package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.mj1;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class Template {

    public static class AIShortcutColor {
        private Optional<String> for_text = Optional.a();
        private Optional<String> for_bg = Optional.a();
        private Optional<String> for_border = Optional.a();
        private Optional<String> for_icon_border = Optional.a();

        public Optional<String> getForBg() {
            return this.for_bg;
        }

        public Optional<String> getForBorder() {
            return this.for_border;
        }

        public Optional<String> getForIconBorder() {
            return this.for_icon_border;
        }

        public Optional<String> getForText() {
            return this.for_text;
        }

        public AIShortcutColor setForBg(String str) {
            this.for_bg = Optional.e(str);
            return this;
        }

        public AIShortcutColor setForBorder(String str) {
            this.for_border = Optional.e(str);
            return this;
        }

        public AIShortcutColor setForIconBorder(String str) {
            this.for_icon_border = Optional.e(str);
            return this;
        }

        public AIShortcutColor setForText(String str) {
            this.for_text = Optional.e(str);
            return this;
        }
    }

    @NamespaceName(name = "ActionSingleBox", namespace = AIApiConstants.Template.NAME)
    public static class ActionSingleBox implements InstructionPayload {

        @Required
        private List<ActionSingleBoxItem> items;

        public ActionSingleBox() {
        }

        public ActionSingleBox(List<ActionSingleBoxItem> list) {
            this.items = list;
        }

        @Required
        public List<ActionSingleBoxItem> getItems() {
            return this.items;
        }

        @Required
        public ActionSingleBox setItems(List<ActionSingleBoxItem> list) {
            this.items = list;
            return this;
        }
    }

    public static class ActionSingleBoxItem {
        private Optional<Integer> number = Optional.a();
        private Optional<String> text = Optional.a();
        private Optional<Agent.Action> action = Optional.a();

        public Optional<Agent.Action> getAction() {
            return this.action;
        }

        public Optional<Integer> getNumber() {
            return this.number;
        }

        public Optional<String> getText() {
            return this.text;
        }

        public ActionSingleBoxItem setAction(Agent.Action action) {
            this.action = Optional.e(action);
            return this;
        }

        public ActionSingleBoxItem setNumber(int i) {
            this.number = Optional.e(Integer.valueOf(i));
            return this;
        }

        public ActionSingleBoxItem setText(String str) {
            this.text = Optional.e(str);
            return this;
        }
    }

    public static class AdsAttachment {

        @Required
        private Image image;

        @Required
        private Launcher img_launcher;

        @Required
        private String tag;

        public AdsAttachment() {
        }

        public AdsAttachment(Image image, Launcher launcher, String str) {
            this.image = image;
            this.img_launcher = launcher;
            this.tag = str;
        }

        @Required
        public Image getImage() {
            return this.image;
        }

        @Required
        public Launcher getImgLauncher() {
            return this.img_launcher;
        }

        @Required
        public String getTag() {
            return this.tag;
        }

        @Required
        public AdsAttachment setImage(Image image) {
            this.image = image;
            return this;
        }

        @Required
        public AdsAttachment setImgLauncher(Launcher launcher) {
            this.img_launcher = launcher;
            return this;
        }

        @Required
        public AdsAttachment setTag(String str) {
            this.tag = str;
            return this;
        }
    }

    public enum AlarmOperation {
        UNKNOWN(-1),
        CREATE(0),
        QUERY(1),
        OPEN(2),
        CLOSE(3),
        PAUSE(4),
        PROCEED(5),
        DELETE(6),
        STOP(7),
        MODIFY(8);

        private int id;

        AlarmOperation(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum AlarmOperationStatus {
        UNKNOWN(-1),
        CREATE(0),
        MODIFY(1),
        DELETE(2);

        private int id;

        AlarmOperationStatus(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class Align {
        private Optional<String> h_align = Optional.a();
        private Optional<String> v_align = Optional.a();

        public Optional<String> getHAlign() {
            return this.h_align;
        }

        public Optional<String> getVAlign() {
            return this.v_align;
        }

        public Align setHAlign(String str) {
            this.h_align = Optional.e(str);
            return this;
        }

        public Align setVAlign(String str) {
            this.v_align = Optional.e(str);
            return this;
        }
    }

    @NamespaceName(name = "AncientPoem", namespace = AIApiConstants.Template.NAME)
    @Deprecated
    public static class AncientPoem implements InstructionPayload {

        @Required
        private List<AncientPoemData> poems;

        public AncientPoem() {
        }

        public AncientPoem(List<AncientPoemData> list) {
            this.poems = list;
        }

        @Required
        public List<AncientPoemData> getPoems() {
            return this.poems;
        }

        @Required
        public AncientPoem setPoems(List<AncientPoemData> list) {
            this.poems = list;
            return this;
        }
    }

    public static class AnimationConfig {

        @Required
        private String url;

        public AnimationConfig() {
        }

        public AnimationConfig(String str) {
            this.url = str;
        }

        @Required
        public String getUrl() {
            return this.url;
        }

        @Required
        public AnimationConfig setUrl(String str) {
            this.url = str;
            return this;
        }
    }

    public enum AppDeviceCategory {
        LOCAL(0),
        SECONDARY_SCREEN_PROJECTION(1);

        private int id;

        AppDeviceCategory(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum AppEntitySource {
        UNKNOWN(0),
        APP_SEARCH_HIGH(1),
        APP_SEARCH_LOW(2),
        AD(3);

        private int id;

        AppEntitySource(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class ArithRecord {
        private Optional<String> expression = Optional.a();
        private Optional<String> result_unit = Optional.a();
        private Optional<String> approximate_value = Optional.a();
        private Optional<String> value = Optional.a();

        public Optional<String> getApproximateValue() {
            return this.approximate_value;
        }

        public Optional<String> getExpression() {
            return this.expression;
        }

        public Optional<String> getResultUnit() {
            return this.result_unit;
        }

        public Optional<String> getValue() {
            return this.value;
        }

        public ArithRecord setApproximateValue(String str) {
            this.approximate_value = Optional.e(str);
            return this;
        }

        public ArithRecord setExpression(String str) {
            this.expression = Optional.e(str);
            return this;
        }

        public ArithRecord setResultUnit(String str) {
            this.result_unit = Optional.e(str);
            return this;
        }

        public ArithRecord setValue(String str) {
            this.value = Optional.e(str);
            return this;
        }
    }

    public enum AttachmentType {
        UNKNOWN(-1),
        FEEDBACK(0),
        ADS(1);

        private int id;

        AttachmentType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "AutoAutomatic", namespace = AIApiConstants.Template.NAME)
    public static class AutoAutomatic implements InstructionPayload {

        @Required
        private Title rule_name;

        public AutoAutomatic() {
        }

        public AutoAutomatic(Title title) {
            this.rule_name = title;
        }

        @Required
        public Title getRuleName() {
            return this.rule_name;
        }

        @Required
        public AutoAutomatic setRuleName(Title title) {
            this.rule_name = title;
            return this;
        }
    }

    public enum BackgroundColorType {
        GRADIENT(0),
        PURE(1);

        private int id;

        BackgroundColorType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class Button {

        @Required
        private Launcher launcher;

        @Required
        private String text;

        public Button() {
        }

        public Button(String str, Launcher launcher) {
            this.text = str;
            this.launcher = launcher;
        }

        @Required
        public Launcher getLauncher() {
            return this.launcher;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public Button setLauncher(Launcher launcher) {
            this.launcher = launcher;
            return this;
        }

        @Required
        public Button setText(String str) {
            this.text = str;
            return this;
        }
    }

    public enum CalculatorType {
        UNKNOWN(-1),
        CALCULATE(0),
        EXCHANGE_RATE(1),
        UNIT_CONVERSION(2),
        DISCOUNT_CALCULATION(3),
        CAPITAL(4),
        RELATIVE(5),
        GUIDE(6),
        COMPUTE_TAX(7);

        private int id;

        CalculatorType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum CarCardCategory {
        UNKNOWN(-1),
        POWER_ON(0),
        POWER_OFF(1);

        private int id;

        CarCardCategory(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "CarImageNumberItem", namespace = AIApiConstants.Template.NAME)
    public static class CarImageNumberItem implements InstructionPayload {
        private Optional<String> name = Optional.a();
        private Optional<Integer> positionIndex = Optional.a();
        private Optional<String> value = Optional.a();
        private Optional<String> unit = Optional.a();
        private Optional<Long> timestamp = Optional.a();
        private Optional<Boolean> is_abnormal = Optional.a();
        private Optional<Image> image = Optional.a();

        public Optional<Image> getImage() {
            return this.image;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<Integer> getPositionIndex() {
            return this.positionIndex;
        }

        public Optional<Long> getTimestamp() {
            return this.timestamp;
        }

        public Optional<String> getUnit() {
            return this.unit;
        }

        public Optional<String> getValue() {
            return this.value;
        }

        public Optional<Boolean> isAbnormal() {
            return this.is_abnormal;
        }

        public CarImageNumberItem setImage(Image image) {
            this.image = Optional.e(image);
            return this;
        }

        public CarImageNumberItem setIsAbnormal(boolean z) {
            this.is_abnormal = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public CarImageNumberItem setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public CarImageNumberItem setPositionIndex(int i) {
            this.positionIndex = Optional.e(Integer.valueOf(i));
            return this;
        }

        public CarImageNumberItem setTimestamp(long j) {
            this.timestamp = Optional.e(Long.valueOf(j));
            return this;
        }

        public CarImageNumberItem setUnit(String str) {
            this.unit = Optional.e(str);
            return this;
        }

        public CarImageNumberItem setValue(String str) {
            this.value = Optional.e(str);
            return this;
        }
    }

    public static class CineasteWithTag {

        @Required
        private Cineaste cineaste;

        @Required
        private List<Video.VideoSearchTags> tags;

        public CineasteWithTag() {
        }

        public CineasteWithTag(Cineaste cineaste, List<Video.VideoSearchTags> list) {
            this.cineaste = cineaste;
            this.tags = list;
        }

        @Required
        public Cineaste getCineaste() {
            return this.cineaste;
        }

        @Required
        public List<Video.VideoSearchTags> getTags() {
            return this.tags;
        }

        @Required
        public CineasteWithTag setCineaste(Cineaste cineaste) {
            this.cineaste = cineaste;
            return this;
        }

        @Required
        public CineasteWithTag setTags(List<Video.VideoSearchTags> list) {
            this.tags = list;
            return this;
        }
    }

    public enum ConfirmCategory {
        UNKNOWN(-1),
        CLOSE_VOICE_WAKEUP(0),
        CAR_SUGGESTION(1),
        CAR_VOLUME_SET_TOO_LOUD(2),
        CAR_VOLUME_SET_TOO_LOW(3),
        ENABLE_AUTO_PROJECTION(4);

        private int id;

        ConfirmCategory(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class ConfirmInfo {
        private Optional<Integer> volume = Optional.a();
        private Optional<Speaker.VolumeType> channel = Optional.a();

        public Optional<Speaker.VolumeType> getChannel() {
            return this.channel;
        }

        public Optional<Integer> getVolume() {
            return this.volume;
        }

        public ConfirmInfo setChannel(Speaker.VolumeType volumeType) {
            this.channel = Optional.e(volumeType);
            return this;
        }

        public ConfirmInfo setVolume(int i) {
            this.volume = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    public static class Course {
        private Optional<String> name = Optional.a();
        private Optional<String> classroom = Optional.a();
        private Optional<String> teacher = Optional.a();
        private Optional<String> time_range = Optional.a();

        public Optional<String> getClassroom() {
            return this.classroom;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<String> getTeacher() {
            return this.teacher;
        }

        public Optional<String> getTimeRange() {
            return this.time_range;
        }

        public Course setClassroom(String str) {
            this.classroom = Optional.e(str);
            return this;
        }

        public Course setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public Course setTeacher(String str) {
            this.teacher = Optional.e(str);
            return this;
        }

        public Course setTimeRange(String str) {
            this.time_range = Optional.e(str);
            return this;
        }
    }

    @NamespaceName(name = "CourseSchedule", namespace = AIApiConstants.Template.NAME)
    public static class CourseSchedule implements InstructionPayload {
        private Optional<DayCourseSchedule> day_courses = Optional.a();
        private Optional<List<DayCourseSchedule>> week_courses = Optional.a();

        public Optional<DayCourseSchedule> getDayCourses() {
            return this.day_courses;
        }

        public Optional<List<DayCourseSchedule>> getWeekCourses() {
            return this.week_courses;
        }

        public CourseSchedule setDayCourses(DayCourseSchedule dayCourseSchedule) {
            this.day_courses = Optional.e(dayCourseSchedule);
            return this;
        }

        public CourseSchedule setWeekCourses(List<DayCourseSchedule> list) {
            this.week_courses = Optional.e(list);
            return this;
        }
    }

    public static class DayCourseSchedule {

        @Required
        private List<Course> courses;

        @Required
        private Common.Weekday week_day;

        public DayCourseSchedule() {
        }

        public DayCourseSchedule(Common.Weekday weekday, List<Course> list) {
            this.week_day = weekday;
            this.courses = list;
        }

        @Required
        public List<Course> getCourses() {
            return this.courses;
        }

        @Required
        public Common.Weekday getWeekDay() {
            return this.week_day;
        }

        @Required
        public DayCourseSchedule setCourses(List<Course> list) {
            this.courses = list;
            return this;
        }

        @Required
        public DayCourseSchedule setWeekDay(Common.Weekday weekday) {
            this.week_day = weekday;
            return this;
        }
    }

    @NamespaceName(name = "Details", namespace = AIApiConstants.Template.NAME)
    public static class Details implements EventPayload {

        @Required
        private String id;

        public Details() {
        }

        public Details(String str) {
            this.id = str;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public Details setId(String str) {
            this.id = str;
            return this;
        }
    }

    public enum DeviceOnlineStatus {
        UNKNOWN(-1),
        OFFLINE(0),
        ONLINE(1);

        private int id;

        DeviceOnlineStatus(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum DeviceOperateResult {
        UNKNOWN(-1),
        SUCCESS(0),
        FAILED(1),
        OFFLINE(2);

        private int id;

        DeviceOperateResult(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class DictionaryTranslation {
        private Optional<SynonymCardV2> synonym_card = Optional.a();
        private Optional<FullScreenTemplate.PartSimple> part_simple = Optional.a();
        private Optional<FullScreenTemplate.WordDetail> word_detail = Optional.a();
        private Optional<MachineTranslation> word_simple = Optional.a();

        public Optional<FullScreenTemplate.PartSimple> getPartSimple() {
            return this.part_simple;
        }

        public Optional<SynonymCardV2> getSynonymCard() {
            return this.synonym_card;
        }

        public Optional<FullScreenTemplate.WordDetail> getWordDetail() {
            return this.word_detail;
        }

        public Optional<MachineTranslation> getWordSimple() {
            return this.word_simple;
        }

        public DictionaryTranslation setPartSimple(FullScreenTemplate.PartSimple partSimple) {
            this.part_simple = Optional.e(partSimple);
            return this;
        }

        public DictionaryTranslation setSynonymCard(SynonymCardV2 synonymCardV2) {
            this.synonym_card = Optional.e(synonymCardV2);
            return this;
        }

        public DictionaryTranslation setWordDetail(FullScreenTemplate.WordDetail wordDetail) {
            this.word_detail = Optional.e(wordDetail);
            return this;
        }

        public DictionaryTranslation setWordSimple(MachineTranslation machineTranslation) {
            this.word_simple = Optional.e(machineTranslation);
            return this;
        }
    }

    public enum DirectionDef {
        UNKNOWN(-1),
        VERTICAL(0),
        HORIZONTAL(1);

        private int id;

        DirectionDef(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class DisplayCommon {
        private Optional<FullScreen> full_screen = Optional.a();
        private Optional<DisplayMode> display_mode = Optional.a();

        @Deprecated
        private Optional<Feedback> feedback = Optional.a();
        private Optional<Boolean> disable_close_on_click_outside = Optional.a();
        private Optional<Boolean> replace_latest_card = Optional.a();

        public Optional<DisplayMode> getDisplayMode() {
            return this.display_mode;
        }

        @Deprecated
        public Optional<Feedback> getFeedback() {
            return this.feedback;
        }

        public Optional<FullScreen> getFullScreen() {
            return this.full_screen;
        }

        public Optional<Boolean> isDisableCloseOnClickOutside() {
            return this.disable_close_on_click_outside;
        }

        public Optional<Boolean> isReplaceLatestCard() {
            return this.replace_latest_card;
        }

        public DisplayCommon setDisableCloseOnClickOutside(boolean z) {
            this.disable_close_on_click_outside = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public DisplayCommon setDisplayMode(DisplayMode displayMode) {
            this.display_mode = Optional.e(displayMode);
            return this;
        }

        @Deprecated
        public DisplayCommon setFeedback(Feedback feedback) {
            this.feedback = Optional.e(feedback);
            return this;
        }

        public DisplayCommon setFullScreen(FullScreen fullScreen) {
            this.full_screen = Optional.e(fullScreen);
            return this;
        }

        public DisplayCommon setReplaceLatestCard(boolean z) {
            this.replace_latest_card = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public static class DisplayControl {
        private Optional<Integer> duration = Optional.a();
        private Optional<DisplayControlType> type = Optional.a();

        public Optional<Integer> getDuration() {
            return this.duration;
        }

        public Optional<DisplayControlType> getType() {
            return this.type;
        }

        public DisplayControl setDuration(int i) {
            this.duration = Optional.e(Integer.valueOf(i));
            return this;
        }

        public DisplayControl setType(DisplayControlType displayControlType) {
            this.type = Optional.e(displayControlType);
            return this;
        }
    }

    public enum DisplayControlType {
        UNKNOWN(-1),
        DISAPPEAR_BY_TTS_FINISHED(0),
        DISAPPEAR_BY_FIRST_AUDIO_FINISHED(1);

        private int id;

        DisplayControlType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum DisplayMode {
        UNKNOWN(-1),
        SMALL(0),
        FULL(1);

        private int id;

        DisplayMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class EntityInfo {

        @Required
        private String id;

        public EntityInfo() {
        }

        public EntityInfo(String str) {
            this.id = str;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public EntityInfo setId(String str) {
            this.id = str;
            return this;
        }
    }

    public enum ExecType {
        UNKNOWN(-1),
        HOME_DEVICE_STATE_EVENT(0),
        LAUNCHER(1);

        private int id;

        ExecType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "FeedbackCard", namespace = AIApiConstants.Template.NAME)
    public static class FeedbackCard implements InstructionPayload {
        private Optional<String> package_name = Optional.a();
        private Optional<String> module_name = Optional.a();
        private Optional<Integer> module_id = Optional.a();
        private Optional<String> source = Optional.a();
        private Optional<Image> skill_icon = Optional.a();
        private Optional<AutoController.Position> sound_zone = Optional.a();

        public Optional<Integer> getModuleId() {
            return this.module_id;
        }

        public Optional<String> getModuleName() {
            return this.module_name;
        }

        public Optional<String> getPackageName() {
            return this.package_name;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        public Optional<AutoController.Position> getSoundZone() {
            return this.sound_zone;
        }

        public Optional<String> getSource() {
            return this.source;
        }

        public FeedbackCard setModuleId(int i) {
            this.module_id = Optional.e(Integer.valueOf(i));
            return this;
        }

        public FeedbackCard setModuleName(String str) {
            this.module_name = Optional.e(str);
            return this;
        }

        public FeedbackCard setPackageName(String str) {
            this.package_name = Optional.e(str);
            return this;
        }

        public FeedbackCard setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public FeedbackCard setSoundZone(AutoController.Position position) {
            this.sound_zone = Optional.e(position);
            return this;
        }

        public FeedbackCard setSource(String str) {
            this.source = Optional.e(str);
            return this;
        }
    }

    public static class ForeignDictionaryExampleSentence {

        @Required
        private String example_sentence_title;

        @Required
        private List<ForeignDictionarySentence> sentences;

        public ForeignDictionaryExampleSentence() {
        }

        public ForeignDictionaryExampleSentence(String str, List<ForeignDictionarySentence> list) {
            this.example_sentence_title = str;
            this.sentences = list;
        }

        @Required
        public String getExampleSentenceTitle() {
            return this.example_sentence_title;
        }

        @Required
        public List<ForeignDictionarySentence> getSentences() {
            return this.sentences;
        }

        @Required
        public ForeignDictionaryExampleSentence setExampleSentenceTitle(String str) {
            this.example_sentence_title = str;
            return this;
        }

        @Required
        public ForeignDictionaryExampleSentence setSentences(List<ForeignDictionarySentence> list) {
            this.sentences = list;
            return this;
        }
    }

    public static class ForeignDictionarySentence {

        @Required
        private String chinese_sentence;

        @Required
        private String foreign_sentence;

        public ForeignDictionarySentence() {
        }

        public ForeignDictionarySentence(String str, String str2) {
            this.foreign_sentence = str;
            this.chinese_sentence = str2;
        }

        @Required
        public String getChineseSentence() {
            return this.chinese_sentence;
        }

        @Required
        public String getForeignSentence() {
            return this.foreign_sentence;
        }

        @Required
        public ForeignDictionarySentence setChineseSentence(String str) {
            this.chinese_sentence = str;
            return this;
        }

        @Required
        public ForeignDictionarySentence setForeignSentence(String str) {
            this.foreign_sentence = str;
            return this;
        }
    }

    public static class FrontendPageExtraData {
        private Optional<String> query = Optional.a();
        private Optional<String> text = Optional.a();
        private Optional<String> to_speak = Optional.a();

        public Optional<String> getQuery() {
            return this.query;
        }

        public Optional<String> getText() {
            return this.text;
        }

        public Optional<String> getToSpeak() {
            return this.to_speak;
        }

        public FrontendPageExtraData setQuery(String str) {
            this.query = Optional.e(str);
            return this;
        }

        public FrontendPageExtraData setText(String str) {
            this.text = Optional.e(str);
            return this;
        }

        public FrontendPageExtraData setToSpeak(String str) {
            this.to_speak = Optional.e(str);
            return this;
        }
    }

    public enum FrontendPageLoadType {
        UNKNOWN(-1),
        URL(0),
        DATA(1);

        private int id;

        FrontendPageLoadType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class FullScreen {
        private Optional<Launcher> action = Optional.a();
        private Optional<String> task = Optional.a();
        private Optional<List<ListsItem>> more_items = Optional.a();
        private Optional<Boolean> background_play = Optional.a();

        public Optional<Launcher> getAction() {
            return this.action;
        }

        public Optional<List<ListsItem>> getMoreItems() {
            return this.more_items;
        }

        public Optional<String> getTask() {
            return this.task;
        }

        public Optional<Boolean> isBackgroundPlay() {
            return this.background_play;
        }

        public FullScreen setAction(Launcher launcher) {
            this.action = Optional.e(launcher);
            return this;
        }

        public FullScreen setBackgroundPlay(boolean z) {
            this.background_play = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public FullScreen setMoreItems(List<ListsItem> list) {
            this.more_items = Optional.e(list);
            return this;
        }

        public FullScreen setTask(String str) {
            this.task = Optional.e(str);
            return this;
        }
    }

    public enum GeneralDisplayType {
        UNKNOWN(-1),
        BILLBOARD(0),
        MULTI_IMAGE_1(1),
        MULTI_IMAGE_2(2),
        ARROW_TO_RIGHT(3);

        private int id;

        GeneralDisplayType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum GeneralUIType {
        UNKNOWN(-1),
        COMPOSITION(0);

        private int id;

        GeneralUIType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum GradientOrientationType {
        UNKNOWN(-1),
        TOPRIGHT_BOTTOMLEFT(0),
        TOPLEFT_BOTTOMRIGHT(1),
        TOP_BOTTOM(2),
        LEFT_RIGHT(3);

        private int id;

        GradientOrientationType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class H5PageExtraData {
        private Optional<String> query = Optional.a();
        private Optional<String> text = Optional.a();
        private Optional<String> to_speak = Optional.a();

        public Optional<String> getQuery() {
            return this.query;
        }

        public Optional<String> getText() {
            return this.text;
        }

        public Optional<String> getToSpeak() {
            return this.to_speak;
        }

        public H5PageExtraData setQuery(String str) {
            this.query = Optional.e(str);
            return this;
        }

        public H5PageExtraData setText(String str) {
            this.text = Optional.e(str);
            return this;
        }

        public H5PageExtraData setToSpeak(String str) {
            this.to_speak = Optional.e(str);
            return this;
        }
    }

    public enum H5PageLoadType {
        UNKNOWN(-1),
        URL(0),
        DATA(1);

        private int id;

        H5PageLoadType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum H5PageSource {
        INNER(0),
        BAIDU_BAIKE(1);

        private int id;

        H5PageSource(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum H5ParamType {
        UNKNOWN(-1),
        TRANSLATION(0),
        DICTIONARIES(1),
        TRANSLATION_V2(2),
        URL_ONLY(3),
        QABOT(4),
        WIKI_DETAIL(5),
        LISTS_DETAIL(6),
        VIDEO(7),
        RECIPE_DETAIL(8),
        RECIPE_LIST(9),
        COURSE_SCHEDULE(10),
        STATION(11),
        COMPOSITION(12),
        OPENPLATFORM(13),
        TRANSLATION_V3(14),
        DICTIONARY_TARGET(15),
        ASSIST_MEMO(16),
        Anniversary(17),
        FEIHUALING(18),
        SPORTS(19),
        CONVERSATION_FLOW(20),
        NUCLEICACID(21),
        FOOD(22);

        private int id;

        H5ParamType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "Help", namespace = AIApiConstants.Template.NAME)
    public static class Help implements InstructionPayload {
    }

    public enum HintType {
        DEFAULT(0),
        AI_MEMORY(1);

        private int id;

        HintType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum HomeOperateResult {
        UNKNOWN(-1),
        SUCCESS(0),
        FAILED(1);

        private int id;

        HomeOperateResult(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum HomeRoomSelectType {
        UNKNOWN(-1),
        ROOM(0),
        HOOM(1);

        private int id;

        HomeRoomSelectType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class ImageLauncher {
        private Optional<String> url = Optional.a();
        private Optional<ImageAndroidIntent> intent = Optional.a();
        private Optional<String> desc = Optional.a();
        private Optional<EventRequestInfo> event = Optional.a();

        public Optional<String> getDesc() {
            return this.desc;
        }

        public Optional<EventRequestInfo> getEvent() {
            return this.event;
        }

        public Optional<ImageAndroidIntent> getIntent() {
            return this.intent;
        }

        public Optional<String> getUrl() {
            return this.url;
        }

        public ImageLauncher setDesc(String str) {
            this.desc = Optional.e(str);
            return this;
        }

        public ImageLauncher setEvent(EventRequestInfo eventRequestInfo) {
            this.event = Optional.e(eventRequestInfo);
            return this;
        }

        public ImageLauncher setIntent(ImageAndroidIntent imageAndroidIntent) {
            this.intent = Optional.e(imageAndroidIntent);
            return this;
        }

        public ImageLauncher setUrl(String str) {
            this.url = Optional.e(str);
            return this;
        }
    }

    public enum IntentTargetDisplay {
        CURRENT_DEVICE_SCREEN(0),
        FLEX_PINNED_WINDOW(1),
        SECONDARY_PROJECT_SCREEN(2);

        private int id;

        IntentTargetDisplay(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class JumpItem {
        private Optional<Title> title = Optional.a();
        private Optional<Image> icon = Optional.a();
        private Optional<Launcher> launcher = Optional.a();

        public Optional<Image> getIcon() {
            return this.icon;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<Title> getTitle() {
            return this.title;
        }

        public JumpItem setIcon(Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        public JumpItem setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public JumpItem setTitle(Title title) {
            this.title = Optional.e(title);
            return this;
        }
    }

    public enum KnowledgeType {
        WORLDEST(0),
        WONDER_WHY(1);

        private int id;

        KnowledgeType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "LLMDocumentCard", namespace = AIApiConstants.Template.NAME)
    public static class LLMDocumentCard implements InstructionPayload {
        private Optional<Image> image = Optional.a();
        private Optional<String> name = Optional.a();
        private Optional<String> size = Optional.a();

        public Optional<Image> getImage() {
            return this.image;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<String> getSize() {
            return this.size;
        }

        public LLMDocumentCard setImage(Image image) {
            this.image = Optional.e(image);
            return this;
        }

        public LLMDocumentCard setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public LLMDocumentCard setSize(String str) {
            this.size = Optional.e(str);
            return this;
        }
    }

    public enum LLMImageBusinessType {
        UNKNOWN(-1),
        IMG_TO_IMG(0),
        TEXT_TO_IMG(1);

        private int id;

        LLMImageBusinessType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum LLMImageCarModelPosition {
        UNKNOWN(-1),
        STYLE_APPOINT(0),
        FRONT_TRUNK(1),
        REAR_TRUNK(2),
        LEFT_ROW1_DOOR(3),
        RIGHT_ROW1_DOOR(4),
        LEFT_ROW2_DOOR(5),
        RIGHT_ROW2_DOOR(6),
        LEFT_ROW3_DOOR(7),
        RIGHT_ROW3_DOOR(8),
        BACKGROUND_LIGHT(9),
        BACKGROUND_DARK(10);

        private int id;

        LLMImageCarModelPosition(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "LLMImageCarModelRecover", namespace = AIApiConstants.Template.NAME)
    public static class LLMImageCarModelRecover implements InstructionPayload {
    }

    public enum LLMImageOfflineCode {
        UNKNOWN(-1),
        INIT(0),
        OFFLINE_MODEL_UNAVAILABLE(1),
        NEED_DOWNLOAD_AGAIN(2),
        MEMORY_NOT_ENOUGH_MODEL_LOAD_ERROR(3),
        MEMORY_NOT_ENOUGH_IMAGE_ERROR(4),
        ILLEGAL(5),
        SUCCESS(6),
        FAILED(7);

        private int id;

        LLMImageOfflineCode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class LLMImageOfflineMessage {

        @Required
        private LLMImageOfflineCode code;

        @Required
        private String message;

        public LLMImageOfflineMessage() {
        }

        public LLMImageOfflineMessage(LLMImageOfflineCode lLMImageOfflineCode, String str) {
            this.code = lLMImageOfflineCode;
            this.message = str;
        }

        @Required
        public LLMImageOfflineCode getCode() {
            return this.code;
        }

        @Required
        public String getMessage() {
            return this.message;
        }

        @Required
        public LLMImageOfflineMessage setCode(LLMImageOfflineCode lLMImageOfflineCode) {
            this.code = lLMImageOfflineCode;
            return this;
        }

        @Required
        public LLMImageOfflineMessage setMessage(String str) {
            this.message = str;
            return this;
        }
    }

    public enum LLMImageScenesCode {
        UNKNOWN(-1),
        INIT(0),
        LOAD_SUCCESS_PARTIALLY(1),
        LOAD_SUCCESS_ALL(2),
        LOAD_FAILED(3),
        GET_TASK_IDS_FAILED(4),
        QUERY_ILLEGAL(5),
        IMAGE_ILLEGAL(6),
        MODEL_NOT_SUPPORT(7),
        MODEL_CHECK_NO_PERSON(8);

        private int id;

        LLMImageScenesCode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class LLMImageScenesMessage {

        @Required
        private LLMImageScenesCode code;

        @Required
        private String message;

        public LLMImageScenesMessage() {
        }

        public LLMImageScenesMessage(LLMImageScenesCode lLMImageScenesCode, String str) {
            this.code = lLMImageScenesCode;
            this.message = str;
        }

        @Required
        public LLMImageScenesCode getCode() {
            return this.code;
        }

        @Required
        public String getMessage() {
            return this.message;
        }

        @Required
        public LLMImageScenesMessage setCode(LLMImageScenesCode lLMImageScenesCode) {
            this.code = lLMImageScenesCode;
            return this;
        }

        @Required
        public LLMImageScenesMessage setMessage(String str) {
            this.message = str;
            return this;
        }
    }

    public enum LLMImageSubBusinessType {
        UNKNOWN(-1),
        CAR_MODEL_IMG(0);

        private int id;

        LLMImageSubBusinessType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "LLMLoadingCard", namespace = AIApiConstants.Template.NAME)
    public static class LLMLoadingCard implements InstructionPayload {
        private Optional<String> skill_name = Optional.a();
        private Optional<LLMLoadingCategory> loading_type = Optional.a();
        private Optional<Integer> timeout = Optional.a();
        private Optional<String> timeout_text = Optional.a();
        private Optional<String> title = Optional.a();
        private Optional<CarouselLoadingText> loading_text = Optional.a();
        private Optional<String> query = Optional.a();
        private Optional<Boolean> show_retry_button_flag = Optional.a();

        public Optional<CarouselLoadingText> getLoadingText() {
            return this.loading_text;
        }

        public Optional<LLMLoadingCategory> getLoadingType() {
            return this.loading_type;
        }

        public Optional<String> getQuery() {
            return this.query;
        }

        public Optional<String> getSkillName() {
            return this.skill_name;
        }

        public Optional<Integer> getTimeout() {
            return this.timeout;
        }

        public Optional<String> getTimeoutText() {
            return this.timeout_text;
        }

        public Optional<String> getTitle() {
            return this.title;
        }

        public Optional<Boolean> isShowRetryButtonFlag() {
            return this.show_retry_button_flag;
        }

        public LLMLoadingCard setLoadingText(CarouselLoadingText carouselLoadingText) {
            this.loading_text = Optional.e(carouselLoadingText);
            return this;
        }

        public LLMLoadingCard setLoadingType(LLMLoadingCategory lLMLoadingCategory) {
            this.loading_type = Optional.e(lLMLoadingCategory);
            return this;
        }

        public LLMLoadingCard setQuery(String str) {
            this.query = Optional.e(str);
            return this;
        }

        public LLMLoadingCard setShowRetryButtonFlag(boolean z) {
            this.show_retry_button_flag = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public LLMLoadingCard setSkillName(String str) {
            this.skill_name = Optional.e(str);
            return this;
        }

        public LLMLoadingCard setTimeout(int i) {
            this.timeout = Optional.e(Integer.valueOf(i));
            return this;
        }

        public LLMLoadingCard setTimeoutText(String str) {
            this.timeout_text = Optional.e(str);
            return this;
        }

        public LLMLoadingCard setTitle(String str) {
            this.title = Optional.e(str);
            return this;
        }
    }

    public enum LLMLoadingCategory {
        UNKNOWN(-1),
        LOADING(0),
        SEARCH(1),
        CAR_IDENTIFY(2),
        SEARCH_MATERIAL(3),
        VIDEO_GENERATION(4),
        DOCUMETN_SUMMARY_GENERATION(5);

        private int id;

        LLMLoadingCategory(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "LLMReferenceInfo", namespace = AIApiConstants.Template.NAME)
    public static class LLMReferenceInfo implements InstructionPayload {

        @Required
        private List<LLMReferenceInfoItem> items;

        public LLMReferenceInfo() {
        }

        public LLMReferenceInfo(List<LLMReferenceInfoItem> list) {
            this.items = list;
        }

        @Required
        public List<LLMReferenceInfoItem> getItems() {
            return this.items;
        }

        @Required
        public LLMReferenceInfo setItems(List<LLMReferenceInfoItem> list) {
            this.items = list;
            return this;
        }
    }

    public static class LLMReferenceInfoItem {
        private Optional<String> id = Optional.a();
        private Optional<String> content = Optional.a();
        private Optional<Image> skill_icon = Optional.a();
        private Optional<MultiModal.MultiModalParam> multi_modal_param = Optional.a();

        public Optional<String> getContent() {
            return this.content;
        }

        public Optional<String> getId() {
            return this.id;
        }

        public Optional<MultiModal.MultiModalParam> getMultiModalParam() {
            return this.multi_modal_param;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        public LLMReferenceInfoItem setContent(String str) {
            this.content = Optional.e(str);
            return this;
        }

        public LLMReferenceInfoItem setId(String str) {
            this.id = Optional.e(str);
            return this;
        }

        public LLMReferenceInfoItem setMultiModalParam(MultiModal.MultiModalParam multiModalParam) {
            this.multi_modal_param = Optional.e(multiModalParam);
            return this;
        }

        public LLMReferenceInfoItem setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }
    }

    public static class Launcher {
        private Optional<String> url = Optional.a();
        private Optional<AndroidIntent> intent = Optional.a();
        private Optional<QuickAppLaunchInfo> quick_app = Optional.a();
        private Optional<Nlp.InvokeNlpRequest> next_request = Optional.a();
        private Optional<Common.GeneralQuickAppInfo> general_quick_app = Optional.a();
        private Optional<mj1> instructions = Optional.a();
        private Optional<EventRequestInfo> event = Optional.a();

        public Optional<EventRequestInfo> getEvent() {
            return this.event;
        }

        public Optional<Common.GeneralQuickAppInfo> getGeneralQuickApp() {
            return this.general_quick_app;
        }

        public Optional<mj1> getInstructions() {
            return this.instructions;
        }

        public Optional<AndroidIntent> getIntent() {
            return this.intent;
        }

        public Optional<Nlp.InvokeNlpRequest> getNextRequest() {
            return this.next_request;
        }

        public Optional<QuickAppLaunchInfo> getQuickApp() {
            return this.quick_app;
        }

        public Optional<String> getUrl() {
            return this.url;
        }

        public Launcher setEvent(EventRequestInfo eventRequestInfo) {
            this.event = Optional.e(eventRequestInfo);
            return this;
        }

        public Launcher setGeneralQuickApp(Common.GeneralQuickAppInfo generalQuickAppInfo) {
            this.general_quick_app = Optional.e(generalQuickAppInfo);
            return this;
        }

        public Launcher setInstructions(mj1 mj1Var) {
            this.instructions = Optional.e(mj1Var);
            return this;
        }

        public Launcher setIntent(AndroidIntent androidIntent) {
            this.intent = Optional.e(androidIntent);
            return this;
        }

        public Launcher setNextRequest(Nlp.InvokeNlpRequest invokeNlpRequest) {
            this.next_request = Optional.e(invokeNlpRequest);
            return this;
        }

        public Launcher setQuickApp(QuickAppLaunchInfo quickAppLaunchInfo) {
            this.quick_app = Optional.e(quickAppLaunchInfo);
            return this;
        }

        public Launcher setUrl(String str) {
            this.url = Optional.e(str);
            return this;
        }
    }

    public enum ListsItemDisplayType {
        UNKNOWN(-1),
        RIGHT_IMAGE(0),
        LEFT_IMAGE(1),
        TEXT_ONLY(2);

        private int id;

        ListsItemDisplayType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class ListsMoreItem {

        @Required
        private Launcher launcher;

        @Required
        private Title title;

        public ListsMoreItem() {
        }

        public ListsMoreItem(Title title, Launcher launcher) {
            this.title = title;
            this.launcher = launcher;
        }

        @Required
        public Launcher getLauncher() {
            return this.launcher;
        }

        @Required
        public Title getTitle() {
            return this.title;
        }

        @Required
        public ListsMoreItem setLauncher(Launcher launcher) {
            this.launcher = launcher;
            return this;
        }

        @Required
        public ListsMoreItem setTitle(Title title) {
            this.title = title;
            return this;
        }
    }

    public enum ListsType {
        UNKNOWN(-1),
        QABOT_COMPOSITION(0),
        POEM_VERSE(1);

        private int id;

        ListsType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "MemoDraftPanel", namespace = AIApiConstants.Template.NAME)
    public static class MemoDraftPanel implements InstructionPayload {
    }

    public enum MemoryCategory {
        UNKNOWN(-1),
        ABOUT_ME(0),
        TOPIC(1),
        KNOWLEDGE(2);

        private int id;

        MemoryCategory(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum MessageSendDeviceCategory {
        PHONE(0),
        SOUNDBOX(1),
        TV(2),
        PC(3),
        SOUNDBOX_APP(4);

        private int id;

        MessageSendDeviceCategory(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum MessageSendDeviceType {
        FAMILY(0),
        PERSONAL(1);

        private int id;

        MessageSendDeviceType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum MessageSendType {
        SINGLE(0),
        GROUP(1);

        private int id;

        MessageSendType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class MiotRichStatus {

        @Required
        private MiotRichStatusCode code;

        @Required
        private String label;

        @Required
        private String label_bg_color;

        @Required
        private String label_color;

        public MiotRichStatus() {
        }

        public MiotRichStatus(String str, MiotRichStatusCode miotRichStatusCode, String str2, String str3) {
            this.label = str;
            this.code = miotRichStatusCode;
            this.label_color = str2;
            this.label_bg_color = str3;
        }

        @Required
        public MiotRichStatusCode getCode() {
            return this.code;
        }

        @Required
        public String getLabel() {
            return this.label;
        }

        @Required
        public String getLabelBgColor() {
            return this.label_bg_color;
        }

        @Required
        public String getLabelColor() {
            return this.label_color;
        }

        @Required
        public MiotRichStatus setCode(MiotRichStatusCode miotRichStatusCode) {
            this.code = miotRichStatusCode;
            return this;
        }

        @Required
        public MiotRichStatus setLabel(String str) {
            this.label = str;
            return this;
        }

        @Required
        public MiotRichStatus setLabelBgColor(String str) {
            this.label_bg_color = str;
            return this;
        }

        @Required
        public MiotRichStatus setLabelColor(String str) {
            this.label_color = str;
            return this;
        }
    }

    public enum MiotRichStatusCode {
        UNKNOWN(-1),
        TURN_ON_SUCCESS(0),
        TURN_OFF_SUCCESS(1),
        OPERATE_SUCCESS(2),
        OPERATE_FAIL(3),
        SCENE_EXECUTE_SUCCESS(4),
        SCENE_EXECUTE_FAIL(5),
        DEVICE_OFFLINE(6);

        private int id;

        MiotRichStatusCode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class MoreLink {

        @Required
        private Launcher launcher;

        @Required
        private Title title;

        public MoreLink() {
        }

        public MoreLink(Title title, Launcher launcher) {
            this.title = title;
            this.launcher = launcher;
        }

        @Required
        public Launcher getLauncher() {
            return this.launcher;
        }

        @Required
        public Title getTitle() {
            return this.title;
        }

        @Required
        public MoreLink setLauncher(Launcher launcher) {
            this.launcher = launcher;
            return this;
        }

        @Required
        public MoreLink setTitle(Title title) {
            this.title = title;
            return this;
        }
    }

    public static class MusicEntity {

        @Required
        private AppEntity app;

        @Required
        private List<AudioInfo> audio_items;

        @Required
        private int auto_play_len;

        @Required
        private AudioProvider provider;

        @Required
        private Image skill_icon;

        public MusicEntity() {
        }

        public MusicEntity(AudioProvider audioProvider, int i, List<AudioInfo> list, AppEntity appEntity, Image image) {
            this.provider = audioProvider;
            this.auto_play_len = i;
            this.audio_items = list;
            this.app = appEntity;
            this.skill_icon = image;
        }

        @Required
        public AppEntity getApp() {
            return this.app;
        }

        @Required
        public List<AudioInfo> getAudioItems() {
            return this.audio_items;
        }

        @Required
        public int getAutoPlayLen() {
            return this.auto_play_len;
        }

        @Required
        public AudioProvider getProvider() {
            return this.provider;
        }

        @Required
        public Image getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public MusicEntity setApp(AppEntity appEntity) {
            this.app = appEntity;
            return this;
        }

        @Required
        public MusicEntity setAudioItems(List<AudioInfo> list) {
            this.audio_items = list;
            return this;
        }

        @Required
        public MusicEntity setAutoPlayLen(int i) {
            this.auto_play_len = i;
            return this;
        }

        @Required
        public MusicEntity setProvider(AudioProvider audioProvider) {
            this.provider = audioProvider;
            return this;
        }

        @Required
        public MusicEntity setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }
    }

    public enum NavigationStatus {
        UNKNOWN(-1),
        TURN_ON(0),
        LONG_TIME_WAIT(1),
        MODIFY_DESTINATION(2),
        END_NAVIGATION_EARLY(3),
        TURN_OFF(4),
        POWER_OFF(5),
        ARRIVED(6);

        private int id;

        NavigationStatus(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class OnError {

        @Required
        private ErrorDetail not_installed;

        @Required
        private ErrorDetail unknown;

        @Required
        private ErrorDetail version_too_low;

        public OnError() {
        }

        public OnError(ErrorDetail errorDetail, ErrorDetail errorDetail2, ErrorDetail errorDetail3) {
            this.version_too_low = errorDetail;
            this.not_installed = errorDetail2;
            this.unknown = errorDetail3;
        }

        @Required
        public ErrorDetail getNotInstalled() {
            return this.not_installed;
        }

        @Required
        public ErrorDetail getUnknown() {
            return this.unknown;
        }

        @Required
        public ErrorDetail getVersionTooLow() {
            return this.version_too_low;
        }

        @Required
        public OnError setNotInstalled(ErrorDetail errorDetail) {
            this.not_installed = errorDetail;
            return this;
        }

        @Required
        public OnError setUnknown(ErrorDetail errorDetail) {
            this.unknown = errorDetail;
            return this;
        }

        @Required
        public OnError setVersionTooLow(ErrorDetail errorDetail) {
            this.version_too_low = errorDetail;
            return this;
        }
    }

    @NamespaceName(name = "OralExamination", namespace = AIApiConstants.Template.NAME)
    public static class OralExamination implements InstructionPayload {

        @Required
        private c4h result;

        public OralExamination() {
        }

        public OralExamination(c4h c4hVar) {
            this.result = c4hVar;
        }

        @Required
        public c4h getResult() {
            return this.result;
        }

        @Required
        public OralExamination setResult(c4h c4hVar) {
            this.result = c4hVar;
            return this;
        }
    }

    public static class PathTarget {

        @Required
        private String action;

        @Required
        private String id;

        @Required
        private String name;

        @Required
        private String pkg_name;

        @Required
        private String text;

        public PathTarget() {
        }

        public PathTarget(String str, String str2, String str3, String str4, String str5) {
            this.name = str;
            this.id = str2;
            this.action = str3;
            this.pkg_name = str4;
            this.text = str5;
        }

        @Required
        public String getAction() {
            return this.action;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public String getPkgName() {
            return this.pkg_name;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public PathTarget setAction(String str) {
            this.action = str;
            return this;
        }

        @Required
        public PathTarget setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public PathTarget setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public PathTarget setPkgName(String str) {
            this.pkg_name = str;
            return this;
        }

        @Required
        public PathTarget setText(String str) {
            this.text = str;
            return this;
        }
    }

    @NamespaceName(name = "PersonDetail", namespace = AIApiConstants.Template.NAME)
    public static class PersonDetail implements InstructionPayload {

        @Required
        private Cineaste cineaste;

        public PersonDetail() {
        }

        public PersonDetail(Cineaste cineaste) {
            this.cineaste = cineaste;
        }

        @Required
        public Cineaste getCineaste() {
            return this.cineaste;
        }

        @Required
        public PersonDetail setCineaste(Cineaste cineaste) {
            this.cineaste = cineaste;
            return this;
        }
    }

    @NamespaceName(name = "PersonDisambiguation", namespace = AIApiConstants.Template.NAME)
    public static class PersonDisambiguation implements InstructionPayload {

        @Required
        private List<CineasteWithTag> candidates;

        @Required
        private int hits;

        public PersonDisambiguation() {
        }

        public PersonDisambiguation(int i, List<CineasteWithTag> list) {
            this.hits = i;
            this.candidates = list;
        }

        @Required
        public List<CineasteWithTag> getCandidates() {
            return this.candidates;
        }

        @Required
        public int getHits() {
            return this.hits;
        }

        @Required
        public PersonDisambiguation setCandidates(List<CineasteWithTag> list) {
            this.candidates = list;
            return this;
        }

        @Required
        public PersonDisambiguation setHits(int i) {
            this.hits = i;
            return this;
        }
    }

    public static class PersonMeta {

        @Required
        private String meta_key;

        @Required
        private String meta_value;

        public PersonMeta() {
        }

        public PersonMeta(String str, String str2) {
            this.meta_key = str;
            this.meta_value = str2;
        }

        @Required
        public String getMetaKey() {
            return this.meta_key;
        }

        @Required
        public String getMetaValue() {
            return this.meta_value;
        }

        @Required
        public PersonMeta setMetaKey(String str) {
            this.meta_key = str;
            return this;
        }

        @Required
        public PersonMeta setMetaValue(String str) {
            this.meta_value = str;
            return this;
        }
    }

    @NamespaceName(name = "PersonSearchList", namespace = AIApiConstants.Template.NAME)
    public static class PersonSearchList implements InstructionPayload {

        @Required
        private List<Cineaste> cineastes;

        @Required
        private SearchHitLevel hit_level;

        @Required
        private long hits;

        public PersonSearchList() {
        }

        public PersonSearchList(SearchHitLevel searchHitLevel, long j, List<Cineaste> list) {
            this.hit_level = searchHitLevel;
            this.hits = j;
            this.cineastes = list;
        }

        @Required
        public List<Cineaste> getCineastes() {
            return this.cineastes;
        }

        @Required
        public SearchHitLevel getHitLevel() {
            return this.hit_level;
        }

        @Required
        public long getHits() {
            return this.hits;
        }

        @Required
        public PersonSearchList setCineastes(List<Cineaste> list) {
            this.cineastes = list;
            return this;
        }

        @Required
        public PersonSearchList setHitLevel(SearchHitLevel searchHitLevel) {
            this.hit_level = searchHitLevel;
            return this;
        }

        @Required
        public PersonSearchList setHits(long j) {
            this.hits = j;
            return this;
        }
    }

    public enum PlayInfoItemDisplayType {
        UNKNOWN(-1),
        HORIZONTAL(0),
        VERTICAL(1),
        VERTICAL_LESS(2),
        DETAIL_TITLE_CENTER(3);

        private int id;

        PlayInfoItemDisplayType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum PlayInfoType {
        UNKNOWN(-1),
        JOKE(0),
        POEM(1),
        MUSIC(2),
        STATION(3),
        VOICE_NEWS(4),
        SOUND(5),
        TRANSLATION(6);

        private int id;

        PlayInfoType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "ProductGuide", namespace = AIApiConstants.Template.NAME)
    public static class ProductGuide implements InstructionPayload {

        @Required
        private String content;

        @Required
        private Image image;

        @Required
        private Button intent;

        @Required
        private String name;

        public ProductGuide() {
        }

        public ProductGuide(String str, String str2, Image image, Button button) {
            this.name = str;
            this.content = str2;
            this.image = image;
            this.intent = button;
        }

        @Required
        public String getContent() {
            return this.content;
        }

        @Required
        public Image getImage() {
            return this.image;
        }

        @Required
        public Button getIntent() {
            return this.intent;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public ProductGuide setContent(String str) {
            this.content = str;
            return this;
        }

        @Required
        public ProductGuide setImage(Image image) {
            this.image = image;
            return this;
        }

        @Required
        public ProductGuide setIntent(Button button) {
            this.intent = button;
            return this;
        }

        @Required
        public ProductGuide setName(String str) {
            this.name = str;
            return this;
        }
    }

    public enum QabotImageType {
        UNKNOWN(-1),
        SMALL(0),
        FULL(1);

        private int id;

        QabotImageType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum QabotParagraphType {
        UNKNOWN(-1),
        PARAGRAPH(0),
        PARAGRAPH_TURN(1);

        private int id;

        QabotParagraphType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum QabotType {
        UNKNOWN(-1),
        WIKI(0),
        PARAGRAPH(1);

        private int id;

        QabotType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "Query", namespace = AIApiConstants.Template.NAME)
    public static class Query implements InstructionPayload {

        @Required
        private String text;

        public Query() {
        }

        public Query(String str) {
            this.text = str;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public Query setText(String str) {
            this.text = str;
            return this;
        }
    }

    public enum QueryType {
        UNKNOWN(-1),
        SONG_SEARCH(0),
        SONG_RECOMMENDATION(1),
        TAG_SEARCH(2),
        ARTIST_SEARCH(3),
        OTHER(4);

        private int id;

        QueryType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum QuestionAnswerMediaType {
        UNKNOWN(-1),
        STATIC_PIC(0),
        DYNAMIC_PIC(1),
        VIDEO(2),
        GIF_VIDEO(3);

        private int id;

        QuestionAnswerMediaType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum RefreshCardType {
        UNKNOWN(-1),
        H5(0),
        RN(1);

        private int id;

        RefreshCardType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ResolveWordsType {
        UNKNOWN(-1),
        DETAILS(0),
        MORE_HOMOPHONES(1),
        TARGET(2);

        private int id;

        ResolveWordsType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "RichPicture", namespace = AIApiConstants.Template.NAME)
    public static class RichPicture implements InstructionPayload {
        private Optional<Image> image = Optional.a();
        private Optional<AudioPlayer.Stream> bg_stream = Optional.a();

        public Optional<AudioPlayer.Stream> getBgStream() {
            return this.bg_stream;
        }

        public Optional<Image> getImage() {
            return this.image;
        }

        public RichPicture setBgStream(AudioPlayer.Stream stream) {
            this.bg_stream = Optional.e(stream);
            return this;
        }

        public RichPicture setImage(Image image) {
            this.image = Optional.e(image);
            return this;
        }
    }

    public enum ScenarioActionType {
        UNKNOWN(-1),
        OPERATE_DEVICE(0),
        PHONE_INFORM(1),
        SOUNDBOX_INFORM(2),
        DELAY(3);

        private int id;

        ScenarioActionType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class ScenarioItem {
        private Optional<List<ScenarioTriggerItem>> trigger_items = Optional.a();
        private Optional<List<ScenarioActionItem>> action_items = Optional.a();
        private Optional<Launcher> launcher = Optional.a();

        public Optional<List<ScenarioActionItem>> getActionItems() {
            return this.action_items;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<List<ScenarioTriggerItem>> getTriggerItems() {
            return this.trigger_items;
        }

        public ScenarioItem setActionItems(List<ScenarioActionItem> list) {
            this.action_items = Optional.e(list);
            return this;
        }

        public ScenarioItem setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public ScenarioItem setTriggerItems(List<ScenarioTriggerItem> list) {
            this.trigger_items = Optional.e(list);
            return this;
        }
    }

    public enum ScenarioTriggerType {
        UNKNOWN(-1),
        TIMER(0),
        DEVICE_OPERATE(1),
        ENV_STATUS(2);

        private int id;

        ScenarioTriggerType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class SceneGroup {

        @Required
        private mj1 instructions;

        @Required
        private String name;

        public SceneGroup() {
        }

        public SceneGroup(mj1 mj1Var, String str) {
            this.instructions = mj1Var;
            this.name = str;
        }

        @Required
        public mj1 getInstructions() {
            return this.instructions;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public SceneGroup setInstructions(mj1 mj1Var) {
            this.instructions = mj1Var;
            return this;
        }

        @Required
        public SceneGroup setName(String str) {
            this.name = str;
            return this;
        }
    }

    public enum ScenesOperateResult {
        UNKNOWN(-1),
        SUCCESS(0),
        FAILED(1);

        private int id;

        ScenesOperateResult(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SearchHitLevel {
        UNKNOWN(-1),
        ACCURATE(0),
        FALLBACK_OPT_INTENTION(1),
        FALLBACK_FUZZY(2),
        FALLBACK_LESS_SLOT(3),
        FALLBACK_RANDOM(4),
        HOT_RECOMMEND(5),
        ERROR_RANDOM(6);

        private int id;

        SearchHitLevel(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "SetDisplayProperty", namespace = AIApiConstants.Template.NAME)
    public static class SetDisplayProperty implements InstructionPayload {
        private Optional<Integer> duration_in_ms = Optional.a();
        private Optional<Integer> wakeup_ball_duration = Optional.a();

        public Optional<Integer> getDurationInMs() {
            return this.duration_in_ms;
        }

        public Optional<Integer> getWakeupBallDuration() {
            return this.wakeup_ball_duration;
        }

        public SetDisplayProperty setDurationInMs(int i) {
            this.duration_in_ms = Optional.e(Integer.valueOf(i));
            return this;
        }

        public SetDisplayProperty setWakeupBallDuration(int i) {
            this.wakeup_ball_duration = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "ShortcutNewUserGuide", namespace = AIApiConstants.Template.NAME)
    public static class ShortcutNewUserGuide implements InstructionPayload {

        @Required
        private String exp_id;

        @Required
        private String message;

        @Required
        private String skill_id;

        public ShortcutNewUserGuide() {
        }

        public ShortcutNewUserGuide(String str, String str2, String str3) {
            this.skill_id = str;
            this.message = str2;
            this.exp_id = str3;
        }

        @Required
        public String getExpId() {
            return this.exp_id;
        }

        @Required
        public String getMessage() {
            return this.message;
        }

        @Required
        public String getSkillId() {
            return this.skill_id;
        }

        @Required
        public ShortcutNewUserGuide setExpId(String str) {
            this.exp_id = str;
            return this;
        }

        @Required
        public ShortcutNewUserGuide setMessage(String str) {
            this.message = str;
            return this;
        }

        @Required
        public ShortcutNewUserGuide setSkillId(String str) {
            this.skill_id = str;
            return this;
        }
    }

    @NamespaceName(name = "ShowLargeLanguageModelRequestCard", namespace = AIApiConstants.Template.NAME)
    public static class ShowLargeLanguageModelRequestCard implements InstructionPayload {

        @Required
        private String query;

        public ShowLargeLanguageModelRequestCard() {
        }

        public ShowLargeLanguageModelRequestCard(String str) {
            this.query = str;
        }

        @Required
        public String getQuery() {
            return this.query;
        }

        @Required
        public ShowLargeLanguageModelRequestCard setQuery(String str) {
            this.query = str;
            return this;
        }
    }

    @NamespaceName(name = "ShowOneCard", namespace = AIApiConstants.Template.NAME)
    public static class ShowOneCard implements InstructionPayload {

        @Required
        private ShowOneCardType display_type;

        public ShowOneCard() {
        }

        public ShowOneCard(ShowOneCardType showOneCardType) {
            this.display_type = showOneCardType;
        }

        @Required
        public ShowOneCardType getDisplayType() {
            return this.display_type;
        }

        @Required
        public ShowOneCard setDisplayType(ShowOneCardType showOneCardType) {
            this.display_type = showOneCardType;
            return this;
        }
    }

    public enum ShowOneCardType {
        UNKNOWN(-1),
        START(0),
        APPEND(1);

        private int id;

        ShowOneCardType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SingleButtonStyleType {
        DEFAULT(0),
        RESULT_OPERATION(1),
        AI_INPUT_EDIT(2),
        SEARCH_ENHANCER(3),
        MICAR_USER_MANUAL(4);

        private int id;

        SingleButtonStyleType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class SmartHotel {
        private Optional<String> name = Optional.a();
        private Optional<Image> image = Optional.a();

        @Deprecated
        private Optional<SmartHotelSummary> summary = Optional.a();
        private Optional<List<SmartHotelFacility>> facilities = Optional.a();

        @Deprecated
        private Optional<SmartHotelCategory> category = Optional.a();
        private Optional<List<SmartHotelBaseInfo>> base_infos = Optional.a();

        public Optional<List<SmartHotelBaseInfo>> getBaseInfos() {
            return this.base_infos;
        }

        @Deprecated
        public Optional<SmartHotelCategory> getCategory() {
            return this.category;
        }

        public Optional<List<SmartHotelFacility>> getFacilities() {
            return this.facilities;
        }

        public Optional<Image> getImage() {
            return this.image;
        }

        public Optional<String> getName() {
            return this.name;
        }

        @Deprecated
        public Optional<SmartHotelSummary> getSummary() {
            return this.summary;
        }

        public SmartHotel setBaseInfos(List<SmartHotelBaseInfo> list) {
            this.base_infos = Optional.e(list);
            return this;
        }

        @Deprecated
        public SmartHotel setCategory(SmartHotelCategory smartHotelCategory) {
            this.category = Optional.e(smartHotelCategory);
            return this;
        }

        public SmartHotel setFacilities(List<SmartHotelFacility> list) {
            this.facilities = Optional.e(list);
            return this;
        }

        public SmartHotel setImage(Image image) {
            this.image = Optional.e(image);
            return this;
        }

        public SmartHotel setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        @Deprecated
        public SmartHotel setSummary(SmartHotelSummary smartHotelSummary) {
            this.summary = Optional.e(smartHotelSummary);
            return this;
        }
    }

    public enum SmartHotelCategory {
        UNKNOWN(-1),
        SUMMARY(0),
        WIFI(1),
        RESTAURANT(2),
        BREAKFAST(3),
        LOBBYBAR(4),
        GYM(5),
        COSMETIC(6),
        SHOPPING(7),
        ATM(8),
        BUSINESS(9),
        MEETING(10),
        PARKING(11),
        STADIUM(12),
        CHILDCARE(13),
        GARDEN(14),
        AROUND(15),
        POOL(16),
        WASH_HOUSE(17),
        CARDS_ROOM(18),
        FRONT_PHONE(19),
        CHECKOUT_TIME(20),
        COMPLAINT_PHONE(21),
        UMBRELLA_BORROW(22),
        TAKEOUT_COLLECT(23),
        DELIVERY_COLLECT(24),
        LEFT_LUGGAGE(25),
        LOCATION(26);

        private int id;

        SmartHotelCategory(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "SmartHotels", namespace = AIApiConstants.Template.NAME)
    public static class SmartHotels implements InstructionPayload {

        @Required
        private List<SmartHotel> hotels;

        public SmartHotels() {
        }

        public SmartHotels(List<SmartHotel> list) {
            this.hotels = list;
        }

        @Required
        public List<SmartHotel> getHotels() {
            return this.hotels;
        }

        @Required
        public SmartHotels setHotels(List<SmartHotel> list) {
            this.hotels = list;
            return this;
        }
    }

    public static class SportMatchSchedule {

        @Required
        private String date;

        @Required
        private List<SportMatchMoment> moments;

        public SportMatchSchedule() {
        }

        public SportMatchSchedule(String str, List<SportMatchMoment> list) {
            this.date = str;
            this.moments = list;
        }

        @Required
        public String getDate() {
            return this.date;
        }

        @Required
        public List<SportMatchMoment> getMoments() {
            return this.moments;
        }

        @Required
        public SportMatchSchedule setDate(String str) {
            this.date = str;
            return this;
        }

        @Required
        public SportMatchSchedule setMoments(List<SportMatchMoment> list) {
            this.moments = list;
            return this;
        }
    }

    public enum SportMatchStatus {
        UNKNOWN(-1),
        NOT_STARTED(0),
        ON_GOING(1),
        FINISHED(2),
        IN_LIVE(3),
        LIVE_EXCEPTION(4);

        private int id;

        SportMatchStatus(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class StockDetail {
        private Optional<String> code = Optional.a();
        private Optional<String> market = Optional.a();
        private Optional<String> name = Optional.a();
        private Optional<Double> highest_price = Optional.a();
        private Optional<Double> lowest_price = Optional.a();
        private Optional<Double> close_price = Optional.a();
        private Optional<Double> cur_price = Optional.a();
        private Optional<Double> change_amount = Optional.a();
        private Optional<Double> change_ratio = Optional.a();

        public Optional<Double> getChangeAmount() {
            return this.change_amount;
        }

        public Optional<Double> getChangeRatio() {
            return this.change_ratio;
        }

        public Optional<Double> getClosePrice() {
            return this.close_price;
        }

        public Optional<String> getCode() {
            return this.code;
        }

        public Optional<Double> getCurPrice() {
            return this.cur_price;
        }

        public Optional<Double> getHighestPrice() {
            return this.highest_price;
        }

        public Optional<Double> getLowestPrice() {
            return this.lowest_price;
        }

        public Optional<String> getMarket() {
            return this.market;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public StockDetail setChangeAmount(double d) {
            this.change_amount = Optional.e(Double.valueOf(d));
            return this;
        }

        public StockDetail setChangeRatio(double d) {
            this.change_ratio = Optional.e(Double.valueOf(d));
            return this;
        }

        public StockDetail setClosePrice(double d) {
            this.close_price = Optional.e(Double.valueOf(d));
            return this;
        }

        public StockDetail setCode(String str) {
            this.code = Optional.e(str);
            return this;
        }

        public StockDetail setCurPrice(double d) {
            this.cur_price = Optional.e(Double.valueOf(d));
            return this;
        }

        public StockDetail setHighestPrice(double d) {
            this.highest_price = Optional.e(Double.valueOf(d));
            return this;
        }

        public StockDetail setLowestPrice(double d) {
            this.lowest_price = Optional.e(Double.valueOf(d));
            return this;
        }

        public StockDetail setMarket(String str) {
            this.market = Optional.e(str);
            return this;
        }

        public StockDetail setName(String str) {
            this.name = Optional.e(str);
            return this;
        }
    }

    public enum StreamIconPosition {
        UNKNOWN(-1),
        CENTER(0),
        TOP_LEFT(1),
        TOP_RIGHT(2),
        BOTTOM_LEFT(3),
        BOTTOM_RIGHT(4);

        private int id;

        StreamIconPosition(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class StreamImage {
        private Optional<Image> image = Optional.a();
        private Optional<StreamImagePosition> image_position = Optional.a();

        public Optional<Image> getImage() {
            return this.image;
        }

        public Optional<StreamImagePosition> getImagePosition() {
            return this.image_position;
        }

        public StreamImage setImage(Image image) {
            this.image = Optional.e(image);
            return this;
        }

        public StreamImage setImagePosition(StreamImagePosition streamImagePosition) {
            this.image_position = Optional.e(streamImagePosition);
            return this;
        }
    }

    public static class StreamImageIcon {
        private Optional<Image> icon = Optional.a();
        private Optional<Image> dark_icon = Optional.a();
        private Optional<StreamIconPosition> icon_position = Optional.a();
        private Optional<String> desc = Optional.a();

        public Optional<Image> getDarkIcon() {
            return this.dark_icon;
        }

        public Optional<String> getDesc() {
            return this.desc;
        }

        public Optional<Image> getIcon() {
            return this.icon;
        }

        public Optional<StreamIconPosition> getIconPosition() {
            return this.icon_position;
        }

        public StreamImageIcon setDarkIcon(Image image) {
            this.dark_icon = Optional.e(image);
            return this;
        }

        public StreamImageIcon setDesc(String str) {
            this.desc = Optional.e(str);
            return this;
        }

        public StreamImageIcon setIcon(Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        public StreamImageIcon setIconPosition(StreamIconPosition streamIconPosition) {
            this.icon_position = Optional.e(streamIconPosition);
            return this;
        }
    }

    public static class StreamImageItem {
        private Optional<StreamImage> image = Optional.a();
        private Optional<List<StreamImageIcon>> initial_icon = Optional.a();
        private Optional<StreamImageIcon> sub_title = Optional.a();
        private Optional<mj1> operations = Optional.a();

        public Optional<StreamImage> getImage() {
            return this.image;
        }

        public Optional<List<StreamImageIcon>> getInitialIcon() {
            return this.initial_icon;
        }

        public Optional<mj1> getOperations() {
            return this.operations;
        }

        public Optional<StreamImageIcon> getSubTitle() {
            return this.sub_title;
        }

        public StreamImageItem setImage(StreamImage streamImage) {
            this.image = Optional.e(streamImage);
            return this;
        }

        public StreamImageItem setInitialIcon(List<StreamImageIcon> list) {
            this.initial_icon = Optional.e(list);
            return this;
        }

        public StreamImageItem setOperations(mj1 mj1Var) {
            this.operations = Optional.e(mj1Var);
            return this;
        }

        public StreamImageItem setSubTitle(StreamImageIcon streamImageIcon) {
            this.sub_title = Optional.e(streamImageIcon);
            return this;
        }
    }

    public enum StreamImagePosition {
        UNKNOWN(-1),
        TOP(0),
        BOTTOM(1),
        RIGHT(2),
        LEFT(3);

        private int id;

        StreamImagePosition(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SwitchPanelType {
        UNKNOWN(-1),
        DEFAULT(0),
        COUNTDOWN(1);

        private int id;

        SwitchPanelType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class SynonymCardV2 {
        private Optional<List<MachineTranslation>> translations = Optional.a();
        private Optional<List<String>> synonym_words = Optional.a();

        public Optional<List<String>> getSynonymWords() {
            return this.synonym_words;
        }

        public Optional<List<MachineTranslation>> getTranslations() {
            return this.translations;
        }

        public SynonymCardV2 setSynonymWords(List<String> list) {
            this.synonym_words = Optional.e(list);
            return this;
        }

        public SynonymCardV2 setTranslations(List<MachineTranslation> list) {
            this.translations = Optional.e(list);
            return this;
        }
    }

    public static class TTSTextItem {

        @Required
        private String text;

        @Required
        private Title title;

        public TTSTextItem() {
        }

        public TTSTextItem(Title title, String str) {
            this.title = title;
            this.text = str;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public Title getTitle() {
            return this.title;
        }

        @Required
        public TTSTextItem setText(String str) {
            this.text = str;
            return this;
        }

        @Required
        public TTSTextItem setTitle(Title title) {
            this.title = title;
            return this;
        }
    }

    public static class TableAttribute {
        private Optional<Align> align = Optional.a();

        public Optional<Align> getAlign() {
            return this.align;
        }

        public TableAttribute setAlign(Align align) {
            this.align = Optional.e(align);
            return this;
        }
    }

    public static class TableData {

        @Required
        private List<List<TableCell>> data;

        @Required
        private List<TableHeader> headers;

        public TableData() {
        }

        public TableData(List<TableHeader> list, List<List<TableCell>> list2) {
            this.headers = list;
            this.data = list2;
        }

        @Required
        public List<List<TableCell>> getData() {
            return this.data;
        }

        @Required
        public List<TableHeader> getHeaders() {
            return this.headers;
        }

        @Required
        public TableData setData(List<List<TableCell>> list) {
            this.data = list;
            return this;
        }

        @Required
        public TableData setHeaders(List<TableHeader> list) {
            this.headers = list;
            return this;
        }
    }

    public enum TableType {
        UNKNOWN(-1),
        NBA_STANDINGS(0),
        WORLD_CUP_STANDINGS(1),
        WORLD_CUP_SQUAD_LISTS(2),
        WORLD_CUP_BEST_GOALSCORERS(3);

        private int id;

        TableType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum TaskLoadType {
        REFRESH(0),
        APPEND(1),
        QUIT(2);

        private int id;

        TaskLoadType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum TimeOfDayType {
        UNKNOWN(-1),
        MORNING(0),
        AFTERNOON(1);

        private int id;

        TimeOfDayType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum TimeType {
        UNKNOWN(-1),
        DATE(0),
        TIME(1);

        private int id;

        TimeType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class ToDoContent {

        @Required
        private String time;

        @Required
        private String todo;

        public ToDoContent() {
        }

        public ToDoContent(String str, String str2) {
            this.todo = str;
            this.time = str2;
        }

        @Required
        public String getTime() {
            return this.time;
        }

        @Required
        public String getTodo() {
            return this.todo;
        }

        @Required
        public ToDoContent setTime(String str) {
            this.time = str;
            return this;
        }

        @Required
        public ToDoContent setTodo(String str) {
            this.todo = str;
            return this;
        }
    }

    public enum ToastPosition {
        UNKNOWN(-1),
        TOP(0);

        private int id;

        ToastPosition(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "ToastStream", namespace = AIApiConstants.Template.NAME)
    public static class ToastStream implements InstructionPayload {

        @Required
        private String markdown_text;

        public ToastStream() {
        }

        public ToastStream(String str) {
            this.markdown_text = str;
        }

        @Required
        public String getMarkdownText() {
            return this.markdown_text;
        }

        @Required
        public ToastStream setMarkdownText(String str) {
            this.markdown_text = str;
            return this;
        }
    }

    public enum TranslationType {
        UNKNOWN(-1),
        DICTIONARY(0),
        MACHINE(1);

        private int id;

        TranslationType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "VehicleControlResultCard", namespace = AIApiConstants.Template.NAME)
    public static class VehicleControlResultCard implements InstructionPayload {

        @Required
        private List<VehicleControlResultItem> items;

        public VehicleControlResultCard() {
        }

        public VehicleControlResultCard(List<VehicleControlResultItem> list) {
            this.items = list;
        }

        @Required
        public List<VehicleControlResultItem> getItems() {
            return this.items;
        }

        @Required
        public VehicleControlResultCard setItems(List<VehicleControlResultItem> list) {
            this.items = list;
            return this;
        }
    }

    public enum VehicleControlResultType {
        UNKNOWN(-1),
        SUCC(0),
        INOPERABLE(1),
        FAILED(2),
        CONFIRMATION(3);

        private int id;

        VehicleControlResultType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum VehicleDeviceIcon {
        UNKNOWN(-1),
        WINDOW(0),
        LEFT_DOOR(1),
        RIGHT_DOOR(2),
        READING_LIGHT(3),
        SEAT(4);

        private int id;

        VehicleDeviceIcon(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "VehicleDialEmoticons", namespace = AIApiConstants.Template.NAME)
    public static class VehicleDialEmoticons implements InstructionPayload {

        @Required
        private List<Integer> left;

        @Required
        private List<Integer> right;

        public VehicleDialEmoticons() {
        }

        public VehicleDialEmoticons(List<Integer> list, List<Integer> list2) {
            this.left = list;
            this.right = list2;
        }

        @Required
        public List<Integer> getLeft() {
            return this.left;
        }

        @Required
        public List<Integer> getRight() {
            return this.right;
        }

        @Required
        public VehicleDialEmoticons setLeft(List<Integer> list) {
            this.left = list;
            return this;
        }

        @Required
        public VehicleDialEmoticons setRight(List<Integer> list) {
            this.right = list;
            return this;
        }
    }

    public enum VehicleStatus {
        UNKNOWN(-1),
        NORMAL(0),
        STOP(1),
        POWER_OFF(2);

        private int id;

        VehicleStatus(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class VideoActor {

        @Required
        private Image avatar;

        @Required
        private String name;

        @Required
        private VideoActorRole role;

        public VideoActor() {
        }

        public VideoActor(String str, Image image, VideoActorRole videoActorRole) {
            this.name = str;
            this.avatar = image;
            this.role = videoActorRole;
        }

        @Required
        public Image getAvatar() {
            return this.avatar;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public VideoActorRole getRole() {
            return this.role;
        }

        @Required
        public VideoActor setAvatar(Image image) {
            this.avatar = image;
            return this;
        }

        @Required
        public VideoActor setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public VideoActor setRole(VideoActorRole videoActorRole) {
            this.role = videoActorRole;
            return this;
        }
    }

    public enum VideoActorRole {
        DEFAULT(0),
        DIRECTOR(1),
        MAIN_ACTOR(2),
        ACTOR(3),
        PRODUCER(4);

        private int id;

        VideoActorRole(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "VideoGeneration", namespace = AIApiConstants.Template.NAME)
    public static class VideoGeneration implements InstructionPayload {
        private Optional<String> query = Optional.a();
        private Optional<Boolean> again = Optional.a();
        private Optional<List<Common.VideoCutMessage>> message_list = Optional.a();
        private Optional<String> suc_hits = Optional.a();
        private Optional<String> fail_hits = Optional.a();
        private Optional<String> style = Optional.a();
        private Optional<List<String>> music = Optional.a();
        private Optional<String> desc = Optional.a();

        public Optional<String> getDesc() {
            return this.desc;
        }

        public Optional<String> getFailHits() {
            return this.fail_hits;
        }

        public Optional<List<Common.VideoCutMessage>> getMessageList() {
            return this.message_list;
        }

        public Optional<List<String>> getMusic() {
            return this.music;
        }

        public Optional<String> getQuery() {
            return this.query;
        }

        public Optional<String> getStyle() {
            return this.style;
        }

        public Optional<String> getSucHits() {
            return this.suc_hits;
        }

        public Optional<Boolean> isAgain() {
            return this.again;
        }

        public VideoGeneration setAgain(boolean z) {
            this.again = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VideoGeneration setDesc(String str) {
            this.desc = Optional.e(str);
            return this;
        }

        public VideoGeneration setFailHits(String str) {
            this.fail_hits = Optional.e(str);
            return this;
        }

        public VideoGeneration setMessageList(List<Common.VideoCutMessage> list) {
            this.message_list = Optional.e(list);
            return this;
        }

        public VideoGeneration setMusic(List<String> list) {
            this.music = Optional.e(list);
            return this;
        }

        public VideoGeneration setQuery(String str) {
            this.query = Optional.e(str);
            return this;
        }

        public VideoGeneration setStyle(String str) {
            this.style = Optional.e(str);
            return this;
        }

        public VideoGeneration setSucHits(String str) {
            this.suc_hits = Optional.e(str);
            return this;
        }
    }

    public enum VideoLengthType {
        UNKNOWN(-1),
        LONG(0),
        SHORT(1);

        private int id;

        VideoLengthType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum VideoShowStatus {
        UNKNOWN(-1),
        OFFLINE(0),
        PRE_ONLINE(1),
        ONLINE(2),
        PRE_SALE(3),
        FINISHED(4),
        NOT_FINISHED(5);

        private int id;

        VideoShowStatus(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class VideoSnapshot {
        private Optional<Image> cover = Optional.a();
        private Optional<Title> title = Optional.a();
        private Optional<Image> pause_icon = Optional.a();
        private Optional<Launcher> launcher = Optional.a();
        private Optional<VideoSource> source = Optional.a();
        private Optional<Integer> duration_in_ms = Optional.a();

        public Optional<Image> getCover() {
            return this.cover;
        }

        public Optional<Integer> getDurationInMs() {
            return this.duration_in_ms;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<Image> getPauseIcon() {
            return this.pause_icon;
        }

        public Optional<VideoSource> getSource() {
            return this.source;
        }

        public Optional<Title> getTitle() {
            return this.title;
        }

        public VideoSnapshot setCover(Image image) {
            this.cover = Optional.e(image);
            return this;
        }

        public VideoSnapshot setDurationInMs(int i) {
            this.duration_in_ms = Optional.e(Integer.valueOf(i));
            return this;
        }

        public VideoSnapshot setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public VideoSnapshot setPauseIcon(Image image) {
            this.pause_icon = Optional.e(image);
            return this;
        }

        public VideoSnapshot setSource(VideoSource videoSource) {
            this.source = Optional.e(videoSource);
            return this;
        }

        public VideoSnapshot setTitle(Title title) {
            this.title = Optional.e(title);
            return this;
        }
    }

    public static class VideoSource {
        private Optional<String> id = Optional.a();
        private Optional<Integer> width_in_pixel = Optional.a();
        private Optional<Integer> height_in_pixel = Optional.a();
        private Optional<Boolean> authentication = Optional.a();
        private Optional<String> token = Optional.a();
        private Optional<String> md5 = Optional.a();

        public Optional<Integer> getHeightInPixel() {
            return this.height_in_pixel;
        }

        public Optional<String> getId() {
            return this.id;
        }

        public Optional<String> getMd5() {
            return this.md5;
        }

        public Optional<String> getToken() {
            return this.token;
        }

        public Optional<Integer> getWidthInPixel() {
            return this.width_in_pixel;
        }

        public Optional<Boolean> isAuthentication() {
            return this.authentication;
        }

        public VideoSource setAuthentication(boolean z) {
            this.authentication = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VideoSource setHeightInPixel(int i) {
            this.height_in_pixel = Optional.e(Integer.valueOf(i));
            return this;
        }

        public VideoSource setId(String str) {
            this.id = Optional.e(str);
            return this;
        }

        public VideoSource setMd5(String str) {
            this.md5 = Optional.e(str);
            return this;
        }

        public VideoSource setToken(String str) {
            this.token = Optional.e(str);
            return this;
        }

        public VideoSource setWidthInPixel(int i) {
            this.width_in_pixel = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    public static class WeatherCode {
        private Optional<String> current = Optional.a();
        private Optional<String> from = Optional.a();
        private Optional<String> to = Optional.a();

        public Optional<String> getCurrent() {
            return this.current;
        }

        public Optional<String> getFrom() {
            return this.from;
        }

        public Optional<String> getTo() {
            return this.to;
        }

        public WeatherCode setCurrent(String str) {
            this.current = Optional.e(str);
            return this;
        }

        public WeatherCode setFrom(String str) {
            this.from = Optional.e(str);
            return this;
        }

        public WeatherCode setTo(String str) {
            this.to = Optional.e(str);
            return this;
        }
    }

    public static class WeatherWind {
        private Optional<WeatherWindDirection> direction = Optional.a();
        private Optional<WeatherWindSpeed> speed = Optional.a();

        public Optional<WeatherWindDirection> getDirection() {
            return this.direction;
        }

        public Optional<WeatherWindSpeed> getSpeed() {
            return this.speed;
        }

        public WeatherWind setDirection(WeatherWindDirection weatherWindDirection) {
            this.direction = Optional.e(weatherWindDirection);
            return this;
        }

        public WeatherWind setSpeed(WeatherWindSpeed weatherWindSpeed) {
            this.speed = Optional.e(weatherWindSpeed);
            return this;
        }
    }

    public enum WikiEventType {
        UNKNOWN(-1),
        POLYSEMY(0),
        ENTITY(1);

        private int id;

        WikiEventType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "AIInputFunctionGuide", namespace = AIApiConstants.Template.NAME)
    public static class AIInputFunctionGuide implements InstructionPayload {

        @Required
        private String desc;
        private Optional<List<AIInputEnableGuideItem>> enableItems = Optional.a();

        @Required
        private List<AIInputFunctionGuideItem> items;

        public AIInputFunctionGuide() {
        }

        @Required
        public String getDesc() {
            return this.desc;
        }

        public Optional<List<AIInputEnableGuideItem>> getEnableItems() {
            return this.enableItems;
        }

        @Required
        public List<AIInputFunctionGuideItem> getItems() {
            return this.items;
        }

        @Required
        public AIInputFunctionGuide setDesc(String str) {
            this.desc = str;
            return this;
        }

        public AIInputFunctionGuide setEnableItems(List<AIInputEnableGuideItem> list) {
            this.enableItems = Optional.e(list);
            return this;
        }

        @Required
        public AIInputFunctionGuide setItems(List<AIInputFunctionGuideItem> list) {
            this.items = list;
            return this;
        }

        public AIInputFunctionGuide(String str, List<AIInputFunctionGuideItem> list) {
            this.desc = str;
            this.items = list;
        }
    }

    public static class AIInputFunctionGuideItem {
        private Optional<Image> icon = Optional.a();

        @Required
        private String text;

        public AIInputFunctionGuideItem() {
        }

        public Optional<Image> getIcon() {
            return this.icon;
        }

        @Required
        public String getText() {
            return this.text;
        }

        public AIInputFunctionGuideItem setIcon(Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        @Required
        public AIInputFunctionGuideItem setText(String str) {
            this.text = str;
            return this;
        }

        public AIInputFunctionGuideItem(String str) {
            this.text = str;
        }
    }

    public static class AbstractItem {

        @Deprecated
        private Optional<String> entity = Optional.a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Required
        private String f10996k;

        @Required
        private String v;

        public AbstractItem() {
        }

        @Deprecated
        public Optional<String> getEntity() {
            return this.entity;
        }

        @Required
        public String getK() {
            return this.f10996k;
        }

        @Required
        public String getV() {
            return this.v;
        }

        @Deprecated
        public AbstractItem setEntity(String str) {
            this.entity = Optional.e(str);
            return this;
        }

        @Required
        public AbstractItem setK(String str) {
            this.f10996k = str;
            return this;
        }

        @Required
        public AbstractItem setV(String str) {
            this.v = str;
            return this;
        }

        public AbstractItem(String str, String str2) {
            this.f10996k = str;
            this.v = str2;
        }
    }

    public static class AncientPoemData {

        @Required
        private String audio_id;

        @Required
        private List<String> authors;

        @Required
        private String dynasty;
        private Optional<String> meaning = Optional.a();

        @Required
        private String name;

        @Required
        private String verse;

        public AncientPoemData() {
        }

        @Required
        public String getAudioId() {
            return this.audio_id;
        }

        @Required
        public List<String> getAuthors() {
            return this.authors;
        }

        @Required
        public String getDynasty() {
            return this.dynasty;
        }

        public Optional<String> getMeaning() {
            return this.meaning;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public String getVerse() {
            return this.verse;
        }

        @Required
        public AncientPoemData setAudioId(String str) {
            this.audio_id = str;
            return this;
        }

        @Required
        public AncientPoemData setAuthors(List<String> list) {
            this.authors = list;
            return this;
        }

        @Required
        public AncientPoemData setDynasty(String str) {
            this.dynasty = str;
            return this;
        }

        public AncientPoemData setMeaning(String str) {
            this.meaning = Optional.e(str);
            return this;
        }

        @Required
        public AncientPoemData setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public AncientPoemData setVerse(String str) {
            this.verse = str;
            return this;
        }

        public AncientPoemData(String str, List<String> list, String str2, String str3, String str4) {
            this.name = str;
            this.authors = list;
            this.verse = str2;
            this.audio_id = str3;
            this.dynasty = str4;
        }
    }

    public static class AppVersion {

        @Required
        private int latest;

        @Required
        private int min;
        private Optional<String> version_name = Optional.a();

        public AppVersion() {
        }

        @Required
        public int getLatest() {
            return this.latest;
        }

        @Required
        public int getMin() {
            return this.min;
        }

        public Optional<String> getVersionName() {
            return this.version_name;
        }

        @Required
        public AppVersion setLatest(int i) {
            this.latest = i;
            return this;
        }

        @Required
        public AppVersion setMin(int i) {
            this.min = i;
            return this;
        }

        public AppVersion setVersionName(String str) {
            this.version_name = Optional.e(str);
            return this;
        }

        public AppVersion(int i, int i2) {
            this.min = i;
            this.latest = i2;
        }
    }

    public static class AudioProvider {
        private Optional<Launcher> launcher = Optional.a();

        @Required
        private Image logo;

        @Required
        private String name;

        public AudioProvider() {
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        @Required
        public Image getLogo() {
            return this.logo;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public AudioProvider setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        @Required
        public AudioProvider setLogo(Image image) {
            this.logo = image;
            return this;
        }

        @Required
        public AudioProvider setName(String str) {
            this.name = str;
            return this;
        }

        public AudioProvider(String str, Image image) {
            this.name = str;
            this.logo = image;
        }
    }

    public static class BackgroundColor {

        @Required
        private List<Integer> colors;
        private Optional<GradientOrientationType> gradient_orientation = Optional.a();

        @Required
        private BackgroundColorType type;

        public BackgroundColor() {
        }

        @Required
        public List<Integer> getColors() {
            return this.colors;
        }

        public Optional<GradientOrientationType> getGradientOrientation() {
            return this.gradient_orientation;
        }

        @Required
        public BackgroundColorType getType() {
            return this.type;
        }

        @Required
        public BackgroundColor setColors(List<Integer> list) {
            this.colors = list;
            return this;
        }

        public BackgroundColor setGradientOrientation(GradientOrientationType gradientOrientationType) {
            this.gradient_orientation = Optional.e(gradientOrientationType);
            return this;
        }

        @Required
        public BackgroundColor setType(BackgroundColorType backgroundColorType) {
            this.type = backgroundColorType;
            return this;
        }

        public BackgroundColor(BackgroundColorType backgroundColorType, List<Integer> list) {
            this.type = backgroundColorType;
            this.colors = list;
        }
    }

    public static class CarouselLoadingText {
        private Optional<String> fixed_loading_text = Optional.a();

        @Required
        private List<String> loading_text_prefix;

        @Required
        private List<String> loading_text_suffix;

        @Required
        private int loading_text_switch_time;

        public CarouselLoadingText() {
        }

        public Optional<String> getFixedLoadingText() {
            return this.fixed_loading_text;
        }

        @Required
        public List<String> getLoadingTextPrefix() {
            return this.loading_text_prefix;
        }

        @Required
        public List<String> getLoadingTextSuffix() {
            return this.loading_text_suffix;
        }

        @Required
        public int getLoadingTextSwitchTime() {
            return this.loading_text_switch_time;
        }

        public CarouselLoadingText setFixedLoadingText(String str) {
            this.fixed_loading_text = Optional.e(str);
            return this;
        }

        @Required
        public CarouselLoadingText setLoadingTextPrefix(List<String> list) {
            this.loading_text_prefix = list;
            return this;
        }

        @Required
        public CarouselLoadingText setLoadingTextSuffix(List<String> list) {
            this.loading_text_suffix = list;
            return this;
        }

        @Required
        public CarouselLoadingText setLoadingTextSwitchTime(int i) {
            this.loading_text_switch_time = i;
            return this;
        }

        public CarouselLoadingText(List<String> list, List<String> list2, int i) {
            this.loading_text_prefix = list;
            this.loading_text_suffix = list2;
            this.loading_text_switch_time = i;
        }
    }

    public static class Cineaste {

        @Required
        private Image avatar;

        @Required
        private String id;
        private Optional<String> meta_id = Optional.a();

        @Required
        private String name;

        public Cineaste() {
        }

        @Required
        public Image getAvatar() {
            return this.avatar;
        }

        @Required
        public String getId() {
            return this.id;
        }

        public Optional<String> getMetaId() {
            return this.meta_id;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public Cineaste setAvatar(Image image) {
            this.avatar = image;
            return this;
        }

        @Required
        public Cineaste setId(String str) {
            this.id = str;
            return this;
        }

        public Cineaste setMetaId(String str) {
            this.meta_id = Optional.e(str);
            return this;
        }

        @Required
        public Cineaste setName(String str) {
            this.name = str;
            return this;
        }

        public Cineaste(String str, String str2, Image image) {
            this.name = str;
            this.id = str2;
            this.avatar = image;
        }
    }

    public static class ClickAlbum {

        @Required
        private List<Image> images;
        private Optional<Launcher> launcher = Optional.a();

        public ClickAlbum() {
        }

        @Required
        public List<Image> getImages() {
            return this.images;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        @Required
        public ClickAlbum setImages(List<Image> list) {
            this.images = list;
            return this;
        }

        public ClickAlbum setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public ClickAlbum(List<Image> list) {
            this.images = list;
        }
    }

    public static class CustomBackground {
        private Optional<BackgroundColor> background_color = Optional.a();

        @Required
        private boolean dark_mode;

        public CustomBackground() {
        }

        public Optional<BackgroundColor> getBackgroundColor() {
            return this.background_color;
        }

        @Required
        public boolean isDarkMode() {
            return this.dark_mode;
        }

        public CustomBackground setBackgroundColor(BackgroundColor backgroundColor) {
            this.background_color = Optional.e(backgroundColor);
            return this;
        }

        @Required
        public CustomBackground setDarkMode(boolean z) {
            this.dark_mode = z;
            return this;
        }

        public CustomBackground(boolean z) {
            this.dark_mode = z;
        }
    }

    @NamespaceName(name = "DynamicDialogFlow", namespace = AIApiConstants.Template.NAME)
    public static class DynamicDialogFlow implements InstructionPayload {

        @Required
        private Image skill_icon;
        private Optional<Title> title = Optional.a();

        public DynamicDialogFlow() {
        }

        @Required
        public Image getSkillIcon() {
            return this.skill_icon;
        }

        public Optional<Title> getTitle() {
            return this.title;
        }

        @Required
        public DynamicDialogFlow setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        public DynamicDialogFlow setTitle(Title title) {
            this.title = Optional.e(title);
            return this;
        }

        public DynamicDialogFlow(Image image) {
            this.skill_icon = image;
        }
    }

    public static class ErrorDetail {
        private Optional<String> audio_url = Optional.a();

        @Required
        private String description;

        public ErrorDetail() {
        }

        public Optional<String> getAudioUrl() {
            return this.audio_url;
        }

        @Required
        public String getDescription() {
            return this.description;
        }

        public ErrorDetail setAudioUrl(String str) {
            this.audio_url = Optional.e(str);
            return this;
        }

        @Required
        public ErrorDetail setDescription(String str) {
            this.description = str;
            return this;
        }

        public ErrorDetail(String str) {
            this.description = str;
        }
    }

    public static class FacilityLocation {
        private Optional<Image> icon = Optional.a();

        @Required
        private String location;

        public FacilityLocation() {
        }

        public Optional<Image> getIcon() {
            return this.icon;
        }

        @Required
        public String getLocation() {
            return this.location;
        }

        public FacilityLocation setIcon(Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        @Required
        public FacilityLocation setLocation(String str) {
            this.location = str;
            return this;
        }

        public FacilityLocation(String str) {
            this.location = str;
        }
    }

    public static class FacilityTime {
        private Optional<Image> icon = Optional.a();

        @Required
        private String time;

        public FacilityTime() {
        }

        public Optional<Image> getIcon() {
            return this.icon;
        }

        @Required
        public String getTime() {
            return this.time;
        }

        public FacilityTime setIcon(Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        @Required
        public FacilityTime setTime(String str) {
            this.time = str;
            return this;
        }

        public FacilityTime(String str) {
            this.time = str;
        }
    }

    @NamespaceName(name = "ForeignDictionary", namespace = AIApiConstants.Template.NAME)
    public static class ForeignDictionary implements InstructionPayload {

        @Required
        private String description;
        private Optional<List<ForeignDictionaryWordTranslations>> word_translations = Optional.a();

        public ForeignDictionary() {
        }

        @Required
        public String getDescription() {
            return this.description;
        }

        public Optional<List<ForeignDictionaryWordTranslations>> getWordTranslations() {
            return this.word_translations;
        }

        @Required
        public ForeignDictionary setDescription(String str) {
            this.description = str;
            return this;
        }

        public ForeignDictionary setWordTranslations(List<ForeignDictionaryWordTranslations> list) {
            this.word_translations = Optional.e(list);
            return this;
        }

        public ForeignDictionary(String str) {
            this.description = str;
        }
    }

    public static class ForeignDictionaryWordTranslations {
        private Optional<ForeignDictionaryExampleSentence> example_sentence = Optional.a();

        @Required
        private ForeignDictionaryWord word;

        public ForeignDictionaryWordTranslations() {
        }

        public Optional<ForeignDictionaryExampleSentence> getExampleSentence() {
            return this.example_sentence;
        }

        @Required
        public ForeignDictionaryWord getWord() {
            return this.word;
        }

        public ForeignDictionaryWordTranslations setExampleSentence(ForeignDictionaryExampleSentence foreignDictionaryExampleSentence) {
            this.example_sentence = Optional.e(foreignDictionaryExampleSentence);
            return this;
        }

        @Required
        public ForeignDictionaryWordTranslations setWord(ForeignDictionaryWord foreignDictionaryWord) {
            this.word = foreignDictionaryWord;
            return this;
        }

        public ForeignDictionaryWordTranslations(ForeignDictionaryWord foreignDictionaryWord) {
            this.word = foreignDictionaryWord;
        }
    }

    public static class HomeDetail {

        @Required
        private long home_id;

        @Required
        private String home_name;

        @Required
        private List<RoomDetail> rooms;
        private Optional<Boolean> support_select_all = Optional.a();

        public HomeDetail() {
        }

        @Required
        public long getHomeId() {
            return this.home_id;
        }

        @Required
        public String getHomeName() {
            return this.home_name;
        }

        @Required
        public List<RoomDetail> getRooms() {
            return this.rooms;
        }

        public Optional<Boolean> isSupportSelectAll() {
            return this.support_select_all;
        }

        @Required
        public HomeDetail setHomeId(long j) {
            this.home_id = j;
            return this;
        }

        @Required
        public HomeDetail setHomeName(String str) {
            this.home_name = str;
            return this;
        }

        @Required
        public HomeDetail setRooms(List<RoomDetail> list) {
            this.rooms = list;
            return this;
        }

        public HomeDetail setSupportSelectAll(boolean z) {
            this.support_select_all = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public HomeDetail(long j, String str, List<RoomDetail> list) {
            this.home_id = j;
            this.home_name = str;
            this.rooms = list;
        }
    }

    public static class Image {

        @Required
        private String description;
        private Optional<ImageLauncher> launcher = Optional.a();

        @Required
        private List<ImageSource> sources;

        public Image() {
        }

        @Required
        public String getDescription() {
            return this.description;
        }

        public Optional<ImageLauncher> getLauncher() {
            return this.launcher;
        }

        @Required
        public List<ImageSource> getSources() {
            return this.sources;
        }

        @Required
        public Image setDescription(String str) {
            this.description = str;
            return this;
        }

        public Image setLauncher(ImageLauncher imageLauncher) {
            this.launcher = Optional.e(imageLauncher);
            return this;
        }

        @Required
        public Image setSources(List<ImageSource> list) {
            this.sources = list;
            return this;
        }

        public Image(String str, List<ImageSource> list) {
            this.description = str;
            this.sources = list;
        }
    }

    @NamespaceName(name = "KeyboardRewrite", namespace = AIApiConstants.Template.NAME)
    public static class KeyboardRewrite implements InstructionPayload {

        @Required
        private List<String> candidate_queries;

        @Required
        private String hint;
        private Optional<Boolean> is_emphasize = Optional.a();

        public KeyboardRewrite() {
        }

        @Required
        public List<String> getCandidateQueries() {
            return this.candidate_queries;
        }

        @Required
        public String getHint() {
            return this.hint;
        }

        public Optional<Boolean> isEmphasize() {
            return this.is_emphasize;
        }

        @Required
        public KeyboardRewrite setCandidateQueries(List<String> list) {
            this.candidate_queries = list;
            return this;
        }

        @Required
        public KeyboardRewrite setHint(String str) {
            this.hint = str;
            return this;
        }

        public KeyboardRewrite setIsEmphasize(boolean z) {
            this.is_emphasize = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public KeyboardRewrite(String str, List<String> list) {
            this.hint = str;
            this.candidate_queries = list;
        }
    }

    @NamespaceName(name = "Knowledge", namespace = AIApiConstants.Template.NAME)
    public static class Knowledge implements EventPayload {
        private Optional<Integer> count = Optional.a();

        @Required
        private KnowledgeType type;

        public Knowledge() {
        }

        public Optional<Integer> getCount() {
            return this.count;
        }

        @Required
        public KnowledgeType getType() {
            return this.type;
        }

        public Knowledge setCount(int i) {
            this.count = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Required
        public Knowledge setType(KnowledgeType knowledgeType) {
            this.type = knowledgeType;
            return this;
        }

        public Knowledge(KnowledgeType knowledgeType) {
            this.type = knowledgeType;
        }
    }

    @NamespaceName(name = "KnowledgeInfo", namespace = AIApiConstants.Template.NAME)
    public static class KnowledgeInfo implements InstructionPayload {

        @Required
        private List<KnowledgeItem> items;
        private Optional<Image> skill_icon = Optional.a();

        public KnowledgeInfo() {
        }

        @Required
        public List<KnowledgeItem> getItems() {
            return this.items;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public KnowledgeInfo setItems(List<KnowledgeItem> list) {
            this.items = list;
            return this;
        }

        public KnowledgeInfo setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public KnowledgeInfo(List<KnowledgeItem> list) {
            this.items = list;
        }
    }

    @NamespaceName(name = "LargeLanguageModelWelcome", namespace = AIApiConstants.Template.NAME)
    public static class LargeLanguageModelWelcome implements InstructionPayload {
        private Optional<Image> icon = Optional.a();

        @Required
        private String markdown_text;

        public LargeLanguageModelWelcome() {
        }

        public Optional<Image> getIcon() {
            return this.icon;
        }

        @Required
        public String getMarkdownText() {
            return this.markdown_text;
        }

        public LargeLanguageModelWelcome setIcon(Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        @Required
        public LargeLanguageModelWelcome setMarkdownText(String str) {
            this.markdown_text = str;
            return this;
        }

        public LargeLanguageModelWelcome(String str) {
            this.markdown_text = str;
        }
    }

    public static class LocalTarget {
        private Optional<String> identifier = Optional.a();

        @Required
        private String name;

        public LocalTarget() {
        }

        public Optional<String> getIdentifier() {
            return this.identifier;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public LocalTarget setIdentifier(String str) {
            this.identifier = Optional.e(str);
            return this;
        }

        @Required
        public LocalTarget setName(String str) {
            this.name = str;
            return this;
        }

        public LocalTarget(String str) {
            this.name = str;
        }
    }

    @NamespaceName(name = "LoginHint", namespace = AIApiConstants.Template.NAME)
    public static class LoginHint implements InstructionPayload {

        @Required
        private HintType hint_type;
        private Optional<String> query = Optional.a();

        @Required
        private Title title;

        public LoginHint() {
        }

        @Required
        public HintType getHintType() {
            return this.hint_type;
        }

        public Optional<String> getQuery() {
            return this.query;
        }

        @Required
        public Title getTitle() {
            return this.title;
        }

        @Required
        public LoginHint setHintType(HintType hintType) {
            this.hint_type = hintType;
            return this;
        }

        public LoginHint setQuery(String str) {
            this.query = Optional.e(str);
            return this;
        }

        @Required
        public LoginHint setTitle(Title title) {
            this.title = title;
            return this;
        }

        public LoginHint(Title title, HintType hintType) {
            this.title = title;
            this.hint_type = hintType;
        }
    }

    @NamespaceName(name = "MemoryUpdate", namespace = AIApiConstants.Template.NAME)
    public static class MemoryUpdate implements InstructionPayload {
        private Optional<Boolean> is_full = Optional.a();

        @Required
        private List<MemoryBaseInfo> memory_base_infos;

        public MemoryUpdate() {
        }

        @Required
        public List<MemoryBaseInfo> getMemoryBaseInfos() {
            return this.memory_base_infos;
        }

        public Optional<Boolean> isFull() {
            return this.is_full;
        }

        public MemoryUpdate setIsFull(boolean z) {
            this.is_full = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public MemoryUpdate setMemoryBaseInfos(List<MemoryBaseInfo> list) {
            this.memory_base_infos = list;
            return this;
        }

        public MemoryUpdate(List<MemoryBaseInfo> list) {
            this.memory_base_infos = list;
        }
    }

    @NamespaceName(name = "MiotScenes", namespace = AIApiConstants.Template.NAME)
    public static class MiotScenes implements InstructionPayload {
        private Optional<MiotRichStatus> miot_rich_status = Optional.a();

        @Required
        private ScenesOperateResult scenes_operate_result;

        @Required
        private String tts;

        public MiotScenes() {
        }

        public Optional<MiotRichStatus> getMiotRichStatus() {
            return this.miot_rich_status;
        }

        @Required
        public ScenesOperateResult getScenesOperateResult() {
            return this.scenes_operate_result;
        }

        @Required
        public String getTts() {
            return this.tts;
        }

        public MiotScenes setMiotRichStatus(MiotRichStatus miotRichStatus) {
            this.miot_rich_status = Optional.e(miotRichStatus);
            return this;
        }

        @Required
        public MiotScenes setScenesOperateResult(ScenesOperateResult scenesOperateResult) {
            this.scenes_operate_result = scenesOperateResult;
            return this;
        }

        @Required
        public MiotScenes setTts(String str) {
            this.tts = str;
            return this;
        }

        public MiotScenes(String str, ScenesOperateResult scenesOperateResult) {
            this.tts = str;
            this.scenes_operate_result = scenesOperateResult;
        }
    }

    public static class PlayInfoItemProvider {
        private Optional<Image> logo = Optional.a();

        @Required
        private String name;

        public PlayInfoItemProvider() {
        }

        public Optional<Image> getLogo() {
            return this.logo;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public PlayInfoItemProvider setLogo(Image image) {
            this.logo = Optional.e(image);
            return this;
        }

        @Required
        public PlayInfoItemProvider setName(String str) {
            this.name = str;
            return this;
        }

        public PlayInfoItemProvider(String str) {
            this.name = str;
        }
    }

    public static class PredictRate {

        @Required
        private double away_win;
        private Optional<Double> draw = Optional.a();

        @Required
        private double home_win;

        public PredictRate() {
        }

        @Required
        public double getAwayWin() {
            return this.away_win;
        }

        public Optional<Double> getDraw() {
            return this.draw;
        }

        @Required
        public double getHomeWin() {
            return this.home_win;
        }

        @Required
        public PredictRate setAwayWin(double d) {
            this.away_win = d;
            return this;
        }

        public PredictRate setDraw(double d) {
            this.draw = Optional.e(Double.valueOf(d));
            return this;
        }

        @Required
        public PredictRate setHomeWin(double d) {
            this.home_win = d;
            return this;
        }

        public PredictRate(double d, double d2) {
            this.home_win = d;
            this.away_win = d2;
        }
    }

    public static class Pronunciation {

        @Required
        private List<String> text;
        private Optional<String> url = Optional.a();

        public Pronunciation() {
        }

        @Required
        public List<String> getText() {
            return this.text;
        }

        public Optional<String> getUrl() {
            return this.url;
        }

        @Required
        public Pronunciation setText(List<String> list) {
            this.text = list;
            return this;
        }

        public Pronunciation setUrl(String str) {
            this.url = Optional.e(str);
            return this;
        }

        public Pronunciation(List<String> list) {
            this.text = list;
        }
    }

    public static class QabotParagraph {

        @Required
        private List<String> content;
        private Optional<Image> image = Optional.a();

        @Required
        private Title title;

        public QabotParagraph() {
        }

        @Required
        public List<String> getContent() {
            return this.content;
        }

        public Optional<Image> getImage() {
            return this.image;
        }

        @Required
        public Title getTitle() {
            return this.title;
        }

        @Required
        public QabotParagraph setContent(List<String> list) {
            this.content = list;
            return this;
        }

        public QabotParagraph setImage(Image image) {
            this.image = Optional.e(image);
            return this;
        }

        @Required
        public QabotParagraph setTitle(Title title) {
            this.title = title;
            return this;
        }

        public QabotParagraph(Title title, List<String> list) {
            this.title = title;
            this.content = list;
        }
    }

    @NamespaceName(name = "RepeatQuery", namespace = AIApiConstants.Template.NAME)
    public static class RepeatQuery implements InstructionPayload {

        @Required
        private String message;

        @Required
        private String query;
        private Optional<String> reason = Optional.a();

        public RepeatQuery() {
        }

        @Required
        public String getMessage() {
            return this.message;
        }

        @Required
        public String getQuery() {
            return this.query;
        }

        public Optional<String> getReason() {
            return this.reason;
        }

        @Required
        public RepeatQuery setMessage(String str) {
            this.message = str;
            return this;
        }

        @Required
        public RepeatQuery setQuery(String str) {
            this.query = str;
            return this;
        }

        public RepeatQuery setReason(String str) {
            this.reason = Optional.e(str);
            return this;
        }

        public RepeatQuery(String str, String str2) {
            this.query = str;
            this.message = str2;
        }
    }

    public static class RoomDetail {
        private Optional<Image> image = Optional.a();

        @Required
        private long room_id;

        @Required
        private String room_name;

        public RoomDetail() {
        }

        public Optional<Image> getImage() {
            return this.image;
        }

        @Required
        public long getRoomId() {
            return this.room_id;
        }

        @Required
        public String getRoomName() {
            return this.room_name;
        }

        public RoomDetail setImage(Image image) {
            this.image = Optional.e(image);
            return this;
        }

        @Required
        public RoomDetail setRoomId(long j) {
            this.room_id = j;
            return this;
        }

        @Required
        public RoomDetail setRoomName(String str) {
            this.room_name = str;
            return this;
        }

        public RoomDetail(long j, String str) {
            this.room_id = j;
            this.room_name = str;
        }
    }

    public static class ScenarioInfo {

        @Required
        private Title home_name;
        private Optional<List<ScenarioItem>> scenario_items = Optional.a();

        public ScenarioInfo() {
        }

        @Required
        public Title getHomeName() {
            return this.home_name;
        }

        public Optional<List<ScenarioItem>> getScenarioItems() {
            return this.scenario_items;
        }

        @Required
        public ScenarioInfo setHomeName(Title title) {
            this.home_name = title;
            return this;
        }

        public ScenarioInfo setScenarioItems(List<ScenarioItem> list) {
            this.scenario_items = Optional.e(list);
            return this;
        }

        public ScenarioInfo(Title title) {
            this.home_name = title;
        }
    }

    public static class SmartHotelBaseInfo {
        private Optional<Image> icon = Optional.a();

        @Required
        private String text;

        public SmartHotelBaseInfo() {
        }

        public Optional<Image> getIcon() {
            return this.icon;
        }

        @Required
        public String getText() {
            return this.text;
        }

        public SmartHotelBaseInfo setIcon(Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        @Required
        public SmartHotelBaseInfo setText(String str) {
            this.text = str;
            return this;
        }

        public SmartHotelBaseInfo(String str) {
            this.text = str;
        }
    }

    public static class SmartHotelWifi {
        private Optional<Image> icon = Optional.a();

        @Required
        private String wifi;

        public SmartHotelWifi() {
        }

        public Optional<Image> getIcon() {
            return this.icon;
        }

        @Required
        public String getWifi() {
            return this.wifi;
        }

        public SmartHotelWifi setIcon(Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        @Required
        public SmartHotelWifi setWifi(String str) {
            this.wifi = str;
            return this;
        }

        public SmartHotelWifi(String str) {
            this.wifi = str;
        }
    }

    public static class TableCell {
        private Optional<Image> image = Optional.a();

        @Required
        private String text;

        public TableCell() {
        }

        public Optional<Image> getImage() {
            return this.image;
        }

        @Required
        public String getText() {
            return this.text;
        }

        public TableCell setImage(Image image) {
            this.image = Optional.e(image);
            return this;
        }

        @Required
        public TableCell setText(String str) {
            this.text = str;
            return this;
        }

        public TableCell(String str) {
            this.text = str;
        }
    }

    public static class TableHeader {
        private Optional<TableAttribute> attributes = Optional.a();

        @Required
        private String text;

        public TableHeader() {
        }

        public Optional<TableAttribute> getAttributes() {
            return this.attributes;
        }

        @Required
        public String getText() {
            return this.text;
        }

        public TableHeader setAttributes(TableAttribute tableAttribute) {
            this.attributes = Optional.e(tableAttribute);
            return this;
        }

        @Required
        public TableHeader setText(String str) {
            this.text = str;
            return this;
        }

        public TableHeader(String str) {
            this.text = str;
        }
    }

    public static class TableTitle {
        private Optional<Image> image = Optional.a();

        @Required
        private Title text;

        public TableTitle() {
        }

        public Optional<Image> getImage() {
            return this.image;
        }

        @Required
        public Title getText() {
            return this.text;
        }

        public TableTitle setImage(Image image) {
            this.image = Optional.e(image);
            return this;
        }

        @Required
        public TableTitle setText(Title title) {
            this.text = title;
            return this;
        }

        public TableTitle(Title title) {
            this.text = title;
        }
    }

    public static class Task {
        private Optional<Boolean> can_ui_back = Optional.a();

        @Required
        private Image icon;

        @Required
        private String id;

        @Required
        private TaskLoadType load_type;

        @Required
        private String name;

        public Task() {
        }

        @Required
        public Image getIcon() {
            return this.icon;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public TaskLoadType getLoadType() {
            return this.load_type;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<Boolean> isCanUiBack() {
            return this.can_ui_back;
        }

        public Task setCanUiBack(boolean z) {
            this.can_ui_back = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public Task setIcon(Image image) {
            this.icon = image;
            return this;
        }

        @Required
        public Task setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public Task setLoadType(TaskLoadType taskLoadType) {
            this.load_type = taskLoadType;
            return this;
        }

        @Required
        public Task setName(String str) {
            this.name = str;
            return this;
        }

        public Task(String str, Image image, String str2, TaskLoadType taskLoadType) {
            this.name = str;
            this.icon = image;
            this.id = str2;
            this.load_type = taskLoadType;
        }
    }

    public static class Title {
        private Optional<Launcher> launcher = Optional.a();

        @Required
        private String main_title;

        @Required
        private String sub_title;

        public Title() {
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        @Required
        public String getMainTitle() {
            return this.main_title;
        }

        @Required
        public String getSubTitle() {
            return this.sub_title;
        }

        public Title setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        @Required
        public Title setMainTitle(String str) {
            this.main_title = str;
            return this;
        }

        @Required
        public Title setSubTitle(String str) {
            this.sub_title = str;
            return this;
        }

        public Title(String str, String str2) {
            this.main_title = str;
            this.sub_title = str2;
        }
    }

    @NamespaceName(name = "ToDo", namespace = AIApiConstants.Template.NAME)
    public static class ToDo implements InstructionPayload {

        @Required
        private ToDoContent content;
        private Optional<Launcher> launcher = Optional.a();

        @Required
        private Image skill_icon;

        public ToDo() {
        }

        @Required
        public ToDoContent getContent() {
            return this.content;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        @Required
        public Image getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public ToDo setContent(ToDoContent toDoContent) {
            this.content = toDoContent;
            return this;
        }

        public ToDo setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        @Required
        public ToDo setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        public ToDo(ToDoContent toDoContent, Image image) {
            this.content = toDoContent;
            this.skill_icon = image;
        }
    }

    @NamespaceName(name = "TouchBar", namespace = AIApiConstants.Template.NAME)
    public static class TouchBar implements InstructionPayload {

        @Required
        private Button button;
        private Optional<Image> skill_icon = Optional.a();

        @Required
        private Title title;

        public TouchBar() {
        }

        @Required
        public Button getButton() {
            return this.button;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public Title getTitle() {
            return this.title;
        }

        @Required
        public TouchBar setButton(Button button) {
            this.button = button;
            return this;
        }

        public TouchBar setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        @Required
        public TouchBar setTitle(Title title) {
            this.title = title;
            return this;
        }

        public TouchBar(Title title, Button button) {
            this.title = title;
            this.button = button;
        }
    }

    @NamespaceName(name = "WordsInfo", namespace = AIApiConstants.Template.NAME)
    public static class WordsInfo implements InstructionPayload {
        private Optional<DisplayCommon> display = Optional.a();

        @Required
        private FullScreen full_screen;

        @Required
        private Image skill_icon;

        @Required
        private Words words;

        public WordsInfo() {
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        @Required
        public FullScreen getFullScreen() {
            return this.full_screen;
        }

        @Required
        public Image getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public Words getWords() {
            return this.words;
        }

        public WordsInfo setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        @Required
        public WordsInfo setFullScreen(FullScreen fullScreen) {
            this.full_screen = fullScreen;
            return this;
        }

        @Required
        public WordsInfo setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        @Required
        public WordsInfo setWords(Words words) {
            this.words = words;
            return this;
        }

        public WordsInfo(Words words, FullScreen fullScreen, Image image) {
            this.words = words;
            this.full_screen = fullScreen;
            this.skill_icon = image;
        }
    }

    public static class AIInputEnableGuideItem {

        @Required
        private boolean collapse;

        @Required
        private String name;
        private Optional<List<AIInputFunctionGuideItem>> items = Optional.a();
        private Optional<Image> icon = Optional.a();

        public AIInputEnableGuideItem() {
        }

        public Optional<Image> getIcon() {
            return this.icon;
        }

        public Optional<List<AIInputFunctionGuideItem>> getItems() {
            return this.items;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public boolean isCollapse() {
            return this.collapse;
        }

        @Required
        public AIInputEnableGuideItem setCollapse(boolean z) {
            this.collapse = z;
            return this;
        }

        public AIInputEnableGuideItem setIcon(Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        public AIInputEnableGuideItem setItems(List<AIInputFunctionGuideItem> list) {
            this.items = Optional.e(list);
            return this;
        }

        @Required
        public AIInputEnableGuideItem setName(String str) {
            this.name = str;
            return this;
        }

        public AIInputEnableGuideItem(String str, boolean z) {
            this.name = str;
            this.collapse = z;
        }
    }

    @NamespaceName(name = "AIMemory", namespace = AIApiConstants.Template.NAME)
    public static class AIMemory implements InstructionPayload {

        @Required
        private String content;
        private Optional<List<AIMemoryLauncher>> launchers = Optional.a();
        private Optional<Image> skill_icon = Optional.a();

        @Required
        private Title title;

        public AIMemory() {
        }

        @Required
        public String getContent() {
            return this.content;
        }

        public Optional<List<AIMemoryLauncher>> getLaunchers() {
            return this.launchers;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public Title getTitle() {
            return this.title;
        }

        @Required
        public AIMemory setContent(String str) {
            this.content = str;
            return this;
        }

        public AIMemory setLaunchers(List<AIMemoryLauncher> list) {
            this.launchers = Optional.e(list);
            return this;
        }

        public AIMemory setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        @Required
        public AIMemory setTitle(Title title) {
            this.title = title;
            return this;
        }

        public AIMemory(Title title, String str) {
            this.title = title;
            this.content = str;
        }
    }

    public static class AIMemoryLauncher {
        private Optional<Image> icon = Optional.a();
        private Optional<Launcher> launcher = Optional.a();

        @Required
        private String name;

        public AIMemoryLauncher() {
        }

        public Optional<Image> getIcon() {
            return this.icon;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public AIMemoryLauncher setIcon(Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        public AIMemoryLauncher setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        @Required
        public AIMemoryLauncher setName(String str) {
            this.name = str;
            return this;
        }

        public AIMemoryLauncher(String str) {
            this.name = str;
        }
    }

    @NamespaceName(name = "AIShortcut", namespace = AIApiConstants.Template.NAME)
    public static class AIShortcut implements InstructionPayload {
        private Optional<Image> bg_image = Optional.a();
        private Optional<AIShortcutColor> color = Optional.a();

        @Required
        private Image icon;

        @Required
        private Nlp.InvokeNlpRequest invoke_nlp_request;

        @Required
        private String pkg_name;

        @Required
        private String text;

        public AIShortcut() {
        }

        public Optional<Image> getBgImage() {
            return this.bg_image;
        }

        public Optional<AIShortcutColor> getColor() {
            return this.color;
        }

        @Required
        public Image getIcon() {
            return this.icon;
        }

        @Required
        public Nlp.InvokeNlpRequest getInvokeNlpRequest() {
            return this.invoke_nlp_request;
        }

        @Required
        public String getPkgName() {
            return this.pkg_name;
        }

        @Required
        public String getText() {
            return this.text;
        }

        public AIShortcut setBgImage(Image image) {
            this.bg_image = Optional.e(image);
            return this;
        }

        public AIShortcut setColor(AIShortcutColor aIShortcutColor) {
            this.color = Optional.e(aIShortcutColor);
            return this;
        }

        @Required
        public AIShortcut setIcon(Image image) {
            this.icon = image;
            return this;
        }

        @Required
        public AIShortcut setInvokeNlpRequest(Nlp.InvokeNlpRequest invokeNlpRequest) {
            this.invoke_nlp_request = invokeNlpRequest;
            return this;
        }

        @Required
        public AIShortcut setPkgName(String str) {
            this.pkg_name = str;
            return this;
        }

        @Required
        public AIShortcut setText(String str) {
            this.text = str;
            return this;
        }

        public AIShortcut(String str, String str2, Image image, Nlp.InvokeNlpRequest invokeNlpRequest) {
            this.pkg_name = str;
            this.text = str2;
            this.icon = image;
            this.invoke_nlp_request = invokeNlpRequest;
        }
    }

    public static class AndroidKeyCode {

        @Required
        private int key_code;
        private Optional<String> description = Optional.a();
        private Optional<Task> task = Optional.a();

        public AndroidKeyCode() {
        }

        public Optional<String> getDescription() {
            return this.description;
        }

        @Required
        public int getKeyCode() {
            return this.key_code;
        }

        public Optional<Task> getTask() {
            return this.task;
        }

        public AndroidKeyCode setDescription(String str) {
            this.description = Optional.e(str);
            return this;
        }

        @Required
        public AndroidKeyCode setKeyCode(int i) {
            this.key_code = i;
            return this;
        }

        public AndroidKeyCode setTask(Task task) {
            this.task = Optional.e(task);
            return this;
        }

        public AndroidKeyCode(int i) {
            this.key_code = i;
        }
    }

    public static class AppEntity {

        @Required
        private AndroidApp app;

        @Required
        private AppControl control;
        private Optional<AppAds> ads = Optional.a();
        private Optional<AppEntitySource> source = Optional.a();

        public AppEntity() {
        }

        public Optional<AppAds> getAds() {
            return this.ads;
        }

        @Required
        public AndroidApp getApp() {
            return this.app;
        }

        @Required
        public AppControl getControl() {
            return this.control;
        }

        public Optional<AppEntitySource> getSource() {
            return this.source;
        }

        public AppEntity setAds(AppAds appAds) {
            this.ads = Optional.e(appAds);
            return this;
        }

        @Required
        public AppEntity setApp(AndroidApp androidApp) {
            this.app = androidApp;
            return this;
        }

        @Required
        public AppEntity setControl(AppControl appControl) {
            this.control = appControl;
            return this;
        }

        public AppEntity setSource(AppEntitySource appEntitySource) {
            this.source = Optional.e(appEntitySource);
            return this;
        }

        public AppEntity(AndroidApp androidApp, AppControl appControl) {
            this.app = androidApp;
            this.control = appControl;
        }
    }

    @NamespaceName(name = "Attachment", namespace = AIApiConstants.Template.NAME)
    public static class Attachment implements InstructionPayload {

        @Required
        private String id;

        @Required
        private AttachmentType type;
        private Optional<FeedbackAttachment> feedback = Optional.a();
        private Optional<AdsAttachment> ads = Optional.a();

        public Attachment() {
        }

        public Optional<AdsAttachment> getAds() {
            return this.ads;
        }

        public Optional<FeedbackAttachment> getFeedback() {
            return this.feedback;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public AttachmentType getType() {
            return this.type;
        }

        public Attachment setAds(AdsAttachment adsAttachment) {
            this.ads = Optional.e(adsAttachment);
            return this;
        }

        public Attachment setFeedback(FeedbackAttachment feedbackAttachment) {
            this.feedback = Optional.e(feedbackAttachment);
            return this;
        }

        @Required
        public Attachment setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public Attachment setType(AttachmentType attachmentType) {
            this.type = attachmentType;
            return this;
        }

        public Attachment(String str, AttachmentType attachmentType) {
            this.id = str;
            this.type = attachmentType;
        }
    }

    @NamespaceName(name = "BuslineInfo", namespace = AIApiConstants.Template.NAME)
    public static class BuslineInfo implements InstructionPayload {

        @Required
        private String bus_name;

        @Required
        private String current_station;

        @Required
        private List<Maps.Busline> lines;
        private Optional<Image> skill_icon = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();

        public BuslineInfo() {
        }

        @Required
        public String getBusName() {
            return this.bus_name;
        }

        @Required
        public String getCurrentStation() {
            return this.current_station;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        @Required
        public List<Maps.Busline> getLines() {
            return this.lines;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public BuslineInfo setBusName(String str) {
            this.bus_name = str;
            return this;
        }

        @Required
        public BuslineInfo setCurrentStation(String str) {
            this.current_station = str;
            return this;
        }

        public BuslineInfo setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        @Required
        public BuslineInfo setLines(List<Maps.Busline> list) {
            this.lines = list;
            return this;
        }

        public BuslineInfo setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public BuslineInfo(List<Maps.Busline> list, String str, String str2) {
            this.lines = list;
            this.bus_name = str;
            this.current_station = str2;
        }
    }

    @NamespaceName(name = "CarAutoProjectConfirmCancelResult", namespace = AIApiConstants.Template.NAME)
    public static class CarAutoProjectConfirmCancelResult implements EventPayload {
        private Optional<ConfirmCategory> category = Optional.a();
        private Optional<ConfirmInfo> confirmInfo = Optional.a();

        @Required
        private boolean confirm_or_cancel;

        public CarAutoProjectConfirmCancelResult() {
        }

        public Optional<ConfirmCategory> getCategory() {
            return this.category;
        }

        public Optional<ConfirmInfo> getConfirmInfo() {
            return this.confirmInfo;
        }

        @Required
        public boolean isConfirmOrCancel() {
            return this.confirm_or_cancel;
        }

        public CarAutoProjectConfirmCancelResult setCategory(ConfirmCategory confirmCategory) {
            this.category = Optional.e(confirmCategory);
            return this;
        }

        public CarAutoProjectConfirmCancelResult setConfirmInfo(ConfirmInfo confirmInfo) {
            this.confirmInfo = Optional.e(confirmInfo);
            return this;
        }

        @Required
        public CarAutoProjectConfirmCancelResult setConfirmOrCancel(boolean z) {
            this.confirm_or_cancel = z;
            return this;
        }

        public CarAutoProjectConfirmCancelResult(boolean z) {
            this.confirm_or_cancel = z;
        }
    }

    @NamespaceName(name = "CarStatisticItemList", namespace = AIApiConstants.Template.NAME)
    public static class CarStatisticItemList implements InstructionPayload {

        @Required
        private List<CarStatisticItem> items;
        private Optional<Image> skill_icon = Optional.a();
        private Optional<Launcher> launcher = Optional.a();

        public CarStatisticItemList() {
        }

        @Required
        public List<CarStatisticItem> getItems() {
            return this.items;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public CarStatisticItemList setItems(List<CarStatisticItem> list) {
            this.items = list;
            return this;
        }

        public CarStatisticItemList setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public CarStatisticItemList setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public CarStatisticItemList(List<CarStatisticItem> list) {
            this.items = list;
        }
    }

    @NamespaceName(name = "CarStatusList", namespace = AIApiConstants.Template.NAME)
    public static class CarStatusList implements InstructionPayload {

        @Required
        private List<CarStatusItem> items;
        private Optional<Image> skill_icon = Optional.a();
        private Optional<Launcher> launcher = Optional.a();

        public CarStatusList() {
        }

        @Required
        public List<CarStatusItem> getItems() {
            return this.items;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public CarStatusList setItems(List<CarStatusItem> list) {
            this.items = list;
            return this;
        }

        public CarStatusList setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public CarStatusList setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public CarStatusList(List<CarStatusItem> list) {
            this.items = list;
        }
    }

    @NamespaceName(name = "CarSwitchListStatus", namespace = AIApiConstants.Template.NAME)
    public static class CarSwitchListStatus implements InstructionPayload {

        @Required
        private List<CarSwitchStatusItem> items;
        private Optional<Image> skill_icon = Optional.a();
        private Optional<Launcher> launcher = Optional.a();

        public CarSwitchListStatus() {
        }

        @Required
        public List<CarSwitchStatusItem> getItems() {
            return this.items;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public CarSwitchListStatus setItems(List<CarSwitchStatusItem> list) {
            this.items = list;
            return this;
        }

        public CarSwitchListStatus setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public CarSwitchListStatus setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public CarSwitchListStatus(List<CarSwitchStatusItem> list) {
            this.items = list;
        }
    }

    public static class CarSwitchStatusItem {

        @Required
        private boolean is_open;

        @Required
        private String name;
        private Optional<Long> timestamp = Optional.a();
        private Optional<Image> image = Optional.a();

        public CarSwitchStatusItem() {
        }

        public Optional<Image> getImage() {
            return this.image;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<Long> getTimestamp() {
            return this.timestamp;
        }

        @Required
        public boolean isOpen() {
            return this.is_open;
        }

        public CarSwitchStatusItem setImage(Image image) {
            this.image = Optional.e(image);
            return this;
        }

        @Required
        public CarSwitchStatusItem setIsOpen(boolean z) {
            this.is_open = z;
            return this;
        }

        @Required
        public CarSwitchStatusItem setName(String str) {
            this.name = str;
            return this;
        }

        public CarSwitchStatusItem setTimestamp(long j) {
            this.timestamp = Optional.e(Long.valueOf(j));
            return this;
        }

        public CarSwitchStatusItem(String str, boolean z) {
            this.name = str;
            this.is_open = z;
        }
    }

    public static class ClickableText {

        @Required
        private String highlight_text;

        @Deprecated
        private Optional<AndroidIntent> intent = Optional.a();
        private Optional<List<AndroidIntent>> intent_list = Optional.a();

        public ClickableText() {
        }

        @Required
        public String getHighlightText() {
            return this.highlight_text;
        }

        @Deprecated
        public Optional<AndroidIntent> getIntent() {
            return this.intent;
        }

        public Optional<List<AndroidIntent>> getIntentList() {
            return this.intent_list;
        }

        @Required
        public ClickableText setHighlightText(String str) {
            this.highlight_text = str;
            return this;
        }

        @Deprecated
        public ClickableText setIntent(AndroidIntent androidIntent) {
            this.intent = Optional.e(androidIntent);
            return this;
        }

        public ClickableText setIntentList(List<AndroidIntent> list) {
            this.intent_list = Optional.e(list);
            return this;
        }

        public ClickableText(String str) {
            this.highlight_text = str;
        }
    }

    @NamespaceName(name = "ConfirmCancelResult", namespace = AIApiConstants.Template.NAME)
    public static class ConfirmCancelResult implements EventPayload {
        private Optional<ConfirmCategory> category = Optional.a();
        private Optional<ConfirmInfo> confirmInfo = Optional.a();

        @Required
        private boolean confirm_or_cancel;

        public ConfirmCancelResult() {
        }

        public Optional<ConfirmCategory> getCategory() {
            return this.category;
        }

        public Optional<ConfirmInfo> getConfirmInfo() {
            return this.confirmInfo;
        }

        @Required
        public boolean isConfirmOrCancel() {
            return this.confirm_or_cancel;
        }

        public ConfirmCancelResult setCategory(ConfirmCategory confirmCategory) {
            this.category = Optional.e(confirmCategory);
            return this;
        }

        public ConfirmCancelResult setConfirmInfo(ConfirmInfo confirmInfo) {
            this.confirmInfo = Optional.e(confirmInfo);
            return this;
        }

        @Required
        public ConfirmCancelResult setConfirmOrCancel(boolean z) {
            this.confirm_or_cancel = z;
            return this;
        }

        public ConfirmCancelResult(boolean z) {
            this.confirm_or_cancel = z;
        }
    }

    public static class EmbeddedList {

        @Required
        private DirectionDef direction;

        @Required
        private List<ListsItem> items;
        private Optional<Title> title = Optional.a();
        private Optional<Launcher> launcher = Optional.a();

        public EmbeddedList() {
        }

        @Required
        public DirectionDef getDirection() {
            return this.direction;
        }

        @Required
        public List<ListsItem> getItems() {
            return this.items;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<Title> getTitle() {
            return this.title;
        }

        @Required
        public EmbeddedList setDirection(DirectionDef directionDef) {
            this.direction = directionDef;
            return this;
        }

        @Required
        public EmbeddedList setItems(List<ListsItem> list) {
            this.items = list;
            return this;
        }

        public EmbeddedList setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public EmbeddedList setTitle(Title title) {
            this.title = Optional.e(title);
            return this;
        }

        public EmbeddedList(List<ListsItem> list, DirectionDef directionDef) {
            this.items = list;
            this.direction = directionDef;
        }
    }

    public static class EventRequestInfo {

        @Required
        private String name;

        @Required
        private String namespace;
        private Optional<String> id = Optional.a();
        private Optional<String> file_id = Optional.a();

        public EventRequestInfo() {
        }

        public Optional<String> getFileId() {
            return this.file_id;
        }

        public Optional<String> getId() {
            return this.id;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public String getNamespace() {
            return this.namespace;
        }

        public EventRequestInfo setFileId(String str) {
            this.file_id = Optional.e(str);
            return this;
        }

        public EventRequestInfo setId(String str) {
            this.id = Optional.e(str);
            return this;
        }

        @Required
        public EventRequestInfo setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public EventRequestInfo setNamespace(String str) {
            this.namespace = str;
            return this;
        }

        public EventRequestInfo(String str, String str2) {
            this.namespace = str;
            this.name = str2;
        }
    }

    public static class Feedback {

        @Required
        private String like_text;

        @Required
        private String prompt_text;

        @Required
        private String unlike_text;
        private Optional<String> like_response_text = Optional.a();
        private Optional<String> unlike_response_text = Optional.a();

        public Feedback() {
        }

        public Optional<String> getLikeResponseText() {
            return this.like_response_text;
        }

        @Required
        public String getLikeText() {
            return this.like_text;
        }

        @Required
        public String getPromptText() {
            return this.prompt_text;
        }

        public Optional<String> getUnlikeResponseText() {
            return this.unlike_response_text;
        }

        @Required
        public String getUnlikeText() {
            return this.unlike_text;
        }

        public Feedback setLikeResponseText(String str) {
            this.like_response_text = Optional.e(str);
            return this;
        }

        @Required
        public Feedback setLikeText(String str) {
            this.like_text = str;
            return this;
        }

        @Required
        public Feedback setPromptText(String str) {
            this.prompt_text = str;
            return this;
        }

        public Feedback setUnlikeResponseText(String str) {
            this.unlike_response_text = Optional.e(str);
            return this;
        }

        @Required
        public Feedback setUnlikeText(String str) {
            this.unlike_text = str;
            return this;
        }

        public Feedback(String str, String str2, String str3) {
            this.prompt_text = str;
            this.like_text = str2;
            this.unlike_text = str3;
        }
    }

    public static class ForeignDictionaryWord {

        @Required
        private String word_name;
        private Optional<String> word_audio_url = Optional.a();
        private Optional<List<String>> speech_interpretations = Optional.a();

        public ForeignDictionaryWord() {
        }

        public Optional<List<String>> getSpeechInterpretations() {
            return this.speech_interpretations;
        }

        public Optional<String> getWordAudioUrl() {
            return this.word_audio_url;
        }

        @Required
        public String getWordName() {
            return this.word_name;
        }

        public ForeignDictionaryWord setSpeechInterpretations(List<String> list) {
            this.speech_interpretations = Optional.e(list);
            return this;
        }

        public ForeignDictionaryWord setWordAudioUrl(String str) {
            this.word_audio_url = Optional.e(str);
            return this;
        }

        @Required
        public ForeignDictionaryWord setWordName(String str) {
            this.word_name = str;
            return this;
        }

        public ForeignDictionaryWord(String str) {
            this.word_name = str;
        }
    }

    @NamespaceName(name = "ImageCard", namespace = AIApiConstants.Template.NAME)
    public static class ImageCard implements InstructionPayload {

        @Required
        private Image image;
        private Optional<Title> title = Optional.a();
        private Optional<Integer> duration = Optional.a();

        public ImageCard() {
        }

        public Optional<Integer> getDuration() {
            return this.duration;
        }

        @Required
        public Image getImage() {
            return this.image;
        }

        public Optional<Title> getTitle() {
            return this.title;
        }

        public ImageCard setDuration(int i) {
            this.duration = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Required
        public ImageCard setImage(Image image) {
            this.image = image;
            return this;
        }

        public ImageCard setTitle(Title title) {
            this.title = Optional.e(title);
            return this;
        }

        public ImageCard(Image image) {
            this.image = image;
        }
    }

    public static class ListsDetail {

        @Required
        private Image skill_icon;

        @Required
        private Title title;
        private Optional<Launcher> launcher = Optional.a();
        private Optional<List<Lists>> abstracts = Optional.a();

        public ListsDetail() {
        }

        public Optional<List<Lists>> getAbstracts() {
            return this.abstracts;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        @Required
        public Image getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public Title getTitle() {
            return this.title;
        }

        public ListsDetail setAbstracts(List<Lists> list) {
            this.abstracts = Optional.e(list);
            return this;
        }

        public ListsDetail setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        @Required
        public ListsDetail setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        @Required
        public ListsDetail setTitle(Title title) {
            this.title = title;
            return this;
        }

        public ListsDetail(Title title, Image image) {
            this.title = title;
            this.skill_icon = image;
        }
    }

    public static class MachineTranslation {

        @Required
        private String trans_text;

        @Required
        private String trans_text_audio_url;
        private Optional<String> word_meaning = Optional.a();
        private Optional<String> ph_symbol = Optional.a();

        public MachineTranslation() {
        }

        public Optional<String> getPhSymbol() {
            return this.ph_symbol;
        }

        @Required
        public String getTransText() {
            return this.trans_text;
        }

        @Required
        public String getTransTextAudioUrl() {
            return this.trans_text_audio_url;
        }

        public Optional<String> getWordMeaning() {
            return this.word_meaning;
        }

        public MachineTranslation setPhSymbol(String str) {
            this.ph_symbol = Optional.e(str);
            return this;
        }

        @Required
        public MachineTranslation setTransText(String str) {
            this.trans_text = str;
            return this;
        }

        @Required
        public MachineTranslation setTransTextAudioUrl(String str) {
            this.trans_text_audio_url = str;
            return this;
        }

        public MachineTranslation setWordMeaning(String str) {
            this.word_meaning = Optional.e(str);
            return this;
        }

        public MachineTranslation(String str, String str2) {
            this.trans_text = str;
            this.trans_text_audio_url = str2;
        }
    }

    @NamespaceName(name = "MatchUp", namespace = AIApiConstants.Template.NAME)
    @Deprecated
    public static class MatchUp implements InstructionPayload {

        @Required
        private List<Match> data;

        @Required
        private Image skill_icon;
        private Optional<CustomBackground> background = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();

        public MatchUp() {
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        @Required
        public List<Match> getData() {
            return this.data;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        @Required
        public Image getSkillIcon() {
            return this.skill_icon;
        }

        public MatchUp setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        @Required
        public MatchUp setData(List<Match> list) {
            this.data = list;
            return this;
        }

        public MatchUp setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        @Required
        public MatchUp setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        public MatchUp(List<Match> list, Image image) {
            this.data = list;
            this.skill_icon = image;
        }
    }

    @NamespaceName(name = AIApiConstants.Memo.NAME, namespace = AIApiConstants.Template.NAME)
    public static class Memo implements InstructionPayload {
        private Optional<CustomBackground> background = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();

        @Required
        private List<MemoItem> items;

        @Required
        private Image skill_icon;

        @Required
        private Title title;

        public Memo() {
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        @Required
        public List<MemoItem> getItems() {
            return this.items;
        }

        @Required
        public Image getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public Title getTitle() {
            return this.title;
        }

        public Memo setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public Memo setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        @Required
        public Memo setItems(List<MemoItem> list) {
            this.items = list;
            return this;
        }

        @Required
        public Memo setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        @Required
        public Memo setTitle(Title title) {
            this.title = title;
            return this;
        }

        public Memo(Title title, Image image, List<MemoItem> list) {
            this.title = title;
            this.skill_icon = image;
            this.items = list;
        }
    }

    @NamespaceName(name = com.xiaomi.ai.api.intent.AIApiConstants.Menstruation.NAME, namespace = AIApiConstants.Template.NAME)
    public static class Menstruation implements InstructionPayload {

        @Required
        private List<ApplicationSettings.MenstrualPeriod> items;

        @Required
        private ApplicationSettings.MenstruationOperationType operation_type;
        private Optional<Launcher> intent = Optional.a();
        private Optional<Image> skill_icon = Optional.a();

        public Menstruation() {
        }

        public Optional<Launcher> getIntent() {
            return this.intent;
        }

        @Required
        public List<ApplicationSettings.MenstrualPeriod> getItems() {
            return this.items;
        }

        @Required
        public ApplicationSettings.MenstruationOperationType getOperationType() {
            return this.operation_type;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        public Menstruation setIntent(Launcher launcher) {
            this.intent = Optional.e(launcher);
            return this;
        }

        @Required
        public Menstruation setItems(List<ApplicationSettings.MenstrualPeriod> list) {
            this.items = list;
            return this;
        }

        @Required
        public Menstruation setOperationType(ApplicationSettings.MenstruationOperationType menstruationOperationType) {
            this.operation_type = menstruationOperationType;
            return this;
        }

        public Menstruation setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public Menstruation(ApplicationSettings.MenstruationOperationType menstruationOperationType, List<ApplicationSettings.MenstrualPeriod> list) {
            this.operation_type = menstruationOperationType;
            this.items = list;
        }
    }

    public static class PathItem {

        @Required
        private String name;
        private Optional<String> id = Optional.a();
        private Optional<String> icon = Optional.a();

        public PathItem() {
        }

        public Optional<String> getIcon() {
            return this.icon;
        }

        public Optional<String> getId() {
            return this.id;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public PathItem setIcon(String str) {
            this.icon = Optional.e(str);
            return this;
        }

        public PathItem setId(String str) {
            this.id = Optional.e(str);
            return this;
        }

        @Required
        public PathItem setName(String str) {
            this.name = str;
            return this;
        }

        public PathItem(String str) {
            this.name = str;
        }
    }

    public static class PathJumpEventRequestInfo {

        @Required
        private String local_skill_name;

        @Required
        private String uri;
        private Optional<String> pkg_name = Optional.a();
        private Optional<String> identifier = Optional.a();

        public PathJumpEventRequestInfo() {
        }

        public Optional<String> getIdentifier() {
            return this.identifier;
        }

        @Required
        public String getLocalSkillName() {
            return this.local_skill_name;
        }

        public Optional<String> getPkgName() {
            return this.pkg_name;
        }

        @Required
        public String getUri() {
            return this.uri;
        }

        public PathJumpEventRequestInfo setIdentifier(String str) {
            this.identifier = Optional.e(str);
            return this;
        }

        @Required
        public PathJumpEventRequestInfo setLocalSkillName(String str) {
            this.local_skill_name = str;
            return this;
        }

        public PathJumpEventRequestInfo setPkgName(String str) {
            this.pkg_name = Optional.e(str);
            return this;
        }

        @Required
        public PathJumpEventRequestInfo setUri(String str) {
            this.uri = str;
            return this;
        }

        public PathJumpEventRequestInfo(String str, String str2) {
            this.uri = str;
            this.local_skill_name = str2;
        }
    }

    @NamespaceName(name = "PlayTTS", namespace = AIApiConstants.Template.NAME)
    public static class PlayTTS implements InstructionPayload {
        private Optional<CustomBackground> background = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();

        @Required
        private List<PlayTTSItem> items;

        @Required
        private Image skill_icon;

        public PlayTTS() {
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        @Required
        public List<PlayTTSItem> getItems() {
            return this.items;
        }

        @Required
        public Image getSkillIcon() {
            return this.skill_icon;
        }

        public PlayTTS setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public PlayTTS setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        @Required
        public PlayTTS setItems(List<PlayTTSItem> list) {
            this.items = list;
            return this;
        }

        @Required
        public PlayTTS setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        public PlayTTS(List<PlayTTSItem> list, Image image) {
            this.items = list;
            this.skill_icon = image;
        }
    }

    public static class QabotParagraphs {

        @Required
        private List<QabotParagraph> paragraphs;

        @Required
        private QabotParagraphType type;
        private Optional<String> head = Optional.a();
        private Optional<String> tail = Optional.a();

        public QabotParagraphs() {
        }

        public Optional<String> getHead() {
            return this.head;
        }

        @Required
        public List<QabotParagraph> getParagraphs() {
            return this.paragraphs;
        }

        public Optional<String> getTail() {
            return this.tail;
        }

        @Required
        public QabotParagraphType getType() {
            return this.type;
        }

        public QabotParagraphs setHead(String str) {
            this.head = Optional.e(str);
            return this;
        }

        @Required
        public QabotParagraphs setParagraphs(List<QabotParagraph> list) {
            this.paragraphs = list;
            return this;
        }

        public QabotParagraphs setTail(String str) {
            this.tail = Optional.e(str);
            return this;
        }

        @Required
        public QabotParagraphs setType(QabotParagraphType qabotParagraphType) {
            this.type = qabotParagraphType;
            return this;
        }

        public QabotParagraphs(QabotParagraphType qabotParagraphType, List<QabotParagraph> list) {
            this.type = qabotParagraphType;
            this.paragraphs = list;
        }
    }

    public static class ShopRecommendationItem {

        @Required
        private ShopInfo shop_info;
        private Optional<Launcher> launcher = Optional.a();
        private Optional<Button> button = Optional.a();

        public ShopRecommendationItem() {
        }

        public Optional<Button> getButton() {
            return this.button;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        @Required
        public ShopInfo getShopInfo() {
            return this.shop_info;
        }

        public ShopRecommendationItem setButton(Button button) {
            this.button = Optional.e(button);
            return this;
        }

        public ShopRecommendationItem setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        @Required
        public ShopRecommendationItem setShopInfo(ShopInfo shopInfo) {
            this.shop_info = shopInfo;
            return this;
        }

        public ShopRecommendationItem(ShopInfo shopInfo) {
            this.shop_info = shopInfo;
        }
    }

    @NamespaceName(name = "SingleButton", namespace = AIApiConstants.Template.NAME)
    public static class SingleButton implements InstructionPayload {

        @Required
        private Button button;
        private Optional<Image> skill_icon = Optional.a();
        private Optional<SingleButtonStyleType> type = Optional.a();

        public SingleButton() {
        }

        @Required
        public Button getButton() {
            return this.button;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        public Optional<SingleButtonStyleType> getType() {
            return this.type;
        }

        @Required
        public SingleButton setButton(Button button) {
            this.button = button;
            return this;
        }

        public SingleButton setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public SingleButton setType(SingleButtonStyleType singleButtonStyleType) {
            this.type = Optional.e(singleButtonStyleType);
            return this;
        }

        public SingleButton(Button button) {
            this.button = button;
        }
    }

    public static class SportMatchTeam {

        @Required
        private String name;
        private Optional<Image> image = Optional.a();
        private Optional<Integer> score = Optional.a();

        public SportMatchTeam() {
        }

        public Optional<Image> getImage() {
            return this.image;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<Integer> getScore() {
            return this.score;
        }

        public SportMatchTeam setImage(Image image) {
            this.image = Optional.e(image);
            return this;
        }

        @Required
        public SportMatchTeam setName(String str) {
            this.name = str;
            return this;
        }

        public SportMatchTeam setScore(int i) {
            this.score = Optional.e(Integer.valueOf(i));
            return this;
        }

        public SportMatchTeam(String str) {
            this.name = str;
        }
    }

    public static class StationItem {

        @Required
        private String ai_album_id;

        @Required
        private String album_name;

        @Required
        private String chinese_name;

        @Required
        private int episode_num;

        @Required
        private String id;

        @Required
        private String origin;

        @Required
        private boolean payment;
        private Optional<Image> album_cover = Optional.a();
        private Optional<String> category = Optional.a();

        public StationItem() {
        }

        @Required
        public String getAiAlbumId() {
            return this.ai_album_id;
        }

        public Optional<Image> getAlbumCover() {
            return this.album_cover;
        }

        @Required
        public String getAlbumName() {
            return this.album_name;
        }

        public Optional<String> getCategory() {
            return this.category;
        }

        @Required
        public String getChineseName() {
            return this.chinese_name;
        }

        @Required
        public int getEpisodeNum() {
            return this.episode_num;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public String getOrigin() {
            return this.origin;
        }

        @Required
        public boolean isPayment() {
            return this.payment;
        }

        @Required
        public StationItem setAiAlbumId(String str) {
            this.ai_album_id = str;
            return this;
        }

        public StationItem setAlbumCover(Image image) {
            this.album_cover = Optional.e(image);
            return this;
        }

        @Required
        public StationItem setAlbumName(String str) {
            this.album_name = str;
            return this;
        }

        public StationItem setCategory(String str) {
            this.category = Optional.e(str);
            return this;
        }

        @Required
        public StationItem setChineseName(String str) {
            this.chinese_name = str;
            return this;
        }

        @Required
        public StationItem setEpisodeNum(int i) {
            this.episode_num = i;
            return this;
        }

        @Required
        public StationItem setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public StationItem setOrigin(String str) {
            this.origin = str;
            return this;
        }

        @Required
        public StationItem setPayment(boolean z) {
            this.payment = z;
            return this;
        }

        public StationItem(String str, String str2, String str3, String str4, String str5, int i, boolean z) {
            this.id = str;
            this.ai_album_id = str2;
            this.album_name = str3;
            this.origin = str4;
            this.chinese_name = str5;
            this.episode_num = i;
            this.payment = z;
        }
    }

    @NamespaceName(name = "Stations", namespace = AIApiConstants.Template.NAME)
    public static class Stations implements InstructionPayload {

        @Required
        private List<StationItem> items;
        private Optional<Image> skill_icon = Optional.a();
        private Optional<String> title = Optional.a();

        public Stations() {
        }

        @Required
        public List<StationItem> getItems() {
            return this.items;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        public Optional<String> getTitle() {
            return this.title;
        }

        @Required
        public Stations setItems(List<StationItem> list) {
            this.items = list;
            return this;
        }

        public Stations setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public Stations setTitle(String str) {
            this.title = Optional.e(str);
            return this;
        }

        public Stations(List<StationItem> list) {
            this.items = list;
        }
    }

    @NamespaceName(name = "StreamImageList", namespace = AIApiConstants.Template.NAME)
    public static class StreamImageList implements InstructionPayload {

        @Required
        @Deprecated
        private List<Image> image_list;

        @Deprecated
        private Optional<StreamImagePosition> image_position = Optional.a();
        private Optional<List<StreamImageItem>> image_items = Optional.a();

        public StreamImageList() {
        }

        public Optional<List<StreamImageItem>> getImageItems() {
            return this.image_items;
        }

        @Required
        @Deprecated
        public List<Image> getImageList() {
            return this.image_list;
        }

        @Deprecated
        public Optional<StreamImagePosition> getImagePosition() {
            return this.image_position;
        }

        public StreamImageList setImageItems(List<StreamImageItem> list) {
            this.image_items = Optional.e(list);
            return this;
        }

        @Required
        @Deprecated
        public StreamImageList setImageList(List<Image> list) {
            this.image_list = list;
            return this;
        }

        @Deprecated
        public StreamImageList setImagePosition(StreamImagePosition streamImagePosition) {
            this.image_position = Optional.e(streamImagePosition);
            return this;
        }

        public StreamImageList(List<Image> list) {
            this.image_list = list;
        }
    }

    @NamespaceName(name = "Videos", namespace = AIApiConstants.Template.NAME)
    public static class Videos implements InstructionPayload {

        @Required
        private SearchHitLevel hit_level;

        @Required
        private int hits;

        @Required
        private List<VideoItem> items;
        private Optional<Integer> episode = Optional.a();
        private Optional<Boolean> is_auto_play = Optional.a();

        public Videos() {
        }

        public Optional<Integer> getEpisode() {
            return this.episode;
        }

        @Required
        public SearchHitLevel getHitLevel() {
            return this.hit_level;
        }

        @Required
        public int getHits() {
            return this.hits;
        }

        @Required
        public List<VideoItem> getItems() {
            return this.items;
        }

        public Optional<Boolean> isAutoPlay() {
            return this.is_auto_play;
        }

        public Videos setEpisode(int i) {
            this.episode = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Required
        public Videos setHitLevel(SearchHitLevel searchHitLevel) {
            this.hit_level = searchHitLevel;
            return this;
        }

        @Required
        public Videos setHits(int i) {
            this.hits = i;
            return this;
        }

        public Videos setIsAutoPlay(boolean z) {
            this.is_auto_play = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public Videos setItems(List<VideoItem> list) {
            this.items = list;
            return this;
        }

        public Videos(List<VideoItem> list, SearchHitLevel searchHitLevel, int i) {
            this.items = list;
            this.hit_level = searchHitLevel;
            this.hits = i;
        }
    }

    public static class WikiMoreDetail {

        @Required
        private WikiMoreItem base;
        private Optional<List<WikiMoreItem>> items = Optional.a();
        private Optional<Launcher> launcher = Optional.a();

        public WikiMoreDetail() {
        }

        @Required
        public WikiMoreItem getBase() {
            return this.base;
        }

        public Optional<List<WikiMoreItem>> getItems() {
            return this.items;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        @Required
        public WikiMoreDetail setBase(WikiMoreItem wikiMoreItem) {
            this.base = wikiMoreItem;
            return this;
        }

        public WikiMoreDetail setItems(List<WikiMoreItem> list) {
            this.items = Optional.e(list);
            return this;
        }

        public WikiMoreDetail setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public WikiMoreDetail(WikiMoreItem wikiMoreItem) {
            this.base = wikiMoreItem;
        }
    }

    public static class WikiMoreItem {

        @Required
        private String desc;
        private Optional<String> sid = Optional.a();
        private Optional<String> mentions = Optional.a();

        public WikiMoreItem() {
        }

        @Required
        public String getDesc() {
            return this.desc;
        }

        public Optional<String> getMentions() {
            return this.mentions;
        }

        public Optional<String> getSid() {
            return this.sid;
        }

        @Required
        public WikiMoreItem setDesc(String str) {
            this.desc = str;
            return this;
        }

        public WikiMoreItem setMentions(String str) {
            this.mentions = Optional.e(str);
            return this;
        }

        public WikiMoreItem setSid(String str) {
            this.sid = Optional.e(str);
            return this;
        }

        public WikiMoreItem(String str) {
            this.desc = str;
        }
    }

    public static class Words {

        @Required
        private List<Pronunciation> pronunciation;

        @Required
        private List<String> text;
        private Optional<List<Image>> image = Optional.a();
        private Optional<List<AbstractItem>> property = Optional.a();

        public Words() {
        }

        public Optional<List<Image>> getImage() {
            return this.image;
        }

        @Required
        public List<Pronunciation> getPronunciation() {
            return this.pronunciation;
        }

        public Optional<List<AbstractItem>> getProperty() {
            return this.property;
        }

        @Required
        public List<String> getText() {
            return this.text;
        }

        public Words setImage(List<Image> list) {
            this.image = Optional.e(list);
            return this;
        }

        @Required
        public Words setPronunciation(List<Pronunciation> list) {
            this.pronunciation = list;
            return this;
        }

        public Words setProperty(List<AbstractItem> list) {
            this.property = Optional.e(list);
            return this;
        }

        @Required
        public Words setText(List<String> list) {
            this.text = list;
            return this;
        }

        public Words(List<String> list, List<Pronunciation> list2) {
            this.text = list;
            this.pronunciation = list2;
        }
    }

    public static class AppControl {

        @Required
        private String name;

        @Required
        private String type;
        private Optional<Launcher> launcher = Optional.a();
        private Optional<String> app_sign = Optional.a();
        private Optional<String> nonce = Optional.a();

        public AppControl() {
        }

        public Optional<String> getAppSign() {
            return this.app_sign;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<String> getNonce() {
            return this.nonce;
        }

        @Required
        public String getType() {
            return this.type;
        }

        public AppControl setAppSign(String str) {
            this.app_sign = Optional.e(str);
            return this;
        }

        public AppControl setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        @Required
        public AppControl setName(String str) {
            this.name = str;
            return this;
        }

        public AppControl setNonce(String str) {
            this.nonce = Optional.e(str);
            return this;
        }

        @Required
        public AppControl setType(String str) {
            this.type = str;
            return this;
        }

        public AppControl(String str, String str2) {
            this.type = str;
            this.name = str2;
        }
    }

    @NamespaceName(name = "CarImageNumberList", namespace = AIApiConstants.Template.NAME)
    public static class CarImageNumberList implements InstructionPayload {

        @Required
        private List<CarImageNumberItem> items;
        private Optional<Image> skill_icon = Optional.a();
        private Optional<Image> image_background = Optional.a();
        private Optional<Launcher> launcher = Optional.a();

        public CarImageNumberList() {
        }

        public Optional<Image> getImageBackground() {
            return this.image_background;
        }

        @Required
        public List<CarImageNumberItem> getItems() {
            return this.items;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        public CarImageNumberList setImageBackground(Image image) {
            this.image_background = Optional.e(image);
            return this;
        }

        @Required
        public CarImageNumberList setItems(List<CarImageNumberItem> list) {
            this.items = list;
            return this;
        }

        public CarImageNumberList setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public CarImageNumberList setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public CarImageNumberList(List<CarImageNumberItem> list) {
            this.items = list;
        }
    }

    @NamespaceName(name = "CarNumberStatus", namespace = AIApiConstants.Template.NAME)
    public static class CarNumberStatus implements InstructionPayload {

        @Required
        private String unit;

        @Required
        private double value;
        private Optional<Long> timestamp = Optional.a();
        private Optional<Image> skill_icon = Optional.a();
        private Optional<Launcher> launcher = Optional.a();

        public CarNumberStatus() {
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        public Optional<Long> getTimestamp() {
            return this.timestamp;
        }

        @Required
        public String getUnit() {
            return this.unit;
        }

        @Required
        public double getValue() {
            return this.value;
        }

        public CarNumberStatus setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public CarNumberStatus setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public CarNumberStatus setTimestamp(long j) {
            this.timestamp = Optional.e(Long.valueOf(j));
            return this;
        }

        @Required
        public CarNumberStatus setUnit(String str) {
            this.unit = str;
            return this;
        }

        @Required
        public CarNumberStatus setValue(double d) {
            this.value = d;
            return this;
        }

        public CarNumberStatus(double d, String str) {
            this.value = d;
            this.unit = str;
        }
    }

    public static class CarStatusItem {

        @Required
        private String name;

        @Required
        private String value;
        private Optional<Long> timestamp = Optional.a();
        private Optional<Boolean> is_abnormal = Optional.a();
        private Optional<Image> image = Optional.a();

        public CarStatusItem() {
        }

        public Optional<Image> getImage() {
            return this.image;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<Long> getTimestamp() {
            return this.timestamp;
        }

        @Required
        public String getValue() {
            return this.value;
        }

        public Optional<Boolean> isAbnormal() {
            return this.is_abnormal;
        }

        public CarStatusItem setImage(Image image) {
            this.image = Optional.e(image);
            return this;
        }

        public CarStatusItem setIsAbnormal(boolean z) {
            this.is_abnormal = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public CarStatusItem setName(String str) {
            this.name = str;
            return this;
        }

        public CarStatusItem setTimestamp(long j) {
            this.timestamp = Optional.e(Long.valueOf(j));
            return this;
        }

        @Required
        public CarStatusItem setValue(String str) {
            this.value = str;
            return this;
        }

        public CarStatusItem(String str, String str2) {
            this.name = str;
            this.value = str2;
        }
    }

    @NamespaceName(name = "Description", namespace = AIApiConstants.Template.NAME)
    public static class Description implements InstructionPayload {

        @Required
        private String text;
        private Optional<Image> skill_icon = Optional.a();
        private Optional<Launcher> launcher = Optional.a();
        private Optional<Image> image = Optional.a();

        public Description() {
        }

        public Optional<Image> getImage() {
            return this.image;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public String getText() {
            return this.text;
        }

        public Description setImage(Image image) {
            this.image = Optional.e(image);
            return this;
        }

        public Description setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public Description setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        @Required
        public Description setText(String str) {
            this.text = str;
            return this;
        }

        public Description(String str) {
            this.text = str;
        }
    }

    public static class DeviceInfoV1 {

        @Required
        private String category;

        @Required
        private String device_id;
        private Optional<String> room = Optional.a();
        private Optional<String> name = Optional.a();
        private Optional<Image> icon = Optional.a();

        public DeviceInfoV1() {
        }

        @Required
        public String getCategory() {
            return this.category;
        }

        @Required
        public String getDeviceId() {
            return this.device_id;
        }

        public Optional<Image> getIcon() {
            return this.icon;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<String> getRoom() {
            return this.room;
        }

        @Required
        public DeviceInfoV1 setCategory(String str) {
            this.category = str;
            return this;
        }

        @Required
        public DeviceInfoV1 setDeviceId(String str) {
            this.device_id = str;
            return this;
        }

        public DeviceInfoV1 setIcon(Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        public DeviceInfoV1 setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public DeviceInfoV1 setRoom(String str) {
            this.room = Optional.e(str);
            return this;
        }

        public DeviceInfoV1(String str, String str2) {
            this.device_id = str;
            this.category = str2;
        }
    }

    public static class EmojiConfig {

        @Required
        private String url;
        private Optional<Long> duration_in_ms = Optional.a();
        private Optional<Float> speed = Optional.a();
        private Optional<Integer> interpolator = Optional.a();

        public EmojiConfig() {
        }

        public Optional<Long> getDurationInMs() {
            return this.duration_in_ms;
        }

        public Optional<Integer> getInterpolator() {
            return this.interpolator;
        }

        public Optional<Float> getSpeed() {
            return this.speed;
        }

        @Required
        public String getUrl() {
            return this.url;
        }

        public EmojiConfig setDurationInMs(long j) {
            this.duration_in_ms = Optional.e(Long.valueOf(j));
            return this;
        }

        public EmojiConfig setInterpolator(int i) {
            this.interpolator = Optional.e(Integer.valueOf(i));
            return this;
        }

        public EmojiConfig setSpeed(float f) {
            this.speed = Optional.e(Float.valueOf(f));
            return this;
        }

        @Required
        public EmojiConfig setUrl(String str) {
            this.url = str;
            return this;
        }

        public EmojiConfig(String str) {
            this.url = str;
        }
    }

    public static class FeedbackAttachment {

        @Required
        private String dislike_response;

        @Required
        private String like;

        @Required
        private String prompt;
        private Optional<String> dislike = Optional.a();
        private Optional<String> like_response = Optional.a();
        private Optional<List<String>> dislike_reasons = Optional.a();

        public FeedbackAttachment() {
        }

        public Optional<String> getDislike() {
            return this.dislike;
        }

        public Optional<List<String>> getDislikeReasons() {
            return this.dislike_reasons;
        }

        @Required
        public String getDislikeResponse() {
            return this.dislike_response;
        }

        @Required
        public String getLike() {
            return this.like;
        }

        public Optional<String> getLikeResponse() {
            return this.like_response;
        }

        @Required
        public String getPrompt() {
            return this.prompt;
        }

        public FeedbackAttachment setDislike(String str) {
            this.dislike = Optional.e(str);
            return this;
        }

        public FeedbackAttachment setDislikeReasons(List<String> list) {
            this.dislike_reasons = Optional.e(list);
            return this;
        }

        @Required
        public FeedbackAttachment setDislikeResponse(String str) {
            this.dislike_response = str;
            return this;
        }

        @Required
        public FeedbackAttachment setLike(String str) {
            this.like = str;
            return this;
        }

        public FeedbackAttachment setLikeResponse(String str) {
            this.like_response = Optional.e(str);
            return this;
        }

        @Required
        public FeedbackAttachment setPrompt(String str) {
            this.prompt = str;
            return this;
        }

        public FeedbackAttachment(String str, String str2, String str3) {
            this.prompt = str;
            this.like = str2;
            this.dislike_response = str3;
        }
    }

    @NamespaceName(name = "H5RefreshCard", namespace = AIApiConstants.Template.NAME)
    public static class H5RefreshCard implements InstructionPayload {

        @Required
        private c4h param;

        @Required
        private H5ParamType param_type;
        private Optional<H5PageExtraData> extra_data = Optional.a();
        private Optional<RefreshCardType> type = Optional.a();
        private Optional<String> load_url = Optional.a();

        public H5RefreshCard() {
        }

        public Optional<H5PageExtraData> getExtraData() {
            return this.extra_data;
        }

        public Optional<String> getLoadUrl() {
            return this.load_url;
        }

        @Required
        public c4h getParam() {
            return this.param;
        }

        @Required
        public H5ParamType getParamType() {
            return this.param_type;
        }

        public Optional<RefreshCardType> getType() {
            return this.type;
        }

        public H5RefreshCard setExtraData(H5PageExtraData h5PageExtraData) {
            this.extra_data = Optional.e(h5PageExtraData);
            return this;
        }

        public H5RefreshCard setLoadUrl(String str) {
            this.load_url = Optional.e(str);
            return this;
        }

        @Required
        public H5RefreshCard setParam(c4h c4hVar) {
            this.param = c4hVar;
            return this;
        }

        @Required
        public H5RefreshCard setParamType(H5ParamType h5ParamType) {
            this.param_type = h5ParamType;
            return this;
        }

        public H5RefreshCard setType(RefreshCardType refreshCardType) {
            this.type = Optional.e(refreshCardType);
            return this;
        }

        public H5RefreshCard(H5ParamType h5ParamType, c4h c4hVar) {
            this.param_type = h5ParamType;
            this.param = c4hVar;
        }
    }

    @NamespaceName(name = "LLMRichContent", namespace = AIApiConstants.Template.NAME)
    public static class LLMRichContent implements InstructionPayload {

        @Required
        private String description;

        @Required
        private String title;
        private Optional<Image> icon = Optional.a();
        private Optional<BackgroundColor> background_color = Optional.a();
        private Optional<Launcher> launcher = Optional.a();

        public LLMRichContent() {
        }

        public Optional<BackgroundColor> getBackgroundColor() {
            return this.background_color;
        }

        @Required
        public String getDescription() {
            return this.description;
        }

        public Optional<Image> getIcon() {
            return this.icon;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        @Required
        public String getTitle() {
            return this.title;
        }

        public LLMRichContent setBackgroundColor(BackgroundColor backgroundColor) {
            this.background_color = Optional.e(backgroundColor);
            return this;
        }

        @Required
        public LLMRichContent setDescription(String str) {
            this.description = str;
            return this;
        }

        public LLMRichContent setIcon(Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        public LLMRichContent setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        @Required
        public LLMRichContent setTitle(String str) {
            this.title = str;
            return this;
        }

        public LLMRichContent(String str, String str2) {
            this.title = str;
            this.description = str2;
        }
    }

    public static class ListsItem {

        @Required
        private List<Image> images;
        private Optional<Launcher> launcher = Optional.a();
        private Optional<Image> skill_icon = Optional.a();
        private Optional<List<ListsSubItem>> sub_items = Optional.a();

        @Required
        private String text;

        @Required
        private Title title;

        public ListsItem() {
        }

        @Required
        public List<Image> getImages() {
            return this.images;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        public Optional<List<ListsSubItem>> getSubItems() {
            return this.sub_items;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public Title getTitle() {
            return this.title;
        }

        @Required
        public ListsItem setImages(List<Image> list) {
            this.images = list;
            return this;
        }

        public ListsItem setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public ListsItem setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public ListsItem setSubItems(List<ListsSubItem> list) {
            this.sub_items = Optional.e(list);
            return this;
        }

        @Required
        public ListsItem setText(String str) {
            this.text = str;
            return this;
        }

        @Required
        public ListsItem setTitle(Title title) {
            this.title = title;
            return this;
        }

        public ListsItem(Title title, String str, List<Image> list) {
            this.title = title;
            this.text = str;
            this.images = list;
        }
    }

    public static class ListsSubItem {
        private Optional<List<Image>> images = Optional.a();
        private Optional<Launcher> launcher = Optional.a();
        private Optional<Image> skill_icon = Optional.a();

        @Required
        private String text;

        @Required
        private Title title;

        public ListsSubItem() {
        }

        public Optional<List<Image>> getImages() {
            return this.images;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public Title getTitle() {
            return this.title;
        }

        public ListsSubItem setImages(List<Image> list) {
            this.images = Optional.e(list);
            return this;
        }

        public ListsSubItem setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public ListsSubItem setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        @Required
        public ListsSubItem setText(String str) {
            this.text = str;
            return this;
        }

        @Required
        public ListsSubItem setTitle(Title title) {
            this.title = title;
            return this;
        }

        public ListsSubItem(Title title, String str) {
            this.title = title;
            this.text = str;
        }
    }

    public static class Match {
        private Optional<Button> button_link = Optional.a();
        private Optional<MoreLink> more_link = Optional.a();
        private Optional<PredictRate> predict_rate = Optional.a();

        @Required
        private MatchSchedule schedule;

        @Required
        private Title title;

        public Match() {
        }

        public Optional<Button> getButtonLink() {
            return this.button_link;
        }

        public Optional<MoreLink> getMoreLink() {
            return this.more_link;
        }

        public Optional<PredictRate> getPredictRate() {
            return this.predict_rate;
        }

        @Required
        public MatchSchedule getSchedule() {
            return this.schedule;
        }

        @Required
        public Title getTitle() {
            return this.title;
        }

        public Match setButtonLink(Button button) {
            this.button_link = Optional.e(button);
            return this;
        }

        public Match setMoreLink(MoreLink moreLink) {
            this.more_link = Optional.e(moreLink);
            return this;
        }

        public Match setPredictRate(PredictRate predictRate) {
            this.predict_rate = Optional.e(predictRate);
            return this;
        }

        @Required
        public Match setSchedule(MatchSchedule matchSchedule) {
            this.schedule = matchSchedule;
            return this;
        }

        @Required
        public Match setTitle(Title title) {
            this.title = title;
            return this;
        }

        public Match(Title title, MatchSchedule matchSchedule) {
            this.title = title;
            this.schedule = matchSchedule;
        }
    }

    public static class MatchSchedule {

        @Required
        private Team team1;

        @Required
        private Team team2;
        private Optional<String> status = Optional.a();
        private Optional<String> score = Optional.a();
        private Optional<Launcher> launcher = Optional.a();

        public MatchSchedule() {
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<String> getScore() {
            return this.score;
        }

        public Optional<String> getStatus() {
            return this.status;
        }

        @Required
        public Team getTeam1() {
            return this.team1;
        }

        @Required
        public Team getTeam2() {
            return this.team2;
        }

        public MatchSchedule setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public MatchSchedule setScore(String str) {
            this.score = Optional.e(str);
            return this;
        }

        public MatchSchedule setStatus(String str) {
            this.status = Optional.e(str);
            return this;
        }

        @Required
        public MatchSchedule setTeam1(Team team) {
            this.team1 = team;
            return this;
        }

        @Required
        public MatchSchedule setTeam2(Team team) {
            this.team2 = team;
            return this;
        }

        public MatchSchedule(Team team, Team team2) {
            this.team1 = team;
            this.team2 = team2;
        }
    }

    public static class MemoItem {

        @Required
        private String item_id;

        @Required
        private String text;
        private Optional<AudioPlayer.Stream> audio = Optional.a();
        private Optional<Image> image = Optional.a();
        private Optional<Long> create_time = Optional.a();

        public MemoItem() {
        }

        public Optional<AudioPlayer.Stream> getAudio() {
            return this.audio;
        }

        public Optional<Long> getCreateTime() {
            return this.create_time;
        }

        public Optional<Image> getImage() {
            return this.image;
        }

        @Required
        public String getItemId() {
            return this.item_id;
        }

        @Required
        public String getText() {
            return this.text;
        }

        public MemoItem setAudio(AudioPlayer.Stream stream) {
            this.audio = Optional.e(stream);
            return this;
        }

        public MemoItem setCreateTime(long j) {
            this.create_time = Optional.e(Long.valueOf(j));
            return this;
        }

        public MemoItem setImage(Image image) {
            this.image = Optional.e(image);
            return this;
        }

        @Required
        public MemoItem setItemId(String str) {
            this.item_id = str;
            return this;
        }

        @Required
        public MemoItem setText(String str) {
            this.text = str;
            return this;
        }

        public MemoItem(String str, String str2) {
            this.item_id = str;
            this.text = str2;
        }
    }

    public static class MemoryBaseInfo {

        @Required
        private String content;

        @Required
        private MemoryCategory type;
        private Optional<Boolean> l4_tag = Optional.a();
        private Optional<String> memory_id = Optional.a();
        private Optional<Long> create_time = Optional.a();

        public MemoryBaseInfo() {
        }

        @Required
        public String getContent() {
            return this.content;
        }

        public Optional<Long> getCreateTime() {
            return this.create_time;
        }

        public Optional<String> getMemoryId() {
            return this.memory_id;
        }

        @Required
        public MemoryCategory getType() {
            return this.type;
        }

        public Optional<Boolean> isL4Tag() {
            return this.l4_tag;
        }

        @Required
        public MemoryBaseInfo setContent(String str) {
            this.content = str;
            return this;
        }

        public MemoryBaseInfo setCreateTime(long j) {
            this.create_time = Optional.e(Long.valueOf(j));
            return this;
        }

        public MemoryBaseInfo setL4Tag(boolean z) {
            this.l4_tag = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public MemoryBaseInfo setMemoryId(String str) {
            this.memory_id = Optional.e(str);
            return this;
        }

        @Required
        public MemoryBaseInfo setType(MemoryCategory memoryCategory) {
            this.type = memoryCategory;
            return this;
        }

        public MemoryBaseInfo(MemoryCategory memoryCategory, String str) {
            this.type = memoryCategory;
            this.content = str;
        }
    }

    @NamespaceName(name = "PathJump", namespace = AIApiConstants.Template.NAME)
    public static class PathJump implements InstructionPayload {

        @Required
        private List<PathItem> paths;

        @Required
        private PathTarget target;
        private Optional<Launcher> launcher = Optional.a();
        private Optional<String> description = Optional.a();
        private Optional<PathJumpEventRequestInfo> pathJumpEventRequestInfo = Optional.a();

        public PathJump() {
        }

        public Optional<String> getDescription() {
            return this.description;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<PathJumpEventRequestInfo> getPathJumpEventRequestInfo() {
            return this.pathJumpEventRequestInfo;
        }

        @Required
        public List<PathItem> getPaths() {
            return this.paths;
        }

        @Required
        public PathTarget getTarget() {
            return this.target;
        }

        public PathJump setDescription(String str) {
            this.description = Optional.e(str);
            return this;
        }

        public PathJump setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public PathJump setPathJumpEventRequestInfo(PathJumpEventRequestInfo pathJumpEventRequestInfo) {
            this.pathJumpEventRequestInfo = Optional.e(pathJumpEventRequestInfo);
            return this;
        }

        @Required
        public PathJump setPaths(List<PathItem> list) {
            this.paths = list;
            return this;
        }

        @Required
        public PathJump setTarget(PathTarget pathTarget) {
            this.target = pathTarget;
            return this;
        }

        public PathJump(List<PathItem> list, PathTarget pathTarget) {
            this.paths = list;
            this.target = pathTarget;
        }
    }

    @NamespaceName(name = "Person", namespace = AIApiConstants.Template.NAME)
    public static class Person implements InstructionPayload {

        @Required
        private String desc;

        @Required
        private String name;
        private Optional<Image> avatar = Optional.a();
        private Optional<List<PersonMeta>> metas = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();

        public Person() {
        }

        public Optional<Image> getAvatar() {
            return this.avatar;
        }

        @Required
        public String getDesc() {
            return this.desc;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        public Optional<List<PersonMeta>> getMetas() {
            return this.metas;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Person setAvatar(Image image) {
            this.avatar = Optional.e(image);
            return this;
        }

        @Required
        public Person setDesc(String str) {
            this.desc = str;
            return this;
        }

        public Person setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        public Person setMetas(List<PersonMeta> list) {
            this.metas = Optional.e(list);
            return this;
        }

        @Required
        public Person setName(String str) {
            this.name = str;
            return this;
        }

        public Person(String str, String str2) {
            this.name = str;
            this.desc = str2;
        }
    }

    public static class Player {

        @Required
        private String name;
        private Optional<String> introduction = Optional.a();
        private Optional<Image> photo = Optional.a();
        private Optional<Launcher> launcher = Optional.a();

        public Player() {
        }

        public Optional<String> getIntroduction() {
            return this.introduction;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<Image> getPhoto() {
            return this.photo;
        }

        public Player setIntroduction(String str) {
            this.introduction = Optional.e(str);
            return this;
        }

        public Player setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        @Required
        public Player setName(String str) {
            this.name = str;
            return this;
        }

        public Player setPhoto(Image image) {
            this.photo = Optional.e(image);
            return this;
        }

        public Player(String str) {
            this.name = str;
        }
    }

    @NamespaceName(name = "PlayerRecord", namespace = AIApiConstants.Template.NAME)
    public static class PlayerRecord implements InstructionPayload {

        @Required
        private List<Common.PropItem> data;

        @Required
        private Player player;

        @Required
        private Image skill_icon;
        private Optional<MatchSchedule> recent_match = Optional.a();
        private Optional<CustomBackground> background = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();

        public PlayerRecord() {
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        @Required
        public List<Common.PropItem> getData() {
            return this.data;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        @Required
        public Player getPlayer() {
            return this.player;
        }

        public Optional<MatchSchedule> getRecentMatch() {
            return this.recent_match;
        }

        @Required
        public Image getSkillIcon() {
            return this.skill_icon;
        }

        public PlayerRecord setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        @Required
        public PlayerRecord setData(List<Common.PropItem> list) {
            this.data = list;
            return this;
        }

        public PlayerRecord setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        @Required
        public PlayerRecord setPlayer(Player player) {
            this.player = player;
            return this;
        }

        public PlayerRecord setRecentMatch(MatchSchedule matchSchedule) {
            this.recent_match = Optional.e(matchSchedule);
            return this;
        }

        @Required
        public PlayerRecord setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        public PlayerRecord(Player player, List<Common.PropItem> list, Image image) {
            this.player = player;
            this.data = list;
            this.skill_icon = image;
        }
    }

    public static class QuickAppLaunchInfo {

        @Required
        private String pkg_name;

        @Required
        private int size;

        @Required
        private AppVersion version;
        private Optional<c4h> params = Optional.a();
        private Optional<CustomBackground> background = Optional.a();
        private Optional<Task> task = Optional.a();

        public QuickAppLaunchInfo() {
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<c4h> getParams() {
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

        public Optional<Task> getTask() {
            return this.task;
        }

        @Required
        public AppVersion getVersion() {
            return this.version;
        }

        public QuickAppLaunchInfo setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public QuickAppLaunchInfo setParams(c4h c4hVar) {
            this.params = Optional.e(c4hVar);
            return this;
        }

        @Required
        public QuickAppLaunchInfo setPkgName(String str) {
            this.pkg_name = str;
            return this;
        }

        @Required
        public QuickAppLaunchInfo setSize(int i) {
            this.size = i;
            return this;
        }

        public QuickAppLaunchInfo setTask(Task task) {
            this.task = Optional.e(task);
            return this;
        }

        @Required
        public QuickAppLaunchInfo setVersion(AppVersion appVersion) {
            this.version = appVersion;
            return this;
        }

        public QuickAppLaunchInfo(String str, int i, AppVersion appVersion) {
            this.pkg_name = str;
            this.size = i;
            this.version = appVersion;
        }
    }

    @NamespaceName(name = "ResolveWords", namespace = AIApiConstants.Template.NAME)
    public static class ResolveWords implements EventPayload {

        @Required
        private String words;
        private Optional<String> id = Optional.a();
        private Optional<ResolveWordsType> type = Optional.a();
        private Optional<String> property = Optional.a();

        public ResolveWords() {
        }

        public Optional<String> getId() {
            return this.id;
        }

        public Optional<String> getProperty() {
            return this.property;
        }

        public Optional<ResolveWordsType> getType() {
            return this.type;
        }

        @Required
        public String getWords() {
            return this.words;
        }

        public ResolveWords setId(String str) {
            this.id = Optional.e(str);
            return this;
        }

        public ResolveWords setProperty(String str) {
            this.property = Optional.e(str);
            return this;
        }

        public ResolveWords setType(ResolveWordsType resolveWordsType) {
            this.type = Optional.e(resolveWordsType);
            return this;
        }

        @Required
        public ResolveWords setWords(String str) {
            this.words = str;
            return this;
        }

        public ResolveWords(String str) {
            this.words = str;
        }
    }

    public static class RichText {

        @Required
        private String text;
        private Optional<String> color = Optional.a();
        private Optional<String> bg_color = Optional.a();
        private Optional<String> html = Optional.a();

        public RichText() {
        }

        public Optional<String> getBgColor() {
            return this.bg_color;
        }

        public Optional<String> getColor() {
            return this.color;
        }

        public Optional<String> getHtml() {
            return this.html;
        }

        @Required
        public String getText() {
            return this.text;
        }

        public RichText setBgColor(String str) {
            this.bg_color = Optional.e(str);
            return this;
        }

        public RichText setColor(String str) {
            this.color = Optional.e(str);
            return this;
        }

        public RichText setHtml(String str) {
            this.html = Optional.e(str);
            return this;
        }

        @Required
        public RichText setText(String str) {
            this.text = str;
            return this;
        }

        public RichText(String str) {
            this.text = str;
        }
    }

    public static class ScenarioActionItem {

        @Required
        private Title title;
        private Optional<List<DeviceItem>> items = Optional.a();
        private Optional<ScenarioActionType> action_type = Optional.a();
        private Optional<Image> image = Optional.a();

        public ScenarioActionItem() {
        }

        public Optional<ScenarioActionType> getActionType() {
            return this.action_type;
        }

        public Optional<Image> getImage() {
            return this.image;
        }

        public Optional<List<DeviceItem>> getItems() {
            return this.items;
        }

        @Required
        public Title getTitle() {
            return this.title;
        }

        public ScenarioActionItem setActionType(ScenarioActionType scenarioActionType) {
            this.action_type = Optional.e(scenarioActionType);
            return this;
        }

        public ScenarioActionItem setImage(Image image) {
            this.image = Optional.e(image);
            return this;
        }

        public ScenarioActionItem setItems(List<DeviceItem> list) {
            this.items = Optional.e(list);
            return this;
        }

        @Required
        public ScenarioActionItem setTitle(Title title) {
            this.title = title;
            return this;
        }

        public ScenarioActionItem(Title title) {
            this.title = title;
        }
    }

    public static class ScenarioTriggerItem {

        @Required
        private Title title;
        private Optional<DeviceItem> trigger_device = Optional.a();
        private Optional<ScenarioTriggerType> trigger_type = Optional.a();
        private Optional<Image> image = Optional.a();

        public ScenarioTriggerItem() {
        }

        public Optional<Image> getImage() {
            return this.image;
        }

        @Required
        public Title getTitle() {
            return this.title;
        }

        public Optional<DeviceItem> getTriggerDevice() {
            return this.trigger_device;
        }

        public Optional<ScenarioTriggerType> getTriggerType() {
            return this.trigger_type;
        }

        public ScenarioTriggerItem setImage(Image image) {
            this.image = Optional.e(image);
            return this;
        }

        @Required
        public ScenarioTriggerItem setTitle(Title title) {
            this.title = title;
            return this;
        }

        public ScenarioTriggerItem setTriggerDevice(DeviceItem deviceItem) {
            this.trigger_device = Optional.e(deviceItem);
            return this;
        }

        public ScenarioTriggerItem setTriggerType(ScenarioTriggerType scenarioTriggerType) {
            this.trigger_type = Optional.e(scenarioTriggerType);
            return this;
        }

        public ScenarioTriggerItem(Title title) {
            this.title = title;
        }
    }

    @NamespaceName(name = "Scenes", namespace = AIApiConstants.Template.NAME)
    public static class Scenes implements InstructionPayload {

        @Required
        private List<SceneGroup> groups;
        private Optional<DisplayCommon> display = Optional.a();
        private Optional<Image> skill_icon = Optional.a();
        private Optional<Title> title = Optional.a();

        public Scenes() {
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        @Required
        public List<SceneGroup> getGroups() {
            return this.groups;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        public Optional<Title> getTitle() {
            return this.title;
        }

        public Scenes setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        @Required
        public Scenes setGroups(List<SceneGroup> list) {
            this.groups = list;
            return this;
        }

        public Scenes setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public Scenes setTitle(Title title) {
            this.title = Optional.e(title);
            return this;
        }

        public Scenes(List<SceneGroup> list) {
            this.groups = list;
        }
    }

    @NamespaceName(name = "ShopRecommendation", namespace = AIApiConstants.Template.NAME)
    public static class ShopRecommendation implements InstructionPayload {

        @Required
        private List<ShopRecommendationItem> items;
        private Optional<Image> skill_icon = Optional.a();
        private Optional<CustomBackground> background = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();

        public ShopRecommendation() {
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        @Required
        public List<ShopRecommendationItem> getItems() {
            return this.items;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        public ShopRecommendation setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public ShopRecommendation setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        @Required
        public ShopRecommendation setItems(List<ShopRecommendationItem> list) {
            this.items = list;
            return this;
        }

        public ShopRecommendation setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public ShopRecommendation(List<ShopRecommendationItem> list) {
            this.items = list;
        }
    }

    public static class SmartHotelSummary {

        @Required
        private String content;
        private Optional<Image> icon = Optional.a();
        private Optional<SmartHotelWifi> wifi = Optional.a();
        private Optional<List<SmartHotelBaseInfo>> base_infos = Optional.a();

        public SmartHotelSummary() {
        }

        public Optional<List<SmartHotelBaseInfo>> getBaseInfos() {
            return this.base_infos;
        }

        @Required
        public String getContent() {
            return this.content;
        }

        public Optional<Image> getIcon() {
            return this.icon;
        }

        public Optional<SmartHotelWifi> getWifi() {
            return this.wifi;
        }

        public SmartHotelSummary setBaseInfos(List<SmartHotelBaseInfo> list) {
            this.base_infos = Optional.e(list);
            return this;
        }

        @Required
        public SmartHotelSummary setContent(String str) {
            this.content = str;
            return this;
        }

        public SmartHotelSummary setIcon(Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        public SmartHotelSummary setWifi(SmartHotelWifi smartHotelWifi) {
            this.wifi = Optional.e(smartHotelWifi);
            return this;
        }

        public SmartHotelSummary(String str) {
            this.content = str;
        }
    }

    @NamespaceName(name = "SportMatch", namespace = AIApiConstants.Template.NAME)
    public static class SportMatch implements InstructionPayload {

        @Required
        private Image cp;

        @Required
        private String name;
        private Optional<List<SportMatchSchedule>> schedule = Optional.a();
        private Optional<List<SportMatchMedalRank>> medal_ranks = Optional.a();
        private Optional<Launcher> launcher = Optional.a();

        public SportMatch() {
        }

        @Required
        public Image getCp() {
            return this.cp;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<List<SportMatchMedalRank>> getMedalRanks() {
            return this.medal_ranks;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<List<SportMatchSchedule>> getSchedule() {
            return this.schedule;
        }

        @Required
        public SportMatch setCp(Image image) {
            this.cp = image;
            return this;
        }

        public SportMatch setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public SportMatch setMedalRanks(List<SportMatchMedalRank> list) {
            this.medal_ranks = Optional.e(list);
            return this;
        }

        @Required
        public SportMatch setName(String str) {
            this.name = str;
            return this;
        }

        public SportMatch setSchedule(List<SportMatchSchedule> list) {
            this.schedule = Optional.e(list);
            return this;
        }

        public SportMatch(String str, Image image) {
            this.name = str;
            this.cp = image;
        }
    }

    public static class SportMatchMedalRank {

        @Required
        private int bronze;

        @Required
        private String country;

        @Required
        private int gold;

        @Required
        private int rank;

        @Required
        private int silver;

        @Required
        private int total;
        private Optional<String> goals_fumbles = Optional.a();
        private Optional<Image> image = Optional.a();
        private Optional<String> group = Optional.a();

        public SportMatchMedalRank() {
        }

        @Required
        public int getBronze() {
            return this.bronze;
        }

        @Required
        public String getCountry() {
            return this.country;
        }

        public Optional<String> getGoalsFumbles() {
            return this.goals_fumbles;
        }

        @Required
        public int getGold() {
            return this.gold;
        }

        public Optional<String> getGroup() {
            return this.group;
        }

        public Optional<Image> getImage() {
            return this.image;
        }

        @Required
        public int getRank() {
            return this.rank;
        }

        @Required
        public int getSilver() {
            return this.silver;
        }

        @Required
        public int getTotal() {
            return this.total;
        }

        @Required
        public SportMatchMedalRank setBronze(int i) {
            this.bronze = i;
            return this;
        }

        @Required
        public SportMatchMedalRank setCountry(String str) {
            this.country = str;
            return this;
        }

        public SportMatchMedalRank setGoalsFumbles(String str) {
            this.goals_fumbles = Optional.e(str);
            return this;
        }

        @Required
        public SportMatchMedalRank setGold(int i) {
            this.gold = i;
            return this;
        }

        public SportMatchMedalRank setGroup(String str) {
            this.group = Optional.e(str);
            return this;
        }

        public SportMatchMedalRank setImage(Image image) {
            this.image = Optional.e(image);
            return this;
        }

        @Required
        public SportMatchMedalRank setRank(int i) {
            this.rank = i;
            return this;
        }

        @Required
        public SportMatchMedalRank setSilver(int i) {
            this.silver = i;
            return this;
        }

        @Required
        public SportMatchMedalRank setTotal(int i) {
            this.total = i;
            return this;
        }

        public SportMatchMedalRank(String str, int i, int i2, int i3, int i4, int i5) {
            this.country = str;
            this.rank = i;
            this.total = i2;
            this.gold = i3;
            this.silver = i4;
            this.bronze = i5;
        }
    }

    @NamespaceName(name = "TaskSummary", namespace = AIApiConstants.Template.NAME)
    public static class TaskSummary implements InstructionPayload {

        @Required
        private String name;
        private Optional<String> description = Optional.a();
        private Optional<Launcher> launcher = Optional.a();
        private Optional<Image> icon = Optional.a();

        public TaskSummary() {
        }

        public Optional<String> getDescription() {
            return this.description;
        }

        public Optional<Image> getIcon() {
            return this.icon;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public TaskSummary setDescription(String str) {
            this.description = Optional.e(str);
            return this;
        }

        public TaskSummary setIcon(Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        public TaskSummary setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        @Required
        public TaskSummary setName(String str) {
            this.name = str;
            return this;
        }

        public TaskSummary(String str) {
            this.name = str;
        }
    }

    public static class VehicleControlResultItem {

        @Required
        private VehicleControlResultType type;
        private Optional<String> operation_desc = Optional.a();
        private Optional<String> result_desc = Optional.a();
        private Optional<VehicleDeviceIcon> icon = Optional.a();

        public VehicleControlResultItem() {
        }

        public Optional<VehicleDeviceIcon> getIcon() {
            return this.icon;
        }

        public Optional<String> getOperationDesc() {
            return this.operation_desc;
        }

        public Optional<String> getResultDesc() {
            return this.result_desc;
        }

        @Required
        public VehicleControlResultType getType() {
            return this.type;
        }

        public VehicleControlResultItem setIcon(VehicleDeviceIcon vehicleDeviceIcon) {
            this.icon = Optional.e(vehicleDeviceIcon);
            return this;
        }

        public VehicleControlResultItem setOperationDesc(String str) {
            this.operation_desc = Optional.e(str);
            return this;
        }

        public VehicleControlResultItem setResultDesc(String str) {
            this.result_desc = Optional.e(str);
            return this;
        }

        @Required
        public VehicleControlResultItem setType(VehicleControlResultType vehicleControlResultType) {
            this.type = vehicleControlResultType;
            return this;
        }

        public VehicleControlResultItem(VehicleControlResultType vehicleControlResultType) {
            this.type = vehicleControlResultType;
        }
    }

    @NamespaceName(name = "Weather", namespace = AIApiConstants.Template.NAME)
    public static class Weather implements InstructionPayload {

        @Required
        private Image skill_icon;

        @Required
        private List<WeatherItem> weather;
        private Optional<Launcher> launcher = Optional.a();
        private Optional<CustomBackground> background = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();

        public Weather() {
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        @Required
        public Image getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public List<WeatherItem> getWeather() {
            return this.weather;
        }

        public Weather setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public Weather setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        public Weather setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        @Required
        public Weather setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        @Required
        public Weather setWeather(List<WeatherItem> list) {
            this.weather = list;
            return this;
        }

        public Weather(List<WeatherItem> list, Image image) {
            this.weather = list;
            this.skill_icon = image;
        }
    }

    public static class WeatherWindDirection {

        @Required
        private String text;
        private Optional<String> current = Optional.a();
        private Optional<String> from = Optional.a();
        private Optional<String> to = Optional.a();

        public WeatherWindDirection() {
        }

        public Optional<String> getCurrent() {
            return this.current;
        }

        public Optional<String> getFrom() {
            return this.from;
        }

        @Required
        public String getText() {
            return this.text;
        }

        public Optional<String> getTo() {
            return this.to;
        }

        public WeatherWindDirection setCurrent(String str) {
            this.current = Optional.e(str);
            return this;
        }

        public WeatherWindDirection setFrom(String str) {
            this.from = Optional.e(str);
            return this;
        }

        @Required
        public WeatherWindDirection setText(String str) {
            this.text = str;
            return this;
        }

        public WeatherWindDirection setTo(String str) {
            this.to = Optional.e(str);
            return this;
        }

        public WeatherWindDirection(String str) {
            this.text = str;
        }
    }

    public static class WeatherWindSpeed {

        @Required
        private String text;
        private Optional<String> current = Optional.a();
        private Optional<String> from = Optional.a();
        private Optional<String> to = Optional.a();

        public WeatherWindSpeed() {
        }

        public Optional<String> getCurrent() {
            return this.current;
        }

        public Optional<String> getFrom() {
            return this.from;
        }

        @Required
        public String getText() {
            return this.text;
        }

        public Optional<String> getTo() {
            return this.to;
        }

        public WeatherWindSpeed setCurrent(String str) {
            this.current = Optional.e(str);
            return this;
        }

        public WeatherWindSpeed setFrom(String str) {
            this.from = Optional.e(str);
            return this;
        }

        @Required
        public WeatherWindSpeed setText(String str) {
            this.text = str;
            return this;
        }

        public WeatherWindSpeed setTo(String str) {
            this.to = Optional.e(str);
            return this;
        }

        public WeatherWindSpeed(String str) {
            this.text = str;
        }
    }

    @NamespaceName(name = "WikiEvent", namespace = AIApiConstants.Template.NAME)
    public static class WikiEvent implements EventPayload {

        @Required
        private WikiEventType category;
        private Optional<String> text = Optional.a();
        private Optional<String> sid = Optional.a();
        private Optional<String> mentions = Optional.a();

        public WikiEvent() {
        }

        @Required
        public WikiEventType getCategory() {
            return this.category;
        }

        public Optional<String> getMentions() {
            return this.mentions;
        }

        public Optional<String> getSid() {
            return this.sid;
        }

        public Optional<String> getText() {
            return this.text;
        }

        @Required
        public WikiEvent setCategory(WikiEventType wikiEventType) {
            this.category = wikiEventType;
            return this;
        }

        public WikiEvent setMentions(String str) {
            this.mentions = Optional.e(str);
            return this;
        }

        public WikiEvent setSid(String str) {
            this.sid = Optional.e(str);
            return this;
        }

        public WikiEvent setText(String str) {
            this.text = Optional.e(str);
            return this;
        }

        public WikiEvent(WikiEventType wikiEventType) {
            this.category = wikiEventType;
        }
    }

    @NamespaceName(name = com.xiaomi.ai.api.intent.AIApiConstants.Alarm.NAME, namespace = AIApiConstants.Template.NAME)
    public static class Alarm implements InstructionPayload {

        @Required
        private List<AlarmItem> items;

        @Required
        private AlarmOperation operation;

        @Deprecated
        private Optional<Image> icon = Optional.a();
        private Optional<Launcher> launcher = Optional.a();
        private Optional<Image> skill_icon = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();

        public Alarm() {
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        @Deprecated
        public Optional<Image> getIcon() {
            return this.icon;
        }

        @Required
        public List<AlarmItem> getItems() {
            return this.items;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        @Required
        public AlarmOperation getOperation() {
            return this.operation;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        public Alarm setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        @Deprecated
        public Alarm setIcon(Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        @Required
        public Alarm setItems(List<AlarmItem> list) {
            this.items = list;
            return this;
        }

        public Alarm setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        @Required
        public Alarm setOperation(AlarmOperation alarmOperation) {
            this.operation = alarmOperation;
            return this;
        }

        public Alarm setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public Alarm(AlarmOperation alarmOperation, List<AlarmItem> list) {
            this.operation = alarmOperation;
            this.items = list;
        }
    }

    @NamespaceName(name = "AutomationScenarioList", namespace = AIApiConstants.Template.NAME)
    public static class AutomationScenarioList implements InstructionPayload {

        @Required
        private List<ScenarioInfo> items;
        private Optional<Image> skill_icon = Optional.a();
        private Optional<CustomBackground> background = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();
        private Optional<Launcher> launcher = Optional.a();

        public AutomationScenarioList() {
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        @Required
        public List<ScenarioInfo> getItems() {
            return this.items;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        public AutomationScenarioList setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public AutomationScenarioList setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        @Required
        public AutomationScenarioList setItems(List<ScenarioInfo> list) {
            this.items = list;
            return this;
        }

        public AutomationScenarioList setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public AutomationScenarioList setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public AutomationScenarioList(List<ScenarioInfo> list) {
            this.items = list;
        }
    }

    @NamespaceName(name = "CallConfirm", namespace = AIApiConstants.Template.NAME)
    public static class CallConfirm implements InstructionPayload {

        @Required
        private Phone.Contact contact;
        private Optional<Phone.CardType> card_type = Optional.a();
        private Optional<Phone.CallMode> call_mode = Optional.a();
        private Optional<Integer> countdown = Optional.a();
        private Optional<Image> skill_icon = Optional.a();

        public CallConfirm() {
        }

        public Optional<Phone.CallMode> getCallMode() {
            return this.call_mode;
        }

        public Optional<Phone.CardType> getCardType() {
            return this.card_type;
        }

        @Required
        public Phone.Contact getContact() {
            return this.contact;
        }

        public Optional<Integer> getCountdown() {
            return this.countdown;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        public CallConfirm setCallMode(Phone.CallMode callMode) {
            this.call_mode = Optional.e(callMode);
            return this;
        }

        public CallConfirm setCardType(Phone.CardType cardType) {
            this.card_type = Optional.e(cardType);
            return this;
        }

        @Required
        public CallConfirm setContact(Phone.Contact contact) {
            this.contact = contact;
            return this;
        }

        public CallConfirm setCountdown(int i) {
            this.countdown = Optional.e(Integer.valueOf(i));
            return this;
        }

        public CallConfirm setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public CallConfirm(Phone.Contact contact) {
            this.contact = contact;
        }
    }

    @NamespaceName(name = "CarStatisticItem", namespace = AIApiConstants.Template.NAME)
    public static class CarStatisticItem implements InstructionPayload {

        @Required
        private String name;

        @Required
        private String unit;

        @Required
        private String value;
        private Optional<Long> timestamp = Optional.a();
        private Optional<Float> progress_bar = Optional.a();
        private Optional<CarCardCategory> pattern = Optional.a();
        private Optional<Image> image = Optional.a();

        public CarStatisticItem() {
        }

        public Optional<Image> getImage() {
            return this.image;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<CarCardCategory> getPattern() {
            return this.pattern;
        }

        public Optional<Float> getProgressBar() {
            return this.progress_bar;
        }

        public Optional<Long> getTimestamp() {
            return this.timestamp;
        }

        @Required
        public String getUnit() {
            return this.unit;
        }

        @Required
        public String getValue() {
            return this.value;
        }

        public CarStatisticItem setImage(Image image) {
            this.image = Optional.e(image);
            return this;
        }

        @Required
        public CarStatisticItem setName(String str) {
            this.name = str;
            return this;
        }

        public CarStatisticItem setPattern(CarCardCategory carCardCategory) {
            this.pattern = Optional.e(carCardCategory);
            return this;
        }

        public CarStatisticItem setProgressBar(float f) {
            this.progress_bar = Optional.e(Float.valueOf(f));
            return this;
        }

        public CarStatisticItem setTimestamp(long j) {
            this.timestamp = Optional.e(Long.valueOf(j));
            return this;
        }

        @Required
        public CarStatisticItem setUnit(String str) {
            this.unit = str;
            return this;
        }

        @Required
        public CarStatisticItem setValue(String str) {
            this.value = str;
            return this;
        }

        public CarStatisticItem(String str, String str2, String str3) {
            this.name = str;
            this.value = str2;
            this.unit = str3;
        }
    }

    @NamespaceName(name = "CarToHomeLocationSharing", namespace = AIApiConstants.Template.NAME)
    public static class CarToHomeLocationSharing implements InstructionPayload {

        @Required
        private String caller_device_name;

        @Required
        private String destination_name;

        @Required
        private String estimate_arrive_time;

        @Required
        private long last_update_time;

        @Required
        private float left_distance;

        @Required
        private int left_time;

        @Required
        private Image logo;

        @Required
        private NavigationStatus navigation_status;

        @Required
        private Image profile_picture;
        private Optional<String> collect_destination_name = Optional.a();
        private Optional<String> current_location_name = Optional.a();
        private Optional<VehicleStatus> vehicle_status = Optional.a();
        private Optional<Integer> dwell_time = Optional.a();

        public CarToHomeLocationSharing() {
        }

        @Required
        public String getCallerDeviceName() {
            return this.caller_device_name;
        }

        public Optional<String> getCollectDestinationName() {
            return this.collect_destination_name;
        }

        public Optional<String> getCurrentLocationName() {
            return this.current_location_name;
        }

        @Required
        public String getDestinationName() {
            return this.destination_name;
        }

        public Optional<Integer> getDwellTime() {
            return this.dwell_time;
        }

        @Required
        public String getEstimateArriveTime() {
            return this.estimate_arrive_time;
        }

        @Required
        public long getLastUpdateTime() {
            return this.last_update_time;
        }

        @Required
        public float getLeftDistance() {
            return this.left_distance;
        }

        @Required
        public int getLeftTime() {
            return this.left_time;
        }

        @Required
        public Image getLogo() {
            return this.logo;
        }

        @Required
        public NavigationStatus getNavigationStatus() {
            return this.navigation_status;
        }

        @Required
        public Image getProfilePicture() {
            return this.profile_picture;
        }

        public Optional<VehicleStatus> getVehicleStatus() {
            return this.vehicle_status;
        }

        @Required
        public CarToHomeLocationSharing setCallerDeviceName(String str) {
            this.caller_device_name = str;
            return this;
        }

        public CarToHomeLocationSharing setCollectDestinationName(String str) {
            this.collect_destination_name = Optional.e(str);
            return this;
        }

        public CarToHomeLocationSharing setCurrentLocationName(String str) {
            this.current_location_name = Optional.e(str);
            return this;
        }

        @Required
        public CarToHomeLocationSharing setDestinationName(String str) {
            this.destination_name = str;
            return this;
        }

        public CarToHomeLocationSharing setDwellTime(int i) {
            this.dwell_time = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Required
        public CarToHomeLocationSharing setEstimateArriveTime(String str) {
            this.estimate_arrive_time = str;
            return this;
        }

        @Required
        public CarToHomeLocationSharing setLastUpdateTime(long j) {
            this.last_update_time = j;
            return this;
        }

        @Required
        public CarToHomeLocationSharing setLeftDistance(float f) {
            this.left_distance = f;
            return this;
        }

        @Required
        public CarToHomeLocationSharing setLeftTime(int i) {
            this.left_time = i;
            return this;
        }

        @Required
        public CarToHomeLocationSharing setLogo(Image image) {
            this.logo = image;
            return this;
        }

        @Required
        public CarToHomeLocationSharing setNavigationStatus(NavigationStatus navigationStatus) {
            this.navigation_status = navigationStatus;
            return this;
        }

        @Required
        public CarToHomeLocationSharing setProfilePicture(Image image) {
            this.profile_picture = image;
            return this;
        }

        public CarToHomeLocationSharing setVehicleStatus(VehicleStatus vehicleStatus) {
            this.vehicle_status = Optional.e(vehicleStatus);
            return this;
        }

        public CarToHomeLocationSharing(String str, long j, String str2, float f, int i, String str3, Image image, Image image2, NavigationStatus navigationStatus) {
            this.caller_device_name = str;
            this.last_update_time = j;
            this.destination_name = str2;
            this.left_distance = f;
            this.left_time = i;
            this.estimate_arrive_time = str3;
            this.logo = image;
            this.profile_picture = image2;
            this.navigation_status = navigationStatus;
        }
    }

    @NamespaceName(name = "General2", namespace = AIApiConstants.Template.NAME)
    public static class General2 implements InstructionPayload {

        @Required
        private RichText main_title;

        @Required
        private Image skill_icon;

        @Required
        private List<RichText> sub_titles;

        @Required
        private List<RichText> texts;
        private Optional<Launcher> launcher = Optional.a();
        private Optional<CustomBackground> background = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();
        private Optional<String> specification = Optional.a();

        public General2() {
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        @Required
        public RichText getMainTitle() {
            return this.main_title;
        }

        @Required
        public Image getSkillIcon() {
            return this.skill_icon;
        }

        public Optional<String> getSpecification() {
            return this.specification;
        }

        @Required
        public List<RichText> getSubTitles() {
            return this.sub_titles;
        }

        @Required
        public List<RichText> getTexts() {
            return this.texts;
        }

        public General2 setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public General2 setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        public General2 setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        @Required
        public General2 setMainTitle(RichText richText) {
            this.main_title = richText;
            return this;
        }

        @Required
        public General2 setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        public General2 setSpecification(String str) {
            this.specification = Optional.e(str);
            return this;
        }

        @Required
        public General2 setSubTitles(List<RichText> list) {
            this.sub_titles = list;
            return this;
        }

        @Required
        public General2 setTexts(List<RichText> list) {
            this.texts = list;
            return this;
        }

        public General2(RichText richText, List<RichText> list, List<RichText> list2, Image image) {
            this.main_title = richText;
            this.sub_titles = list;
            this.texts = list2;
            this.skill_icon = image;
        }
    }

    public static class HomeInfo {

        @Required
        private String home_id;

        @Required
        private String home_name;
        private Optional<Boolean> resident = Optional.a();
        private Optional<String> home_description = Optional.a();
        private Optional<DeviceList> device_list = Optional.a();
        private Optional<Boolean> is_device_list_show = Optional.a();

        public HomeInfo() {
        }

        public Optional<DeviceList> getDeviceList() {
            return this.device_list;
        }

        public Optional<String> getHomeDescription() {
            return this.home_description;
        }

        @Required
        public String getHomeId() {
            return this.home_id;
        }

        @Required
        public String getHomeName() {
            return this.home_name;
        }

        public Optional<Boolean> isDeviceListShow() {
            return this.is_device_list_show;
        }

        public Optional<Boolean> isResident() {
            return this.resident;
        }

        public HomeInfo setDeviceList(DeviceList deviceList) {
            this.device_list = Optional.e(deviceList);
            return this;
        }

        public HomeInfo setHomeDescription(String str) {
            this.home_description = Optional.e(str);
            return this;
        }

        @Required
        public HomeInfo setHomeId(String str) {
            this.home_id = str;
            return this;
        }

        @Required
        public HomeInfo setHomeName(String str) {
            this.home_name = str;
            return this;
        }

        public HomeInfo setIsDeviceListShow(boolean z) {
            this.is_device_list_show = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public HomeInfo setResident(boolean z) {
            this.resident = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public HomeInfo(String str, String str2) {
            this.home_id = str;
            this.home_name = str2;
        }
    }

    public static class HomeItem {

        @Required
        private Title title;
        private Optional<HomeInfo> info = Optional.a();
        private Optional<List<Image>> images = Optional.a();
        private Optional<Launcher> launcher = Optional.a();
        private Optional<HomeOperateResult> home_operate_result = Optional.a();

        public HomeItem() {
        }

        public Optional<HomeOperateResult> getHomeOperateResult() {
            return this.home_operate_result;
        }

        public Optional<List<Image>> getImages() {
            return this.images;
        }

        public Optional<HomeInfo> getInfo() {
            return this.info;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        @Required
        public Title getTitle() {
            return this.title;
        }

        public HomeItem setHomeOperateResult(HomeOperateResult homeOperateResult) {
            this.home_operate_result = Optional.e(homeOperateResult);
            return this;
        }

        public HomeItem setImages(List<Image> list) {
            this.images = Optional.e(list);
            return this;
        }

        public HomeItem setInfo(HomeInfo homeInfo) {
            this.info = Optional.e(homeInfo);
            return this;
        }

        public HomeItem setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        @Required
        public HomeItem setTitle(Title title) {
            this.title = title;
            return this;
        }

        public HomeItem(Title title) {
            this.title = title;
        }
    }

    public static class ImageAndroidIntent {

        @Required
        private String pkg_name;

        @Required
        private String type;

        @Required
        private String uri;
        private Optional<String> permission = Optional.a();
        private Optional<OnError> on_error = Optional.a();
        private Optional<Integer> min_version = Optional.a();
        private Optional<c4h> params = Optional.a();

        public ImageAndroidIntent() {
        }

        public Optional<Integer> getMinVersion() {
            return this.min_version;
        }

        public Optional<OnError> getOnError() {
            return this.on_error;
        }

        public Optional<c4h> getParams() {
            return this.params;
        }

        public Optional<String> getPermission() {
            return this.permission;
        }

        @Required
        public String getPkgName() {
            return this.pkg_name;
        }

        @Required
        public String getType() {
            return this.type;
        }

        @Required
        public String getUri() {
            return this.uri;
        }

        public ImageAndroidIntent setMinVersion(int i) {
            this.min_version = Optional.e(Integer.valueOf(i));
            return this;
        }

        public ImageAndroidIntent setOnError(OnError onError) {
            this.on_error = Optional.e(onError);
            return this;
        }

        public ImageAndroidIntent setParams(c4h c4hVar) {
            this.params = Optional.e(c4hVar);
            return this;
        }

        public ImageAndroidIntent setPermission(String str) {
            this.permission = Optional.e(str);
            return this;
        }

        @Required
        public ImageAndroidIntent setPkgName(String str) {
            this.pkg_name = str;
            return this;
        }

        @Required
        public ImageAndroidIntent setType(String str) {
            this.type = str;
            return this;
        }

        @Required
        public ImageAndroidIntent setUri(String str) {
            this.uri = str;
            return this;
        }

        public ImageAndroidIntent(String str, String str2, String str3) {
            this.type = str;
            this.pkg_name = str2;
            this.uri = str3;
        }
    }

    public static class KnowledgeItem {

        @Required
        private String query;

        @Required
        private KnowledgeType type;
        private Optional<String> name = Optional.a();
        private Optional<String> property = Optional.a();
        private Optional<String> summary = Optional.a();
        private Optional<Image> image = Optional.a();

        public KnowledgeItem() {
        }

        public Optional<Image> getImage() {
            return this.image;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<String> getProperty() {
            return this.property;
        }

        @Required
        public String getQuery() {
            return this.query;
        }

        public Optional<String> getSummary() {
            return this.summary;
        }

        @Required
        public KnowledgeType getType() {
            return this.type;
        }

        public KnowledgeItem setImage(Image image) {
            this.image = Optional.e(image);
            return this;
        }

        public KnowledgeItem setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public KnowledgeItem setProperty(String str) {
            this.property = Optional.e(str);
            return this;
        }

        @Required
        public KnowledgeItem setQuery(String str) {
            this.query = str;
            return this;
        }

        public KnowledgeItem setSummary(String str) {
            this.summary = Optional.e(str);
            return this;
        }

        @Required
        public KnowledgeItem setType(KnowledgeType knowledgeType) {
            this.type = knowledgeType;
            return this;
        }

        public KnowledgeItem(KnowledgeType knowledgeType, String str) {
            this.type = knowledgeType;
            this.query = str;
        }
    }

    public static class PlayTTSItem {

        @Required
        private String album_id;
        private Optional<Title> title = Optional.a();
        private Optional<String> summary = Optional.a();
        private Optional<Image> cover = Optional.a();
        private Optional<List<TTSTextItem>> texts = Optional.a();

        public PlayTTSItem() {
        }

        @Required
        public String getAlbumId() {
            return this.album_id;
        }

        public Optional<Image> getCover() {
            return this.cover;
        }

        public Optional<String> getSummary() {
            return this.summary;
        }

        public Optional<List<TTSTextItem>> getTexts() {
            return this.texts;
        }

        public Optional<Title> getTitle() {
            return this.title;
        }

        @Required
        public PlayTTSItem setAlbumId(String str) {
            this.album_id = str;
            return this;
        }

        public PlayTTSItem setCover(Image image) {
            this.cover = Optional.e(image);
            return this;
        }

        public PlayTTSItem setSummary(String str) {
            this.summary = Optional.e(str);
            return this;
        }

        public PlayTTSItem setTexts(List<TTSTextItem> list) {
            this.texts = Optional.e(list);
            return this;
        }

        public PlayTTSItem setTitle(Title title) {
            this.title = Optional.e(title);
            return this;
        }

        public PlayTTSItem(String str) {
            this.album_id = str;
        }
    }

    @NamespaceName(name = "QabotLists", namespace = AIApiConstants.Template.NAME)
    public static class QabotLists implements InstructionPayload {

        @Required
        private List<ListsItem> items;

        @Required
        private Title title;
        private Optional<Launcher> launcher = Optional.a();
        private Optional<Image> skill_icon = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();
        private Optional<Integer> max_row_num = Optional.a();

        public QabotLists() {
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        @Required
        public List<ListsItem> getItems() {
            return this.items;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<Integer> getMaxRowNum() {
            return this.max_row_num;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public Title getTitle() {
            return this.title;
        }

        public QabotLists setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        @Required
        public QabotLists setItems(List<ListsItem> list) {
            this.items = list;
            return this;
        }

        public QabotLists setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public QabotLists setMaxRowNum(int i) {
            this.max_row_num = Optional.e(Integer.valueOf(i));
            return this;
        }

        public QabotLists setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        @Required
        public QabotLists setTitle(Title title) {
            this.title = title;
            return this;
        }

        public QabotLists(Title title, List<ListsItem> list) {
            this.title = title;
            this.items = list;
        }
    }

    public static class QuestionAnswerVideoInfo {

        @Required
        private Image cover;

        @Required
        private String url;
        private Optional<Image> pause_icon = Optional.a();
        private Optional<Title> title = Optional.a();
        private Optional<Integer> duration_in_ms = Optional.a();
        private Optional<String> md5 = Optional.a();

        public QuestionAnswerVideoInfo() {
        }

        @Required
        public Image getCover() {
            return this.cover;
        }

        public Optional<Integer> getDurationInMs() {
            return this.duration_in_ms;
        }

        public Optional<String> getMd5() {
            return this.md5;
        }

        public Optional<Image> getPauseIcon() {
            return this.pause_icon;
        }

        public Optional<Title> getTitle() {
            return this.title;
        }

        @Required
        public String getUrl() {
            return this.url;
        }

        @Required
        public QuestionAnswerVideoInfo setCover(Image image) {
            this.cover = image;
            return this;
        }

        public QuestionAnswerVideoInfo setDurationInMs(int i) {
            this.duration_in_ms = Optional.e(Integer.valueOf(i));
            return this;
        }

        public QuestionAnswerVideoInfo setMd5(String str) {
            this.md5 = Optional.e(str);
            return this;
        }

        public QuestionAnswerVideoInfo setPauseIcon(Image image) {
            this.pause_icon = Optional.e(image);
            return this;
        }

        public QuestionAnswerVideoInfo setTitle(Title title) {
            this.title = Optional.e(title);
            return this;
        }

        @Required
        public QuestionAnswerVideoInfo setUrl(String str) {
            this.url = str;
            return this;
        }

        public QuestionAnswerVideoInfo(Image image, String str) {
            this.cover = image;
            this.url = str;
        }
    }

    @NamespaceName(name = "RestrictDriving", namespace = AIApiConstants.Template.NAME)
    public static class RestrictDriving implements InstructionPayload {

        @Required
        private String description;

        @Required
        private List<Integer> numbers;
        private Optional<String> date = Optional.a();
        private Optional<Common.Weekday> week_day = Optional.a();
        private Optional<Launcher> launcher = Optional.a();
        private Optional<Image> skill_icon = Optional.a();

        public RestrictDriving() {
        }

        public Optional<String> getDate() {
            return this.date;
        }

        @Required
        public String getDescription() {
            return this.description;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        @Required
        public List<Integer> getNumbers() {
            return this.numbers;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        public Optional<Common.Weekday> getWeekDay() {
            return this.week_day;
        }

        public RestrictDriving setDate(String str) {
            this.date = Optional.e(str);
            return this;
        }

        @Required
        public RestrictDriving setDescription(String str) {
            this.description = str;
            return this;
        }

        public RestrictDriving setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        @Required
        public RestrictDriving setNumbers(List<Integer> list) {
            this.numbers = list;
            return this;
        }

        public RestrictDriving setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public RestrictDriving setWeekDay(Common.Weekday weekday) {
            this.week_day = Optional.e(weekday);
            return this;
        }

        public RestrictDriving(String str, List<Integer> list) {
            this.description = str;
            this.numbers = list;
        }
    }

    public static class SmartHotelFacility {

        @Required
        private String name;
        private Optional<Image> image = Optional.a();
        private Optional<FacilityLocation> location = Optional.a();
        private Optional<FacilityTime> time = Optional.a();
        private Optional<String> desc = Optional.a();

        public SmartHotelFacility() {
        }

        public Optional<String> getDesc() {
            return this.desc;
        }

        public Optional<Image> getImage() {
            return this.image;
        }

        public Optional<FacilityLocation> getLocation() {
            return this.location;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<FacilityTime> getTime() {
            return this.time;
        }

        public SmartHotelFacility setDesc(String str) {
            this.desc = Optional.e(str);
            return this;
        }

        public SmartHotelFacility setImage(Image image) {
            this.image = Optional.e(image);
            return this;
        }

        public SmartHotelFacility setLocation(FacilityLocation facilityLocation) {
            this.location = Optional.e(facilityLocation);
            return this;
        }

        @Required
        public SmartHotelFacility setName(String str) {
            this.name = str;
            return this;
        }

        public SmartHotelFacility setTime(FacilityTime facilityTime) {
            this.time = Optional.e(facilityTime);
            return this;
        }

        public SmartHotelFacility(String str) {
            this.name = str;
        }
    }

    @NamespaceName(name = com.xiaomi.ai.api.intent.AIApiConstants.Stock.NAME, namespace = AIApiConstants.Template.NAME)
    public static class Stock implements InstructionPayload {

        @Required
        private List<StockDetail> stocks;
        private Optional<String> tip = Optional.a();
        private Optional<String> h5_url = Optional.a();
        private Optional<Launcher> intent = Optional.a();
        private Optional<Image> skill_icon = Optional.a();

        public Stock() {
        }

        public Optional<String> getH5Url() {
            return this.h5_url;
        }

        public Optional<Launcher> getIntent() {
            return this.intent;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public List<StockDetail> getStocks() {
            return this.stocks;
        }

        public Optional<String> getTip() {
            return this.tip;
        }

        public Stock setH5Url(String str) {
            this.h5_url = Optional.e(str);
            return this;
        }

        public Stock setIntent(Launcher launcher) {
            this.intent = Optional.e(launcher);
            return this;
        }

        public Stock setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        @Required
        public Stock setStocks(List<StockDetail> list) {
            this.stocks = list;
            return this;
        }

        public Stock setTip(String str) {
            this.tip = Optional.e(str);
            return this;
        }

        public Stock(List<StockDetail> list) {
            this.stocks = list;
        }
    }

    public static class SwitchItem {

        @Required
        private Title title;
        private Optional<String> status = Optional.a();
        private Optional<LocalTarget> target = Optional.a();
        private Optional<Launcher> launcher = Optional.a();
        private Optional<String> number_title = Optional.a();

        public SwitchItem() {
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<String> getNumberTitle() {
            return this.number_title;
        }

        public Optional<String> getStatus() {
            return this.status;
        }

        public Optional<LocalTarget> getTarget() {
            return this.target;
        }

        @Required
        public Title getTitle() {
            return this.title;
        }

        public SwitchItem setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public SwitchItem setNumberTitle(String str) {
            this.number_title = Optional.e(str);
            return this;
        }

        public SwitchItem setStatus(String str) {
            this.status = Optional.e(str);
            return this;
        }

        public SwitchItem setTarget(LocalTarget localTarget) {
            this.target = Optional.e(localTarget);
            return this;
        }

        @Required
        public SwitchItem setTitle(Title title) {
            this.title = title;
            return this;
        }

        public SwitchItem(Title title) {
            this.title = title;
        }
    }

    @NamespaceName(name = com.xiaomi.ai.api.intent.AIApiConstants.Table.NAME, namespace = AIApiConstants.Template.NAME)
    public static class Table implements InstructionPayload {

        @Required
        private Image skill_icon;

        @Required
        private List<TableData> values;
        private Optional<TableTitle> title = Optional.a();
        private Optional<TableType> type = Optional.a();
        private Optional<CustomBackground> background = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();

        public Table() {
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        @Required
        public Image getSkillIcon() {
            return this.skill_icon;
        }

        public Optional<TableTitle> getTitle() {
            return this.title;
        }

        public Optional<TableType> getType() {
            return this.type;
        }

        @Required
        public List<TableData> getValues() {
            return this.values;
        }

        public Table setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public Table setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        @Required
        public Table setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        public Table setTitle(TableTitle tableTitle) {
            this.title = Optional.e(tableTitle);
            return this;
        }

        public Table setType(TableType tableType) {
            this.type = Optional.e(tableType);
            return this;
        }

        @Required
        public Table setValues(List<TableData> list) {
            this.values = list;
            return this;
        }

        public Table(List<TableData> list, Image image) {
            this.values = list;
            this.skill_icon = image;
        }
    }

    public static class Team {

        @Required
        private String name;
        private Optional<Image> logo = Optional.a();
        private Optional<Image> aux_image = Optional.a();
        private Optional<Boolean> home = Optional.a();
        private Optional<Launcher> launcher = Optional.a();

        public Team() {
        }

        public Optional<Image> getAuxImage() {
            return this.aux_image;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<Image> getLogo() {
            return this.logo;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<Boolean> isHome() {
            return this.home;
        }

        public Team setAuxImage(Image image) {
            this.aux_image = Optional.e(image);
            return this;
        }

        public Team setHome(boolean z) {
            this.home = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public Team setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public Team setLogo(Image image) {
            this.logo = Optional.e(image);
            return this;
        }

        @Required
        public Team setName(String str) {
            this.name = str;
            return this;
        }

        public Team(String str) {
            this.name = str;
        }
    }

    @NamespaceName(name = "WeatherV2", namespace = AIApiConstants.Template.NAME)
    public static class WeatherV2 implements InstructionPayload {

        @Required
        private Title location;

        @Required
        private Image skill_icon;

        @Required
        private List<FullScreenTemplate.WeatherFragmentData> weather;
        private Optional<Launcher> launcher = Optional.a();
        private Optional<CustomBackground> background = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();
        private Optional<Boolean> daylight = Optional.a();

        public WeatherV2() {
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        @Required
        public Title getLocation() {
            return this.location;
        }

        @Required
        public Image getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public List<FullScreenTemplate.WeatherFragmentData> getWeather() {
            return this.weather;
        }

        public Optional<Boolean> isDaylight() {
            return this.daylight;
        }

        public WeatherV2 setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public WeatherV2 setDaylight(boolean z) {
            this.daylight = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public WeatherV2 setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        public WeatherV2 setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        @Required
        public WeatherV2 setLocation(Title title) {
            this.location = title;
            return this;
        }

        @Required
        public WeatherV2 setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        @Required
        public WeatherV2 setWeather(List<FullScreenTemplate.WeatherFragmentData> list) {
            this.weather = list;
            return this;
        }

        public WeatherV2(Title title, List<FullScreenTemplate.WeatherFragmentData> list, Image image) {
            this.location = title;
            this.weather = list;
            this.skill_icon = image;
        }
    }

    public static class AlarmDisplay {

        @Required
        private String date;

        @Required
        private String time;
        private Optional<String> weekday = Optional.a();
        private Optional<String> circle = Optional.a();
        private Optional<TimeOfDayType> time_of_day = Optional.a();
        private Optional<String> lunar_date_time = Optional.a();
        private Optional<String> event_location = Optional.a();

        public AlarmDisplay() {
        }

        public Optional<String> getCircle() {
            return this.circle;
        }

        @Required
        public String getDate() {
            return this.date;
        }

        public Optional<String> getEventLocation() {
            return this.event_location;
        }

        public Optional<String> getLunarDateTime() {
            return this.lunar_date_time;
        }

        @Required
        public String getTime() {
            return this.time;
        }

        public Optional<TimeOfDayType> getTimeOfDay() {
            return this.time_of_day;
        }

        public Optional<String> getWeekday() {
            return this.weekday;
        }

        public AlarmDisplay setCircle(String str) {
            this.circle = Optional.e(str);
            return this;
        }

        @Required
        public AlarmDisplay setDate(String str) {
            this.date = str;
            return this;
        }

        public AlarmDisplay setEventLocation(String str) {
            this.event_location = Optional.e(str);
            return this;
        }

        public AlarmDisplay setLunarDateTime(String str) {
            this.lunar_date_time = Optional.e(str);
            return this;
        }

        @Required
        public AlarmDisplay setTime(String str) {
            this.time = str;
            return this;
        }

        public AlarmDisplay setTimeOfDay(TimeOfDayType timeOfDayType) {
            this.time_of_day = Optional.e(timeOfDayType);
            return this;
        }

        public AlarmDisplay setWeekday(String str) {
            this.weekday = Optional.e(str);
            return this;
        }

        public AlarmDisplay(String str, String str2) {
            this.time = str;
            this.date = str2;
        }
    }

    @NamespaceName(name = AIApiConstants.Application.NAME, namespace = AIApiConstants.Template.NAME)
    public static class Application implements InstructionPayload {

        @Required
        private List<AppEntity> apps;

        @Required
        private Image skill_icon;
        private Optional<CustomBackground> background = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();
        private Optional<List<AppEntity>> recommend_apps = Optional.a();
        private Optional<Boolean> with_interaction = Optional.a();
        private Optional<String> search_keyword = Optional.a();

        public Application() {
        }

        @Required
        public List<AppEntity> getApps() {
            return this.apps;
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        public Optional<List<AppEntity>> getRecommendApps() {
            return this.recommend_apps;
        }

        public Optional<String> getSearchKeyword() {
            return this.search_keyword;
        }

        @Required
        public Image getSkillIcon() {
            return this.skill_icon;
        }

        public Optional<Boolean> isWithInteraction() {
            return this.with_interaction;
        }

        @Required
        public Application setApps(List<AppEntity> list) {
            this.apps = list;
            return this;
        }

        public Application setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public Application setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        public Application setRecommendApps(List<AppEntity> list) {
            this.recommend_apps = Optional.e(list);
            return this;
        }

        public Application setSearchKeyword(String str) {
            this.search_keyword = Optional.e(str);
            return this;
        }

        @Required
        public Application setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        public Application setWithInteraction(boolean z) {
            this.with_interaction = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public Application(Image image, List<AppEntity> list) {
            this.skill_icon = image;
            this.apps = list;
        }
    }

    @NamespaceName(name = "DeviceList", namespace = AIApiConstants.Template.NAME)
    public static class DeviceList implements InstructionPayload {

        @Required
        private List<DeviceItem> items;

        @Required
        private boolean show_index;
        private Optional<Image> skill_icon = Optional.a();
        private Optional<CustomBackground> background = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();
        private Optional<Boolean> support_multi_device = Optional.a();
        private Optional<String> tts = Optional.a();

        public DeviceList() {
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        @Required
        public List<DeviceItem> getItems() {
            return this.items;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        public Optional<String> getTts() {
            return this.tts;
        }

        @Required
        public boolean isShowIndex() {
            return this.show_index;
        }

        public Optional<Boolean> isSupportMultiDevice() {
            return this.support_multi_device;
        }

        public DeviceList setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public DeviceList setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        @Required
        public DeviceList setItems(List<DeviceItem> list) {
            this.items = list;
            return this;
        }

        @Required
        public DeviceList setShowIndex(boolean z) {
            this.show_index = z;
            return this;
        }

        public DeviceList setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public DeviceList setSupportMultiDevice(boolean z) {
            this.support_multi_device = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public DeviceList setTts(String str) {
            this.tts = Optional.e(str);
            return this;
        }

        public DeviceList(List<DeviceItem> list, boolean z) {
            this.items = list;
            this.show_index = z;
        }
    }

    @NamespaceName(name = "HomeList", namespace = AIApiConstants.Template.NAME)
    public static class HomeList implements InstructionPayload {

        @Required
        private List<HomeItem> items;

        @Required
        private boolean show_index;
        private Optional<Image> skill_icon = Optional.a();
        private Optional<CustomBackground> background = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();
        private Optional<Launcher> launcher = Optional.a();
        private Optional<String> tts = Optional.a();

        public HomeList() {
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        @Required
        public List<HomeItem> getItems() {
            return this.items;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        public Optional<String> getTts() {
            return this.tts;
        }

        @Required
        public boolean isShowIndex() {
            return this.show_index;
        }

        public HomeList setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public HomeList setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        @Required
        public HomeList setItems(List<HomeItem> list) {
            this.items = list;
            return this;
        }

        public HomeList setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        @Required
        public HomeList setShowIndex(boolean z) {
            this.show_index = z;
            return this;
        }

        public HomeList setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public HomeList setTts(String str) {
            this.tts = Optional.e(str);
            return this;
        }

        public HomeList(List<HomeItem> list, boolean z) {
            this.items = list;
            this.show_index = z;
        }
    }

    @NamespaceName(name = "HomeRoomSelectList", namespace = AIApiConstants.Template.NAME)
    public static class HomeRoomSelectList implements InstructionPayload {

        @Required
        private List<HomeDetail> home_detail_items;
        private Optional<Image> skill_icon = Optional.a();
        private Optional<CustomBackground> background = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();
        private Optional<Launcher> launcher = Optional.a();
        private Optional<HomeRoomSelectType> home_room_select_type = Optional.a();

        public HomeRoomSelectList() {
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        @Required
        public List<HomeDetail> getHomeDetailItems() {
            return this.home_detail_items;
        }

        public Optional<HomeRoomSelectType> getHomeRoomSelectType() {
            return this.home_room_select_type;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        public HomeRoomSelectList setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public HomeRoomSelectList setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        @Required
        public HomeRoomSelectList setHomeDetailItems(List<HomeDetail> list) {
            this.home_detail_items = list;
            return this;
        }

        public HomeRoomSelectList setHomeRoomSelectType(HomeRoomSelectType homeRoomSelectType) {
            this.home_room_select_type = Optional.e(homeRoomSelectType);
            return this;
        }

        public HomeRoomSelectList setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public HomeRoomSelectList setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public HomeRoomSelectList(List<HomeDetail> list) {
            this.home_detail_items = list;
        }
    }

    public static class SportMatchMoment {

        @Required
        private String event;

        @Required
        private String start_time;

        @Required
        private SportMatchStatus status;

        @Required
        private String sub_event;
        private Optional<String> sub_event_stage = Optional.a();
        private Optional<String> participants = Optional.a();
        private Optional<String> group = Optional.a();
        private Optional<Launcher> launcher = Optional.a();
        private Optional<List<SportMatchTeam>> teams = Optional.a();

        public SportMatchMoment() {
        }

        @Required
        public String getEvent() {
            return this.event;
        }

        public Optional<String> getGroup() {
            return this.group;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<String> getParticipants() {
            return this.participants;
        }

        @Required
        public String getStartTime() {
            return this.start_time;
        }

        @Required
        public SportMatchStatus getStatus() {
            return this.status;
        }

        @Required
        public String getSubEvent() {
            return this.sub_event;
        }

        public Optional<String> getSubEventStage() {
            return this.sub_event_stage;
        }

        public Optional<List<SportMatchTeam>> getTeams() {
            return this.teams;
        }

        @Required
        public SportMatchMoment setEvent(String str) {
            this.event = str;
            return this;
        }

        public SportMatchMoment setGroup(String str) {
            this.group = Optional.e(str);
            return this;
        }

        public SportMatchMoment setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public SportMatchMoment setParticipants(String str) {
            this.participants = Optional.e(str);
            return this;
        }

        @Required
        public SportMatchMoment setStartTime(String str) {
            this.start_time = str;
            return this;
        }

        @Required
        public SportMatchMoment setStatus(SportMatchStatus sportMatchStatus) {
            this.status = sportMatchStatus;
            return this;
        }

        @Required
        public SportMatchMoment setSubEvent(String str) {
            this.sub_event = str;
            return this;
        }

        public SportMatchMoment setSubEventStage(String str) {
            this.sub_event_stage = Optional.e(str);
            return this;
        }

        public SportMatchMoment setTeams(List<SportMatchTeam> list) {
            this.teams = Optional.e(list);
            return this;
        }

        public SportMatchMoment(String str, SportMatchStatus sportMatchStatus, String str2, String str3) {
            this.start_time = str;
            this.status = sportMatchStatus;
            this.event = str2;
            this.sub_event = str3;
        }
    }

    @NamespaceName(name = "SuggestionGuide", namespace = AIApiConstants.Template.NAME)
    public static class SuggestionGuide implements InstructionPayload {

        @Required
        private String scene_name;
        private Optional<String> guide_text = Optional.a();
        private Optional<String> scene_description = Optional.a();
        private Optional<Image> scene_image = Optional.a();
        private Optional<Launcher> suggestion_launcher = Optional.a();
        private Optional<Launcher> scene_launcher = Optional.a();

        public SuggestionGuide() {
        }

        public Optional<String> getGuideText() {
            return this.guide_text;
        }

        public Optional<String> getSceneDescription() {
            return this.scene_description;
        }

        public Optional<Image> getSceneImage() {
            return this.scene_image;
        }

        public Optional<Launcher> getSceneLauncher() {
            return this.scene_launcher;
        }

        @Required
        public String getSceneName() {
            return this.scene_name;
        }

        public Optional<Launcher> getSuggestionLauncher() {
            return this.suggestion_launcher;
        }

        public SuggestionGuide setGuideText(String str) {
            this.guide_text = Optional.e(str);
            return this;
        }

        public SuggestionGuide setSceneDescription(String str) {
            this.scene_description = Optional.e(str);
            return this;
        }

        public SuggestionGuide setSceneImage(Image image) {
            this.scene_image = Optional.e(image);
            return this;
        }

        public SuggestionGuide setSceneLauncher(Launcher launcher) {
            this.scene_launcher = Optional.e(launcher);
            return this;
        }

        @Required
        public SuggestionGuide setSceneName(String str) {
            this.scene_name = str;
            return this;
        }

        public SuggestionGuide setSuggestionLauncher(Launcher launcher) {
            this.suggestion_launcher = Optional.e(launcher);
            return this;
        }

        public SuggestionGuide(String str) {
            this.scene_name = str;
        }
    }

    @NamespaceName(name = "SwitchPanelList", namespace = AIApiConstants.Template.NAME)
    public static class SwitchPanelList implements InstructionPayload {

        @Required
        private Image skill_icon;

        @Required
        @Deprecated
        private List<SwitchItem> titles;
        private Optional<Launcher> launcher = Optional.a();
        private Optional<SwitchPanelType> type = Optional.a();
        private Optional<List<SwitchItem>> items = Optional.a();
        private Optional<CustomBackground> background = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();

        public SwitchPanelList() {
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        public Optional<List<SwitchItem>> getItems() {
            return this.items;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        @Required
        public Image getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        @Deprecated
        public List<SwitchItem> getTitles() {
            return this.titles;
        }

        public Optional<SwitchPanelType> getType() {
            return this.type;
        }

        public SwitchPanelList setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public SwitchPanelList setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        public SwitchPanelList setItems(List<SwitchItem> list) {
            this.items = Optional.e(list);
            return this;
        }

        public SwitchPanelList setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        @Required
        public SwitchPanelList setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        @Required
        @Deprecated
        public SwitchPanelList setTitles(List<SwitchItem> list) {
            this.titles = list;
            return this;
        }

        public SwitchPanelList setType(SwitchPanelType switchPanelType) {
            this.type = Optional.e(switchPanelType);
            return this;
        }

        public SwitchPanelList(List<SwitchItem> list, Image image) {
            this.titles = list;
            this.skill_icon = image;
        }
    }

    @NamespaceName(name = com.xiaomi.ai.api.intent.AIApiConstants.Translation.NAME, namespace = AIApiConstants.Template.NAME)
    public static class Translation implements InstructionPayload {

        @Required
        private String dest_text;

        @Required
        private String src_text;
        private Optional<String> src_language = Optional.a();
        private Optional<String> dest_language = Optional.a();
        private Optional<TranslationType> type = Optional.a();
        private Optional<DictionaryTranslation> dictionary = Optional.a();
        private Optional<MachineTranslation> machine = Optional.a();

        public Translation() {
        }

        public Optional<String> getDestLanguage() {
            return this.dest_language;
        }

        @Required
        public String getDestText() {
            return this.dest_text;
        }

        public Optional<DictionaryTranslation> getDictionary() {
            return this.dictionary;
        }

        public Optional<MachineTranslation> getMachine() {
            return this.machine;
        }

        public Optional<String> getSrcLanguage() {
            return this.src_language;
        }

        @Required
        public String getSrcText() {
            return this.src_text;
        }

        public Optional<TranslationType> getType() {
            return this.type;
        }

        public Translation setDestLanguage(String str) {
            this.dest_language = Optional.e(str);
            return this;
        }

        @Required
        public Translation setDestText(String str) {
            this.dest_text = str;
            return this;
        }

        public Translation setDictionary(DictionaryTranslation dictionaryTranslation) {
            this.dictionary = Optional.e(dictionaryTranslation);
            return this;
        }

        public Translation setMachine(MachineTranslation machineTranslation) {
            this.machine = Optional.e(machineTranslation);
            return this;
        }

        public Translation setSrcLanguage(String str) {
            this.src_language = Optional.e(str);
            return this;
        }

        @Required
        public Translation setSrcText(String str) {
            this.src_text = str;
            return this;
        }

        public Translation setType(TranslationType translationType) {
            this.type = Optional.e(translationType);
            return this;
        }

        public Translation(String str, String str2) {
            this.src_text = str;
            this.dest_text = str2;
        }
    }

    @NamespaceName(name = "AdjustProgress", namespace = AIApiConstants.Template.NAME)
    public static class AdjustProgress implements InstructionPayload {

        @Required
        private Image skill_icon;

        @Required
        private Title title;
        private Optional<Image> left_icon = Optional.a();
        private Optional<Image> right_icon = Optional.a();
        private Optional<Launcher> launcher = Optional.a();
        private Optional<LocalTarget> target = Optional.a();
        private Optional<CustomBackground> background = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();

        public AdjustProgress() {
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<Image> getLeftIcon() {
            return this.left_icon;
        }

        public Optional<Image> getRightIcon() {
            return this.right_icon;
        }

        @Required
        public Image getSkillIcon() {
            return this.skill_icon;
        }

        public Optional<LocalTarget> getTarget() {
            return this.target;
        }

        @Required
        public Title getTitle() {
            return this.title;
        }

        public AdjustProgress setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public AdjustProgress setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        public AdjustProgress setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public AdjustProgress setLeftIcon(Image image) {
            this.left_icon = Optional.e(image);
            return this;
        }

        public AdjustProgress setRightIcon(Image image) {
            this.right_icon = Optional.e(image);
            return this;
        }

        @Required
        public AdjustProgress setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        public AdjustProgress setTarget(LocalTarget localTarget) {
            this.target = Optional.e(localTarget);
            return this;
        }

        @Required
        public AdjustProgress setTitle(Title title) {
            this.title = title;
            return this;
        }

        public AdjustProgress(Title title, Image image) {
            this.title = title;
            this.skill_icon = image;
        }
    }

    public static class AudioInfo {

        @Required
        private String album_id;

        @Required
        private String album_name;

        @Required
        private int artist_id;

        @Required
        private String artist_name;

        @Required
        private String audio_id;

        @Required
        private String audio_name;

        @Required
        private List<String> controls;

        @Required
        private Image cover;
        private Optional<String> lyric_url = Optional.a();
        private Optional<Launcher> launcher = Optional.a();
        private Optional<Boolean> is_vip = Optional.a();
        private Optional<Boolean> is_original = Optional.a();
        private Optional<EntityInfo> entity_info = Optional.a();
        private Optional<Boolean> payment = Optional.a();

        public AudioInfo() {
        }

        @Required
        public String getAlbumId() {
            return this.album_id;
        }

        @Required
        public String getAlbumName() {
            return this.album_name;
        }

        @Required
        public int getArtistId() {
            return this.artist_id;
        }

        @Required
        public String getArtistName() {
            return this.artist_name;
        }

        @Required
        public String getAudioId() {
            return this.audio_id;
        }

        @Required
        public String getAudioName() {
            return this.audio_name;
        }

        @Required
        public List<String> getControls() {
            return this.controls;
        }

        @Required
        public Image getCover() {
            return this.cover;
        }

        public Optional<EntityInfo> getEntityInfo() {
            return this.entity_info;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<String> getLyricUrl() {
            return this.lyric_url;
        }

        public Optional<Boolean> isOriginal() {
            return this.is_original;
        }

        public Optional<Boolean> isPayment() {
            return this.payment;
        }

        public Optional<Boolean> isVip() {
            return this.is_vip;
        }

        @Required
        public AudioInfo setAlbumId(String str) {
            this.album_id = str;
            return this;
        }

        @Required
        public AudioInfo setAlbumName(String str) {
            this.album_name = str;
            return this;
        }

        @Required
        public AudioInfo setArtistId(int i) {
            this.artist_id = i;
            return this;
        }

        @Required
        public AudioInfo setArtistName(String str) {
            this.artist_name = str;
            return this;
        }

        @Required
        public AudioInfo setAudioId(String str) {
            this.audio_id = str;
            return this;
        }

        @Required
        public AudioInfo setAudioName(String str) {
            this.audio_name = str;
            return this;
        }

        @Required
        public AudioInfo setControls(List<String> list) {
            this.controls = list;
            return this;
        }

        @Required
        public AudioInfo setCover(Image image) {
            this.cover = image;
            return this;
        }

        public AudioInfo setEntityInfo(EntityInfo entityInfo) {
            this.entity_info = Optional.e(entityInfo);
            return this;
        }

        public AudioInfo setIsOriginal(boolean z) {
            this.is_original = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AudioInfo setIsVip(boolean z) {
            this.is_vip = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AudioInfo setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public AudioInfo setLyricUrl(String str) {
            this.lyric_url = Optional.e(str);
            return this;
        }

        public AudioInfo setPayment(boolean z) {
            this.payment = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AudioInfo(String str, String str2, String str3, int i, String str4, String str5, Image image, List<String> list) {
            this.audio_id = str;
            this.audio_name = str2;
            this.artist_name = str3;
            this.artist_id = i;
            this.album_name = str4;
            this.album_id = str5;
            this.cover = image;
            this.controls = list;
        }
    }

    @NamespaceName(name = AIApiConstants.General.NAME, namespace = AIApiConstants.Template.NAME)
    public static class General implements InstructionPayload {

        @Required
        private List<Image> images;

        @Required
        private Image skill_icon;

        @Required
        private String text;

        @Required
        private Title title;
        private Optional<Launcher> launcher = Optional.a();
        private Optional<List<AbstractItem>> abstracts = Optional.a();
        private Optional<GeneralDisplayType> type = Optional.a();
        private Optional<CustomBackground> background = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();
        private Optional<GeneralUIType> ui_type = Optional.a();

        public General() {
        }

        public Optional<List<AbstractItem>> getAbstracts() {
            return this.abstracts;
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        @Required
        public List<Image> getImages() {
            return this.images;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        @Required
        public Image getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public Title getTitle() {
            return this.title;
        }

        public Optional<GeneralDisplayType> getType() {
            return this.type;
        }

        public Optional<GeneralUIType> getUiType() {
            return this.ui_type;
        }

        public General setAbstracts(List<AbstractItem> list) {
            this.abstracts = Optional.e(list);
            return this;
        }

        public General setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public General setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        @Required
        public General setImages(List<Image> list) {
            this.images = list;
            return this;
        }

        public General setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        @Required
        public General setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        @Required
        public General setText(String str) {
            this.text = str;
            return this;
        }

        @Required
        public General setTitle(Title title) {
            this.title = title;
            return this;
        }

        public General setType(GeneralDisplayType generalDisplayType) {
            this.type = Optional.e(generalDisplayType);
            return this;
        }

        public General setUiType(GeneralUIType generalUIType) {
            this.ui_type = Optional.e(generalUIType);
            return this;
        }

        public General(Title title, String str, Image image, List<Image> list) {
            this.title = title;
            this.text = str;
            this.skill_icon = image;
            this.images = list;
        }
    }

    @NamespaceName(name = "Lists", namespace = AIApiConstants.Template.NAME)
    public static class Lists implements InstructionPayload {

        @Required
        private List<ListsItem> items;

        @Required
        private Image skill_icon;
        private Optional<Title> title = Optional.a();
        private Optional<ListsMoreItem> more = Optional.a();
        private Optional<ListsItemDisplayType> item_display_type = Optional.a();
        private Optional<CustomBackground> background = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();
        private Optional<ListsType> type = Optional.a();

        public Lists() {
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        public Optional<ListsItemDisplayType> getItemDisplayType() {
            return this.item_display_type;
        }

        @Required
        public List<ListsItem> getItems() {
            return this.items;
        }

        public Optional<ListsMoreItem> getMore() {
            return this.more;
        }

        @Required
        public Image getSkillIcon() {
            return this.skill_icon;
        }

        public Optional<Title> getTitle() {
            return this.title;
        }

        public Optional<ListsType> getType() {
            return this.type;
        }

        public Lists setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public Lists setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        public Lists setItemDisplayType(ListsItemDisplayType listsItemDisplayType) {
            this.item_display_type = Optional.e(listsItemDisplayType);
            return this;
        }

        @Required
        public Lists setItems(List<ListsItem> list) {
            this.items = list;
            return this;
        }

        public Lists setMore(ListsMoreItem listsMoreItem) {
            this.more = Optional.e(listsMoreItem);
            return this;
        }

        @Required
        public Lists setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        public Lists setTitle(Title title) {
            this.title = Optional.e(title);
            return this;
        }

        public Lists setType(ListsType listsType) {
            this.type = Optional.e(listsType);
            return this;
        }

        public Lists(Image image, List<ListsItem> list) {
            this.skill_icon = image;
            this.items = list;
        }
    }

    public static class AndroidIntent {

        @Required
        private String pkg_name;

        @Required
        private String type;

        @Required
        private String uri;
        private Optional<String> permission = Optional.a();
        private Optional<OnError> on_error = Optional.a();
        private Optional<Integer> min_version = Optional.a();
        private Optional<c4h> params = Optional.a();
        private Optional<CustomBackground> background = Optional.a();
        private Optional<Task> task = Optional.a();
        private Optional<IntentTargetDisplay> target_display = Optional.a();

        public AndroidIntent() {
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<Integer> getMinVersion() {
            return this.min_version;
        }

        public Optional<OnError> getOnError() {
            return this.on_error;
        }

        public Optional<c4h> getParams() {
            return this.params;
        }

        public Optional<String> getPermission() {
            return this.permission;
        }

        @Required
        public String getPkgName() {
            return this.pkg_name;
        }

        public Optional<IntentTargetDisplay> getTargetDisplay() {
            return this.target_display;
        }

        public Optional<Task> getTask() {
            return this.task;
        }

        @Required
        public String getType() {
            return this.type;
        }

        @Required
        public String getUri() {
            return this.uri;
        }

        public AndroidIntent setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public AndroidIntent setMinVersion(int i) {
            this.min_version = Optional.e(Integer.valueOf(i));
            return this;
        }

        public AndroidIntent setOnError(OnError onError) {
            this.on_error = Optional.e(onError);
            return this;
        }

        public AndroidIntent setParams(c4h c4hVar) {
            this.params = Optional.e(c4hVar);
            return this;
        }

        public AndroidIntent setPermission(String str) {
            this.permission = Optional.e(str);
            return this;
        }

        @Required
        public AndroidIntent setPkgName(String str) {
            this.pkg_name = str;
            return this;
        }

        public AndroidIntent setTargetDisplay(IntentTargetDisplay intentTargetDisplay) {
            this.target_display = Optional.e(intentTargetDisplay);
            return this;
        }

        public AndroidIntent setTask(Task task) {
            this.task = Optional.e(task);
            return this;
        }

        @Required
        public AndroidIntent setType(String str) {
            this.type = str;
            return this;
        }

        @Required
        public AndroidIntent setUri(String str) {
            this.uri = str;
            return this;
        }

        public AndroidIntent(String str, String str2, String str3) {
            this.type = str;
            this.pkg_name = str2;
            this.uri = str3;
        }
    }

    public static class AppAds {

        @Required
        private List<String> click_monitor_urls;

        @Required
        private String ext_apk_channel;

        @Required
        private List<String> finish_download_monitor_urls;

        @Required
        private List<String> finish_install_monitor_urls;

        @Required
        private List<String> launch_monitor_urls;

        @Required
        private List<String> start_download_monitor_urls;

        @Required
        private List<String> start_install_monitor_urls;

        @Required
        private List<String> view_monitor_urls;

        @Required
        private boolean with_ads;
        private Optional<String> ex = Optional.a();
        private Optional<String> app_ref = Optional.a();
        private Optional<String> landing_page_url = Optional.a();
        private Optional<String> float_card_url = Optional.a();
        private Optional<String> ai_ex = Optional.a();
        private Optional<String> deep_link = Optional.a();
        private Optional<String> tracking_strategy = Optional.a();

        public AppAds() {
        }

        public Optional<String> getAiEx() {
            return this.ai_ex;
        }

        public Optional<String> getAppRef() {
            return this.app_ref;
        }

        @Required
        public List<String> getClickMonitorUrls() {
            return this.click_monitor_urls;
        }

        public Optional<String> getDeepLink() {
            return this.deep_link;
        }

        public Optional<String> getEx() {
            return this.ex;
        }

        @Required
        public String getExtApkChannel() {
            return this.ext_apk_channel;
        }

        @Required
        public List<String> getFinishDownloadMonitorUrls() {
            return this.finish_download_monitor_urls;
        }

        @Required
        public List<String> getFinishInstallMonitorUrls() {
            return this.finish_install_monitor_urls;
        }

        public Optional<String> getFloatCardUrl() {
            return this.float_card_url;
        }

        public Optional<String> getLandingPageUrl() {
            return this.landing_page_url;
        }

        @Required
        public List<String> getLaunchMonitorUrls() {
            return this.launch_monitor_urls;
        }

        @Required
        public List<String> getStartDownloadMonitorUrls() {
            return this.start_download_monitor_urls;
        }

        @Required
        public List<String> getStartInstallMonitorUrls() {
            return this.start_install_monitor_urls;
        }

        public Optional<String> getTrackingStrategy() {
            return this.tracking_strategy;
        }

        @Required
        public List<String> getViewMonitorUrls() {
            return this.view_monitor_urls;
        }

        @Required
        public boolean isWithAds() {
            return this.with_ads;
        }

        public AppAds setAiEx(String str) {
            this.ai_ex = Optional.e(str);
            return this;
        }

        public AppAds setAppRef(String str) {
            this.app_ref = Optional.e(str);
            return this;
        }

        @Required
        public AppAds setClickMonitorUrls(List<String> list) {
            this.click_monitor_urls = list;
            return this;
        }

        public AppAds setDeepLink(String str) {
            this.deep_link = Optional.e(str);
            return this;
        }

        public AppAds setEx(String str) {
            this.ex = Optional.e(str);
            return this;
        }

        @Required
        public AppAds setExtApkChannel(String str) {
            this.ext_apk_channel = str;
            return this;
        }

        @Required
        public AppAds setFinishDownloadMonitorUrls(List<String> list) {
            this.finish_download_monitor_urls = list;
            return this;
        }

        @Required
        public AppAds setFinishInstallMonitorUrls(List<String> list) {
            this.finish_install_monitor_urls = list;
            return this;
        }

        public AppAds setFloatCardUrl(String str) {
            this.float_card_url = Optional.e(str);
            return this;
        }

        public AppAds setLandingPageUrl(String str) {
            this.landing_page_url = Optional.e(str);
            return this;
        }

        @Required
        public AppAds setLaunchMonitorUrls(List<String> list) {
            this.launch_monitor_urls = list;
            return this;
        }

        @Required
        public AppAds setStartDownloadMonitorUrls(List<String> list) {
            this.start_download_monitor_urls = list;
            return this;
        }

        @Required
        public AppAds setStartInstallMonitorUrls(List<String> list) {
            this.start_install_monitor_urls = list;
            return this;
        }

        public AppAds setTrackingStrategy(String str) {
            this.tracking_strategy = Optional.e(str);
            return this;
        }

        @Required
        public AppAds setViewMonitorUrls(List<String> list) {
            this.view_monitor_urls = list;
            return this;
        }

        @Required
        public AppAds setWithAds(boolean z) {
            this.with_ads = z;
            return this;
        }

        public AppAds(boolean z, String str, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, List<String> list7) {
            this.with_ads = z;
            this.ext_apk_channel = str;
            this.view_monitor_urls = list;
            this.click_monitor_urls = list2;
            this.launch_monitor_urls = list3;
            this.start_download_monitor_urls = list4;
            this.finish_download_monitor_urls = list5;
            this.start_install_monitor_urls = list6;
            this.finish_install_monitor_urls = list7;
        }
    }

    @NamespaceName(name = "LLMImageGeneration", namespace = AIApiConstants.Template.NAME)
    public static class LLMImageGeneration implements InstructionPayload {

        @Required
        private String cp_name;

        @Required
        private List<LLMImageScenesMessage> scenes_message;

        @Required
        private List<String> task_ids;
        private Optional<Image> cp_image = Optional.a();
        private Optional<Integer> status_code = Optional.a();
        private Optional<String> model = Optional.a();
        private Optional<String> name = Optional.a();
        private Optional<LLMImageBusinessType> image_business_type = Optional.a();
        private Optional<LLMImageSubBusinessType> image_sub_business_type = Optional.a();
        private Optional<List<LLMImageCarModelPosition>> car_model_position = Optional.a();

        public LLMImageGeneration() {
        }

        public Optional<List<LLMImageCarModelPosition>> getCarModelPosition() {
            return this.car_model_position;
        }

        public Optional<Image> getCpImage() {
            return this.cp_image;
        }

        @Required
        public String getCpName() {
            return this.cp_name;
        }

        public Optional<LLMImageBusinessType> getImageBusinessType() {
            return this.image_business_type;
        }

        public Optional<LLMImageSubBusinessType> getImageSubBusinessType() {
            return this.image_sub_business_type;
        }

        public Optional<String> getModel() {
            return this.model;
        }

        public Optional<String> getName() {
            return this.name;
        }

        @Required
        public List<LLMImageScenesMessage> getScenesMessage() {
            return this.scenes_message;
        }

        public Optional<Integer> getStatusCode() {
            return this.status_code;
        }

        @Required
        public List<String> getTaskIds() {
            return this.task_ids;
        }

        public LLMImageGeneration setCarModelPosition(List<LLMImageCarModelPosition> list) {
            this.car_model_position = Optional.e(list);
            return this;
        }

        public LLMImageGeneration setCpImage(Image image) {
            this.cp_image = Optional.e(image);
            return this;
        }

        @Required
        public LLMImageGeneration setCpName(String str) {
            this.cp_name = str;
            return this;
        }

        public LLMImageGeneration setImageBusinessType(LLMImageBusinessType lLMImageBusinessType) {
            this.image_business_type = Optional.e(lLMImageBusinessType);
            return this;
        }

        public LLMImageGeneration setImageSubBusinessType(LLMImageSubBusinessType lLMImageSubBusinessType) {
            this.image_sub_business_type = Optional.e(lLMImageSubBusinessType);
            return this;
        }

        public LLMImageGeneration setModel(String str) {
            this.model = Optional.e(str);
            return this;
        }

        public LLMImageGeneration setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        @Required
        public LLMImageGeneration setScenesMessage(List<LLMImageScenesMessage> list) {
            this.scenes_message = list;
            return this;
        }

        public LLMImageGeneration setStatusCode(int i) {
            this.status_code = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Required
        public LLMImageGeneration setTaskIds(List<String> list) {
            this.task_ids = list;
            return this;
        }

        public LLMImageGeneration(List<String> list, String str, List<LLMImageScenesMessage> list2) {
            this.task_ids = list;
            this.cp_name = str;
            this.scenes_message = list2;
        }
    }

    @NamespaceName(name = "Music", namespace = AIApiConstants.Template.NAME)
    public static class Music implements InstructionPayload {

        @Required
        private List<MusicEntity> group;
        private Optional<Launcher> launcher = Optional.a();
        private Optional<String> loop_mode = Optional.a();
        private Optional<Title> title = Optional.a();
        private Optional<CustomBackground> background = Optional.a();
        private Optional<QueryType> query_type = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();
        private Optional<Common.MultiExecutionSequences> secondaries = Optional.a();

        public Music() {
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        @Required
        public List<MusicEntity> getGroup() {
            return this.group;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<String> getLoopMode() {
            return this.loop_mode;
        }

        public Optional<QueryType> getQueryType() {
            return this.query_type;
        }

        public Optional<Common.MultiExecutionSequences> getSecondaries() {
            return this.secondaries;
        }

        public Optional<Title> getTitle() {
            return this.title;
        }

        public Music setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public Music setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        @Required
        public Music setGroup(List<MusicEntity> list) {
            this.group = list;
            return this;
        }

        public Music setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public Music setLoopMode(String str) {
            this.loop_mode = Optional.e(str);
            return this;
        }

        public Music setQueryType(QueryType queryType) {
            this.query_type = Optional.e(queryType);
            return this;
        }

        public Music setSecondaries(Common.MultiExecutionSequences multiExecutionSequences) {
            this.secondaries = Optional.e(multiExecutionSequences);
            return this;
        }

        public Music setTitle(Title title) {
            this.title = Optional.e(title);
            return this;
        }

        public Music(List<MusicEntity> list) {
            this.group = list;
        }
    }

    @NamespaceName(name = "SwitchPanel", namespace = AIApiConstants.Template.NAME)
    public static class SwitchPanel implements InstructionPayload {

        @Required
        private Image skill_icon;

        @Required
        private Title title;
        private Optional<Launcher> launcher = Optional.a();
        private Optional<String> status = Optional.a();
        private Optional<SwitchPanelType> type = Optional.a();
        private Optional<LocalTarget> target = Optional.a();
        private Optional<CustomBackground> background = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();
        private Optional<String> number_title = Optional.a();

        public SwitchPanel() {
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<String> getNumberTitle() {
            return this.number_title;
        }

        @Required
        public Image getSkillIcon() {
            return this.skill_icon;
        }

        public Optional<String> getStatus() {
            return this.status;
        }

        public Optional<LocalTarget> getTarget() {
            return this.target;
        }

        @Required
        public Title getTitle() {
            return this.title;
        }

        public Optional<SwitchPanelType> getType() {
            return this.type;
        }

        public SwitchPanel setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public SwitchPanel setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        public SwitchPanel setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public SwitchPanel setNumberTitle(String str) {
            this.number_title = Optional.e(str);
            return this;
        }

        @Required
        public SwitchPanel setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        public SwitchPanel setStatus(String str) {
            this.status = Optional.e(str);
            return this;
        }

        public SwitchPanel setTarget(LocalTarget localTarget) {
            this.target = Optional.e(localTarget);
            return this;
        }

        @Required
        public SwitchPanel setTitle(Title title) {
            this.title = title;
            return this;
        }

        public SwitchPanel setType(SwitchPanelType switchPanelType) {
            this.type = Optional.e(switchPanelType);
            return this;
        }

        public SwitchPanel(Title title, Image image) {
            this.title = title;
            this.skill_icon = image;
        }
    }

    public static class DeviceItem {

        @Required
        private Title title;
        private Optional<DeviceInfoV1> info = Optional.a();
        private Optional<List<Image>> images = Optional.a();
        private Optional<Launcher> launcher = Optional.a();
        private Optional<Button> more_detail = Optional.a();
        private Optional<DeviceOperateResult> device_operate_result = Optional.a();
        private Optional<DeviceOnlineStatus> device_online_status = Optional.a();
        private Optional<MiotRichStatus> miot_rich_status = Optional.a();
        private Optional<ExecType> exec_type = Optional.a();

        public DeviceItem() {
        }

        public Optional<DeviceOnlineStatus> getDeviceOnlineStatus() {
            return this.device_online_status;
        }

        public Optional<DeviceOperateResult> getDeviceOperateResult() {
            return this.device_operate_result;
        }

        public Optional<ExecType> getExecType() {
            return this.exec_type;
        }

        public Optional<List<Image>> getImages() {
            return this.images;
        }

        public Optional<DeviceInfoV1> getInfo() {
            return this.info;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<MiotRichStatus> getMiotRichStatus() {
            return this.miot_rich_status;
        }

        public Optional<Button> getMoreDetail() {
            return this.more_detail;
        }

        @Required
        public Title getTitle() {
            return this.title;
        }

        public DeviceItem setDeviceOnlineStatus(DeviceOnlineStatus deviceOnlineStatus) {
            this.device_online_status = Optional.e(deviceOnlineStatus);
            return this;
        }

        public DeviceItem setDeviceOperateResult(DeviceOperateResult deviceOperateResult) {
            this.device_operate_result = Optional.e(deviceOperateResult);
            return this;
        }

        public DeviceItem setExecType(ExecType execType) {
            this.exec_type = Optional.e(execType);
            return this;
        }

        public DeviceItem setImages(List<Image> list) {
            this.images = Optional.e(list);
            return this;
        }

        public DeviceItem setInfo(DeviceInfoV1 deviceInfoV1) {
            this.info = Optional.e(deviceInfoV1);
            return this;
        }

        public DeviceItem setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public DeviceItem setMiotRichStatus(MiotRichStatus miotRichStatus) {
            this.miot_rich_status = Optional.e(miotRichStatus);
            return this;
        }

        public DeviceItem setMoreDetail(Button button) {
            this.more_detail = Optional.e(button);
            return this;
        }

        @Required
        public DeviceItem setTitle(Title title) {
            this.title = title;
            return this;
        }

        public DeviceItem(Title title) {
            this.title = title;
        }
    }

    @NamespaceName(name = "FrontendPage", namespace = AIApiConstants.Template.NAME)
    public static class FrontendPage implements InstructionPayload {

        @Required
        private ErrorDetail error_prompt;

        @Required
        private FrontendPageLoadType load_type;

        @Required
        private c4h param;

        @Required
        private String param_type;

        @Required
        private Image skill_icon;

        @Required
        private int timeout_in_milli;
        private Optional<String> load_url = Optional.a();
        private Optional<String> load_html = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();
        private Optional<Common.MultiExecutionSequences> secondaries = Optional.a();
        private Optional<FrontendPageExtraData> extra_data = Optional.a();
        private Optional<Boolean> reback = Optional.a();
        private Optional<Boolean> auto_play_audio = Optional.a();
        private Optional<Boolean> is_second_page = Optional.a();

        public FrontendPage() {
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        @Required
        public ErrorDetail getErrorPrompt() {
            return this.error_prompt;
        }

        public Optional<FrontendPageExtraData> getExtraData() {
            return this.extra_data;
        }

        public Optional<String> getLoadHtml() {
            return this.load_html;
        }

        @Required
        public FrontendPageLoadType getLoadType() {
            return this.load_type;
        }

        public Optional<String> getLoadUrl() {
            return this.load_url;
        }

        @Required
        public c4h getParam() {
            return this.param;
        }

        @Required
        public String getParamType() {
            return this.param_type;
        }

        public Optional<Common.MultiExecutionSequences> getSecondaries() {
            return this.secondaries;
        }

        @Required
        public Image getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public int getTimeoutInMilli() {
            return this.timeout_in_milli;
        }

        public Optional<Boolean> isAutoPlayAudio() {
            return this.auto_play_audio;
        }

        public Optional<Boolean> isReback() {
            return this.reback;
        }

        public Optional<Boolean> isSecondPage() {
            return this.is_second_page;
        }

        public FrontendPage setAutoPlayAudio(boolean z) {
            this.auto_play_audio = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public FrontendPage setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        @Required
        public FrontendPage setErrorPrompt(ErrorDetail errorDetail) {
            this.error_prompt = errorDetail;
            return this;
        }

        public FrontendPage setExtraData(FrontendPageExtraData frontendPageExtraData) {
            this.extra_data = Optional.e(frontendPageExtraData);
            return this;
        }

        public FrontendPage setIsSecondPage(boolean z) {
            this.is_second_page = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public FrontendPage setLoadHtml(String str) {
            this.load_html = Optional.e(str);
            return this;
        }

        @Required
        public FrontendPage setLoadType(FrontendPageLoadType frontendPageLoadType) {
            this.load_type = frontendPageLoadType;
            return this;
        }

        public FrontendPage setLoadUrl(String str) {
            this.load_url = Optional.e(str);
            return this;
        }

        @Required
        public FrontendPage setParam(c4h c4hVar) {
            this.param = c4hVar;
            return this;
        }

        @Required
        public FrontendPage setParamType(String str) {
            this.param_type = str;
            return this;
        }

        public FrontendPage setReback(boolean z) {
            this.reback = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public FrontendPage setSecondaries(Common.MultiExecutionSequences multiExecutionSequences) {
            this.secondaries = Optional.e(multiExecutionSequences);
            return this;
        }

        @Required
        public FrontendPage setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        @Required
        public FrontendPage setTimeoutInMilli(int i) {
            this.timeout_in_milli = i;
            return this;
        }

        public FrontendPage(FrontendPageLoadType frontendPageLoadType, int i, ErrorDetail errorDetail, Image image, c4h c4hVar, String str) {
            this.load_type = frontendPageLoadType;
            this.timeout_in_milli = i;
            this.error_prompt = errorDetail;
            this.skill_icon = image;
            this.param = c4hVar;
            this.param_type = str;
        }
    }

    public static class ImageSource {

        @Required
        private String url;
        private Optional<Integer> id = Optional.a();
        private Optional<String> bg_url = Optional.a();
        private Optional<String> size = Optional.a();
        private Optional<Integer> width = Optional.a();
        private Optional<Integer> height = Optional.a();
        private Optional<Boolean> authentication = Optional.a();
        private Optional<String> token = Optional.a();
        private Optional<String> md5 = Optional.a();

        public ImageSource() {
        }

        public Optional<String> getBgUrl() {
            return this.bg_url;
        }

        public Optional<Integer> getHeight() {
            return this.height;
        }

        public Optional<Integer> getId() {
            return this.id;
        }

        public Optional<String> getMd5() {
            return this.md5;
        }

        public Optional<String> getSize() {
            return this.size;
        }

        public Optional<String> getToken() {
            return this.token;
        }

        @Required
        public String getUrl() {
            return this.url;
        }

        public Optional<Integer> getWidth() {
            return this.width;
        }

        public Optional<Boolean> isAuthentication() {
            return this.authentication;
        }

        public ImageSource setAuthentication(boolean z) {
            this.authentication = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ImageSource setBgUrl(String str) {
            this.bg_url = Optional.e(str);
            return this;
        }

        public ImageSource setHeight(int i) {
            this.height = Optional.e(Integer.valueOf(i));
            return this;
        }

        public ImageSource setId(int i) {
            this.id = Optional.e(Integer.valueOf(i));
            return this;
        }

        public ImageSource setMd5(String str) {
            this.md5 = Optional.e(str);
            return this;
        }

        public ImageSource setSize(String str) {
            this.size = Optional.e(str);
            return this;
        }

        public ImageSource setToken(String str) {
            this.token = Optional.e(str);
            return this;
        }

        @Required
        public ImageSource setUrl(String str) {
            this.url = str;
            return this;
        }

        public ImageSource setWidth(int i) {
            this.width = Optional.e(Integer.valueOf(i));
            return this;
        }

        public ImageSource(String str) {
            this.url = str;
        }
    }

    @NamespaceName(name = "QuestionAnswer", namespace = AIApiConstants.Template.NAME)
    public static class QuestionAnswer implements InstructionPayload {

        @Required
        private QuestionAnswerMediaType media_type;

        @Required
        private String text;

        @Required
        private Title title;
        private Optional<Image> image = Optional.a();
        private Optional<QuestionAnswerVideoInfo> video_info = Optional.a();
        private Optional<String> tips = Optional.a();
        private Optional<Image> skill_icon = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();
        private Optional<Launcher> launcher = Optional.a();
        private Optional<Button> button = Optional.a();
        private Optional<String> device_name = Optional.a();

        public QuestionAnswer() {
        }

        public Optional<Button> getButton() {
            return this.button;
        }

        public Optional<String> getDeviceName() {
            return this.device_name;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        public Optional<Image> getImage() {
            return this.image;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        @Required
        public QuestionAnswerMediaType getMediaType() {
            return this.media_type;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public String getText() {
            return this.text;
        }

        public Optional<String> getTips() {
            return this.tips;
        }

        @Required
        public Title getTitle() {
            return this.title;
        }

        public Optional<QuestionAnswerVideoInfo> getVideoInfo() {
            return this.video_info;
        }

        public QuestionAnswer setButton(Button button) {
            this.button = Optional.e(button);
            return this;
        }

        public QuestionAnswer setDeviceName(String str) {
            this.device_name = Optional.e(str);
            return this;
        }

        public QuestionAnswer setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        public QuestionAnswer setImage(Image image) {
            this.image = Optional.e(image);
            return this;
        }

        public QuestionAnswer setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        @Required
        public QuestionAnswer setMediaType(QuestionAnswerMediaType questionAnswerMediaType) {
            this.media_type = questionAnswerMediaType;
            return this;
        }

        public QuestionAnswer setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        @Required
        public QuestionAnswer setText(String str) {
            this.text = str;
            return this;
        }

        public QuestionAnswer setTips(String str) {
            this.tips = Optional.e(str);
            return this;
        }

        @Required
        public QuestionAnswer setTitle(Title title) {
            this.title = title;
            return this;
        }

        public QuestionAnswer setVideoInfo(QuestionAnswerVideoInfo questionAnswerVideoInfo) {
            this.video_info = Optional.e(questionAnswerVideoInfo);
            return this;
        }

        public QuestionAnswer(Title title, String str, QuestionAnswerMediaType questionAnswerMediaType) {
            this.title = title;
            this.text = str;
            this.media_type = questionAnswerMediaType;
        }
    }

    public static class ShopInfo {

        @Required
        private String name;
        private Optional<String> location = Optional.a();
        private Optional<String> distance = Optional.a();
        private Optional<Float> score = Optional.a();
        private Optional<String> average_price = Optional.a();
        private Optional<String> tag = Optional.a();
        private Optional<String> coupon = Optional.a();
        private Optional<Boolean> open = Optional.a();
        private Optional<Image> logo = Optional.a();

        public ShopInfo() {
        }

        public Optional<String> getAveragePrice() {
            return this.average_price;
        }

        public Optional<String> getCoupon() {
            return this.coupon;
        }

        public Optional<String> getDistance() {
            return this.distance;
        }

        public Optional<String> getLocation() {
            return this.location;
        }

        public Optional<Image> getLogo() {
            return this.logo;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<Float> getScore() {
            return this.score;
        }

        public Optional<String> getTag() {
            return this.tag;
        }

        public Optional<Boolean> isOpen() {
            return this.open;
        }

        public ShopInfo setAveragePrice(String str) {
            this.average_price = Optional.e(str);
            return this;
        }

        public ShopInfo setCoupon(String str) {
            this.coupon = Optional.e(str);
            return this;
        }

        public ShopInfo setDistance(String str) {
            this.distance = Optional.e(str);
            return this;
        }

        public ShopInfo setLocation(String str) {
            this.location = Optional.e(str);
            return this;
        }

        public ShopInfo setLogo(Image image) {
            this.logo = Optional.e(image);
            return this;
        }

        @Required
        public ShopInfo setName(String str) {
            this.name = str;
            return this;
        }

        public ShopInfo setOpen(boolean z) {
            this.open = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ShopInfo setScore(float f) {
            this.score = Optional.e(Float.valueOf(f));
            return this;
        }

        public ShopInfo setTag(String str) {
            this.tag = Optional.e(str);
            return this;
        }

        public ShopInfo(String str) {
            this.name = str;
        }
    }

    public static class WeatherItem {

        @Required
        private String date;

        @Required
        private String location;
        private Optional<String> aqi = Optional.a();
        private Optional<String> current_temperature = Optional.a();
        private Optional<String> high_temperature = Optional.a();
        private Optional<String> low_temperature = Optional.a();
        private Optional<Image> icon = Optional.a();
        private Optional<WeatherCode> weather_code = Optional.a();
        private Optional<WeatherWind> wind = Optional.a();
        private Optional<Boolean> is_daylight = Optional.a();

        public WeatherItem() {
        }

        public Optional<String> getAqi() {
            return this.aqi;
        }

        public Optional<String> getCurrentTemperature() {
            return this.current_temperature;
        }

        @Required
        public String getDate() {
            return this.date;
        }

        public Optional<String> getHighTemperature() {
            return this.high_temperature;
        }

        public Optional<Image> getIcon() {
            return this.icon;
        }

        @Required
        public String getLocation() {
            return this.location;
        }

        public Optional<String> getLowTemperature() {
            return this.low_temperature;
        }

        public Optional<WeatherCode> getWeatherCode() {
            return this.weather_code;
        }

        public Optional<WeatherWind> getWind() {
            return this.wind;
        }

        public Optional<Boolean> isDaylight() {
            return this.is_daylight;
        }

        public WeatherItem setAqi(String str) {
            this.aqi = Optional.e(str);
            return this;
        }

        public WeatherItem setCurrentTemperature(String str) {
            this.current_temperature = Optional.e(str);
            return this;
        }

        @Required
        public WeatherItem setDate(String str) {
            this.date = str;
            return this;
        }

        public WeatherItem setHighTemperature(String str) {
            this.high_temperature = Optional.e(str);
            return this;
        }

        public WeatherItem setIcon(Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        public WeatherItem setIsDaylight(boolean z) {
            this.is_daylight = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public WeatherItem setLocation(String str) {
            this.location = str;
            return this;
        }

        public WeatherItem setLowTemperature(String str) {
            this.low_temperature = Optional.e(str);
            return this;
        }

        public WeatherItem setWeatherCode(WeatherCode weatherCode) {
            this.weather_code = Optional.e(weatherCode);
            return this;
        }

        public WeatherItem setWind(WeatherWind weatherWind) {
            this.wind = Optional.e(weatherWind);
            return this;
        }

        public WeatherItem(String str, String str2) {
            this.date = str;
            this.location = str2;
        }
    }

    @NamespaceName(name = "H5Page", namespace = AIApiConstants.Template.NAME)
    public static class H5Page implements InstructionPayload {

        @Required
        private ErrorDetail error_prompt;

        @Required
        private H5PageLoadType load_type;

        @Required
        private c4h param;

        @Required
        private H5ParamType param_type;

        @Required
        private Image skill_icon;

        @Required
        private int timeout_in_milli;
        private Optional<String> load_url = Optional.a();
        private Optional<String> load_html = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();
        private Optional<Common.MultiExecutionSequences> secondaries = Optional.a();
        private Optional<H5PageExtraData> extra_data = Optional.a();
        private Optional<Boolean> all_ui_h5 = Optional.a();
        private Optional<H5PageSource> source = Optional.a();
        private Optional<Boolean> reback = Optional.a();
        private Optional<Boolean> auto_play_audio = Optional.a();

        public H5Page() {
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        @Required
        public ErrorDetail getErrorPrompt() {
            return this.error_prompt;
        }

        public Optional<H5PageExtraData> getExtraData() {
            return this.extra_data;
        }

        public Optional<String> getLoadHtml() {
            return this.load_html;
        }

        @Required
        public H5PageLoadType getLoadType() {
            return this.load_type;
        }

        public Optional<String> getLoadUrl() {
            return this.load_url;
        }

        @Required
        public c4h getParam() {
            return this.param;
        }

        @Required
        public H5ParamType getParamType() {
            return this.param_type;
        }

        public Optional<Common.MultiExecutionSequences> getSecondaries() {
            return this.secondaries;
        }

        @Required
        public Image getSkillIcon() {
            return this.skill_icon;
        }

        public Optional<H5PageSource> getSource() {
            return this.source;
        }

        @Required
        public int getTimeoutInMilli() {
            return this.timeout_in_milli;
        }

        public Optional<Boolean> isAllUiH5() {
            return this.all_ui_h5;
        }

        public Optional<Boolean> isAutoPlayAudio() {
            return this.auto_play_audio;
        }

        public Optional<Boolean> isReback() {
            return this.reback;
        }

        public H5Page setAllUiH5(boolean z) {
            this.all_ui_h5 = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public H5Page setAutoPlayAudio(boolean z) {
            this.auto_play_audio = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public H5Page setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        @Required
        public H5Page setErrorPrompt(ErrorDetail errorDetail) {
            this.error_prompt = errorDetail;
            return this;
        }

        public H5Page setExtraData(H5PageExtraData h5PageExtraData) {
            this.extra_data = Optional.e(h5PageExtraData);
            return this;
        }

        public H5Page setLoadHtml(String str) {
            this.load_html = Optional.e(str);
            return this;
        }

        @Required
        public H5Page setLoadType(H5PageLoadType h5PageLoadType) {
            this.load_type = h5PageLoadType;
            return this;
        }

        public H5Page setLoadUrl(String str) {
            this.load_url = Optional.e(str);
            return this;
        }

        @Required
        public H5Page setParam(c4h c4hVar) {
            this.param = c4hVar;
            return this;
        }

        @Required
        public H5Page setParamType(H5ParamType h5ParamType) {
            this.param_type = h5ParamType;
            return this;
        }

        public H5Page setReback(boolean z) {
            this.reback = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public H5Page setSecondaries(Common.MultiExecutionSequences multiExecutionSequences) {
            this.secondaries = Optional.e(multiExecutionSequences);
            return this;
        }

        @Required
        public H5Page setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        public H5Page setSource(H5PageSource h5PageSource) {
            this.source = Optional.e(h5PageSource);
            return this;
        }

        @Required
        public H5Page setTimeoutInMilli(int i) {
            this.timeout_in_milli = i;
            return this;
        }

        public H5Page(H5PageLoadType h5PageLoadType, int i, ErrorDetail errorDetail, Image image, c4h c4hVar, H5ParamType h5ParamType) {
            this.load_type = h5PageLoadType;
            this.timeout_in_milli = i;
            this.error_prompt = errorDetail;
            this.skill_icon = image;
            this.param = c4hVar;
            this.param_type = h5ParamType;
        }
    }

    @NamespaceName(name = "LLMImageGenerationLimit", namespace = AIApiConstants.Template.NAME)
    public static class LLMImageGenerationLimit implements InstructionPayload {

        @Required
        private String description;

        @Required
        private String title;
        private Optional<Image> icon = Optional.a();
        private Optional<BackgroundColor> background_color = Optional.a();
        private Optional<Launcher> launcher = Optional.a();
        private Optional<List<LLMImageOfflineMessage>> scenes_message = Optional.a();
        private Optional<Image> cp_image = Optional.a();
        private Optional<List<String>> prompts = Optional.a();
        private Optional<String> painting_hits = Optional.a();
        private Optional<String> paint_success_hits = Optional.a();
        private Optional<String> paint_fail_hits = Optional.a();

        public LLMImageGenerationLimit() {
        }

        public Optional<BackgroundColor> getBackgroundColor() {
            return this.background_color;
        }

        public Optional<Image> getCpImage() {
            return this.cp_image;
        }

        @Required
        public String getDescription() {
            return this.description;
        }

        public Optional<Image> getIcon() {
            return this.icon;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<String> getPaintFailHits() {
            return this.paint_fail_hits;
        }

        public Optional<String> getPaintSuccessHits() {
            return this.paint_success_hits;
        }

        public Optional<String> getPaintingHits() {
            return this.painting_hits;
        }

        public Optional<List<String>> getPrompts() {
            return this.prompts;
        }

        public Optional<List<LLMImageOfflineMessage>> getScenesMessage() {
            return this.scenes_message;
        }

        @Required
        public String getTitle() {
            return this.title;
        }

        public LLMImageGenerationLimit setBackgroundColor(BackgroundColor backgroundColor) {
            this.background_color = Optional.e(backgroundColor);
            return this;
        }

        public LLMImageGenerationLimit setCpImage(Image image) {
            this.cp_image = Optional.e(image);
            return this;
        }

        @Required
        public LLMImageGenerationLimit setDescription(String str) {
            this.description = str;
            return this;
        }

        public LLMImageGenerationLimit setIcon(Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        public LLMImageGenerationLimit setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public LLMImageGenerationLimit setPaintFailHits(String str) {
            this.paint_fail_hits = Optional.e(str);
            return this;
        }

        public LLMImageGenerationLimit setPaintSuccessHits(String str) {
            this.paint_success_hits = Optional.e(str);
            return this;
        }

        public LLMImageGenerationLimit setPaintingHits(String str) {
            this.painting_hits = Optional.e(str);
            return this;
        }

        public LLMImageGenerationLimit setPrompts(List<String> list) {
            this.prompts = Optional.e(list);
            return this;
        }

        public LLMImageGenerationLimit setScenesMessage(List<LLMImageOfflineMessage> list) {
            this.scenes_message = Optional.e(list);
            return this;
        }

        @Required
        public LLMImageGenerationLimit setTitle(String str) {
            this.title = str;
            return this;
        }

        public LLMImageGenerationLimit(String str, String str2) {
            this.title = str;
            this.description = str2;
        }
    }

    @NamespaceName(name = "PlayInfo", namespace = AIApiConstants.Template.NAME)
    public static class PlayInfo implements InstructionPayload {

        @Required
        private List<PlayInfoItem> items;
        private Optional<Image> skill_icon = Optional.a();
        private Optional<DisplayControl> display_control = Optional.a();
        private Optional<Launcher> launcher = Optional.a();
        private Optional<PlayInfoItemDisplayType> display_type = Optional.a();
        private Optional<AudioPlayer.PlayBehavior> play_behavior = Optional.a();
        private Optional<PlayInfoType> type = Optional.a();
        private Optional<CustomBackground> background = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();
        private Optional<String> cp = Optional.a();

        public PlayInfo() {
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<String> getCp() {
            return this.cp;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        public Optional<DisplayControl> getDisplayControl() {
            return this.display_control;
        }

        public Optional<PlayInfoItemDisplayType> getDisplayType() {
            return this.display_type;
        }

        @Required
        public List<PlayInfoItem> getItems() {
            return this.items;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<AudioPlayer.PlayBehavior> getPlayBehavior() {
            return this.play_behavior;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        public Optional<PlayInfoType> getType() {
            return this.type;
        }

        public PlayInfo setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public PlayInfo setCp(String str) {
            this.cp = Optional.e(str);
            return this;
        }

        public PlayInfo setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        public PlayInfo setDisplayControl(DisplayControl displayControl) {
            this.display_control = Optional.e(displayControl);
            return this;
        }

        public PlayInfo setDisplayType(PlayInfoItemDisplayType playInfoItemDisplayType) {
            this.display_type = Optional.e(playInfoItemDisplayType);
            return this;
        }

        @Required
        public PlayInfo setItems(List<PlayInfoItem> list) {
            this.items = list;
            return this;
        }

        public PlayInfo setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public PlayInfo setPlayBehavior(AudioPlayer.PlayBehavior playBehavior) {
            this.play_behavior = Optional.e(playBehavior);
            return this;
        }

        public PlayInfo setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public PlayInfo setType(PlayInfoType playInfoType) {
            this.type = Optional.e(playInfoType);
            return this;
        }

        public PlayInfo(List<PlayInfoItem> list) {
            this.items = list;
        }
    }

    @NamespaceName(name = com.xiaomi.ai.api.intent.AIApiConstants.Qabot.NAME, namespace = AIApiConstants.Template.NAME)
    public static class Qabot implements InstructionPayload {

        @Required
        private Title title;

        @Required
        private QabotType type;
        private Optional<VideoSnapshot> videoSnapshot = Optional.a();
        private Optional<ClickAlbum> images = Optional.a();
        private Optional<Launcher> launcher = Optional.a();
        private Optional<QabotParagraphs> paragraphs = Optional.a();
        private Optional<List<AbstractItem>> abstracts = Optional.a();
        private Optional<String> text = Optional.a();
        private Optional<Image> skill_icon = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();
        private Optional<QabotImageType> image_type = Optional.a();

        public Qabot() {
        }

        public Optional<List<AbstractItem>> getAbstracts() {
            return this.abstracts;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        public Optional<QabotImageType> getImageType() {
            return this.image_type;
        }

        public Optional<ClickAlbum> getImages() {
            return this.images;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<QabotParagraphs> getParagraphs() {
            return this.paragraphs;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        public Optional<String> getText() {
            return this.text;
        }

        @Required
        public Title getTitle() {
            return this.title;
        }

        @Required
        public QabotType getType() {
            return this.type;
        }

        public Optional<VideoSnapshot> getVideoSnapshot() {
            return this.videoSnapshot;
        }

        public Qabot setAbstracts(List<AbstractItem> list) {
            this.abstracts = Optional.e(list);
            return this;
        }

        public Qabot setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        public Qabot setImageType(QabotImageType qabotImageType) {
            this.image_type = Optional.e(qabotImageType);
            return this;
        }

        public Qabot setImages(ClickAlbum clickAlbum) {
            this.images = Optional.e(clickAlbum);
            return this;
        }

        public Qabot setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public Qabot setParagraphs(QabotParagraphs qabotParagraphs) {
            this.paragraphs = Optional.e(qabotParagraphs);
            return this;
        }

        public Qabot setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public Qabot setText(String str) {
            this.text = Optional.e(str);
            return this;
        }

        @Required
        public Qabot setTitle(Title title) {
            this.title = title;
            return this;
        }

        @Required
        public Qabot setType(QabotType qabotType) {
            this.type = qabotType;
            return this;
        }

        public Qabot setVideoSnapshot(VideoSnapshot videoSnapshot) {
            this.videoSnapshot = Optional.e(videoSnapshot);
            return this;
        }

        public Qabot(QabotType qabotType, Title title) {
            this.type = qabotType;
            this.title = title;
        }
    }

    @NamespaceName(name = com.xiaomi.ai.api.intent.AIApiConstants.Calculator.NAME, namespace = AIApiConstants.Template.NAME)
    public static class Calculator implements InstructionPayload {

        @Required
        private Image skill_icon;
        private Optional<String> expression = Optional.a();
        private Optional<String> result_unit = Optional.a();
        private Optional<String> approximate_value = Optional.a();
        private Optional<String> value = Optional.a();
        private Optional<List<ArithRecord>> recent_records = Optional.a();
        private Optional<Launcher> launcher = Optional.a();
        private Optional<CustomBackground> background = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();
        private Optional<CalculatorType> calculator_type = Optional.a();
        private Optional<String> data_source = Optional.a();

        public Calculator() {
        }

        public Optional<String> getApproximateValue() {
            return this.approximate_value;
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<CalculatorType> getCalculatorType() {
            return this.calculator_type;
        }

        public Optional<String> getDataSource() {
            return this.data_source;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        public Optional<String> getExpression() {
            return this.expression;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<List<ArithRecord>> getRecentRecords() {
            return this.recent_records;
        }

        public Optional<String> getResultUnit() {
            return this.result_unit;
        }

        @Required
        public Image getSkillIcon() {
            return this.skill_icon;
        }

        public Optional<String> getValue() {
            return this.value;
        }

        public Calculator setApproximateValue(String str) {
            this.approximate_value = Optional.e(str);
            return this;
        }

        public Calculator setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public Calculator setCalculatorType(CalculatorType calculatorType) {
            this.calculator_type = Optional.e(calculatorType);
            return this;
        }

        public Calculator setDataSource(String str) {
            this.data_source = Optional.e(str);
            return this;
        }

        public Calculator setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        public Calculator setExpression(String str) {
            this.expression = Optional.e(str);
            return this;
        }

        public Calculator setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public Calculator setRecentRecords(List<ArithRecord> list) {
            this.recent_records = Optional.e(list);
            return this;
        }

        public Calculator setResultUnit(String str) {
            this.result_unit = Optional.e(str);
            return this;
        }

        @Required
        public Calculator setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        public Calculator setValue(String str) {
            this.value = Optional.e(str);
            return this;
        }

        public Calculator(Image image) {
            this.skill_icon = image;
        }
    }

    @NamespaceName(name = "ConfirmCancelBox", namespace = AIApiConstants.Template.NAME)
    public static class ConfirmCancelBox implements InstructionPayload {

        @Required
        private String text;
        private Optional<Launcher> confirm = Optional.a();
        private Optional<Launcher> cancel = Optional.a();
        private Optional<String> title = Optional.a();
        private Optional<ConfirmCategory> category = Optional.a();
        private Optional<Image> icon = Optional.a();
        private Optional<Boolean> show_confirm_button = Optional.a();
        private Optional<Boolean> show_cancel_button = Optional.a();
        private Optional<Integer> timeout_in_seconds = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();
        private Optional<ConfirmInfo> confirmInfo = Optional.a();

        public ConfirmCancelBox() {
        }

        public Optional<Launcher> getCancel() {
            return this.cancel;
        }

        public Optional<ConfirmCategory> getCategory() {
            return this.category;
        }

        public Optional<Launcher> getConfirm() {
            return this.confirm;
        }

        public Optional<ConfirmInfo> getConfirmInfo() {
            return this.confirmInfo;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        public Optional<Image> getIcon() {
            return this.icon;
        }

        @Required
        public String getText() {
            return this.text;
        }

        public Optional<Integer> getTimeoutInSeconds() {
            return this.timeout_in_seconds;
        }

        public Optional<String> getTitle() {
            return this.title;
        }

        public Optional<Boolean> isShowCancelButton() {
            return this.show_cancel_button;
        }

        public Optional<Boolean> isShowConfirmButton() {
            return this.show_confirm_button;
        }

        public ConfirmCancelBox setCancel(Launcher launcher) {
            this.cancel = Optional.e(launcher);
            return this;
        }

        public ConfirmCancelBox setCategory(ConfirmCategory confirmCategory) {
            this.category = Optional.e(confirmCategory);
            return this;
        }

        public ConfirmCancelBox setConfirm(Launcher launcher) {
            this.confirm = Optional.e(launcher);
            return this;
        }

        public ConfirmCancelBox setConfirmInfo(ConfirmInfo confirmInfo) {
            this.confirmInfo = Optional.e(confirmInfo);
            return this;
        }

        public ConfirmCancelBox setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        public ConfirmCancelBox setIcon(Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        public ConfirmCancelBox setShowCancelButton(boolean z) {
            this.show_cancel_button = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ConfirmCancelBox setShowConfirmButton(boolean z) {
            this.show_confirm_button = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public ConfirmCancelBox setText(String str) {
            this.text = str;
            return this;
        }

        public ConfirmCancelBox setTimeoutInSeconds(int i) {
            this.timeout_in_seconds = Optional.e(Integer.valueOf(i));
            return this;
        }

        public ConfirmCancelBox setTitle(String str) {
            this.title = Optional.e(str);
            return this;
        }

        public ConfirmCancelBox(String str) {
            this.text = str;
        }
    }

    @NamespaceName(name = com.xiaomi.ai.api.intent.AIApiConstants.Message.NAME, namespace = AIApiConstants.Template.NAME)
    public static class Message implements InstructionPayload {

        @Required
        private MessageSendDeviceCategory send_device_category;

        @Required
        private MessageSendDeviceType send_device_type;

        @Required
        private MessageSendType send_type;
        private Optional<String> asr_text = Optional.a();
        private Optional<String> room_name = Optional.a();
        private Optional<String> device_name = Optional.a();
        private Optional<String> home_name = Optional.a();
        private Optional<String> home_id = Optional.a();
        private Optional<String> room_id = Optional.a();
        private Optional<String> sender_device_id = Optional.a();
        private Optional<Image> family_avatar = Optional.a();
        private Optional<Image> personal_avatar = Optional.a();
        private Optional<String> id = Optional.a();

        public Message() {
        }

        public Optional<String> getAsrText() {
            return this.asr_text;
        }

        public Optional<String> getDeviceName() {
            return this.device_name;
        }

        public Optional<Image> getFamilyAvatar() {
            return this.family_avatar;
        }

        public Optional<String> getHomeId() {
            return this.home_id;
        }

        public Optional<String> getHomeName() {
            return this.home_name;
        }

        public Optional<String> getId() {
            return this.id;
        }

        public Optional<Image> getPersonalAvatar() {
            return this.personal_avatar;
        }

        public Optional<String> getRoomId() {
            return this.room_id;
        }

        public Optional<String> getRoomName() {
            return this.room_name;
        }

        @Required
        public MessageSendDeviceCategory getSendDeviceCategory() {
            return this.send_device_category;
        }

        @Required
        public MessageSendDeviceType getSendDeviceType() {
            return this.send_device_type;
        }

        @Required
        public MessageSendType getSendType() {
            return this.send_type;
        }

        public Optional<String> getSenderDeviceId() {
            return this.sender_device_id;
        }

        public Message setAsrText(String str) {
            this.asr_text = Optional.e(str);
            return this;
        }

        public Message setDeviceName(String str) {
            this.device_name = Optional.e(str);
            return this;
        }

        public Message setFamilyAvatar(Image image) {
            this.family_avatar = Optional.e(image);
            return this;
        }

        public Message setHomeId(String str) {
            this.home_id = Optional.e(str);
            return this;
        }

        public Message setHomeName(String str) {
            this.home_name = Optional.e(str);
            return this;
        }

        public Message setId(String str) {
            this.id = Optional.e(str);
            return this;
        }

        public Message setPersonalAvatar(Image image) {
            this.personal_avatar = Optional.e(image);
            return this;
        }

        public Message setRoomId(String str) {
            this.room_id = Optional.e(str);
            return this;
        }

        public Message setRoomName(String str) {
            this.room_name = Optional.e(str);
            return this;
        }

        @Required
        public Message setSendDeviceCategory(MessageSendDeviceCategory messageSendDeviceCategory) {
            this.send_device_category = messageSendDeviceCategory;
            return this;
        }

        @Required
        public Message setSendDeviceType(MessageSendDeviceType messageSendDeviceType) {
            this.send_device_type = messageSendDeviceType;
            return this;
        }

        @Required
        public Message setSendType(MessageSendType messageSendType) {
            this.send_type = messageSendType;
            return this;
        }

        public Message setSenderDeviceId(String str) {
            this.sender_device_id = Optional.e(str);
            return this;
        }

        public Message(MessageSendType messageSendType, MessageSendDeviceType messageSendDeviceType, MessageSendDeviceCategory messageSendDeviceCategory) {
            this.send_type = messageSendType;
            this.send_device_type = messageSendDeviceType;
            this.send_device_category = messageSendDeviceCategory;
        }
    }

    @NamespaceName(name = "Toast", namespace = AIApiConstants.Template.NAME)
    public static class Toast implements InstructionPayload {

        @Required
        private String text;
        private Optional<String> query = Optional.a();
        private Optional<Boolean> training = Optional.a();
        private Optional<Image> image = Optional.a();
        private Optional<CustomBackground> background = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();
        private Optional<ToastPosition> position = Optional.a();
        private Optional<EmojiConfig> emoji = Optional.a();
        private Optional<AnimationConfig> animation = Optional.a();
        private Optional<Boolean> show_audio = Optional.a();
        private Optional<ClickableText> clickable_text = Optional.a();

        public Toast() {
        }

        public Optional<AnimationConfig> getAnimation() {
            return this.animation;
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<ClickableText> getClickableText() {
            return this.clickable_text;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        public Optional<EmojiConfig> getEmoji() {
            return this.emoji;
        }

        public Optional<Image> getImage() {
            return this.image;
        }

        public Optional<ToastPosition> getPosition() {
            return this.position;
        }

        public Optional<String> getQuery() {
            return this.query;
        }

        @Required
        public String getText() {
            return this.text;
        }

        public Optional<Boolean> isShowAudio() {
            return this.show_audio;
        }

        public Optional<Boolean> isTraining() {
            return this.training;
        }

        public Toast setAnimation(AnimationConfig animationConfig) {
            this.animation = Optional.e(animationConfig);
            return this;
        }

        public Toast setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public Toast setClickableText(ClickableText clickableText) {
            this.clickable_text = Optional.e(clickableText);
            return this;
        }

        public Toast setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        public Toast setEmoji(EmojiConfig emojiConfig) {
            this.emoji = Optional.e(emojiConfig);
            return this;
        }

        public Toast setImage(Image image) {
            this.image = Optional.e(image);
            return this;
        }

        public Toast setPosition(ToastPosition toastPosition) {
            this.position = Optional.e(toastPosition);
            return this;
        }

        public Toast setQuery(String str) {
            this.query = Optional.e(str);
            return this;
        }

        public Toast setShowAudio(boolean z) {
            this.show_audio = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public Toast setText(String str) {
            this.text = str;
            return this;
        }

        public Toast setTraining(boolean z) {
            this.training = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public Toast(String str) {
            this.text = str;
        }
    }

    public static class PlayInfoItem {

        @Required
        private String audio_id;

        @Required
        private List<String> controls;

        @Required
        private Title title;
        private Optional<Integer> duration_in_ms = Optional.a();
        private Optional<Image> cover = Optional.a();
        private Optional<PlayInfoItemProvider> provider = Optional.a();
        private Optional<String> text = Optional.a();
        private Optional<Common.AudioType> audio_type = Optional.a();
        private Optional<String> lyric_uri = Optional.a();

        @Deprecated
        private Optional<String> mv_id = Optional.a();
        private Optional<Launcher> launcher = Optional.a();
        private Optional<AudioPlayer.Stream> mv_stream = Optional.a();
        private Optional<Boolean> is_vip = Optional.a();
        private Optional<Boolean> payment = Optional.a();

        public PlayInfoItem() {
        }

        @Required
        public String getAudioId() {
            return this.audio_id;
        }

        public Optional<Common.AudioType> getAudioType() {
            return this.audio_type;
        }

        @Required
        public List<String> getControls() {
            return this.controls;
        }

        public Optional<Image> getCover() {
            return this.cover;
        }

        public Optional<Integer> getDurationInMs() {
            return this.duration_in_ms;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<String> getLyricUri() {
            return this.lyric_uri;
        }

        @Deprecated
        public Optional<String> getMvId() {
            return this.mv_id;
        }

        public Optional<AudioPlayer.Stream> getMvStream() {
            return this.mv_stream;
        }

        public Optional<PlayInfoItemProvider> getProvider() {
            return this.provider;
        }

        public Optional<String> getText() {
            return this.text;
        }

        @Required
        public Title getTitle() {
            return this.title;
        }

        public Optional<Boolean> isPayment() {
            return this.payment;
        }

        public Optional<Boolean> isVip() {
            return this.is_vip;
        }

        @Required
        public PlayInfoItem setAudioId(String str) {
            this.audio_id = str;
            return this;
        }

        public PlayInfoItem setAudioType(Common.AudioType audioType) {
            this.audio_type = Optional.e(audioType);
            return this;
        }

        @Required
        public PlayInfoItem setControls(List<String> list) {
            this.controls = list;
            return this;
        }

        public PlayInfoItem setCover(Image image) {
            this.cover = Optional.e(image);
            return this;
        }

        public PlayInfoItem setDurationInMs(int i) {
            this.duration_in_ms = Optional.e(Integer.valueOf(i));
            return this;
        }

        public PlayInfoItem setIsVip(boolean z) {
            this.is_vip = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public PlayInfoItem setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public PlayInfoItem setLyricUri(String str) {
            this.lyric_uri = Optional.e(str);
            return this;
        }

        @Deprecated
        public PlayInfoItem setMvId(String str) {
            this.mv_id = Optional.e(str);
            return this;
        }

        public PlayInfoItem setMvStream(AudioPlayer.Stream stream) {
            this.mv_stream = Optional.e(stream);
            return this;
        }

        public PlayInfoItem setPayment(boolean z) {
            this.payment = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public PlayInfoItem setProvider(PlayInfoItemProvider playInfoItemProvider) {
            this.provider = Optional.e(playInfoItemProvider);
            return this;
        }

        public PlayInfoItem setText(String str) {
            this.text = Optional.e(str);
            return this;
        }

        @Required
        public PlayInfoItem setTitle(Title title) {
            this.title = title;
            return this;
        }

        public PlayInfoItem(String str, List<String> list, Title title) {
            this.audio_id = str;
            this.controls = list;
            this.title = title;
        }
    }

    @NamespaceName(name = "Time", namespace = AIApiConstants.Template.NAME)
    public static class Time implements InstructionPayload {

        @Required
        private TimeType type;
        private Optional<String> date = Optional.a();
        private Optional<String> festival = Optional.a();
        private Optional<String> week = Optional.a();
        private Optional<String> lunar = Optional.a();
        private Optional<Launcher> launcher = Optional.a();
        private Optional<String> time = Optional.a();
        private Optional<String> period = Optional.a();
        private Optional<Image> icon = Optional.a();
        private Optional<String> location = Optional.a();
        private Optional<Image> skill_icon = Optional.a();
        private Optional<String> three_level_intent_name = Optional.a();
        private Optional<Nlp.TimeIntention> time_intention = Optional.a();

        public Time() {
        }

        public Optional<String> getDate() {
            return this.date;
        }

        public Optional<String> getFestival() {
            return this.festival;
        }

        public Optional<Image> getIcon() {
            return this.icon;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<String> getLocation() {
            return this.location;
        }

        public Optional<String> getLunar() {
            return this.lunar;
        }

        public Optional<String> getPeriod() {
            return this.period;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        public Optional<String> getThreeLevelIntentName() {
            return this.three_level_intent_name;
        }

        public Optional<String> getTime() {
            return this.time;
        }

        public Optional<Nlp.TimeIntention> getTimeIntention() {
            return this.time_intention;
        }

        @Required
        public TimeType getType() {
            return this.type;
        }

        public Optional<String> getWeek() {
            return this.week;
        }

        public Time setDate(String str) {
            this.date = Optional.e(str);
            return this;
        }

        public Time setFestival(String str) {
            this.festival = Optional.e(str);
            return this;
        }

        public Time setIcon(Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        public Time setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public Time setLocation(String str) {
            this.location = Optional.e(str);
            return this;
        }

        public Time setLunar(String str) {
            this.lunar = Optional.e(str);
            return this;
        }

        public Time setPeriod(String str) {
            this.period = Optional.e(str);
            return this;
        }

        public Time setSkillIcon(Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public Time setThreeLevelIntentName(String str) {
            this.three_level_intent_name = Optional.e(str);
            return this;
        }

        public Time setTime(String str) {
            this.time = Optional.e(str);
            return this;
        }

        public Time setTimeIntention(Nlp.TimeIntention timeIntention) {
            this.time_intention = Optional.e(timeIntention);
            return this;
        }

        @Required
        public Time setType(TimeType timeType) {
            this.type = timeType;
            return this;
        }

        public Time setWeek(String str) {
            this.week = Optional.e(str);
            return this;
        }

        public Time(TimeType timeType) {
            this.type = timeType;
        }
    }

    public static class WikiDetail {

        @Required
        private Image skill_icon;

        @Required
        private String text;

        @Required
        private Title title;
        private Optional<Launcher> launcher = Optional.a();
        private Optional<ClickAlbum> images = Optional.a();
        private Optional<List<AbstractItem>> abstracts = Optional.a();
        private Optional<GeneralDisplayType> type = Optional.a();
        private Optional<CustomBackground> background = Optional.a();
        private Optional<DisplayCommon> display = Optional.a();
        private Optional<VideoSnapshot> videoSnapshot = Optional.a();
        private Optional<EmbeddedList> relationShip = Optional.a();
        private Optional<EmbeddedList> news = Optional.a();
        private Optional<Title> polysemy = Optional.a();
        private Optional<WikiMoreDetail> more_detail = Optional.a();
        private Optional<String> entity_id = Optional.a();
        private Optional<String> loadmore_token = Optional.a();

        public WikiDetail() {
        }

        public Optional<List<AbstractItem>> getAbstracts() {
            return this.abstracts;
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
        }

        public Optional<String> getEntityId() {
            return this.entity_id;
        }

        public Optional<ClickAlbum> getImages() {
            return this.images;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<String> getLoadmoreToken() {
            return this.loadmore_token;
        }

        public Optional<WikiMoreDetail> getMoreDetail() {
            return this.more_detail;
        }

        public Optional<EmbeddedList> getNews() {
            return this.news;
        }

        public Optional<Title> getPolysemy() {
            return this.polysemy;
        }

        public Optional<EmbeddedList> getRelationShip() {
            return this.relationShip;
        }

        @Required
        public Image getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public Title getTitle() {
            return this.title;
        }

        public Optional<GeneralDisplayType> getType() {
            return this.type;
        }

        public Optional<VideoSnapshot> getVideoSnapshot() {
            return this.videoSnapshot;
        }

        public WikiDetail setAbstracts(List<AbstractItem> list) {
            this.abstracts = Optional.e(list);
            return this;
        }

        public WikiDetail setBackground(CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public WikiDetail setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        public WikiDetail setEntityId(String str) {
            this.entity_id = Optional.e(str);
            return this;
        }

        public WikiDetail setImages(ClickAlbum clickAlbum) {
            this.images = Optional.e(clickAlbum);
            return this;
        }

        public WikiDetail setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public WikiDetail setLoadmoreToken(String str) {
            this.loadmore_token = Optional.e(str);
            return this;
        }

        public WikiDetail setMoreDetail(WikiMoreDetail wikiMoreDetail) {
            this.more_detail = Optional.e(wikiMoreDetail);
            return this;
        }

        public WikiDetail setNews(EmbeddedList embeddedList) {
            this.news = Optional.e(embeddedList);
            return this;
        }

        public WikiDetail setPolysemy(Title title) {
            this.polysemy = Optional.e(title);
            return this;
        }

        public WikiDetail setRelationShip(EmbeddedList embeddedList) {
            this.relationShip = Optional.e(embeddedList);
            return this;
        }

        @Required
        public WikiDetail setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        @Required
        public WikiDetail setText(String str) {
            this.text = str;
            return this;
        }

        @Required
        public WikiDetail setTitle(Title title) {
            this.title = title;
            return this;
        }

        public WikiDetail setType(GeneralDisplayType generalDisplayType) {
            this.type = Optional.e(generalDisplayType);
            return this;
        }

        public WikiDetail setVideoSnapshot(VideoSnapshot videoSnapshot) {
            this.videoSnapshot = Optional.e(videoSnapshot);
            return this;
        }

        public WikiDetail(Title title, String str, Image image) {
            this.title = title;
            this.text = str;
            this.skill_icon = image;
        }
    }

    public static class AndroidApp {

        @Required
        private Image icon;

        @Required
        private String name;

        @Required
        private String pkg_name;
        private Optional<String> slogan = Optional.a();
        private Optional<String> tag = Optional.a();
        private Optional<Float> rating_score = Optional.a();
        private Optional<Integer> apk_size = Optional.a();
        private Optional<AppVersion> version = Optional.a();
        private Optional<Long> downloads = Optional.a();
        private Optional<String> developer = Optional.a();
        private Optional<Launcher> privacy = Optional.a();
        private Optional<Launcher> auth = Optional.a();
        private Optional<Long> app_size = Optional.a();
        private Optional<Launcher> open_page = Optional.a();
        private Optional<String> page_identifier = Optional.a();
        private Optional<AppDeviceCategory> app_device_category = Optional.a();
        private Optional<String> project_device_id = Optional.a();
        private Optional<Launcher> introduction = Optional.a();
        private Optional<String> page_identifier_data = Optional.a();

        public AndroidApp() {
        }

        public Optional<Integer> getApkSize() {
            return this.apk_size;
        }

        public Optional<AppDeviceCategory> getAppDeviceCategory() {
            return this.app_device_category;
        }

        public Optional<Long> getAppSize() {
            return this.app_size;
        }

        public Optional<Launcher> getAuth() {
            return this.auth;
        }

        public Optional<String> getDeveloper() {
            return this.developer;
        }

        public Optional<Long> getDownloads() {
            return this.downloads;
        }

        @Required
        public Image getIcon() {
            return this.icon;
        }

        public Optional<Launcher> getIntroduction() {
            return this.introduction;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<Launcher> getOpenPage() {
            return this.open_page;
        }

        public Optional<String> getPageIdentifier() {
            return this.page_identifier;
        }

        public Optional<String> getPageIdentifierData() {
            return this.page_identifier_data;
        }

        @Required
        public String getPkgName() {
            return this.pkg_name;
        }

        public Optional<Launcher> getPrivacy() {
            return this.privacy;
        }

        public Optional<String> getProjectDeviceId() {
            return this.project_device_id;
        }

        public Optional<Float> getRatingScore() {
            return this.rating_score;
        }

        public Optional<String> getSlogan() {
            return this.slogan;
        }

        public Optional<String> getTag() {
            return this.tag;
        }

        public Optional<AppVersion> getVersion() {
            return this.version;
        }

        public AndroidApp setApkSize(int i) {
            this.apk_size = Optional.e(Integer.valueOf(i));
            return this;
        }

        public AndroidApp setAppDeviceCategory(AppDeviceCategory appDeviceCategory) {
            this.app_device_category = Optional.e(appDeviceCategory);
            return this;
        }

        public AndroidApp setAppSize(long j) {
            this.app_size = Optional.e(Long.valueOf(j));
            return this;
        }

        public AndroidApp setAuth(Launcher launcher) {
            this.auth = Optional.e(launcher);
            return this;
        }

        public AndroidApp setDeveloper(String str) {
            this.developer = Optional.e(str);
            return this;
        }

        public AndroidApp setDownloads(long j) {
            this.downloads = Optional.e(Long.valueOf(j));
            return this;
        }

        @Required
        public AndroidApp setIcon(Image image) {
            this.icon = image;
            return this;
        }

        public AndroidApp setIntroduction(Launcher launcher) {
            this.introduction = Optional.e(launcher);
            return this;
        }

        @Required
        public AndroidApp setName(String str) {
            this.name = str;
            return this;
        }

        public AndroidApp setOpenPage(Launcher launcher) {
            this.open_page = Optional.e(launcher);
            return this;
        }

        public AndroidApp setPageIdentifier(String str) {
            this.page_identifier = Optional.e(str);
            return this;
        }

        public AndroidApp setPageIdentifierData(String str) {
            this.page_identifier_data = Optional.e(str);
            return this;
        }

        @Required
        public AndroidApp setPkgName(String str) {
            this.pkg_name = str;
            return this;
        }

        public AndroidApp setPrivacy(Launcher launcher) {
            this.privacy = Optional.e(launcher);
            return this;
        }

        public AndroidApp setProjectDeviceId(String str) {
            this.project_device_id = Optional.e(str);
            return this;
        }

        public AndroidApp setRatingScore(float f) {
            this.rating_score = Optional.e(Float.valueOf(f));
            return this;
        }

        public AndroidApp setSlogan(String str) {
            this.slogan = Optional.e(str);
            return this;
        }

        public AndroidApp setTag(String str) {
            this.tag = Optional.e(str);
            return this;
        }

        public AndroidApp setVersion(AppVersion appVersion) {
            this.version = Optional.e(appVersion);
            return this;
        }

        public AndroidApp(String str, String str2, Image image) {
            this.name = str;
            this.pkg_name = str2;
            this.icon = image;
        }
    }

    public static class VideoItem {

        @Required
        private List<Video.ThirdPartyContentProvider> cp;

        @Required
        private String id;

        @Required
        private VideoLengthType length_type;

        @Required
        private String name;
        private Optional<Image> horizontal_poster = Optional.a();
        private Optional<Image> vertical_poster = Optional.a();
        private Optional<VideoShowStatus> status = Optional.a();
        private Optional<String> description = Optional.a();
        private Optional<String> publish_date = Optional.a();
        private Optional<Integer> publish_year = Optional.a();
        private Optional<Float> rating = Optional.a();
        private Optional<String> area = Optional.a();
        private Optional<Integer> duration_in_min = Optional.a();
        private Optional<String> category = Optional.a();
        private Optional<Integer> latest_episode = Optional.a();
        private Optional<Integer> episode_num = Optional.a();
        private Optional<List<VideoActor>> actors = Optional.a();
        private Optional<c4h> log = Optional.a();
        private Optional<Common.VideoMediaType> video_media_type = Optional.a();
        private Optional<List<String>> tags = Optional.a();

        public VideoItem() {
        }

        public Optional<List<VideoActor>> getActors() {
            return this.actors;
        }

        public Optional<String> getArea() {
            return this.area;
        }

        public Optional<String> getCategory() {
            return this.category;
        }

        @Required
        public List<Video.ThirdPartyContentProvider> getCp() {
            return this.cp;
        }

        public Optional<String> getDescription() {
            return this.description;
        }

        public Optional<Integer> getDurationInMin() {
            return this.duration_in_min;
        }

        public Optional<Integer> getEpisodeNum() {
            return this.episode_num;
        }

        public Optional<Image> getHorizontalPoster() {
            return this.horizontal_poster;
        }

        @Required
        public String getId() {
            return this.id;
        }

        public Optional<Integer> getLatestEpisode() {
            return this.latest_episode;
        }

        @Required
        public VideoLengthType getLengthType() {
            return this.length_type;
        }

        public Optional<c4h> getLog() {
            return this.log;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<String> getPublishDate() {
            return this.publish_date;
        }

        public Optional<Integer> getPublishYear() {
            return this.publish_year;
        }

        public Optional<Float> getRating() {
            return this.rating;
        }

        public Optional<VideoShowStatus> getStatus() {
            return this.status;
        }

        public Optional<List<String>> getTags() {
            return this.tags;
        }

        public Optional<Image> getVerticalPoster() {
            return this.vertical_poster;
        }

        public Optional<Common.VideoMediaType> getVideoMediaType() {
            return this.video_media_type;
        }

        public VideoItem setActors(List<VideoActor> list) {
            this.actors = Optional.e(list);
            return this;
        }

        public VideoItem setArea(String str) {
            this.area = Optional.e(str);
            return this;
        }

        public VideoItem setCategory(String str) {
            this.category = Optional.e(str);
            return this;
        }

        @Required
        public VideoItem setCp(List<Video.ThirdPartyContentProvider> list) {
            this.cp = list;
            return this;
        }

        public VideoItem setDescription(String str) {
            this.description = Optional.e(str);
            return this;
        }

        public VideoItem setDurationInMin(int i) {
            this.duration_in_min = Optional.e(Integer.valueOf(i));
            return this;
        }

        public VideoItem setEpisodeNum(int i) {
            this.episode_num = Optional.e(Integer.valueOf(i));
            return this;
        }

        public VideoItem setHorizontalPoster(Image image) {
            this.horizontal_poster = Optional.e(image);
            return this;
        }

        @Required
        public VideoItem setId(String str) {
            this.id = str;
            return this;
        }

        public VideoItem setLatestEpisode(int i) {
            this.latest_episode = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Required
        public VideoItem setLengthType(VideoLengthType videoLengthType) {
            this.length_type = videoLengthType;
            return this;
        }

        public VideoItem setLog(c4h c4hVar) {
            this.log = Optional.e(c4hVar);
            return this;
        }

        @Required
        public VideoItem setName(String str) {
            this.name = str;
            return this;
        }

        public VideoItem setPublishDate(String str) {
            this.publish_date = Optional.e(str);
            return this;
        }

        public VideoItem setPublishYear(int i) {
            this.publish_year = Optional.e(Integer.valueOf(i));
            return this;
        }

        public VideoItem setRating(float f) {
            this.rating = Optional.e(Float.valueOf(f));
            return this;
        }

        public VideoItem setStatus(VideoShowStatus videoShowStatus) {
            this.status = Optional.e(videoShowStatus);
            return this;
        }

        public VideoItem setTags(List<String> list) {
            this.tags = Optional.e(list);
            return this;
        }

        public VideoItem setVerticalPoster(Image image) {
            this.vertical_poster = Optional.e(image);
            return this;
        }

        public VideoItem setVideoMediaType(Common.VideoMediaType videoMediaType) {
            this.video_media_type = Optional.e(videoMediaType);
            return this;
        }

        public VideoItem(String str, String str2, VideoLengthType videoLengthType, List<Video.ThirdPartyContentProvider> list) {
            this.name = str;
            this.id = str2;
            this.length_type = videoLengthType;
            this.cp = list;
        }
    }

    public static class AlarmItem {

        @Required
        private String datetime;

        @Required
        private String id;

        @Required
        private Alerts.AlertType type;
        private Optional<Alerts.AlertCircleType> circle = Optional.a();
        private Optional<String> circle_extra = Optional.a();
        private Optional<String> event = Optional.a();
        private Optional<String> reminder = Optional.a();
        private Optional<Integer> repeat_ringing = Optional.a();
        private Optional<String> offset = Optional.a();
        private Optional<Integer> advance_reminder = Optional.a();
        private Optional<Alerts.Ringtone> ringtone = Optional.a();
        private Optional<String> time_reminder = Optional.a();
        private Optional<String> end_datetime = Optional.a();
        private Optional<AlarmDisplay> display = Optional.a();
        private Optional<String> circle_rule = Optional.a();
        private Optional<Alerts.AlertStatus> status = Optional.a();
        private Optional<LocalTarget> target = Optional.a();
        private Optional<Launcher> launcher = Optional.a();
        private Optional<Image> icon = Optional.a();
        private Optional<Alerts.ExamItemType> exam_item_type = Optional.a();
        private Optional<AlarmOperationStatus> alarm_operation_status = Optional.a();

        public AlarmItem() {
        }

        public Optional<Integer> getAdvanceReminder() {
            return this.advance_reminder;
        }

        public Optional<AlarmOperationStatus> getAlarmOperationStatus() {
            return this.alarm_operation_status;
        }

        public Optional<Alerts.AlertCircleType> getCircle() {
            return this.circle;
        }

        public Optional<String> getCircleExtra() {
            return this.circle_extra;
        }

        public Optional<String> getCircleRule() {
            return this.circle_rule;
        }

        @Required
        public String getDatetime() {
            return this.datetime;
        }

        public Optional<AlarmDisplay> getDisplay() {
            return this.display;
        }

        public Optional<String> getEndDatetime() {
            return this.end_datetime;
        }

        public Optional<String> getEvent() {
            return this.event;
        }

        public Optional<Alerts.ExamItemType> getExamItemType() {
            return this.exam_item_type;
        }

        public Optional<Image> getIcon() {
            return this.icon;
        }

        @Required
        public String getId() {
            return this.id;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<String> getOffset() {
            return this.offset;
        }

        public Optional<String> getReminder() {
            return this.reminder;
        }

        public Optional<Integer> getRepeatRinging() {
            return this.repeat_ringing;
        }

        public Optional<Alerts.Ringtone> getRingtone() {
            return this.ringtone;
        }

        public Optional<Alerts.AlertStatus> getStatus() {
            return this.status;
        }

        public Optional<LocalTarget> getTarget() {
            return this.target;
        }

        public Optional<String> getTimeReminder() {
            return this.time_reminder;
        }

        @Required
        public Alerts.AlertType getType() {
            return this.type;
        }

        public AlarmItem setAdvanceReminder(int i) {
            this.advance_reminder = Optional.e(Integer.valueOf(i));
            return this;
        }

        public AlarmItem setAlarmOperationStatus(AlarmOperationStatus alarmOperationStatus) {
            this.alarm_operation_status = Optional.e(alarmOperationStatus);
            return this;
        }

        public AlarmItem setCircle(Alerts.AlertCircleType alertCircleType) {
            this.circle = Optional.e(alertCircleType);
            return this;
        }

        public AlarmItem setCircleExtra(String str) {
            this.circle_extra = Optional.e(str);
            return this;
        }

        public AlarmItem setCircleRule(String str) {
            this.circle_rule = Optional.e(str);
            return this;
        }

        @Required
        public AlarmItem setDatetime(String str) {
            this.datetime = str;
            return this;
        }

        public AlarmItem setDisplay(AlarmDisplay alarmDisplay) {
            this.display = Optional.e(alarmDisplay);
            return this;
        }

        public AlarmItem setEndDatetime(String str) {
            this.end_datetime = Optional.e(str);
            return this;
        }

        public AlarmItem setEvent(String str) {
            this.event = Optional.e(str);
            return this;
        }

        public AlarmItem setExamItemType(Alerts.ExamItemType examItemType) {
            this.exam_item_type = Optional.e(examItemType);
            return this;
        }

        public AlarmItem setIcon(Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        @Required
        public AlarmItem setId(String str) {
            this.id = str;
            return this;
        }

        public AlarmItem setLauncher(Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public AlarmItem setOffset(String str) {
            this.offset = Optional.e(str);
            return this;
        }

        public AlarmItem setReminder(String str) {
            this.reminder = Optional.e(str);
            return this;
        }

        public AlarmItem setRepeatRinging(int i) {
            this.repeat_ringing = Optional.e(Integer.valueOf(i));
            return this;
        }

        public AlarmItem setRingtone(Alerts.Ringtone ringtone) {
            this.ringtone = Optional.e(ringtone);
            return this;
        }

        public AlarmItem setStatus(Alerts.AlertStatus alertStatus) {
            this.status = Optional.e(alertStatus);
            return this;
        }

        public AlarmItem setTarget(LocalTarget localTarget) {
            this.target = Optional.e(localTarget);
            return this;
        }

        public AlarmItem setTimeReminder(String str) {
            this.time_reminder = Optional.e(str);
            return this;
        }

        @Required
        public AlarmItem setType(Alerts.AlertType alertType) {
            this.type = alertType;
            return this;
        }

        public AlarmItem(String str, Alerts.AlertType alertType, String str2) {
            this.id = str;
            this.type = alertType;
            this.datetime = str2;
        }
    }
}
