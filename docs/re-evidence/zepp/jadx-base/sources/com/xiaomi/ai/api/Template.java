package com.xiaomi.ai.api;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.huami.watch.companion.device.config.Features;
import com.huami.watch.dataflow.exchange.Action;
import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class Template {

    @NamespaceName(name = "AIShortcut", namespace = AIApiConstants.Template.NAME)
    public static class AIShortcut implements InstructionPayload {
        private Optional<Image> bg_image = Optional.empty();
        private Optional<AIShortcutColor> color = Optional.empty();

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

        public AIShortcut(String str, String str2, Image image, Nlp.InvokeNlpRequest invokeNlpRequest) {
            this.pkg_name = str;
            this.text = str2;
            this.icon = image;
            this.invoke_nlp_request = invokeNlpRequest;
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
            this.bg_image = Optional.ofNullable(image);
            return this;
        }

        public AIShortcut setColor(AIShortcutColor aIShortcutColor) {
            this.color = Optional.ofNullable(aIShortcutColor);
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
    }

    public static class AIShortcutColor {
        private Optional<String> for_text = Optional.empty();
        private Optional<String> for_bg = Optional.empty();
        private Optional<String> for_border = Optional.empty();
        private Optional<String> for_icon_border = Optional.empty();

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
            this.for_bg = Optional.ofNullable(str);
            return this;
        }

        public AIShortcutColor setForBorder(String str) {
            this.for_border = Optional.ofNullable(str);
            return this;
        }

        public AIShortcutColor setForIconBorder(String str) {
            this.for_icon_border = Optional.ofNullable(str);
            return this;
        }

        public AIShortcutColor setForText(String str) {
            this.for_text = Optional.ofNullable(str);
            return this;
        }
    }

    public static class AbstractItem {

        @Deprecated
        private Optional<String> entity = Optional.empty();

        @Required
        private String k;

        @Required
        private String v;

        public AbstractItem() {
        }

        public AbstractItem(String str, String str2) {
            this.k = str;
            this.v = str2;
        }

        @Deprecated
        public Optional<String> getEntity() {
            return this.entity;
        }

        @Required
        public String getK() {
            return this.k;
        }

        @Required
        public String getV() {
            return this.v;
        }

        @Deprecated
        public AbstractItem setEntity(String str) {
            this.entity = Optional.ofNullable(str);
            return this;
        }

        @Required
        public AbstractItem setK(String str) {
            this.k = str;
            return this;
        }

        @Required
        public AbstractItem setV(String str) {
            this.v = str;
            return this;
        }
    }

    @NamespaceName(name = "AdjustProgress", namespace = AIApiConstants.Template.NAME)
    public static class AdjustProgress implements InstructionPayload {

        @Required
        private Image skill_icon;

        @Required
        private Title title;
        private Optional<Image> left_icon = Optional.empty();
        private Optional<Image> right_icon = Optional.empty();
        private Optional<Launcher> launcher = Optional.empty();
        private Optional<LocalTarget> target = Optional.empty();
        private Optional<CustomBackground> background = Optional.empty();
        private Optional<DisplayCommon> display = Optional.empty();

        public AdjustProgress() {
        }

        public AdjustProgress(Title title, Image image) {
            this.title = title;
            this.skill_icon = image;
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
            this.background = Optional.ofNullable(customBackground);
            return this;
        }

        public AdjustProgress setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.ofNullable(displayCommon);
            return this;
        }

        public AdjustProgress setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        public AdjustProgress setLeftIcon(Image image) {
            this.left_icon = Optional.ofNullable(image);
            return this;
        }

        public AdjustProgress setRightIcon(Image image) {
            this.right_icon = Optional.ofNullable(image);
            return this;
        }

        @Required
        public AdjustProgress setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        public AdjustProgress setTarget(LocalTarget localTarget) {
            this.target = Optional.ofNullable(localTarget);
            return this;
        }

        @Required
        public AdjustProgress setTitle(Title title) {
            this.title = title;
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

    @NamespaceName(name = Features.ALARM, namespace = AIApiConstants.Template.NAME)
    public static class Alarm implements InstructionPayload {

        @Required
        private List<AlarmItem> items;

        @Required
        private AlarmOperation operation;
        private Optional<Image> icon = Optional.empty();
        private Optional<Launcher> launcher = Optional.empty();

        public Alarm() {
        }

        public Alarm(AlarmOperation alarmOperation, List<AlarmItem> list) {
            this.operation = alarmOperation;
            this.items = list;
        }

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

        public Alarm setIcon(Image image) {
            this.icon = Optional.ofNullable(image);
            return this;
        }

        @Required
        public Alarm setItems(List<AlarmItem> list) {
            this.items = list;
            return this;
        }

        public Alarm setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        @Required
        public Alarm setOperation(AlarmOperation alarmOperation) {
            this.operation = alarmOperation;
            return this;
        }
    }

    public static class AlarmDisplay {

        @Required
        private String date;

        @Required
        private String time;
        private Optional<String> weekday = Optional.empty();
        private Optional<String> circle = Optional.empty();

        public AlarmDisplay() {
        }

        public AlarmDisplay(String str, String str2) {
            this.time = str;
            this.date = str2;
        }

        public Optional<String> getCircle() {
            return this.circle;
        }

        @Required
        public String getDate() {
            return this.date;
        }

        @Required
        public String getTime() {
            return this.time;
        }

        public Optional<String> getWeekday() {
            return this.weekday;
        }

        public AlarmDisplay setCircle(String str) {
            this.circle = Optional.ofNullable(str);
            return this;
        }

        @Required
        public AlarmDisplay setDate(String str) {
            this.date = str;
            return this;
        }

        @Required
        public AlarmDisplay setTime(String str) {
            this.time = str;
            return this;
        }

        public AlarmDisplay setWeekday(String str) {
            this.weekday = Optional.ofNullable(str);
            return this;
        }
    }

    public static class AlarmItem {

        @Required
        private String datetime;

        @Required
        private String id;

        @Required
        private Alerts.AlertType type;
        private Optional<Alerts.AlertCircleType> circle = Optional.empty();
        private Optional<String> circle_extra = Optional.empty();
        private Optional<String> event = Optional.empty();
        private Optional<String> reminder = Optional.empty();
        private Optional<Integer> repeat_ringing = Optional.empty();
        private Optional<String> offset = Optional.empty();
        private Optional<Integer> advance_reminder = Optional.empty();
        private Optional<Alerts.Ringtone> ringtone = Optional.empty();
        private Optional<String> time_reminder = Optional.empty();
        private Optional<String> end_datetime = Optional.empty();
        private Optional<AlarmDisplay> display = Optional.empty();
        private Optional<String> circle_rule = Optional.empty();
        private Optional<Alerts.AlertStatus> status = Optional.empty();
        private Optional<LocalTarget> target = Optional.empty();
        private Optional<Launcher> launcher = Optional.empty();
        private Optional<Image> icon = Optional.empty();

        public AlarmItem() {
        }

        public AlarmItem(String str, Alerts.AlertType alertType, String str2) {
            this.id = str;
            this.type = alertType;
            this.datetime = str2;
        }

        public Optional<Integer> getAdvanceReminder() {
            return this.advance_reminder;
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
            this.advance_reminder = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public AlarmItem setCircle(Alerts.AlertCircleType alertCircleType) {
            this.circle = Optional.ofNullable(alertCircleType);
            return this;
        }

        public AlarmItem setCircleExtra(String str) {
            this.circle_extra = Optional.ofNullable(str);
            return this;
        }

        public AlarmItem setCircleRule(String str) {
            this.circle_rule = Optional.ofNullable(str);
            return this;
        }

        @Required
        public AlarmItem setDatetime(String str) {
            this.datetime = str;
            return this;
        }

        public AlarmItem setDisplay(AlarmDisplay alarmDisplay) {
            this.display = Optional.ofNullable(alarmDisplay);
            return this;
        }

        public AlarmItem setEndDatetime(String str) {
            this.end_datetime = Optional.ofNullable(str);
            return this;
        }

        public AlarmItem setEvent(String str) {
            this.event = Optional.ofNullable(str);
            return this;
        }

        public AlarmItem setIcon(Image image) {
            this.icon = Optional.ofNullable(image);
            return this;
        }

        @Required
        public AlarmItem setId(String str) {
            this.id = str;
            return this;
        }

        public AlarmItem setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        public AlarmItem setOffset(String str) {
            this.offset = Optional.ofNullable(str);
            return this;
        }

        public AlarmItem setReminder(String str) {
            this.reminder = Optional.ofNullable(str);
            return this;
        }

        public AlarmItem setRepeatRinging(int i) {
            this.repeat_ringing = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public AlarmItem setRingtone(Alerts.Ringtone ringtone) {
            this.ringtone = Optional.ofNullable(ringtone);
            return this;
        }

        public AlarmItem setStatus(Alerts.AlertStatus alertStatus) {
            this.status = Optional.ofNullable(alertStatus);
            return this;
        }

        public AlarmItem setTarget(LocalTarget localTarget) {
            this.target = Optional.ofNullable(localTarget);
            return this;
        }

        public AlarmItem setTimeReminder(String str) {
            this.time_reminder = Optional.ofNullable(str);
            return this;
        }

        @Required
        public AlarmItem setType(Alerts.AlertType alertType) {
            this.type = alertType;
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
        STOP(7);

        private int id;

        AlarmOperation(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class Align {
        private Optional<String> h_align = Optional.empty();
        private Optional<String> v_align = Optional.empty();

        public Optional<String> getHAlign() {
            return this.h_align;
        }

        public Optional<String> getVAlign() {
            return this.v_align;
        }

        public Align setHAlign(String str) {
            this.h_align = Optional.ofNullable(str);
            return this;
        }

        public Align setVAlign(String str) {
            this.v_align = Optional.ofNullable(str);
            return this;
        }
    }

    @NamespaceName(name = "AncientPoem", namespace = AIApiConstants.Template.NAME)
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

    public static class AncientPoemData {

        @Required
        private String audio_id;

        @Required
        private List<String> authors;

        @Required
        private String dynasty;
        private Optional<String> meaning = Optional.empty();

        @Required
        private String name;

        @Required
        private String verse;

        public AncientPoemData() {
        }

        public AncientPoemData(String str, List<String> list, String str2, String str3, String str4) {
            this.name = str;
            this.authors = list;
            this.verse = str2;
            this.audio_id = str3;
            this.dynasty = str4;
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
            this.meaning = Optional.ofNullable(str);
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
    }

    public static class AndroidApp {

        @Required
        private Image icon;

        @Required
        private String name;

        @Required
        private String pkg_name;
        private Optional<String> slogan = Optional.empty();
        private Optional<String> tag = Optional.empty();
        private Optional<Float> rating_score = Optional.empty();
        private Optional<Integer> apk_size = Optional.empty();
        private Optional<AppVersion> version = Optional.empty();

        public AndroidApp() {
        }

        public AndroidApp(String str, String str2, Image image) {
            this.name = str;
            this.pkg_name = str2;
            this.icon = image;
        }

        public Optional<Integer> getApkSize() {
            return this.apk_size;
        }

        @Required
        public Image getIcon() {
            return this.icon;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public String getPkgName() {
            return this.pkg_name;
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
            this.apk_size = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        @Required
        public AndroidApp setIcon(Image image) {
            this.icon = image;
            return this;
        }

        @Required
        public AndroidApp setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public AndroidApp setPkgName(String str) {
            this.pkg_name = str;
            return this;
        }

        public AndroidApp setRatingScore(float f) {
            this.rating_score = Optional.ofNullable(Float.valueOf(f));
            return this;
        }

        public AndroidApp setSlogan(String str) {
            this.slogan = Optional.ofNullable(str);
            return this;
        }

        public AndroidApp setTag(String str) {
            this.tag = Optional.ofNullable(str);
            return this;
        }

        public AndroidApp setVersion(AppVersion appVersion) {
            this.version = Optional.ofNullable(appVersion);
            return this;
        }
    }

    public static class AndroidIntent {

        @Required
        private String pkg_name;

        @Required
        private String type;

        @Required
        private String uri;
        private Optional<String> permission = Optional.empty();
        private Optional<OnError> on_error = Optional.empty();
        private Optional<Integer> min_version = Optional.empty();
        private Optional<ObjectNode> params = Optional.empty();
        private Optional<CustomBackground> background = Optional.empty();
        private Optional<Task> task = Optional.empty();

        public AndroidIntent() {
        }

        public AndroidIntent(String str, String str2, String str3) {
            this.type = str;
            this.pkg_name = str2;
            this.uri = str3;
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

        public Optional<ObjectNode> getParams() {
            return this.params;
        }

        public Optional<String> getPermission() {
            return this.permission;
        }

        @Required
        public String getPkgName() {
            return this.pkg_name;
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
            this.background = Optional.ofNullable(customBackground);
            return this;
        }

        public AndroidIntent setMinVersion(int i) {
            this.min_version = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public AndroidIntent setOnError(OnError onError) {
            this.on_error = Optional.ofNullable(onError);
            return this;
        }

        public AndroidIntent setParams(ObjectNode objectNode) {
            this.params = Optional.ofNullable(objectNode);
            return this;
        }

        public AndroidIntent setPermission(String str) {
            this.permission = Optional.ofNullable(str);
            return this;
        }

        @Required
        public AndroidIntent setPkgName(String str) {
            this.pkg_name = str;
            return this;
        }

        public AndroidIntent setTask(Task task) {
            this.task = Optional.ofNullable(task);
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
    }

    public static class AndroidKeyCode {

        @Required
        private int key_code;
        private Optional<String> description = Optional.empty();
        private Optional<Task> task = Optional.empty();

        public AndroidKeyCode() {
        }

        public AndroidKeyCode(int i) {
            this.key_code = i;
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
            this.description = Optional.ofNullable(str);
            return this;
        }

        @Required
        public AndroidKeyCode setKeyCode(int i) {
            this.key_code = i;
            return this;
        }

        public AndroidKeyCode setTask(Task task) {
            this.task = Optional.ofNullable(task);
            return this;
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
        private Optional<String> ex = Optional.empty();
        private Optional<String> app_ref = Optional.empty();
        private Optional<String> landing_page_url = Optional.empty();
        private Optional<String> float_card_url = Optional.empty();
        private Optional<String> ai_ex = Optional.empty();
        private Optional<String> deep_link = Optional.empty();

        public AppAds() {
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

        @Required
        public List<String> getViewMonitorUrls() {
            return this.view_monitor_urls;
        }

        @Required
        public boolean isWithAds() {
            return this.with_ads;
        }

        public AppAds setAiEx(String str) {
            this.ai_ex = Optional.ofNullable(str);
            return this;
        }

        public AppAds setAppRef(String str) {
            this.app_ref = Optional.ofNullable(str);
            return this;
        }

        @Required
        public AppAds setClickMonitorUrls(List<String> list) {
            this.click_monitor_urls = list;
            return this;
        }

        public AppAds setDeepLink(String str) {
            this.deep_link = Optional.ofNullable(str);
            return this;
        }

        public AppAds setEx(String str) {
            this.ex = Optional.ofNullable(str);
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
            this.float_card_url = Optional.ofNullable(str);
            return this;
        }

        public AppAds setLandingPageUrl(String str) {
            this.landing_page_url = Optional.ofNullable(str);
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
    }

    public static class AppControl {

        @Required
        private String name;

        @Required
        private String type;
        private Optional<Launcher> launcher = Optional.empty();
        private Optional<String> app_sign = Optional.empty();
        private Optional<String> nonce = Optional.empty();

        public AppControl() {
        }

        public AppControl(String str, String str2) {
            this.type = str;
            this.name = str2;
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
            this.app_sign = Optional.ofNullable(str);
            return this;
        }

        public AppControl setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        @Required
        public AppControl setName(String str) {
            this.name = str;
            return this;
        }

        public AppControl setNonce(String str) {
            this.nonce = Optional.ofNullable(str);
            return this;
        }

        @Required
        public AppControl setType(String str) {
            this.type = str;
            return this;
        }
    }

    public static class AppEntity {
        private Optional<AppAds> ads = Optional.empty();

        @Required
        private AndroidApp app;

        @Required
        private AppControl control;

        public AppEntity() {
        }

        public AppEntity(AndroidApp androidApp, AppControl appControl) {
            this.app = androidApp;
            this.control = appControl;
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

        public AppEntity setAds(AppAds appAds) {
            this.ads = Optional.ofNullable(appAds);
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
    }

    public static class AppVersion {

        @Required
        private int latest;

        @Required
        private int min;

        public AppVersion() {
        }

        public AppVersion(int i, int i2) {
            this.min = i;
            this.latest = i2;
        }

        @Required
        public int getLatest() {
            return this.latest;
        }

        @Required
        public int getMin() {
            return this.min;
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
    }

    @NamespaceName(name = AIApiConstants.Application.NAME, namespace = AIApiConstants.Template.NAME)
    public static class Application implements InstructionPayload {

        @Required
        private List<AppEntity> apps;
        private Optional<CustomBackground> background = Optional.empty();
        private Optional<DisplayCommon> display = Optional.empty();
        private Optional<List<AppEntity>> recommend_apps = Optional.empty();

        @Required
        private Image skill_icon;

        public Application() {
        }

        public Application(Image image, List<AppEntity> list) {
            this.skill_icon = image;
            this.apps = list;
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

        @Required
        public Image getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public Application setApps(List<AppEntity> list) {
            this.apps = list;
            return this;
        }

        public Application setBackground(CustomBackground customBackground) {
            this.background = Optional.ofNullable(customBackground);
            return this;
        }

        public Application setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.ofNullable(displayCommon);
            return this;
        }

        public Application setRecommendApps(List<AppEntity> list) {
            this.recommend_apps = Optional.ofNullable(list);
            return this;
        }

        @Required
        public Application setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }
    }

    public static class ArithRecord {
        private Optional<String> expression = Optional.empty();
        private Optional<String> result_unit = Optional.empty();
        private Optional<String> approximate_value = Optional.empty();
        private Optional<String> value = Optional.empty();

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
            this.approximate_value = Optional.ofNullable(str);
            return this;
        }

        public ArithRecord setExpression(String str) {
            this.expression = Optional.ofNullable(str);
            return this;
        }

        public ArithRecord setResultUnit(String str) {
            this.result_unit = Optional.ofNullable(str);
            return this;
        }

        public ArithRecord setValue(String str) {
            this.value = Optional.ofNullable(str);
            return this;
        }
    }

    @NamespaceName(name = "Attachment", namespace = AIApiConstants.Template.NAME)
    public static class Attachment implements InstructionPayload {

        @Required
        private String id;

        @Required
        private AttachmentType type;
        private Optional<FeedbackAttachment> feedback = Optional.empty();
        private Optional<AdsAttachment> ads = Optional.empty();

        public Attachment() {
        }

        public Attachment(String str, AttachmentType attachmentType) {
            this.id = str;
            this.type = attachmentType;
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
            this.ads = Optional.ofNullable(adsAttachment);
            return this;
        }

        public Attachment setFeedback(FeedbackAttachment feedbackAttachment) {
            this.feedback = Optional.ofNullable(feedbackAttachment);
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
    }

    public enum AttachmentType {
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
        private Optional<String> lyric_url = Optional.empty();
        private Optional<Launcher> launcher = Optional.empty();
        private Optional<Boolean> is_vip = Optional.empty();
        private Optional<Boolean> is_original = Optional.empty();
        private Optional<EntityInfo> entity_info = Optional.empty();
        private Optional<Boolean> payment = Optional.empty();

        public AudioInfo() {
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
            this.entity_info = Optional.ofNullable(entityInfo);
            return this;
        }

        public AudioInfo setIsOriginal(boolean z) {
            this.is_original = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public AudioInfo setIsVip(boolean z) {
            this.is_vip = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public AudioInfo setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        public AudioInfo setLyricUrl(String str) {
            this.lyric_url = Optional.ofNullable(str);
            return this;
        }

        public AudioInfo setPayment(boolean z) {
            this.payment = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }
    }

    public static class AudioProvider {
        private Optional<Launcher> launcher = Optional.empty();

        @Required
        private Image logo;

        @Required
        private String name;

        public AudioProvider() {
        }

        public AudioProvider(String str, Image image) {
            this.name = str;
            this.logo = image;
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
            this.launcher = Optional.ofNullable(launcher);
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
    }

    public static class BackgroundColor {

        @Required
        private List<Integer> colors;
        private Optional<GradientOrientationType> gradient_orientation = Optional.empty();

        @Required
        private BackgroundColorType type;

        public BackgroundColor() {
        }

        public BackgroundColor(BackgroundColorType backgroundColorType, List<Integer> list) {
            this.type = backgroundColorType;
            this.colors = list;
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
            this.gradient_orientation = Optional.ofNullable(gradientOrientationType);
            return this;
        }

        @Required
        public BackgroundColor setType(BackgroundColorType backgroundColorType) {
            this.type = backgroundColorType;
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

    @NamespaceName(name = "BuslineInfo", namespace = AIApiConstants.Template.NAME)
    public static class BuslineInfo implements InstructionPayload {

        @Required
        private String bus_name;

        @Required
        private String current_station;

        @Required
        private List<Maps.Busline> lines;
        private Optional<Image> skill_icon = Optional.empty();
        private Optional<DisplayCommon> display = Optional.empty();

        public BuslineInfo() {
        }

        public BuslineInfo(List<Maps.Busline> list, String str, String str2) {
            this.lines = list;
            this.bus_name = str;
            this.current_station = str2;
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
            this.display = Optional.ofNullable(displayCommon);
            return this;
        }

        @Required
        public BuslineInfo setLines(List<Maps.Busline> list) {
            this.lines = list;
            return this;
        }

        public BuslineInfo setSkillIcon(Image image) {
            this.skill_icon = Optional.ofNullable(image);
            return this;
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

    @NamespaceName(name = "Calculator", namespace = AIApiConstants.Template.NAME)
    public static class Calculator implements InstructionPayload {

        @Required
        private Image skill_icon;
        private Optional<String> expression = Optional.empty();
        private Optional<String> result_unit = Optional.empty();
        private Optional<String> approximate_value = Optional.empty();
        private Optional<String> value = Optional.empty();
        private Optional<List<ArithRecord>> recent_records = Optional.empty();
        private Optional<Launcher> launcher = Optional.empty();
        private Optional<CustomBackground> background = Optional.empty();
        private Optional<DisplayCommon> display = Optional.empty();
        private Optional<CalculatorType> calculator_type = Optional.empty();
        private Optional<String> data_source = Optional.empty();

        public Calculator() {
        }

        public Calculator(Image image) {
            this.skill_icon = image;
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
            this.approximate_value = Optional.ofNullable(str);
            return this;
        }

        public Calculator setBackground(CustomBackground customBackground) {
            this.background = Optional.ofNullable(customBackground);
            return this;
        }

        public Calculator setCalculatorType(CalculatorType calculatorType) {
            this.calculator_type = Optional.ofNullable(calculatorType);
            return this;
        }

        public Calculator setDataSource(String str) {
            this.data_source = Optional.ofNullable(str);
            return this;
        }

        public Calculator setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.ofNullable(displayCommon);
            return this;
        }

        public Calculator setExpression(String str) {
            this.expression = Optional.ofNullable(str);
            return this;
        }

        public Calculator setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        public Calculator setRecentRecords(List<ArithRecord> list) {
            this.recent_records = Optional.ofNullable(list);
            return this;
        }

        public Calculator setResultUnit(String str) {
            this.result_unit = Optional.ofNullable(str);
            return this;
        }

        @Required
        public Calculator setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        public Calculator setValue(String str) {
            this.value = Optional.ofNullable(str);
            return this;
        }
    }

    public enum CalculatorType {
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

    public static class Cineaste {

        @Required
        private Image avatar;

        @Required
        private String id;
        private Optional<String> meta_id = Optional.empty();

        @Required
        private String name;

        public Cineaste() {
        }

        public Cineaste(String str, String str2, Image image) {
            this.name = str;
            this.id = str2;
            this.avatar = image;
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
            this.meta_id = Optional.ofNullable(str);
            return this;
        }

        @Required
        public Cineaste setName(String str) {
            this.name = str;
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

    public static class ClickAlbum {

        @Required
        private List<Image> images;
        private Optional<Launcher> launcher = Optional.empty();

        public ClickAlbum() {
        }

        public ClickAlbum(List<Image> list) {
            this.images = list;
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
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }
    }

    @NamespaceName(name = "ConfirmCancelBox", namespace = AIApiConstants.Template.NAME)
    public static class ConfirmCancelBox implements InstructionPayload {

        @Required
        private String text;
        private Optional<Launcher> confirm = Optional.empty();
        private Optional<Launcher> cancel = Optional.empty();

        public ConfirmCancelBox() {
        }

        public ConfirmCancelBox(String str) {
            this.text = str;
        }

        public Optional<Launcher> getCancel() {
            return this.cancel;
        }

        public Optional<Launcher> getConfirm() {
            return this.confirm;
        }

        @Required
        public String getText() {
            return this.text;
        }

        public ConfirmCancelBox setCancel(Launcher launcher) {
            this.cancel = Optional.ofNullable(launcher);
            return this;
        }

        public ConfirmCancelBox setConfirm(Launcher launcher) {
            this.confirm = Optional.ofNullable(launcher);
            return this;
        }

        @Required
        public ConfirmCancelBox setText(String str) {
            this.text = str;
            return this;
        }
    }

    public static class Course {
        private Optional<String> name = Optional.empty();
        private Optional<String> classroom = Optional.empty();
        private Optional<String> teacher = Optional.empty();
        private Optional<String> time_range = Optional.empty();

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
            this.classroom = Optional.ofNullable(str);
            return this;
        }

        public Course setName(String str) {
            this.name = Optional.ofNullable(str);
            return this;
        }

        public Course setTeacher(String str) {
            this.teacher = Optional.ofNullable(str);
            return this;
        }

        public Course setTimeRange(String str) {
            this.time_range = Optional.ofNullable(str);
            return this;
        }
    }

    @NamespaceName(name = "CourseSchedule", namespace = AIApiConstants.Template.NAME)
    public static class CourseSchedule implements InstructionPayload {
        private Optional<DayCourseSchedule> day_courses = Optional.empty();
        private Optional<List<DayCourseSchedule>> week_courses = Optional.empty();

        public Optional<DayCourseSchedule> getDayCourses() {
            return this.day_courses;
        }

        public Optional<List<DayCourseSchedule>> getWeekCourses() {
            return this.week_courses;
        }

        public CourseSchedule setDayCourses(DayCourseSchedule dayCourseSchedule) {
            this.day_courses = Optional.ofNullable(dayCourseSchedule);
            return this;
        }

        public CourseSchedule setWeekCourses(List<DayCourseSchedule> list) {
            this.week_courses = Optional.ofNullable(list);
            return this;
        }
    }

    public static class CustomBackground {
        private Optional<BackgroundColor> background_color = Optional.empty();

        @Required
        private boolean dark_mode;

        public CustomBackground() {
        }

        public CustomBackground(boolean z) {
            this.dark_mode = z;
        }

        public Optional<BackgroundColor> getBackgroundColor() {
            return this.background_color;
        }

        @Required
        public boolean isDarkMode() {
            return this.dark_mode;
        }

        public CustomBackground setBackgroundColor(BackgroundColor backgroundColor) {
            this.background_color = Optional.ofNullable(backgroundColor);
            return this;
        }

        @Required
        public CustomBackground setDarkMode(boolean z) {
            this.dark_mode = z;
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

    public static class DeviceInfoV1 {

        @Required
        private String category;

        @Required
        private String device_id;
        private Optional<String> room = Optional.empty();

        public DeviceInfoV1() {
        }

        public DeviceInfoV1(String str, String str2) {
            this.device_id = str;
            this.category = str2;
        }

        @Required
        public String getCategory() {
            return this.category;
        }

        @Required
        public String getDeviceId() {
            return this.device_id;
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

        public DeviceInfoV1 setRoom(String str) {
            this.room = Optional.ofNullable(str);
            return this;
        }
    }

    public static class DeviceItem {

        @Required
        private Title title;
        private Optional<DeviceInfoV1> info = Optional.empty();
        private Optional<List<Image>> images = Optional.empty();
        private Optional<Launcher> launcher = Optional.empty();

        public DeviceItem() {
        }

        public DeviceItem(Title title) {
            this.title = title;
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

        @Required
        public Title getTitle() {
            return this.title;
        }

        public DeviceItem setImages(List<Image> list) {
            this.images = Optional.ofNullable(list);
            return this;
        }

        public DeviceItem setInfo(DeviceInfoV1 deviceInfoV1) {
            this.info = Optional.ofNullable(deviceInfoV1);
            return this;
        }

        public DeviceItem setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        @Required
        public DeviceItem setTitle(Title title) {
            this.title = title;
            return this;
        }
    }

    @NamespaceName(name = "DeviceList", namespace = AIApiConstants.Template.NAME)
    public static class DeviceList implements InstructionPayload {

        @Required
        private List<DeviceItem> items;

        @Required
        private boolean show_index;
        private Optional<Image> skill_icon = Optional.empty();
        private Optional<CustomBackground> background = Optional.empty();
        private Optional<DisplayCommon> display = Optional.empty();

        public DeviceList() {
        }

        public DeviceList(List<DeviceItem> list, boolean z) {
            this.items = list;
            this.show_index = z;
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

        @Required
        public boolean isShowIndex() {
            return this.show_index;
        }

        public DeviceList setBackground(CustomBackground customBackground) {
            this.background = Optional.ofNullable(customBackground);
            return this;
        }

        public DeviceList setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.ofNullable(displayCommon);
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
            this.skill_icon = Optional.ofNullable(image);
            return this;
        }
    }

    public static class DictionaryTranslation {
        private Optional<SynonymCardV2> synonym_card = Optional.empty();
        private Optional<FullScreenTemplate.PartSimple> part_simple = Optional.empty();
        private Optional<FullScreenTemplate.WordDetail> word_detail = Optional.empty();
        private Optional<MachineTranslation> word_simple = Optional.empty();

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
            this.part_simple = Optional.ofNullable(partSimple);
            return this;
        }

        public DictionaryTranslation setSynonymCard(SynonymCardV2 synonymCardV2) {
            this.synonym_card = Optional.ofNullable(synonymCardV2);
            return this;
        }

        public DictionaryTranslation setWordDetail(FullScreenTemplate.WordDetail wordDetail) {
            this.word_detail = Optional.ofNullable(wordDetail);
            return this;
        }

        public DictionaryTranslation setWordSimple(MachineTranslation machineTranslation) {
            this.word_simple = Optional.ofNullable(machineTranslation);
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
        private Optional<FullScreen> full_screen = Optional.empty();
        private Optional<DisplayMode> display_mode = Optional.empty();

        @Deprecated
        private Optional<Feedback> feedback = Optional.empty();

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

        public DisplayCommon setDisplayMode(DisplayMode displayMode) {
            this.display_mode = Optional.ofNullable(displayMode);
            return this;
        }

        @Deprecated
        public DisplayCommon setFeedback(Feedback feedback) {
            this.feedback = Optional.ofNullable(feedback);
            return this;
        }

        public DisplayCommon setFullScreen(FullScreen fullScreen) {
            this.full_screen = Optional.ofNullable(fullScreen);
            return this;
        }
    }

    public static class DisplayControl {
        private Optional<Integer> duration = Optional.empty();
        private Optional<DisplayControlType> type = Optional.empty();

        public Optional<Integer> getDuration() {
            return this.duration;
        }

        public Optional<DisplayControlType> getType() {
            return this.type;
        }

        public DisplayControl setDuration(int i) {
            this.duration = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public DisplayControl setType(DisplayControlType displayControlType) {
            this.type = Optional.ofNullable(displayControlType);
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

    @NamespaceName(name = "DynamicDialogFlow", namespace = AIApiConstants.Template.NAME)
    public static class DynamicDialogFlow implements InstructionPayload {

        @Required
        private Image skill_icon;
        private Optional<Title> title = Optional.empty();

        public DynamicDialogFlow() {
        }

        public DynamicDialogFlow(Image image) {
            this.skill_icon = image;
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
            this.title = Optional.ofNullable(title);
            return this;
        }
    }

    public static class EmbeddedList {

        @Required
        private DirectionDef direction;

        @Required
        private List<ListsItem> items;
        private Optional<Title> title = Optional.empty();
        private Optional<Launcher> launcher = Optional.empty();

        public EmbeddedList() {
        }

        public EmbeddedList(List<ListsItem> list, DirectionDef directionDef) {
            this.items = list;
            this.direction = directionDef;
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
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        public EmbeddedList setTitle(Title title) {
            this.title = Optional.ofNullable(title);
            return this;
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

    public static class ErrorDetail {
        private Optional<String> audio_url = Optional.empty();

        @Required
        private String description;

        public ErrorDetail() {
        }

        public ErrorDetail(String str) {
            this.description = str;
        }

        public Optional<String> getAudioUrl() {
            return this.audio_url;
        }

        @Required
        public String getDescription() {
            return this.description;
        }

        public ErrorDetail setAudioUrl(String str) {
            this.audio_url = Optional.ofNullable(str);
            return this;
        }

        @Required
        public ErrorDetail setDescription(String str) {
            this.description = str;
            return this;
        }
    }

    public static class EventRequestInfo {

        @Required
        private String name;

        @Required
        private String namespace;

        public EventRequestInfo() {
        }

        public EventRequestInfo(String str, String str2) {
            this.namespace = str;
            this.name = str2;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public String getNamespace() {
            return this.namespace;
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
    }

    public static class FacilityLocation {
        private Optional<Image> icon = Optional.empty();

        @Required
        private String location;

        public FacilityLocation() {
        }

        public FacilityLocation(String str) {
            this.location = str;
        }

        public Optional<Image> getIcon() {
            return this.icon;
        }

        @Required
        public String getLocation() {
            return this.location;
        }

        public FacilityLocation setIcon(Image image) {
            this.icon = Optional.ofNullable(image);
            return this;
        }

        @Required
        public FacilityLocation setLocation(String str) {
            this.location = str;
            return this;
        }
    }

    public static class FacilityTime {
        private Optional<Image> icon = Optional.empty();

        @Required
        private String time;

        public FacilityTime() {
        }

        public FacilityTime(String str) {
            this.time = str;
        }

        public Optional<Image> getIcon() {
            return this.icon;
        }

        @Required
        public String getTime() {
            return this.time;
        }

        public FacilityTime setIcon(Image image) {
            this.icon = Optional.ofNullable(image);
            return this;
        }

        @Required
        public FacilityTime setTime(String str) {
            this.time = str;
            return this;
        }
    }

    public static class Feedback {

        @Required
        private String like_text;

        @Required
        private String prompt_text;

        @Required
        private String unlike_text;
        private Optional<String> like_response_text = Optional.empty();
        private Optional<String> unlike_response_text = Optional.empty();

        public Feedback() {
        }

        public Feedback(String str, String str2, String str3) {
            this.prompt_text = str;
            this.like_text = str2;
            this.unlike_text = str3;
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
            this.like_response_text = Optional.ofNullable(str);
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
            this.unlike_response_text = Optional.ofNullable(str);
            return this;
        }

        @Required
        public Feedback setUnlikeText(String str) {
            this.unlike_text = str;
            return this;
        }
    }

    public static class FeedbackAttachment {

        @Required
        private String dislike_response;

        @Required
        private String like;

        @Required
        private String prompt;
        private Optional<String> dislike = Optional.empty();
        private Optional<String> like_response = Optional.empty();
        private Optional<List<String>> dislike_reasons = Optional.empty();

        public FeedbackAttachment() {
        }

        public FeedbackAttachment(String str, String str2, String str3) {
            this.prompt = str;
            this.like = str2;
            this.dislike_response = str3;
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
            this.dislike = Optional.ofNullable(str);
            return this;
        }

        public FeedbackAttachment setDislikeReasons(List<String> list) {
            this.dislike_reasons = Optional.ofNullable(list);
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
            this.like_response = Optional.ofNullable(str);
            return this;
        }

        @Required
        public FeedbackAttachment setPrompt(String str) {
            this.prompt = str;
            return this;
        }
    }

    @NamespaceName(name = "ForeignDictionary", namespace = AIApiConstants.Template.NAME)
    public static class ForeignDictionary implements InstructionPayload {

        @Required
        private String description;
        private Optional<List<ForeignDictionaryWordTranslations>> word_translations = Optional.empty();

        public ForeignDictionary() {
        }

        public ForeignDictionary(String str) {
            this.description = str;
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
            this.word_translations = Optional.ofNullable(list);
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

    public static class ForeignDictionaryWord {

        @Required
        private String word_name;
        private Optional<String> word_audio_url = Optional.empty();
        private Optional<List<String>> speech_interpretations = Optional.empty();

        public ForeignDictionaryWord() {
        }

        public ForeignDictionaryWord(String str) {
            this.word_name = str;
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
            this.speech_interpretations = Optional.ofNullable(list);
            return this;
        }

        public ForeignDictionaryWord setWordAudioUrl(String str) {
            this.word_audio_url = Optional.ofNullable(str);
            return this;
        }

        @Required
        public ForeignDictionaryWord setWordName(String str) {
            this.word_name = str;
            return this;
        }
    }

    public static class ForeignDictionaryWordTranslations {
        private Optional<ForeignDictionaryExampleSentence> example_sentence = Optional.empty();

        @Required
        private ForeignDictionaryWord word;

        public ForeignDictionaryWordTranslations() {
        }

        public ForeignDictionaryWordTranslations(ForeignDictionaryWord foreignDictionaryWord) {
            this.word = foreignDictionaryWord;
        }

        public Optional<ForeignDictionaryExampleSentence> getExampleSentence() {
            return this.example_sentence;
        }

        @Required
        public ForeignDictionaryWord getWord() {
            return this.word;
        }

        public ForeignDictionaryWordTranslations setExampleSentence(ForeignDictionaryExampleSentence foreignDictionaryExampleSentence) {
            this.example_sentence = Optional.ofNullable(foreignDictionaryExampleSentence);
            return this;
        }

        @Required
        public ForeignDictionaryWordTranslations setWord(ForeignDictionaryWord foreignDictionaryWord) {
            this.word = foreignDictionaryWord;
            return this;
        }
    }

    public static class FullScreen {
        private Optional<Launcher> action = Optional.empty();
        private Optional<String> task = Optional.empty();
        private Optional<List<ListsItem>> more_items = Optional.empty();

        public Optional<Launcher> getAction() {
            return this.action;
        }

        public Optional<List<ListsItem>> getMoreItems() {
            return this.more_items;
        }

        public Optional<String> getTask() {
            return this.task;
        }

        public FullScreen setAction(Launcher launcher) {
            this.action = Optional.ofNullable(launcher);
            return this;
        }

        public FullScreen setMoreItems(List<ListsItem> list) {
            this.more_items = Optional.ofNullable(list);
            return this;
        }

        public FullScreen setTask(String str) {
            this.task = Optional.ofNullable(str);
            return this;
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
        private Optional<Launcher> launcher = Optional.empty();
        private Optional<List<AbstractItem>> abstracts = Optional.empty();
        private Optional<GeneralDisplayType> type = Optional.empty();
        private Optional<CustomBackground> background = Optional.empty();
        private Optional<DisplayCommon> display = Optional.empty();
        private Optional<GeneralUIType> ui_type = Optional.empty();

        public General() {
        }

        public General(Title title, String str, Image image, List<Image> list) {
            this.title = title;
            this.text = str;
            this.skill_icon = image;
            this.images = list;
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
            this.abstracts = Optional.ofNullable(list);
            return this;
        }

        public General setBackground(CustomBackground customBackground) {
            this.background = Optional.ofNullable(customBackground);
            return this;
        }

        public General setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.ofNullable(displayCommon);
            return this;
        }

        @Required
        public General setImages(List<Image> list) {
            this.images = list;
            return this;
        }

        public General setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
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
            this.type = Optional.ofNullable(generalDisplayType);
            return this;
        }

        public General setUiType(GeneralUIType generalUIType) {
            this.ui_type = Optional.ofNullable(generalUIType);
            return this;
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
        private Optional<Launcher> launcher = Optional.empty();
        private Optional<CustomBackground> background = Optional.empty();
        private Optional<DisplayCommon> display = Optional.empty();
        private Optional<String> specification = Optional.empty();

        public General2() {
        }

        public General2(RichText richText, List<RichText> list, List<RichText> list2, Image image) {
            this.main_title = richText;
            this.sub_titles = list;
            this.texts = list2;
            this.skill_icon = image;
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
            this.background = Optional.ofNullable(customBackground);
            return this;
        }

        public General2 setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.ofNullable(displayCommon);
            return this;
        }

        public General2 setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
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
            this.specification = Optional.ofNullable(str);
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
    }

    public enum GeneralDisplayType {
        UNKNOWN(-1),
        BILLBOARD(0),
        MULTI_IMAGE_1(1),
        MULTI_IMAGE_2(2);

        private int id;

        GeneralDisplayType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum GeneralUIType {
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

    @NamespaceName(name = "H5Page", namespace = AIApiConstants.Template.NAME)
    public static class H5Page implements InstructionPayload {

        @Required
        private ErrorDetail error_prompt;

        @Required
        private H5PageLoadType load_type;

        @Required
        private ObjectNode param;

        @Required
        private H5ParamType param_type;

        @Required
        private Image skill_icon;

        @Required
        private int timeout_in_milli;
        private Optional<String> load_url = Optional.empty();
        private Optional<String> load_html = Optional.empty();
        private Optional<DisplayCommon> display = Optional.empty();
        private Optional<Common.MultiExecutionSequences> secondaries = Optional.empty();
        private Optional<H5PageExtraData> extra_data = Optional.empty();
        private Optional<Boolean> all_ui_h5 = Optional.empty();
        private Optional<H5PageSource> source = Optional.empty();
        private Optional<Boolean> reback = Optional.empty();

        public H5Page() {
        }

        public H5Page(H5PageLoadType h5PageLoadType, int i, ErrorDetail errorDetail, Image image, ObjectNode objectNode, H5ParamType h5ParamType) {
            this.load_type = h5PageLoadType;
            this.timeout_in_milli = i;
            this.error_prompt = errorDetail;
            this.skill_icon = image;
            this.param = objectNode;
            this.param_type = h5ParamType;
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
        public ObjectNode getParam() {
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

        public Optional<Boolean> isReback() {
            return this.reback;
        }

        public H5Page setAllUiH5(boolean z) {
            this.all_ui_h5 = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public H5Page setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.ofNullable(displayCommon);
            return this;
        }

        @Required
        public H5Page setErrorPrompt(ErrorDetail errorDetail) {
            this.error_prompt = errorDetail;
            return this;
        }

        public H5Page setExtraData(H5PageExtraData h5PageExtraData) {
            this.extra_data = Optional.ofNullable(h5PageExtraData);
            return this;
        }

        public H5Page setLoadHtml(String str) {
            this.load_html = Optional.ofNullable(str);
            return this;
        }

        @Required
        public H5Page setLoadType(H5PageLoadType h5PageLoadType) {
            this.load_type = h5PageLoadType;
            return this;
        }

        public H5Page setLoadUrl(String str) {
            this.load_url = Optional.ofNullable(str);
            return this;
        }

        @Required
        public H5Page setParam(ObjectNode objectNode) {
            this.param = objectNode;
            return this;
        }

        @Required
        public H5Page setParamType(H5ParamType h5ParamType) {
            this.param_type = h5ParamType;
            return this;
        }

        public H5Page setReback(boolean z) {
            this.reback = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public H5Page setSecondaries(Common.MultiExecutionSequences multiExecutionSequences) {
            this.secondaries = Optional.ofNullable(multiExecutionSequences);
            return this;
        }

        @Required
        public H5Page setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        public H5Page setSource(H5PageSource h5PageSource) {
            this.source = Optional.ofNullable(h5PageSource);
            return this;
        }

        @Required
        public H5Page setTimeoutInMilli(int i) {
            this.timeout_in_milli = i;
            return this;
        }
    }

    public static class H5PageExtraData {
        private Optional<String> query = Optional.empty();
        private Optional<String> text = Optional.empty();
        private Optional<String> to_speak = Optional.empty();

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
            this.query = Optional.ofNullable(str);
            return this;
        }

        public H5PageExtraData setText(String str) {
            this.text = Optional.ofNullable(str);
            return this;
        }

        public H5PageExtraData setToSpeak(String str) {
            this.to_speak = Optional.ofNullable(str);
            return this;
        }
    }

    public enum H5PageLoadType {
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
        TRANSLATION_V3(14);

        private int id;

        H5ParamType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "H5RefreshCard", namespace = AIApiConstants.Template.NAME)
    public static class H5RefreshCard implements InstructionPayload {
        private Optional<H5PageExtraData> extra_data = Optional.empty();

        @Required
        private ObjectNode param;

        @Required
        private H5ParamType param_type;

        public H5RefreshCard() {
        }

        public H5RefreshCard(H5ParamType h5ParamType, ObjectNode objectNode) {
            this.param_type = h5ParamType;
            this.param = objectNode;
        }

        public Optional<H5PageExtraData> getExtraData() {
            return this.extra_data;
        }

        @Required
        public ObjectNode getParam() {
            return this.param;
        }

        @Required
        public H5ParamType getParamType() {
            return this.param_type;
        }

        public H5RefreshCard setExtraData(H5PageExtraData h5PageExtraData) {
            this.extra_data = Optional.ofNullable(h5PageExtraData);
            return this;
        }

        @Required
        public H5RefreshCard setParam(ObjectNode objectNode) {
            this.param = objectNode;
            return this;
        }

        @Required
        public H5RefreshCard setParamType(H5ParamType h5ParamType) {
            this.param_type = h5ParamType;
            return this;
        }
    }

    @NamespaceName(name = "Help", namespace = AIApiConstants.Template.NAME)
    public static class Help implements InstructionPayload {
    }

    public static class Image {

        @Required
        private String description;

        @Required
        private List<ImageSource> sources;

        public Image() {
        }

        public Image(String str, List<ImageSource> list) {
            this.description = str;
            this.sources = list;
        }

        @Required
        public String getDescription() {
            return this.description;
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

        @Required
        public Image setSources(List<ImageSource> list) {
            this.sources = list;
            return this;
        }
    }

    @NamespaceName(name = "ImageCard", namespace = AIApiConstants.Template.NAME)
    public static class ImageCard implements InstructionPayload {

        @Required
        private Image image;
        private Optional<Title> title = Optional.empty();
        private Optional<Integer> duration = Optional.empty();

        public ImageCard() {
        }

        public ImageCard(Image image) {
            this.image = image;
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
            this.duration = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        @Required
        public ImageCard setImage(Image image) {
            this.image = image;
            return this;
        }

        public ImageCard setTitle(Title title) {
            this.title = Optional.ofNullable(title);
            return this;
        }
    }

    public static class ImageSource {

        @Required
        private String url;
        private Optional<Integer> id = Optional.empty();
        private Optional<String> bg_url = Optional.empty();
        private Optional<String> size = Optional.empty();
        private Optional<Integer> width = Optional.empty();
        private Optional<Integer> height = Optional.empty();
        private Optional<Boolean> authentication = Optional.empty();
        private Optional<String> token = Optional.empty();
        private Optional<String> md5 = Optional.empty();

        public ImageSource() {
        }

        public ImageSource(String str) {
            this.url = str;
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
            this.authentication = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public ImageSource setBgUrl(String str) {
            this.bg_url = Optional.ofNullable(str);
            return this;
        }

        public ImageSource setHeight(int i) {
            this.height = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public ImageSource setId(int i) {
            this.id = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public ImageSource setMd5(String str) {
            this.md5 = Optional.ofNullable(str);
            return this;
        }

        public ImageSource setSize(String str) {
            this.size = Optional.ofNullable(str);
            return this;
        }

        public ImageSource setToken(String str) {
            this.token = Optional.ofNullable(str);
            return this;
        }

        @Required
        public ImageSource setUrl(String str) {
            this.url = str;
            return this;
        }

        public ImageSource setWidth(int i) {
            this.width = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }
    }

    public static class JumpItem {
        private Optional<Title> title = Optional.empty();
        private Optional<Image> icon = Optional.empty();
        private Optional<Launcher> launcher = Optional.empty();

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
            this.icon = Optional.ofNullable(image);
            return this;
        }

        public JumpItem setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        public JumpItem setTitle(Title title) {
            this.title = Optional.ofNullable(title);
            return this;
        }
    }

    @NamespaceName(name = "Knowledge", namespace = AIApiConstants.Template.NAME)
    public static class Knowledge implements EventPayload {
        private Optional<Integer> count = Optional.empty();

        @Required
        private KnowledgeType type;

        public Knowledge() {
        }

        public Knowledge(KnowledgeType knowledgeType) {
            this.type = knowledgeType;
        }

        public Optional<Integer> getCount() {
            return this.count;
        }

        @Required
        public KnowledgeType getType() {
            return this.type;
        }

        public Knowledge setCount(int i) {
            this.count = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        @Required
        public Knowledge setType(KnowledgeType knowledgeType) {
            this.type = knowledgeType;
            return this;
        }
    }

    @NamespaceName(name = "KnowledgeInfo", namespace = AIApiConstants.Template.NAME)
    public static class KnowledgeInfo implements InstructionPayload {

        @Required
        private List<KnowledgeItem> items;
        private Optional<Image> skill_icon = Optional.empty();

        public KnowledgeInfo() {
        }

        public KnowledgeInfo(List<KnowledgeItem> list) {
            this.items = list;
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
            this.skill_icon = Optional.ofNullable(image);
            return this;
        }
    }

    public static class KnowledgeItem {

        @Required
        private String query;

        @Required
        private KnowledgeType type;
        private Optional<String> name = Optional.empty();
        private Optional<String> property = Optional.empty();
        private Optional<String> summary = Optional.empty();
        private Optional<Image> image = Optional.empty();

        public KnowledgeItem() {
        }

        public KnowledgeItem(KnowledgeType knowledgeType, String str) {
            this.type = knowledgeType;
            this.query = str;
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
            this.image = Optional.ofNullable(image);
            return this;
        }

        public KnowledgeItem setName(String str) {
            this.name = Optional.ofNullable(str);
            return this;
        }

        public KnowledgeItem setProperty(String str) {
            this.property = Optional.ofNullable(str);
            return this;
        }

        @Required
        public KnowledgeItem setQuery(String str) {
            this.query = str;
            return this;
        }

        public KnowledgeItem setSummary(String str) {
            this.summary = Optional.ofNullable(str);
            return this;
        }

        @Required
        public KnowledgeItem setType(KnowledgeType knowledgeType) {
            this.type = knowledgeType;
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

    public static class Launcher {
        private Optional<String> url = Optional.empty();
        private Optional<AndroidIntent> intent = Optional.empty();
        private Optional<QuickAppLaunchInfo> quick_app = Optional.empty();
        private Optional<Nlp.InvokeNlpRequest> next_request = Optional.empty();
        private Optional<Common.GeneralQuickAppInfo> general_quick_app = Optional.empty();
        private Optional<ArrayNode> instructions = Optional.empty();
        private Optional<EventRequestInfo> event = Optional.empty();

        public Optional<EventRequestInfo> getEvent() {
            return this.event;
        }

        public Optional<Common.GeneralQuickAppInfo> getGeneralQuickApp() {
            return this.general_quick_app;
        }

        public Optional<ArrayNode> getInstructions() {
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
            this.event = Optional.ofNullable(eventRequestInfo);
            return this;
        }

        public Launcher setGeneralQuickApp(Common.GeneralQuickAppInfo generalQuickAppInfo) {
            this.general_quick_app = Optional.ofNullable(generalQuickAppInfo);
            return this;
        }

        public Launcher setInstructions(ArrayNode arrayNode) {
            this.instructions = Optional.ofNullable(arrayNode);
            return this;
        }

        public Launcher setIntent(AndroidIntent androidIntent) {
            this.intent = Optional.ofNullable(androidIntent);
            return this;
        }

        public Launcher setNextRequest(Nlp.InvokeNlpRequest invokeNlpRequest) {
            this.next_request = Optional.ofNullable(invokeNlpRequest);
            return this;
        }

        public Launcher setQuickApp(QuickAppLaunchInfo quickAppLaunchInfo) {
            this.quick_app = Optional.ofNullable(quickAppLaunchInfo);
            return this;
        }

        public Launcher setUrl(String str) {
            this.url = Optional.ofNullable(str);
            return this;
        }
    }

    @NamespaceName(name = "Lists", namespace = AIApiConstants.Template.NAME)
    public static class Lists implements InstructionPayload {

        @Required
        private List<ListsItem> items;

        @Required
        private Image skill_icon;
        private Optional<Title> title = Optional.empty();
        private Optional<ListsMoreItem> more = Optional.empty();
        private Optional<ListsItemDisplayType> item_display_type = Optional.empty();
        private Optional<CustomBackground> background = Optional.empty();
        private Optional<DisplayCommon> display = Optional.empty();
        private Optional<ListsType> type = Optional.empty();

        public Lists() {
        }

        public Lists(Image image, List<ListsItem> list) {
            this.skill_icon = image;
            this.items = list;
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
            this.background = Optional.ofNullable(customBackground);
            return this;
        }

        public Lists setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.ofNullable(displayCommon);
            return this;
        }

        public Lists setItemDisplayType(ListsItemDisplayType listsItemDisplayType) {
            this.item_display_type = Optional.ofNullable(listsItemDisplayType);
            return this;
        }

        @Required
        public Lists setItems(List<ListsItem> list) {
            this.items = list;
            return this;
        }

        public Lists setMore(ListsMoreItem listsMoreItem) {
            this.more = Optional.ofNullable(listsMoreItem);
            return this;
        }

        @Required
        public Lists setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        public Lists setTitle(Title title) {
            this.title = Optional.ofNullable(title);
            return this;
        }

        public Lists setType(ListsType listsType) {
            this.type = Optional.ofNullable(listsType);
            return this;
        }
    }

    public static class ListsDetail {

        @Required
        private Image skill_icon;

        @Required
        private Title title;
        private Optional<Launcher> launcher = Optional.empty();
        private Optional<List<Lists>> abstracts = Optional.empty();

        public ListsDetail() {
        }

        public ListsDetail(Title title, Image image) {
            this.title = title;
            this.skill_icon = image;
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
            this.abstracts = Optional.ofNullable(list);
            return this;
        }

        public ListsDetail setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
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
    }

    public static class ListsItem {

        @Required
        private List<Image> images;
        private Optional<Launcher> launcher = Optional.empty();
        private Optional<Image> skill_icon = Optional.empty();
        private Optional<List<ListsSubItem>> sub_items = Optional.empty();

        @Required
        private String text;

        @Required
        private Title title;

        public ListsItem() {
        }

        public ListsItem(Title title, String str, List<Image> list) {
            this.title = title;
            this.text = str;
            this.images = list;
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
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        public ListsItem setSkillIcon(Image image) {
            this.skill_icon = Optional.ofNullable(image);
            return this;
        }

        public ListsItem setSubItems(List<ListsSubItem> list) {
            this.sub_items = Optional.ofNullable(list);
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

    public static class ListsSubItem {
        private Optional<List<Image>> images = Optional.empty();
        private Optional<Launcher> launcher = Optional.empty();
        private Optional<Image> skill_icon = Optional.empty();

        @Required
        private String text;

        @Required
        private Title title;

        public ListsSubItem() {
        }

        public ListsSubItem(Title title, String str) {
            this.title = title;
            this.text = str;
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
            this.images = Optional.ofNullable(list);
            return this;
        }

        public ListsSubItem setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        public ListsSubItem setSkillIcon(Image image) {
            this.skill_icon = Optional.ofNullable(image);
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
    }

    public enum ListsType {
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

    public static class LocalTarget {
        private Optional<String> identifier = Optional.empty();

        @Required
        private String name;

        public LocalTarget() {
        }

        public LocalTarget(String str) {
            this.name = str;
        }

        public Optional<String> getIdentifier() {
            return this.identifier;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public LocalTarget setIdentifier(String str) {
            this.identifier = Optional.ofNullable(str);
            return this;
        }

        @Required
        public LocalTarget setName(String str) {
            this.name = str;
            return this;
        }
    }

    public static class MachineTranslation {

        @Required
        private String trans_text;

        @Required
        private String trans_text_audio_url;
        private Optional<String> word_meaning = Optional.empty();
        private Optional<String> ph_symbol = Optional.empty();

        public MachineTranslation() {
        }

        public MachineTranslation(String str, String str2) {
            this.trans_text = str;
            this.trans_text_audio_url = str2;
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
            this.ph_symbol = Optional.ofNullable(str);
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
            this.word_meaning = Optional.ofNullable(str);
            return this;
        }
    }

    public static class Match {
        private Optional<Button> button_link = Optional.empty();
        private Optional<MoreLink> more_link = Optional.empty();
        private Optional<PredictRate> predict_rate = Optional.empty();

        @Required
        private MatchSchedule schedule;

        @Required
        private Title title;

        public Match() {
        }

        public Match(Title title, MatchSchedule matchSchedule) {
            this.title = title;
            this.schedule = matchSchedule;
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
            this.button_link = Optional.ofNullable(button);
            return this;
        }

        public Match setMoreLink(MoreLink moreLink) {
            this.more_link = Optional.ofNullable(moreLink);
            return this;
        }

        public Match setPredictRate(PredictRate predictRate) {
            this.predict_rate = Optional.ofNullable(predictRate);
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
    }

    public static class MatchSchedule {

        @Required
        private Team team1;

        @Required
        private Team team2;
        private Optional<String> status = Optional.empty();
        private Optional<String> score = Optional.empty();
        private Optional<Launcher> launcher = Optional.empty();

        public MatchSchedule() {
        }

        public MatchSchedule(Team team, Team team2) {
            this.team1 = team;
            this.team2 = team2;
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
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        public MatchSchedule setScore(String str) {
            this.score = Optional.ofNullable(str);
            return this;
        }

        public MatchSchedule setStatus(String str) {
            this.status = Optional.ofNullable(str);
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
    }

    @NamespaceName(name = "MatchUp", namespace = AIApiConstants.Template.NAME)
    public static class MatchUp implements InstructionPayload {

        @Required
        private List<Match> data;

        @Required
        private Image skill_icon;
        private Optional<CustomBackground> background = Optional.empty();
        private Optional<DisplayCommon> display = Optional.empty();

        public MatchUp() {
        }

        public MatchUp(List<Match> list, Image image) {
            this.data = list;
            this.skill_icon = image;
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
            this.background = Optional.ofNullable(customBackground);
            return this;
        }

        @Required
        public MatchUp setData(List<Match> list) {
            this.data = list;
            return this;
        }

        public MatchUp setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.ofNullable(displayCommon);
            return this;
        }

        @Required
        public MatchUp setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }
    }

    @NamespaceName(name = AIApiConstants.Memo.NAME, namespace = AIApiConstants.Template.NAME)
    public static class Memo implements InstructionPayload {
        private Optional<CustomBackground> background = Optional.empty();
        private Optional<DisplayCommon> display = Optional.empty();

        @Required
        private List<MemoItem> items;

        @Required
        private Image skill_icon;

        @Required
        private Title title;

        public Memo() {
        }

        public Memo(Title title, Image image, List<MemoItem> list) {
            this.title = title;
            this.skill_icon = image;
            this.items = list;
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
            this.background = Optional.ofNullable(customBackground);
            return this;
        }

        public Memo setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.ofNullable(displayCommon);
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
    }

    public static class MemoItem {

        @Required
        private String item_id;

        @Required
        private String text;
        private Optional<AudioPlayer.Stream> audio = Optional.empty();
        private Optional<Image> image = Optional.empty();
        private Optional<Long> create_time = Optional.empty();

        public MemoItem() {
        }

        public MemoItem(String str, String str2) {
            this.item_id = str;
            this.text = str2;
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
            this.audio = Optional.ofNullable(stream);
            return this;
        }

        public MemoItem setCreateTime(long j) {
            this.create_time = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public MemoItem setImage(Image image) {
            this.image = Optional.ofNullable(image);
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

    @NamespaceName(name = "Music", namespace = AIApiConstants.Template.NAME)
    public static class Music implements InstructionPayload {

        @Required
        private List<MusicEntity> group;
        private Optional<Launcher> launcher = Optional.empty();
        private Optional<String> loop_mode = Optional.empty();
        private Optional<Title> title = Optional.empty();
        private Optional<CustomBackground> background = Optional.empty();
        private Optional<QueryType> query_type = Optional.empty();
        private Optional<DisplayCommon> display = Optional.empty();
        private Optional<Common.MultiExecutionSequences> secondaries = Optional.empty();

        public Music() {
        }

        public Music(List<MusicEntity> list) {
            this.group = list;
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
            this.background = Optional.ofNullable(customBackground);
            return this;
        }

        public Music setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.ofNullable(displayCommon);
            return this;
        }

        @Required
        public Music setGroup(List<MusicEntity> list) {
            this.group = list;
            return this;
        }

        public Music setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        public Music setLoopMode(String str) {
            this.loop_mode = Optional.ofNullable(str);
            return this;
        }

        public Music setQueryType(QueryType queryType) {
            this.query_type = Optional.ofNullable(queryType);
            return this;
        }

        public Music setSecondaries(Common.MultiExecutionSequences multiExecutionSequences) {
            this.secondaries = Optional.ofNullable(multiExecutionSequences);
            return this;
        }

        public Music setTitle(Title title) {
            this.title = Optional.ofNullable(title);
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
        private ObjectNode result;

        public OralExamination() {
        }

        public OralExamination(ObjectNode objectNode) {
            this.result = objectNode;
        }

        @Required
        public ObjectNode getResult() {
            return this.result;
        }

        @Required
        public OralExamination setResult(ObjectNode objectNode) {
            this.result = objectNode;
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

    @NamespaceName(name = "PlayInfo", namespace = AIApiConstants.Template.NAME)
    public static class PlayInfo implements InstructionPayload {

        @Required
        private List<PlayInfoItem> items;
        private Optional<Image> skill_icon = Optional.empty();
        private Optional<DisplayControl> display_control = Optional.empty();
        private Optional<Launcher> launcher = Optional.empty();
        private Optional<PlayInfoItemDisplayType> display_type = Optional.empty();
        private Optional<AudioPlayer.PlayBehavior> play_behavior = Optional.empty();
        private Optional<PlayInfoType> type = Optional.empty();
        private Optional<CustomBackground> background = Optional.empty();
        private Optional<DisplayCommon> display = Optional.empty();
        private Optional<String> cp = Optional.empty();

        public PlayInfo() {
        }

        public PlayInfo(List<PlayInfoItem> list) {
            this.items = list;
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
            this.background = Optional.ofNullable(customBackground);
            return this;
        }

        public PlayInfo setCp(String str) {
            this.cp = Optional.ofNullable(str);
            return this;
        }

        public PlayInfo setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.ofNullable(displayCommon);
            return this;
        }

        public PlayInfo setDisplayControl(DisplayControl displayControl) {
            this.display_control = Optional.ofNullable(displayControl);
            return this;
        }

        public PlayInfo setDisplayType(PlayInfoItemDisplayType playInfoItemDisplayType) {
            this.display_type = Optional.ofNullable(playInfoItemDisplayType);
            return this;
        }

        @Required
        public PlayInfo setItems(List<PlayInfoItem> list) {
            this.items = list;
            return this;
        }

        public PlayInfo setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        public PlayInfo setPlayBehavior(AudioPlayer.PlayBehavior playBehavior) {
            this.play_behavior = Optional.ofNullable(playBehavior);
            return this;
        }

        public PlayInfo setSkillIcon(Image image) {
            this.skill_icon = Optional.ofNullable(image);
            return this;
        }

        public PlayInfo setType(PlayInfoType playInfoType) {
            this.type = Optional.ofNullable(playInfoType);
            return this;
        }
    }

    public static class PlayInfoItem {

        @Required
        private String audio_id;

        @Required
        private List<String> controls;

        @Required
        private Title title;
        private Optional<Integer> duration_in_ms = Optional.empty();
        private Optional<Image> cover = Optional.empty();
        private Optional<PlayInfoItemProvider> provider = Optional.empty();
        private Optional<String> text = Optional.empty();
        private Optional<Common.AudioType> audio_type = Optional.empty();
        private Optional<String> lyric_uri = Optional.empty();

        @Deprecated
        private Optional<String> mv_id = Optional.empty();
        private Optional<Launcher> launcher = Optional.empty();
        private Optional<AudioPlayer.Stream> mv_stream = Optional.empty();
        private Optional<Boolean> is_vip = Optional.empty();
        private Optional<Boolean> payment = Optional.empty();

        public PlayInfoItem() {
        }

        public PlayInfoItem(String str, List<String> list, Title title) {
            this.audio_id = str;
            this.controls = list;
            this.title = title;
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
            this.audio_type = Optional.ofNullable(audioType);
            return this;
        }

        @Required
        public PlayInfoItem setControls(List<String> list) {
            this.controls = list;
            return this;
        }

        public PlayInfoItem setCover(Image image) {
            this.cover = Optional.ofNullable(image);
            return this;
        }

        public PlayInfoItem setDurationInMs(int i) {
            this.duration_in_ms = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public PlayInfoItem setIsVip(boolean z) {
            this.is_vip = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public PlayInfoItem setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        public PlayInfoItem setLyricUri(String str) {
            this.lyric_uri = Optional.ofNullable(str);
            return this;
        }

        @Deprecated
        public PlayInfoItem setMvId(String str) {
            this.mv_id = Optional.ofNullable(str);
            return this;
        }

        public PlayInfoItem setMvStream(AudioPlayer.Stream stream) {
            this.mv_stream = Optional.ofNullable(stream);
            return this;
        }

        public PlayInfoItem setPayment(boolean z) {
            this.payment = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public PlayInfoItem setProvider(PlayInfoItemProvider playInfoItemProvider) {
            this.provider = Optional.ofNullable(playInfoItemProvider);
            return this;
        }

        public PlayInfoItem setText(String str) {
            this.text = Optional.ofNullable(str);
            return this;
        }

        @Required
        public PlayInfoItem setTitle(Title title) {
            this.title = title;
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

    public static class PlayInfoItemProvider {
        private Optional<Image> logo = Optional.empty();

        @Required
        private String name;

        public PlayInfoItemProvider() {
        }

        public PlayInfoItemProvider(String str) {
            this.name = str;
        }

        public Optional<Image> getLogo() {
            return this.logo;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public PlayInfoItemProvider setLogo(Image image) {
            this.logo = Optional.ofNullable(image);
            return this;
        }

        @Required
        public PlayInfoItemProvider setName(String str) {
            this.name = str;
            return this;
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

    @NamespaceName(name = "PlayTTS", namespace = AIApiConstants.Template.NAME)
    public static class PlayTTS implements InstructionPayload {
        private Optional<CustomBackground> background = Optional.empty();
        private Optional<DisplayCommon> display = Optional.empty();

        @Required
        private List<PlayTTSItem> items;

        @Required
        private Image skill_icon;

        public PlayTTS() {
        }

        public PlayTTS(List<PlayTTSItem> list, Image image) {
            this.items = list;
            this.skill_icon = image;
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
            this.background = Optional.ofNullable(customBackground);
            return this;
        }

        public PlayTTS setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.ofNullable(displayCommon);
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
    }

    public static class PlayTTSItem {

        @Required
        private String album_id;
        private Optional<Title> title = Optional.empty();
        private Optional<String> summary = Optional.empty();
        private Optional<Image> cover = Optional.empty();
        private Optional<List<TTSTextItem>> texts = Optional.empty();

        public PlayTTSItem() {
        }

        public PlayTTSItem(String str) {
            this.album_id = str;
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
            this.cover = Optional.ofNullable(image);
            return this;
        }

        public PlayTTSItem setSummary(String str) {
            this.summary = Optional.ofNullable(str);
            return this;
        }

        public PlayTTSItem setTexts(List<TTSTextItem> list) {
            this.texts = Optional.ofNullable(list);
            return this;
        }

        public PlayTTSItem setTitle(Title title) {
            this.title = Optional.ofNullable(title);
            return this;
        }
    }

    public static class Player {

        @Required
        private String name;
        private Optional<String> introduction = Optional.empty();
        private Optional<Image> photo = Optional.empty();
        private Optional<Launcher> launcher = Optional.empty();

        public Player() {
        }

        public Player(String str) {
            this.name = str;
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
            this.introduction = Optional.ofNullable(str);
            return this;
        }

        public Player setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        @Required
        public Player setName(String str) {
            this.name = str;
            return this;
        }

        public Player setPhoto(Image image) {
            this.photo = Optional.ofNullable(image);
            return this;
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
        private Optional<MatchSchedule> recent_match = Optional.empty();
        private Optional<CustomBackground> background = Optional.empty();
        private Optional<DisplayCommon> display = Optional.empty();

        public PlayerRecord() {
        }

        public PlayerRecord(Player player, List<Common.PropItem> list, Image image) {
            this.player = player;
            this.data = list;
            this.skill_icon = image;
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
            this.background = Optional.ofNullable(customBackground);
            return this;
        }

        @Required
        public PlayerRecord setData(List<Common.PropItem> list) {
            this.data = list;
            return this;
        }

        public PlayerRecord setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.ofNullable(displayCommon);
            return this;
        }

        @Required
        public PlayerRecord setPlayer(Player player) {
            this.player = player;
            return this;
        }

        public PlayerRecord setRecentMatch(MatchSchedule matchSchedule) {
            this.recent_match = Optional.ofNullable(matchSchedule);
            return this;
        }

        @Required
        public PlayerRecord setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }
    }

    public static class PredictRate {

        @Required
        private double away_win;
        private Optional<Double> draw = Optional.empty();

        @Required
        private double home_win;

        public PredictRate() {
        }

        public PredictRate(double d, double d2) {
            this.home_win = d;
            this.away_win = d2;
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
            this.draw = Optional.ofNullable(Double.valueOf(d));
            return this;
        }

        @Required
        public PredictRate setHomeWin(double d) {
            this.home_win = d;
            return this;
        }
    }

    public static class Pronunciation {

        @Required
        private List<String> text;
        private Optional<String> url = Optional.empty();

        public Pronunciation() {
        }

        public Pronunciation(List<String> list) {
            this.text = list;
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
            this.url = Optional.ofNullable(str);
            return this;
        }
    }

    @NamespaceName(name = "Qabot", namespace = AIApiConstants.Template.NAME)
    public static class Qabot implements InstructionPayload {

        @Required
        private Title title;

        @Required
        private QabotType type;
        private Optional<VideoSnapshot> videoSnapshot = Optional.empty();
        private Optional<ClickAlbum> images = Optional.empty();
        private Optional<Launcher> launcher = Optional.empty();
        private Optional<QabotParagraphs> paragraphs = Optional.empty();
        private Optional<List<AbstractItem>> abstracts = Optional.empty();
        private Optional<String> text = Optional.empty();
        private Optional<Image> skill_icon = Optional.empty();
        private Optional<DisplayCommon> display = Optional.empty();
        private Optional<QabotImageType> image_type = Optional.empty();

        public Qabot() {
        }

        public Qabot(QabotType qabotType, Title title) {
            this.type = qabotType;
            this.title = title;
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
            this.abstracts = Optional.ofNullable(list);
            return this;
        }

        public Qabot setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.ofNullable(displayCommon);
            return this;
        }

        public Qabot setImageType(QabotImageType qabotImageType) {
            this.image_type = Optional.ofNullable(qabotImageType);
            return this;
        }

        public Qabot setImages(ClickAlbum clickAlbum) {
            this.images = Optional.ofNullable(clickAlbum);
            return this;
        }

        public Qabot setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        public Qabot setParagraphs(QabotParagraphs qabotParagraphs) {
            this.paragraphs = Optional.ofNullable(qabotParagraphs);
            return this;
        }

        public Qabot setSkillIcon(Image image) {
            this.skill_icon = Optional.ofNullable(image);
            return this;
        }

        public Qabot setText(String str) {
            this.text = Optional.ofNullable(str);
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
            this.videoSnapshot = Optional.ofNullable(videoSnapshot);
            return this;
        }
    }

    public enum QabotImageType {
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

    @NamespaceName(name = "QabotLists", namespace = AIApiConstants.Template.NAME)
    public static class QabotLists implements InstructionPayload {

        @Required
        private List<ListsItem> items;

        @Required
        private Title title;
        private Optional<Launcher> launcher = Optional.empty();
        private Optional<Image> skill_icon = Optional.empty();
        private Optional<DisplayCommon> display = Optional.empty();
        private Optional<Integer> max_row_num = Optional.empty();

        public QabotLists() {
        }

        public QabotLists(Title title, List<ListsItem> list) {
            this.title = title;
            this.items = list;
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
            this.display = Optional.ofNullable(displayCommon);
            return this;
        }

        @Required
        public QabotLists setItems(List<ListsItem> list) {
            this.items = list;
            return this;
        }

        public QabotLists setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        public QabotLists setMaxRowNum(int i) {
            this.max_row_num = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public QabotLists setSkillIcon(Image image) {
            this.skill_icon = Optional.ofNullable(image);
            return this;
        }

        @Required
        public QabotLists setTitle(Title title) {
            this.title = title;
            return this;
        }
    }

    public static class QabotParagraph {

        @Required
        private List<String> content;
        private Optional<Image> image = Optional.empty();

        @Required
        private Title title;

        public QabotParagraph() {
        }

        public QabotParagraph(Title title, List<String> list) {
            this.title = title;
            this.content = list;
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
            this.image = Optional.ofNullable(image);
            return this;
        }

        @Required
        public QabotParagraph setTitle(Title title) {
            this.title = title;
            return this;
        }
    }

    public enum QabotParagraphType {
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

    public static class QabotParagraphs {

        @Required
        private List<QabotParagraph> paragraphs;

        @Required
        private QabotParagraphType type;
        private Optional<String> head = Optional.empty();
        private Optional<String> tail = Optional.empty();

        public QabotParagraphs() {
        }

        public QabotParagraphs(QabotParagraphType qabotParagraphType, List<QabotParagraph> list) {
            this.type = qabotParagraphType;
            this.paragraphs = list;
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
            this.head = Optional.ofNullable(str);
            return this;
        }

        @Required
        public QabotParagraphs setParagraphs(List<QabotParagraph> list) {
            this.paragraphs = list;
            return this;
        }

        public QabotParagraphs setTail(String str) {
            this.tail = Optional.ofNullable(str);
            return this;
        }

        @Required
        public QabotParagraphs setType(QabotParagraphType qabotParagraphType) {
            this.type = qabotParagraphType;
            return this;
        }
    }

    public enum QabotType {
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

    @NamespaceName(name = Action.QUERY, namespace = AIApiConstants.Template.NAME)
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

    public static class QuickAppLaunchInfo {

        @Required
        private String pkg_name;

        @Required
        private int size;

        @Required
        private AppVersion version;
        private Optional<ObjectNode> params = Optional.empty();
        private Optional<CustomBackground> background = Optional.empty();
        private Optional<Task> task = Optional.empty();

        public QuickAppLaunchInfo() {
        }

        public QuickAppLaunchInfo(String str, int i, AppVersion appVersion) {
            this.pkg_name = str;
            this.size = i;
            this.version = appVersion;
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<ObjectNode> getParams() {
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
            this.background = Optional.ofNullable(customBackground);
            return this;
        }

        public QuickAppLaunchInfo setParams(ObjectNode objectNode) {
            this.params = Optional.ofNullable(objectNode);
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
            this.task = Optional.ofNullable(task);
            return this;
        }

        @Required
        public QuickAppLaunchInfo setVersion(AppVersion appVersion) {
            this.version = appVersion;
            return this;
        }
    }

    public static class Reminder {
    }

    @NamespaceName(name = "ResolveWords", namespace = AIApiConstants.Template.NAME)
    public static class ResolveWords implements EventPayload {
        private Optional<String> id = Optional.empty();
        private Optional<ResolveWordsType> type = Optional.empty();

        @Required
        private String words;

        public ResolveWords() {
        }

        public ResolveWords(String str) {
            this.words = str;
        }

        public Optional<String> getId() {
            return this.id;
        }

        public Optional<ResolveWordsType> getType() {
            return this.type;
        }

        @Required
        public String getWords() {
            return this.words;
        }

        public ResolveWords setId(String str) {
            this.id = Optional.ofNullable(str);
            return this;
        }

        public ResolveWords setType(ResolveWordsType resolveWordsType) {
            this.type = Optional.ofNullable(resolveWordsType);
            return this;
        }

        @Required
        public ResolveWords setWords(String str) {
            this.words = str;
            return this;
        }
    }

    public enum ResolveWordsType {
        DETAILS(0),
        MORE_HOMOPHONES(1);

        private int id;

        ResolveWordsType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "RestrictDriving", namespace = AIApiConstants.Template.NAME)
    public static class RestrictDriving implements InstructionPayload {

        @Required
        private String description;

        @Required
        private List<Integer> numbers;
        private Optional<String> date = Optional.empty();
        private Optional<Common.Weekday> week_day = Optional.empty();
        private Optional<Launcher> launcher = Optional.empty();
        private Optional<Image> skill_icon = Optional.empty();

        public RestrictDriving() {
        }

        public RestrictDriving(String str, List<Integer> list) {
            this.description = str;
            this.numbers = list;
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
            this.date = Optional.ofNullable(str);
            return this;
        }

        @Required
        public RestrictDriving setDescription(String str) {
            this.description = str;
            return this;
        }

        public RestrictDriving setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        @Required
        public RestrictDriving setNumbers(List<Integer> list) {
            this.numbers = list;
            return this;
        }

        public RestrictDriving setSkillIcon(Image image) {
            this.skill_icon = Optional.ofNullable(image);
            return this;
        }

        public RestrictDriving setWeekDay(Common.Weekday weekday) {
            this.week_day = Optional.ofNullable(weekday);
            return this;
        }
    }

    @NamespaceName(name = "RichPicture", namespace = AIApiConstants.Template.NAME)
    public static class RichPicture implements InstructionPayload {
        private Optional<Image> image = Optional.empty();
        private Optional<AudioPlayer.Stream> bg_stream = Optional.empty();

        public Optional<AudioPlayer.Stream> getBgStream() {
            return this.bg_stream;
        }

        public Optional<Image> getImage() {
            return this.image;
        }

        public RichPicture setBgStream(AudioPlayer.Stream stream) {
            this.bg_stream = Optional.ofNullable(stream);
            return this;
        }

        public RichPicture setImage(Image image) {
            this.image = Optional.ofNullable(image);
            return this;
        }
    }

    public static class RichText {

        @Required
        private String text;
        private Optional<String> color = Optional.empty();
        private Optional<String> bg_color = Optional.empty();
        private Optional<String> html = Optional.empty();

        public RichText() {
        }

        public RichText(String str) {
            this.text = str;
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
            this.bg_color = Optional.ofNullable(str);
            return this;
        }

        public RichText setColor(String str) {
            this.color = Optional.ofNullable(str);
            return this;
        }

        public RichText setHtml(String str) {
            this.html = Optional.ofNullable(str);
            return this;
        }

        @Required
        public RichText setText(String str) {
            this.text = str;
            return this;
        }
    }

    public static class SceneGroup {

        @Required
        private ArrayNode instructions;

        @Required
        private String name;

        public SceneGroup() {
        }

        public SceneGroup(ArrayNode arrayNode, String str) {
            this.instructions = arrayNode;
            this.name = str;
        }

        @Required
        public ArrayNode getInstructions() {
            return this.instructions;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public SceneGroup setInstructions(ArrayNode arrayNode) {
            this.instructions = arrayNode;
            return this;
        }

        @Required
        public SceneGroup setName(String str) {
            this.name = str;
            return this;
        }
    }

    @NamespaceName(name = "Scenes", namespace = AIApiConstants.Template.NAME)
    public static class Scenes implements InstructionPayload {

        @Required
        private List<SceneGroup> groups;
        private Optional<DisplayCommon> display = Optional.empty();
        private Optional<Image> skill_icon = Optional.empty();

        public Scenes() {
        }

        public Scenes(List<SceneGroup> list) {
            this.groups = list;
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

        public Scenes setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.ofNullable(displayCommon);
            return this;
        }

        @Required
        public Scenes setGroups(List<SceneGroup> list) {
            this.groups = list;
            return this;
        }

        public Scenes setSkillIcon(Image image) {
            this.skill_icon = Optional.ofNullable(image);
            return this;
        }
    }

    public enum SearchHitLevel {
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
        private Optional<Integer> duration_in_ms = Optional.empty();
        private Optional<Integer> wakeup_ball_duration = Optional.empty();

        public Optional<Integer> getDurationInMs() {
            return this.duration_in_ms;
        }

        public Optional<Integer> getWakeupBallDuration() {
            return this.wakeup_ball_duration;
        }

        public SetDisplayProperty setDurationInMs(int i) {
            this.duration_in_ms = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public SetDisplayProperty setWakeupBallDuration(int i) {
            this.wakeup_ball_duration = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }
    }

    public static class ShopInfo {

        @Required
        private String name;
        private Optional<String> location = Optional.empty();
        private Optional<String> distance = Optional.empty();
        private Optional<Float> score = Optional.empty();
        private Optional<String> average_price = Optional.empty();
        private Optional<String> tag = Optional.empty();
        private Optional<String> coupon = Optional.empty();
        private Optional<Boolean> open = Optional.empty();
        private Optional<Image> logo = Optional.empty();

        public ShopInfo() {
        }

        public ShopInfo(String str) {
            this.name = str;
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
            this.average_price = Optional.ofNullable(str);
            return this;
        }

        public ShopInfo setCoupon(String str) {
            this.coupon = Optional.ofNullable(str);
            return this;
        }

        public ShopInfo setDistance(String str) {
            this.distance = Optional.ofNullable(str);
            return this;
        }

        public ShopInfo setLocation(String str) {
            this.location = Optional.ofNullable(str);
            return this;
        }

        public ShopInfo setLogo(Image image) {
            this.logo = Optional.ofNullable(image);
            return this;
        }

        @Required
        public ShopInfo setName(String str) {
            this.name = str;
            return this;
        }

        public ShopInfo setOpen(boolean z) {
            this.open = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public ShopInfo setScore(float f) {
            this.score = Optional.ofNullable(Float.valueOf(f));
            return this;
        }

        public ShopInfo setTag(String str) {
            this.tag = Optional.ofNullable(str);
            return this;
        }
    }

    @NamespaceName(name = "ShopRecommendation", namespace = AIApiConstants.Template.NAME)
    public static class ShopRecommendation implements InstructionPayload {

        @Required
        private List<ShopRecommendationItem> items;
        private Optional<Image> skill_icon = Optional.empty();
        private Optional<CustomBackground> background = Optional.empty();
        private Optional<DisplayCommon> display = Optional.empty();

        public ShopRecommendation() {
        }

        public ShopRecommendation(List<ShopRecommendationItem> list) {
            this.items = list;
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
            this.background = Optional.ofNullable(customBackground);
            return this;
        }

        public ShopRecommendation setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.ofNullable(displayCommon);
            return this;
        }

        @Required
        public ShopRecommendation setItems(List<ShopRecommendationItem> list) {
            this.items = list;
            return this;
        }

        public ShopRecommendation setSkillIcon(Image image) {
            this.skill_icon = Optional.ofNullable(image);
            return this;
        }
    }

    public static class ShopRecommendationItem {

        @Required
        private ShopInfo shop_info;
        private Optional<Launcher> launcher = Optional.empty();
        private Optional<Button> button = Optional.empty();

        public ShopRecommendationItem() {
        }

        public ShopRecommendationItem(ShopInfo shopInfo) {
            this.shop_info = shopInfo;
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
            this.button = Optional.ofNullable(button);
            return this;
        }

        public ShopRecommendationItem setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        @Required
        public ShopRecommendationItem setShopInfo(ShopInfo shopInfo) {
            this.shop_info = shopInfo;
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

    @NamespaceName(name = "SingleButton", namespace = AIApiConstants.Template.NAME)
    public static class SingleButton implements InstructionPayload {

        @Required
        private Button button;
        private Optional<Image> skill_icon = Optional.empty();

        public SingleButton() {
        }

        public SingleButton(Button button) {
            this.button = button;
        }

        @Required
        public Button getButton() {
            return this.button;
        }

        public Optional<Image> getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public SingleButton setButton(Button button) {
            this.button = button;
            return this;
        }

        public SingleButton setSkillIcon(Image image) {
            this.skill_icon = Optional.ofNullable(image);
            return this;
        }
    }

    public static class SmartHotel {
        private Optional<String> name = Optional.empty();
        private Optional<Image> image = Optional.empty();

        @Deprecated
        private Optional<SmartHotelSummary> summary = Optional.empty();
        private Optional<List<SmartHotelFacility>> facilities = Optional.empty();

        @Deprecated
        private Optional<SmartHotelCategory> category = Optional.empty();
        private Optional<List<SmartHotelBaseInfo>> base_infos = Optional.empty();

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
            this.base_infos = Optional.ofNullable(list);
            return this;
        }

        @Deprecated
        public SmartHotel setCategory(SmartHotelCategory smartHotelCategory) {
            this.category = Optional.ofNullable(smartHotelCategory);
            return this;
        }

        public SmartHotel setFacilities(List<SmartHotelFacility> list) {
            this.facilities = Optional.ofNullable(list);
            return this;
        }

        public SmartHotel setImage(Image image) {
            this.image = Optional.ofNullable(image);
            return this;
        }

        public SmartHotel setName(String str) {
            this.name = Optional.ofNullable(str);
            return this;
        }

        @Deprecated
        public SmartHotel setSummary(SmartHotelSummary smartHotelSummary) {
            this.summary = Optional.ofNullable(smartHotelSummary);
            return this;
        }
    }

    public static class SmartHotelBaseInfo {
        private Optional<Image> icon = Optional.empty();

        @Required
        private String text;

        public SmartHotelBaseInfo() {
        }

        public SmartHotelBaseInfo(String str) {
            this.text = str;
        }

        public Optional<Image> getIcon() {
            return this.icon;
        }

        @Required
        public String getText() {
            return this.text;
        }

        public SmartHotelBaseInfo setIcon(Image image) {
            this.icon = Optional.ofNullable(image);
            return this;
        }

        @Required
        public SmartHotelBaseInfo setText(String str) {
            this.text = str;
            return this;
        }
    }

    public enum SmartHotelCategory {
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

    public static class SmartHotelFacility {

        @Required
        private String name;
        private Optional<Image> image = Optional.empty();
        private Optional<FacilityLocation> location = Optional.empty();
        private Optional<FacilityTime> time = Optional.empty();
        private Optional<String> desc = Optional.empty();

        public SmartHotelFacility() {
        }

        public SmartHotelFacility(String str) {
            this.name = str;
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
            this.desc = Optional.ofNullable(str);
            return this;
        }

        public SmartHotelFacility setImage(Image image) {
            this.image = Optional.ofNullable(image);
            return this;
        }

        public SmartHotelFacility setLocation(FacilityLocation facilityLocation) {
            this.location = Optional.ofNullable(facilityLocation);
            return this;
        }

        @Required
        public SmartHotelFacility setName(String str) {
            this.name = str;
            return this;
        }

        public SmartHotelFacility setTime(FacilityTime facilityTime) {
            this.time = Optional.ofNullable(facilityTime);
            return this;
        }
    }

    public static class SmartHotelSummary {

        @Required
        private String content;
        private Optional<Image> icon = Optional.empty();
        private Optional<SmartHotelWifi> wifi = Optional.empty();
        private Optional<List<SmartHotelBaseInfo>> base_infos = Optional.empty();

        public SmartHotelSummary() {
        }

        public SmartHotelSummary(String str) {
            this.content = str;
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
            this.base_infos = Optional.ofNullable(list);
            return this;
        }

        @Required
        public SmartHotelSummary setContent(String str) {
            this.content = str;
            return this;
        }

        public SmartHotelSummary setIcon(Image image) {
            this.icon = Optional.ofNullable(image);
            return this;
        }

        public SmartHotelSummary setWifi(SmartHotelWifi smartHotelWifi) {
            this.wifi = Optional.ofNullable(smartHotelWifi);
            return this;
        }
    }

    public static class SmartHotelWifi {
        private Optional<Image> icon = Optional.empty();

        @Required
        private String wifi;

        public SmartHotelWifi() {
        }

        public SmartHotelWifi(String str) {
            this.wifi = str;
        }

        public Optional<Image> getIcon() {
            return this.icon;
        }

        @Required
        public String getWifi() {
            return this.wifi;
        }

        public SmartHotelWifi setIcon(Image image) {
            this.icon = Optional.ofNullable(image);
            return this;
        }

        @Required
        public SmartHotelWifi setWifi(String str) {
            this.wifi = str;
            return this;
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
        private Optional<Image> album_cover = Optional.empty();
        private Optional<String> category = Optional.empty();

        public StationItem() {
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
            this.album_cover = Optional.ofNullable(image);
            return this;
        }

        @Required
        public StationItem setAlbumName(String str) {
            this.album_name = str;
            return this;
        }

        public StationItem setCategory(String str) {
            this.category = Optional.ofNullable(str);
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
    }

    @NamespaceName(name = "Stations", namespace = AIApiConstants.Template.NAME)
    public static class Stations implements InstructionPayload {

        @Required
        private List<StationItem> items;
        private Optional<Image> skill_icon = Optional.empty();
        private Optional<String> title = Optional.empty();

        public Stations() {
        }

        public Stations(List<StationItem> list) {
            this.items = list;
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
            this.skill_icon = Optional.ofNullable(image);
            return this;
        }

        public Stations setTitle(String str) {
            this.title = Optional.ofNullable(str);
            return this;
        }
    }

    @NamespaceName(name = "Stock", namespace = AIApiConstants.Template.NAME)
    public static class Stock implements InstructionPayload {

        @Required
        private List<StockDetail> stocks;
        private Optional<String> tip = Optional.empty();
        private Optional<String> h5_url = Optional.empty();
        private Optional<Launcher> intent = Optional.empty();

        public Stock() {
        }

        public Stock(List<StockDetail> list) {
            this.stocks = list;
        }

        public Optional<String> getH5Url() {
            return this.h5_url;
        }

        public Optional<Launcher> getIntent() {
            return this.intent;
        }

        @Required
        public List<StockDetail> getStocks() {
            return this.stocks;
        }

        public Optional<String> getTip() {
            return this.tip;
        }

        public Stock setH5Url(String str) {
            this.h5_url = Optional.ofNullable(str);
            return this;
        }

        public Stock setIntent(Launcher launcher) {
            this.intent = Optional.ofNullable(launcher);
            return this;
        }

        @Required
        public Stock setStocks(List<StockDetail> list) {
            this.stocks = list;
            return this;
        }

        public Stock setTip(String str) {
            this.tip = Optional.ofNullable(str);
            return this;
        }
    }

    public static class StockDetail {
        private Optional<String> code = Optional.empty();
        private Optional<String> market = Optional.empty();
        private Optional<String> name = Optional.empty();
        private Optional<Double> highest_price = Optional.empty();
        private Optional<Double> lowest_price = Optional.empty();
        private Optional<Double> close_price = Optional.empty();
        private Optional<Double> cur_price = Optional.empty();
        private Optional<Double> change_amount = Optional.empty();
        private Optional<Double> change_ratio = Optional.empty();

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
            this.change_amount = Optional.ofNullable(Double.valueOf(d));
            return this;
        }

        public StockDetail setChangeRatio(double d) {
            this.change_ratio = Optional.ofNullable(Double.valueOf(d));
            return this;
        }

        public StockDetail setClosePrice(double d) {
            this.close_price = Optional.ofNullable(Double.valueOf(d));
            return this;
        }

        public StockDetail setCode(String str) {
            this.code = Optional.ofNullable(str);
            return this;
        }

        public StockDetail setCurPrice(double d) {
            this.cur_price = Optional.ofNullable(Double.valueOf(d));
            return this;
        }

        public StockDetail setHighestPrice(double d) {
            this.highest_price = Optional.ofNullable(Double.valueOf(d));
            return this;
        }

        public StockDetail setLowestPrice(double d) {
            this.lowest_price = Optional.ofNullable(Double.valueOf(d));
            return this;
        }

        public StockDetail setMarket(String str) {
            this.market = Optional.ofNullable(str);
            return this;
        }

        public StockDetail setName(String str) {
            this.name = Optional.ofNullable(str);
            return this;
        }
    }

    public static class SwitchItem {

        @Required
        private Title title;
        private Optional<String> status = Optional.empty();
        private Optional<LocalTarget> target = Optional.empty();
        private Optional<Launcher> launcher = Optional.empty();
        private Optional<String> number_title = Optional.empty();

        public SwitchItem() {
        }

        public SwitchItem(Title title) {
            this.title = title;
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
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        public SwitchItem setNumberTitle(String str) {
            this.number_title = Optional.ofNullable(str);
            return this;
        }

        public SwitchItem setStatus(String str) {
            this.status = Optional.ofNullable(str);
            return this;
        }

        public SwitchItem setTarget(LocalTarget localTarget) {
            this.target = Optional.ofNullable(localTarget);
            return this;
        }

        @Required
        public SwitchItem setTitle(Title title) {
            this.title = title;
            return this;
        }
    }

    @NamespaceName(name = "SwitchPanel", namespace = AIApiConstants.Template.NAME)
    public static class SwitchPanel implements InstructionPayload {

        @Required
        private Image skill_icon;

        @Required
        private Title title;
        private Optional<Launcher> launcher = Optional.empty();
        private Optional<String> status = Optional.empty();
        private Optional<SwitchPanelType> type = Optional.empty();
        private Optional<LocalTarget> target = Optional.empty();
        private Optional<CustomBackground> background = Optional.empty();
        private Optional<DisplayCommon> display = Optional.empty();
        private Optional<String> number_title = Optional.empty();

        public SwitchPanel() {
        }

        public SwitchPanel(Title title, Image image) {
            this.title = title;
            this.skill_icon = image;
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
            this.background = Optional.ofNullable(customBackground);
            return this;
        }

        public SwitchPanel setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.ofNullable(displayCommon);
            return this;
        }

        public SwitchPanel setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        public SwitchPanel setNumberTitle(String str) {
            this.number_title = Optional.ofNullable(str);
            return this;
        }

        @Required
        public SwitchPanel setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        public SwitchPanel setStatus(String str) {
            this.status = Optional.ofNullable(str);
            return this;
        }

        public SwitchPanel setTarget(LocalTarget localTarget) {
            this.target = Optional.ofNullable(localTarget);
            return this;
        }

        @Required
        public SwitchPanel setTitle(Title title) {
            this.title = title;
            return this;
        }

        public SwitchPanel setType(SwitchPanelType switchPanelType) {
            this.type = Optional.ofNullable(switchPanelType);
            return this;
        }
    }

    @NamespaceName(name = "SwitchPanelList", namespace = AIApiConstants.Template.NAME)
    public static class SwitchPanelList implements InstructionPayload {

        @Required
        private Image skill_icon;

        @Required
        @Deprecated
        private List<SwitchItem> titles;
        private Optional<Launcher> launcher = Optional.empty();
        private Optional<SwitchPanelType> type = Optional.empty();
        private Optional<List<SwitchItem>> items = Optional.empty();
        private Optional<CustomBackground> background = Optional.empty();
        private Optional<DisplayCommon> display = Optional.empty();

        public SwitchPanelList() {
        }

        public SwitchPanelList(List<SwitchItem> list, Image image) {
            this.titles = list;
            this.skill_icon = image;
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
            this.background = Optional.ofNullable(customBackground);
            return this;
        }

        public SwitchPanelList setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.ofNullable(displayCommon);
            return this;
        }

        public SwitchPanelList setItems(List<SwitchItem> list) {
            this.items = Optional.ofNullable(list);
            return this;
        }

        public SwitchPanelList setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
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
            this.type = Optional.ofNullable(switchPanelType);
            return this;
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
        private Optional<List<MachineTranslation>> translations = Optional.empty();
        private Optional<List<String>> synonym_words = Optional.empty();

        public Optional<List<String>> getSynonymWords() {
            return this.synonym_words;
        }

        public Optional<List<MachineTranslation>> getTranslations() {
            return this.translations;
        }

        public SynonymCardV2 setSynonymWords(List<String> list) {
            this.synonym_words = Optional.ofNullable(list);
            return this;
        }

        public SynonymCardV2 setTranslations(List<MachineTranslation> list) {
            this.translations = Optional.ofNullable(list);
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

    @NamespaceName(name = "Table", namespace = AIApiConstants.Template.NAME)
    public static class Table implements InstructionPayload {

        @Required
        private Image skill_icon;

        @Required
        private List<TableData> values;
        private Optional<TableTitle> title = Optional.empty();
        private Optional<TableType> type = Optional.empty();
        private Optional<CustomBackground> background = Optional.empty();
        private Optional<DisplayCommon> display = Optional.empty();

        public Table() {
        }

        public Table(List<TableData> list, Image image) {
            this.values = list;
            this.skill_icon = image;
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
            this.background = Optional.ofNullable(customBackground);
            return this;
        }

        public Table setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.ofNullable(displayCommon);
            return this;
        }

        @Required
        public Table setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
        }

        public Table setTitle(TableTitle tableTitle) {
            this.title = Optional.ofNullable(tableTitle);
            return this;
        }

        public Table setType(TableType tableType) {
            this.type = Optional.ofNullable(tableType);
            return this;
        }

        @Required
        public Table setValues(List<TableData> list) {
            this.values = list;
            return this;
        }
    }

    public static class TableAttribute {
        private Optional<Align> align = Optional.empty();

        public Optional<Align> getAlign() {
            return this.align;
        }

        public TableAttribute setAlign(Align align) {
            this.align = Optional.ofNullable(align);
            return this;
        }
    }

    public static class TableCell {
        private Optional<Image> image = Optional.empty();

        @Required
        private String text;

        public TableCell() {
        }

        public TableCell(String str) {
            this.text = str;
        }

        public Optional<Image> getImage() {
            return this.image;
        }

        @Required
        public String getText() {
            return this.text;
        }

        public TableCell setImage(Image image) {
            this.image = Optional.ofNullable(image);
            return this;
        }

        @Required
        public TableCell setText(String str) {
            this.text = str;
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

    public static class TableHeader {
        private Optional<TableAttribute> attributes = Optional.empty();

        @Required
        private String text;

        public TableHeader() {
        }

        public TableHeader(String str) {
            this.text = str;
        }

        public Optional<TableAttribute> getAttributes() {
            return this.attributes;
        }

        @Required
        public String getText() {
            return this.text;
        }

        public TableHeader setAttributes(TableAttribute tableAttribute) {
            this.attributes = Optional.ofNullable(tableAttribute);
            return this;
        }

        @Required
        public TableHeader setText(String str) {
            this.text = str;
            return this;
        }
    }

    public static class TableTitle {
        private Optional<Image> image = Optional.empty();

        @Required
        private Title text;

        public TableTitle() {
        }

        public TableTitle(Title title) {
            this.text = title;
        }

        public Optional<Image> getImage() {
            return this.image;
        }

        @Required
        public Title getText() {
            return this.text;
        }

        public TableTitle setImage(Image image) {
            this.image = Optional.ofNullable(image);
            return this;
        }

        @Required
        public TableTitle setText(Title title) {
            this.text = title;
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

    public static class Task {
        private Optional<Boolean> can_ui_back = Optional.empty();

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

        public Task(String str, Image image, String str2, TaskLoadType taskLoadType) {
            this.name = str;
            this.icon = image;
            this.id = str2;
            this.load_type = taskLoadType;
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
            this.can_ui_back = Optional.ofNullable(Boolean.valueOf(z));
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

    public static class Team {

        @Required
        private String name;
        private Optional<Image> logo = Optional.empty();
        private Optional<Image> aux_image = Optional.empty();
        private Optional<Boolean> home = Optional.empty();
        private Optional<Launcher> launcher = Optional.empty();

        public Team() {
        }

        public Team(String str) {
            this.name = str;
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
            this.aux_image = Optional.ofNullable(image);
            return this;
        }

        public Team setHome(boolean z) {
            this.home = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public Team setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        public Team setLogo(Image image) {
            this.logo = Optional.ofNullable(image);
            return this;
        }

        @Required
        public Team setName(String str) {
            this.name = str;
            return this;
        }
    }

    @NamespaceName(name = "Time", namespace = AIApiConstants.Template.NAME)
    public static class Time implements InstructionPayload {

        @Required
        private TimeType type;
        private Optional<String> date = Optional.empty();
        private Optional<String> festival = Optional.empty();
        private Optional<String> week = Optional.empty();
        private Optional<String> lunar = Optional.empty();
        private Optional<Launcher> launcher = Optional.empty();
        private Optional<String> time = Optional.empty();
        private Optional<String> period = Optional.empty();
        private Optional<Image> icon = Optional.empty();
        private Optional<String> location = Optional.empty();
        private Optional<Image> skill_icon = Optional.empty();

        public Time() {
        }

        public Time(TimeType timeType) {
            this.type = timeType;
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

        public Optional<String> getTime() {
            return this.time;
        }

        @Required
        public TimeType getType() {
            return this.type;
        }

        public Optional<String> getWeek() {
            return this.week;
        }

        public Time setDate(String str) {
            this.date = Optional.ofNullable(str);
            return this;
        }

        public Time setFestival(String str) {
            this.festival = Optional.ofNullable(str);
            return this;
        }

        public Time setIcon(Image image) {
            this.icon = Optional.ofNullable(image);
            return this;
        }

        public Time setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        public Time setLocation(String str) {
            this.location = Optional.ofNullable(str);
            return this;
        }

        public Time setLunar(String str) {
            this.lunar = Optional.ofNullable(str);
            return this;
        }

        public Time setPeriod(String str) {
            this.period = Optional.ofNullable(str);
            return this;
        }

        public Time setSkillIcon(Image image) {
            this.skill_icon = Optional.ofNullable(image);
            return this;
        }

        public Time setTime(String str) {
            this.time = Optional.ofNullable(str);
            return this;
        }

        @Required
        public Time setType(TimeType timeType) {
            this.type = timeType;
            return this;
        }

        public Time setWeek(String str) {
            this.week = Optional.ofNullable(str);
            return this;
        }
    }

    public enum TimeType {
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

    public static class Title {
        private Optional<Launcher> launcher = Optional.empty();

        @Required
        private String main_title;

        @Required
        private String sub_title;

        public Title() {
        }

        public Title(String str, String str2) {
            this.main_title = str;
            this.sub_title = str2;
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
            this.launcher = Optional.ofNullable(launcher);
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
    }

    @NamespaceName(name = "ToDo", namespace = AIApiConstants.Template.NAME)
    public static class ToDo implements InstructionPayload {

        @Required
        private ToDoContent content;
        private Optional<Launcher> launcher = Optional.empty();

        @Required
        private Image skill_icon;

        public ToDo() {
        }

        public ToDo(ToDoContent toDoContent, Image image) {
            this.content = toDoContent;
            this.skill_icon = image;
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
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        @Required
        public ToDo setSkillIcon(Image image) {
            this.skill_icon = image;
            return this;
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

    @NamespaceName(name = "Toast", namespace = AIApiConstants.Template.NAME)
    public static class Toast implements InstructionPayload {

        @Required
        private String text;
        private Optional<String> query = Optional.empty();
        private Optional<Boolean> training = Optional.empty();
        private Optional<Image> image = Optional.empty();
        private Optional<CustomBackground> background = Optional.empty();
        private Optional<DisplayCommon> display = Optional.empty();
        private Optional<ToastPosition> position = Optional.empty();

        public Toast() {
        }

        public Toast(String str) {
            this.text = str;
        }

        public Optional<CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<DisplayCommon> getDisplay() {
            return this.display;
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

        public Optional<Boolean> isTraining() {
            return this.training;
        }

        public Toast setBackground(CustomBackground customBackground) {
            this.background = Optional.ofNullable(customBackground);
            return this;
        }

        public Toast setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.ofNullable(displayCommon);
            return this;
        }

        public Toast setImage(Image image) {
            this.image = Optional.ofNullable(image);
            return this;
        }

        public Toast setPosition(ToastPosition toastPosition) {
            this.position = Optional.ofNullable(toastPosition);
            return this;
        }

        public Toast setQuery(String str) {
            this.query = Optional.ofNullable(str);
            return this;
        }

        @Required
        public Toast setText(String str) {
            this.text = str;
            return this;
        }

        public Toast setTraining(boolean z) {
            this.training = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }
    }

    public enum ToastPosition {
        TOP(0);

        private int id;

        ToastPosition(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "TouchBar", namespace = AIApiConstants.Template.NAME)
    public static class TouchBar implements InstructionPayload {

        @Required
        private Button button;
        private Optional<Image> skill_icon = Optional.empty();

        @Required
        private Title title;

        public TouchBar() {
        }

        public TouchBar(Title title, Button button) {
            this.title = title;
            this.button = button;
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
            this.skill_icon = Optional.ofNullable(image);
            return this;
        }

        @Required
        public TouchBar setTitle(Title title) {
            this.title = title;
            return this;
        }
    }

    @NamespaceName(name = "Translation", namespace = AIApiConstants.Template.NAME)
    public static class Translation implements InstructionPayload {

        @Required
        private String dest_text;

        @Required
        private String src_text;
        private Optional<String> src_language = Optional.empty();
        private Optional<String> dest_language = Optional.empty();
        private Optional<TranslationType> type = Optional.empty();
        private Optional<DictionaryTranslation> dictionary = Optional.empty();
        private Optional<MachineTranslation> machine = Optional.empty();

        public Translation() {
        }

        public Translation(String str, String str2) {
            this.src_text = str;
            this.dest_text = str2;
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
            this.dest_language = Optional.ofNullable(str);
            return this;
        }

        @Required
        public Translation setDestText(String str) {
            this.dest_text = str;
            return this;
        }

        public Translation setDictionary(DictionaryTranslation dictionaryTranslation) {
            this.dictionary = Optional.ofNullable(dictionaryTranslation);
            return this;
        }

        public Translation setMachine(MachineTranslation machineTranslation) {
            this.machine = Optional.ofNullable(machineTranslation);
            return this;
        }

        public Translation setSrcLanguage(String str) {
            this.src_language = Optional.ofNullable(str);
            return this;
        }

        @Required
        public Translation setSrcText(String str) {
            this.src_text = str;
            return this;
        }

        public Translation setType(TranslationType translationType) {
            this.type = Optional.ofNullable(translationType);
            return this;
        }
    }

    public enum TranslationType {
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

    public static class VideoItem {

        @Required
        private List<Video.ThirdPartyContentProvider> cp;

        @Required
        private String id;

        @Required
        private VideoLengthType length_type;

        @Required
        private String name;
        private Optional<Image> horizontal_poster = Optional.empty();
        private Optional<Image> vertical_poster = Optional.empty();
        private Optional<VideoShowStatus> status = Optional.empty();
        private Optional<String> description = Optional.empty();
        private Optional<String> publish_date = Optional.empty();
        private Optional<Integer> publish_year = Optional.empty();
        private Optional<Float> rating = Optional.empty();
        private Optional<String> area = Optional.empty();
        private Optional<Integer> duration_in_min = Optional.empty();
        private Optional<String> category = Optional.empty();
        private Optional<Integer> latest_episode = Optional.empty();
        private Optional<Integer> episode_num = Optional.empty();
        private Optional<List<VideoActor>> actors = Optional.empty();
        private Optional<ObjectNode> log = Optional.empty();
        private Optional<Common.VideoMediaType> video_media_type = Optional.empty();
        private Optional<List<String>> tags = Optional.empty();

        public VideoItem() {
        }

        public VideoItem(String str, String str2, VideoLengthType videoLengthType, List<Video.ThirdPartyContentProvider> list) {
            this.name = str;
            this.id = str2;
            this.length_type = videoLengthType;
            this.cp = list;
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

        public Optional<ObjectNode> getLog() {
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
            this.actors = Optional.ofNullable(list);
            return this;
        }

        public VideoItem setArea(String str) {
            this.area = Optional.ofNullable(str);
            return this;
        }

        public VideoItem setCategory(String str) {
            this.category = Optional.ofNullable(str);
            return this;
        }

        @Required
        public VideoItem setCp(List<Video.ThirdPartyContentProvider> list) {
            this.cp = list;
            return this;
        }

        public VideoItem setDescription(String str) {
            this.description = Optional.ofNullable(str);
            return this;
        }

        public VideoItem setDurationInMin(int i) {
            this.duration_in_min = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VideoItem setEpisodeNum(int i) {
            this.episode_num = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VideoItem setHorizontalPoster(Image image) {
            this.horizontal_poster = Optional.ofNullable(image);
            return this;
        }

        @Required
        public VideoItem setId(String str) {
            this.id = str;
            return this;
        }

        public VideoItem setLatestEpisode(int i) {
            this.latest_episode = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        @Required
        public VideoItem setLengthType(VideoLengthType videoLengthType) {
            this.length_type = videoLengthType;
            return this;
        }

        public VideoItem setLog(ObjectNode objectNode) {
            this.log = Optional.ofNullable(objectNode);
            return this;
        }

        @Required
        public VideoItem setName(String str) {
            this.name = str;
            return this;
        }

        public VideoItem setPublishDate(String str) {
            this.publish_date = Optional.ofNullable(str);
            return this;
        }

        public VideoItem setPublishYear(int i) {
            this.publish_year = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VideoItem setRating(float f) {
            this.rating = Optional.ofNullable(Float.valueOf(f));
            return this;
        }

        public VideoItem setStatus(VideoShowStatus videoShowStatus) {
            this.status = Optional.ofNullable(videoShowStatus);
            return this;
        }

        public VideoItem setTags(List<String> list) {
            this.tags = Optional.ofNullable(list);
            return this;
        }

        public VideoItem setVerticalPoster(Image image) {
            this.vertical_poster = Optional.ofNullable(image);
            return this;
        }

        public VideoItem setVideoMediaType(Common.VideoMediaType videoMediaType) {
            this.video_media_type = Optional.ofNullable(videoMediaType);
            return this;
        }
    }

    public enum VideoLengthType {
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
        private Optional<Image> cover = Optional.empty();
        private Optional<Title> title = Optional.empty();
        private Optional<Image> pause_icon = Optional.empty();
        private Optional<Launcher> launcher = Optional.empty();
        private Optional<VideoSource> source = Optional.empty();

        public Optional<Image> getCover() {
            return this.cover;
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
            this.cover = Optional.ofNullable(image);
            return this;
        }

        public VideoSnapshot setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        public VideoSnapshot setPauseIcon(Image image) {
            this.pause_icon = Optional.ofNullable(image);
            return this;
        }

        public VideoSnapshot setSource(VideoSource videoSource) {
            this.source = Optional.ofNullable(videoSource);
            return this;
        }

        public VideoSnapshot setTitle(Title title) {
            this.title = Optional.ofNullable(title);
            return this;
        }
    }

    public static class VideoSource {
        private Optional<String> id = Optional.empty();
        private Optional<Integer> width_in_pixel = Optional.empty();
        private Optional<Integer> height_in_pixel = Optional.empty();
        private Optional<Boolean> authentication = Optional.empty();
        private Optional<String> token = Optional.empty();
        private Optional<String> md5 = Optional.empty();

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
            this.authentication = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VideoSource setHeightInPixel(int i) {
            this.height_in_pixel = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VideoSource setId(String str) {
            this.id = Optional.ofNullable(str);
            return this;
        }

        public VideoSource setMd5(String str) {
            this.md5 = Optional.ofNullable(str);
            return this;
        }

        public VideoSource setToken(String str) {
            this.token = Optional.ofNullable(str);
            return this;
        }

        public VideoSource setWidthInPixel(int i) {
            this.width_in_pixel = Optional.ofNullable(Integer.valueOf(i));
            return this;
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
        private Optional<Integer> episode = Optional.empty();
        private Optional<Boolean> is_auto_play = Optional.empty();

        public Videos() {
        }

        public Videos(List<VideoItem> list, SearchHitLevel searchHitLevel, int i) {
            this.items = list;
            this.hit_level = searchHitLevel;
            this.hits = i;
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
            this.episode = Optional.ofNullable(Integer.valueOf(i));
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
            this.is_auto_play = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        @Required
        public Videos setItems(List<VideoItem> list) {
            this.items = list;
            return this;
        }
    }

    @NamespaceName(name = "Weather", namespace = AIApiConstants.Template.NAME)
    public static class Weather implements InstructionPayload {

        @Required
        private Image skill_icon;

        @Required
        private List<WeatherItem> weather;
        private Optional<Launcher> launcher = Optional.empty();
        private Optional<CustomBackground> background = Optional.empty();
        private Optional<DisplayCommon> display = Optional.empty();

        public Weather() {
        }

        public Weather(List<WeatherItem> list, Image image) {
            this.weather = list;
            this.skill_icon = image;
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
            this.background = Optional.ofNullable(customBackground);
            return this;
        }

        public Weather setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.ofNullable(displayCommon);
            return this;
        }

        public Weather setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
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
    }

    public static class WeatherCode {
        private Optional<String> current = Optional.empty();
        private Optional<String> from = Optional.empty();
        private Optional<String> to = Optional.empty();

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
            this.current = Optional.ofNullable(str);
            return this;
        }

        public WeatherCode setFrom(String str) {
            this.from = Optional.ofNullable(str);
            return this;
        }

        public WeatherCode setTo(String str) {
            this.to = Optional.ofNullable(str);
            return this;
        }
    }

    public static class WeatherItem {

        @Required
        private String date;

        @Required
        private String location;
        private Optional<String> aqi = Optional.empty();
        private Optional<String> current_temperature = Optional.empty();
        private Optional<String> high_temperature = Optional.empty();
        private Optional<String> low_temperature = Optional.empty();
        private Optional<Image> icon = Optional.empty();
        private Optional<WeatherCode> weather_code = Optional.empty();
        private Optional<WeatherWind> wind = Optional.empty();

        public WeatherItem() {
        }

        public WeatherItem(String str, String str2) {
            this.date = str;
            this.location = str2;
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

        public WeatherItem setAqi(String str) {
            this.aqi = Optional.ofNullable(str);
            return this;
        }

        public WeatherItem setCurrentTemperature(String str) {
            this.current_temperature = Optional.ofNullable(str);
            return this;
        }

        @Required
        public WeatherItem setDate(String str) {
            this.date = str;
            return this;
        }

        public WeatherItem setHighTemperature(String str) {
            this.high_temperature = Optional.ofNullable(str);
            return this;
        }

        public WeatherItem setIcon(Image image) {
            this.icon = Optional.ofNullable(image);
            return this;
        }

        @Required
        public WeatherItem setLocation(String str) {
            this.location = str;
            return this;
        }

        public WeatherItem setLowTemperature(String str) {
            this.low_temperature = Optional.ofNullable(str);
            return this;
        }

        public WeatherItem setWeatherCode(WeatherCode weatherCode) {
            this.weather_code = Optional.ofNullable(weatherCode);
            return this;
        }

        public WeatherItem setWind(WeatherWind weatherWind) {
            this.wind = Optional.ofNullable(weatherWind);
            return this;
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
        private Optional<Launcher> launcher = Optional.empty();
        private Optional<CustomBackground> background = Optional.empty();
        private Optional<DisplayCommon> display = Optional.empty();
        private Optional<Boolean> daylight = Optional.empty();

        public WeatherV2() {
        }

        public WeatherV2(Title title, List<FullScreenTemplate.WeatherFragmentData> list, Image image) {
            this.location = title;
            this.weather = list;
            this.skill_icon = image;
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
            this.background = Optional.ofNullable(customBackground);
            return this;
        }

        public WeatherV2 setDaylight(boolean z) {
            this.daylight = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public WeatherV2 setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.ofNullable(displayCommon);
            return this;
        }

        public WeatherV2 setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
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
    }

    public static class WeatherWind {
        private Optional<WeatherWindDirection> direction = Optional.empty();
        private Optional<WeatherWindSpeed> speed = Optional.empty();

        public Optional<WeatherWindDirection> getDirection() {
            return this.direction;
        }

        public Optional<WeatherWindSpeed> getSpeed() {
            return this.speed;
        }

        public WeatherWind setDirection(WeatherWindDirection weatherWindDirection) {
            this.direction = Optional.ofNullable(weatherWindDirection);
            return this;
        }

        public WeatherWind setSpeed(WeatherWindSpeed weatherWindSpeed) {
            this.speed = Optional.ofNullable(weatherWindSpeed);
            return this;
        }
    }

    public static class WeatherWindDirection {

        @Required
        private String text;
        private Optional<String> current = Optional.empty();
        private Optional<String> from = Optional.empty();
        private Optional<String> to = Optional.empty();

        public WeatherWindDirection() {
        }

        public WeatherWindDirection(String str) {
            this.text = str;
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
            this.current = Optional.ofNullable(str);
            return this;
        }

        public WeatherWindDirection setFrom(String str) {
            this.from = Optional.ofNullable(str);
            return this;
        }

        @Required
        public WeatherWindDirection setText(String str) {
            this.text = str;
            return this;
        }

        public WeatherWindDirection setTo(String str) {
            this.to = Optional.ofNullable(str);
            return this;
        }
    }

    public static class WeatherWindSpeed {

        @Required
        private String text;
        private Optional<String> current = Optional.empty();
        private Optional<String> from = Optional.empty();
        private Optional<String> to = Optional.empty();

        public WeatherWindSpeed() {
        }

        public WeatherWindSpeed(String str) {
            this.text = str;
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
            this.current = Optional.ofNullable(str);
            return this;
        }

        public WeatherWindSpeed setFrom(String str) {
            this.from = Optional.ofNullable(str);
            return this;
        }

        @Required
        public WeatherWindSpeed setText(String str) {
            this.text = str;
            return this;
        }

        public WeatherWindSpeed setTo(String str) {
            this.to = Optional.ofNullable(str);
            return this;
        }
    }

    public static class WikiDetail {

        @Required
        private Image skill_icon;

        @Required
        private String text;

        @Required
        private Title title;
        private Optional<Launcher> launcher = Optional.empty();
        private Optional<ClickAlbum> images = Optional.empty();
        private Optional<List<AbstractItem>> abstracts = Optional.empty();
        private Optional<GeneralDisplayType> type = Optional.empty();
        private Optional<CustomBackground> background = Optional.empty();
        private Optional<DisplayCommon> display = Optional.empty();
        private Optional<VideoSnapshot> videoSnapshot = Optional.empty();
        private Optional<EmbeddedList> relationShip = Optional.empty();
        private Optional<EmbeddedList> news = Optional.empty();
        private Optional<Title> polysemy = Optional.empty();
        private Optional<WikiMoreDetail> more_detail = Optional.empty();

        public WikiDetail() {
        }

        public WikiDetail(Title title, String str, Image image) {
            this.title = title;
            this.text = str;
            this.skill_icon = image;
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

        public Optional<ClickAlbum> getImages() {
            return this.images;
        }

        public Optional<Launcher> getLauncher() {
            return this.launcher;
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
            this.abstracts = Optional.ofNullable(list);
            return this;
        }

        public WikiDetail setBackground(CustomBackground customBackground) {
            this.background = Optional.ofNullable(customBackground);
            return this;
        }

        public WikiDetail setDisplay(DisplayCommon displayCommon) {
            this.display = Optional.ofNullable(displayCommon);
            return this;
        }

        public WikiDetail setImages(ClickAlbum clickAlbum) {
            this.images = Optional.ofNullable(clickAlbum);
            return this;
        }

        public WikiDetail setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        public WikiDetail setMoreDetail(WikiMoreDetail wikiMoreDetail) {
            this.more_detail = Optional.ofNullable(wikiMoreDetail);
            return this;
        }

        public WikiDetail setNews(EmbeddedList embeddedList) {
            this.news = Optional.ofNullable(embeddedList);
            return this;
        }

        public WikiDetail setPolysemy(Title title) {
            this.polysemy = Optional.ofNullable(title);
            return this;
        }

        public WikiDetail setRelationShip(EmbeddedList embeddedList) {
            this.relationShip = Optional.ofNullable(embeddedList);
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
            this.type = Optional.ofNullable(generalDisplayType);
            return this;
        }

        public WikiDetail setVideoSnapshot(VideoSnapshot videoSnapshot) {
            this.videoSnapshot = Optional.ofNullable(videoSnapshot);
            return this;
        }
    }

    @NamespaceName(name = "WikiEvent", namespace = AIApiConstants.Template.NAME)
    public static class WikiEvent implements EventPayload {

        @Required
        private WikiEventType category;
        private Optional<String> text = Optional.empty();
        private Optional<String> sid = Optional.empty();
        private Optional<String> mentions = Optional.empty();

        public WikiEvent() {
        }

        public WikiEvent(WikiEventType wikiEventType) {
            this.category = wikiEventType;
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
            this.mentions = Optional.ofNullable(str);
            return this;
        }

        public WikiEvent setSid(String str) {
            this.sid = Optional.ofNullable(str);
            return this;
        }

        public WikiEvent setText(String str) {
            this.text = Optional.ofNullable(str);
            return this;
        }
    }

    public enum WikiEventType {
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

    public static class WikiMoreDetail {

        @Required
        private WikiMoreItem base;
        private Optional<List<WikiMoreItem>> items = Optional.empty();
        private Optional<Launcher> launcher = Optional.empty();

        public WikiMoreDetail() {
        }

        public WikiMoreDetail(WikiMoreItem wikiMoreItem) {
            this.base = wikiMoreItem;
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
            this.items = Optional.ofNullable(list);
            return this;
        }

        public WikiMoreDetail setLauncher(Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }
    }

    public static class WikiMoreItem {

        @Required
        private String desc;
        private Optional<String> sid = Optional.empty();
        private Optional<String> mentions = Optional.empty();

        public WikiMoreItem() {
        }

        public WikiMoreItem(String str) {
            this.desc = str;
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
            this.mentions = Optional.ofNullable(str);
            return this;
        }

        public WikiMoreItem setSid(String str) {
            this.sid = Optional.ofNullable(str);
            return this;
        }
    }

    public static class Words {

        @Required
        private List<Pronunciation> pronunciation;

        @Required
        private List<String> text;
        private Optional<List<Image>> image = Optional.empty();
        private Optional<List<AbstractItem>> property = Optional.empty();

        public Words() {
        }

        public Words(List<String> list, List<Pronunciation> list2) {
            this.text = list;
            this.pronunciation = list2;
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
            this.image = Optional.ofNullable(list);
            return this;
        }

        @Required
        public Words setPronunciation(List<Pronunciation> list) {
            this.pronunciation = list;
            return this;
        }

        public Words setProperty(List<AbstractItem> list) {
            this.property = Optional.ofNullable(list);
            return this;
        }

        @Required
        public Words setText(List<String> list) {
            this.text = list;
            return this;
        }
    }

    @NamespaceName(name = "WordsInfo", namespace = AIApiConstants.Template.NAME)
    public static class WordsInfo implements InstructionPayload {
        private Optional<DisplayCommon> display = Optional.empty();

        @Required
        private FullScreen full_screen;

        @Required
        private Image skill_icon;

        @Required
        private Words words;

        public WordsInfo() {
        }

        public WordsInfo(Words words, FullScreen fullScreen, Image image) {
            this.words = words;
            this.full_screen = fullScreen;
            this.skill_icon = image;
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
            this.display = Optional.ofNullable(displayCommon);
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
    }
}
