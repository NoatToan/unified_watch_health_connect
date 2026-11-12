package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class UIController {

    public enum AuthorizationOperation {
        UNKNOWN(-1),
        AUTH(0),
        CANCEL_AUTH(1);

        private int id;

        AuthorizationOperation(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum AuthorizationScope {
        UNKNOWN(-1),
        POSITION(0),
        VOICE(1);

        private int id;

        AuthorizationScope(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "AuthorizationUpdated", namespace = AIApiConstants.UIController.NAME)
    public static class AuthorizationUpdated implements EventPayload {

        @Required
        private AuthorizationOperation operation;

        @Required
        private List<AuthorizationScope> scope;

        public AuthorizationUpdated() {
        }

        public AuthorizationUpdated(AuthorizationOperation authorizationOperation, List<AuthorizationScope> list) {
            this.operation = authorizationOperation;
            this.scope = list;
        }

        @Required
        public AuthorizationOperation getOperation() {
            return this.operation;
        }

        @Required
        public List<AuthorizationScope> getScope() {
            return this.scope;
        }

        @Required
        public AuthorizationUpdated setOperation(AuthorizationOperation authorizationOperation) {
            this.operation = authorizationOperation;
            return this;
        }

        @Required
        public AuthorizationUpdated setScope(List<AuthorizationScope> list) {
            this.scope = list;
            return this;
        }
    }

    @NamespaceName(name = com.xiaomi.ai.api.intent.AIApiConstants.Bookmark.NAME, namespace = AIApiConstants.UIController.NAME)
    public static class Bookmark implements InstructionPayload {
    }

    public enum CardType {
        UNKNOWN(-1),
        HOME_LIST(0),
        DEVICE_LIST(1),
        DOC_SUMMARY_SECOND_PAGE(2),
        LLM_CARD(3);

        private int id;

        CardType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "CommonEdit", namespace = AIApiConstants.UIController.NAME)
    public static class CommonEdit implements InstructionPayload {

        @Required
        private CommonEditCmd cmd;

        public CommonEdit() {
        }

        public CommonEdit(CommonEditCmd commonEditCmd) {
            this.cmd = commonEditCmd;
        }

        @Required
        public CommonEditCmd getCmd() {
            return this.cmd;
        }

        @Required
        public CommonEdit setCmd(CommonEditCmd commonEditCmd) {
            this.cmd = commonEditCmd;
            return this;
        }
    }

    public enum CommonEditCmd {
        UNKNOWN(-1),
        PRINT(0),
        SELECT_ALL(1),
        COPY(2),
        PASTE(3),
        CUT(4),
        DELETE(5),
        COMPLETE_DELETE(6),
        SAVE(7),
        SAVE_AS(8),
        FIND(9),
        REPLACE(10),
        UNDO(11),
        REDO(12),
        CLOSE(13),
        ZOOM_IN(14),
        ZOOM_OUT(15),
        RESUME_ZOOM(16),
        MINIMIZE(17),
        MAXIMIZE(18),
        MINIMIZE_ALL(19),
        MAXIMIZE_ALL(20);

        private int id;

        CommonEditCmd(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class ControlDevice {
        private Optional<String> device_id = Optional.a();
        private Optional<String> native_device_id = Optional.a();

        public Optional<String> getDeviceId() {
            return this.device_id;
        }

        public Optional<String> getNativeDeviceId() {
            return this.native_device_id;
        }

        public ControlDevice setDeviceId(String str) {
            this.device_id = Optional.e(str);
            return this;
        }

        public ControlDevice setNativeDeviceId(String str) {
            this.native_device_id = Optional.e(str);
            return this;
        }
    }

    public static class ControlLocation {

        @Required
        private double height;

        @Required
        private double up_left_x;

        @Required
        private double up_left_y;

        @Required
        private double width;

        public ControlLocation() {
        }

        public ControlLocation(double d, double d2, double d3, double d4) {
            this.up_left_x = d;
            this.up_left_y = d2;
            this.width = d3;
            this.height = d4;
        }

        @Required
        public double getHeight() {
            return this.height;
        }

        @Required
        public double getUpLeftX() {
            return this.up_left_x;
        }

        @Required
        public double getUpLeftY() {
            return this.up_left_y;
        }

        @Required
        public double getWidth() {
            return this.width;
        }

        @Required
        public ControlLocation setHeight(double d) {
            this.height = d;
            return this;
        }

        @Required
        public ControlLocation setUpLeftX(double d) {
            this.up_left_x = d;
            return this;
        }

        @Required
        public ControlLocation setUpLeftY(double d) {
            this.up_left_y = d;
            return this;
        }

        @Required
        public ControlLocation setWidth(double d) {
            this.width = d;
            return this;
        }
    }

    public enum ControlState {
        UNKNOWN(-1),
        ON(0),
        OFF(1);

        private int id;

        ControlState(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum Direction {
        UNKNOWN(-1),
        UP(0),
        DOWN(1),
        LEFT(2),
        RIGHT(3);

        private int id;

        Direction(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class DisplayMetrics {

        @Required
        private double height;

        @Required
        private String id;

        @Required
        private double width;

        public DisplayMetrics() {
        }

        public DisplayMetrics(String str, double d, double d2) {
            this.id = str;
            this.width = d;
            this.height = d2;
        }

        @Required
        public double getHeight() {
            return this.height;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public double getWidth() {
            return this.width;
        }

        @Required
        public DisplayMetrics setHeight(double d) {
            this.height = d;
            return this;
        }

        @Required
        public DisplayMetrics setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public DisplayMetrics setWidth(double d) {
            this.width = d;
            return this;
        }
    }

    @NamespaceName(name = "EndScreenProjection", namespace = AIApiConstants.UIController.NAME)
    public static class EndScreenProjection implements InstructionPayload {
        private Optional<Boolean> full_screen = Optional.a();
        private Optional<ControlDevice> control_device = Optional.a();

        public Optional<ControlDevice> getControlDevice() {
            return this.control_device;
        }

        public Optional<Boolean> isFullScreen() {
            return this.full_screen;
        }

        public EndScreenProjection setControlDevice(ControlDevice controlDevice) {
            this.control_device = Optional.e(controlDevice);
            return this;
        }

        public EndScreenProjection setFullScreen(boolean z) {
            this.full_screen = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    @NamespaceName(name = "ExternalState", namespace = AIApiConstants.UIController.NAME)
    public static class ExternalState implements ContextPayload {
        private Optional<String> current_interface = Optional.a();

        public Optional<String> getCurrentInterface() {
            return this.current_interface;
        }

        public ExternalState setCurrentInterface(String str) {
            this.current_interface = Optional.e(str);
            return this;
        }
    }

    public enum FileSizeCompare {
        UNKNOWN(-1),
        LG(0),
        EQ(1),
        LE(2);

        private int id;

        FileSizeCompare(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum FlexibleSize {
        UNKNOWN(-1),
        ONE_THIRD(0),
        TWO_THIRD(1);

        private int id;

        FlexibleSize(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum FlexibleState {
        UNKNOWN(-1),
        MAIN_HOME(0),
        FLEXIBLE_WINDOWS(1),
        FLEXIBLE_WINDOWS_PREVIEW(2),
        APP_FULL_SCREEN(3);

        private int id;

        FlexibleState(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class FlexibleWindowApp {
        private Optional<String> foreground_app = Optional.a();
        private Optional<String> foreground_app_name = Optional.a();
        private Optional<String> foreground_page = Optional.a();
        private Optional<String> package_name = Optional.a();
        private Optional<String> package_app_name = Optional.a();

        public Optional<String> getForegroundApp() {
            return this.foreground_app;
        }

        public Optional<String> getForegroundAppName() {
            return this.foreground_app_name;
        }

        public Optional<String> getForegroundPage() {
            return this.foreground_page;
        }

        public Optional<String> getPackageAppName() {
            return this.package_app_name;
        }

        public Optional<String> getPackageName() {
            return this.package_name;
        }

        public FlexibleWindowApp setForegroundApp(String str) {
            this.foreground_app = Optional.e(str);
            return this;
        }

        public FlexibleWindowApp setForegroundAppName(String str) {
            this.foreground_app_name = Optional.e(str);
            return this;
        }

        public FlexibleWindowApp setForegroundPage(String str) {
            this.foreground_page = Optional.e(str);
            return this;
        }

        public FlexibleWindowApp setPackageAppName(String str) {
            this.package_app_name = Optional.e(str);
            return this;
        }

        public FlexibleWindowApp setPackageName(String str) {
            this.package_name = Optional.e(str);
            return this;
        }
    }

    public enum IncreasingDirection {
        UNKNOWN(-1),
        LEFT_TO_RIGHT(0),
        BOTTOM_TO_UP(1),
        UP_TO_BOTTOM(2);

        private int id;

        IncreasingDirection(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "InputImages", namespace = AIApiConstants.UIController.NAME)
    public static class InputImages implements InstructionPayload {

        @Required
        private List<Template.Image> images;

        @Required
        private Template.Title title;

        public InputImages() {
        }

        public InputImages(Template.Title title, List<Template.Image> list) {
            this.title = title;
            this.images = list;
        }

        @Required
        public List<Template.Image> getImages() {
            return this.images;
        }

        @Required
        public Template.Title getTitle() {
            return this.title;
        }

        @Required
        public InputImages setImages(List<Template.Image> list) {
            this.images = list;
            return this;
        }

        @Required
        public InputImages setTitle(Template.Title title) {
            this.title = title;
            return this;
        }
    }

    public enum InteractionButtonIntentType {
        UNKNOWN(-1),
        PREV(0),
        NEXT(1),
        PLAY(2),
        PAUSE(3),
        LIKE(4),
        PLAY_LIST(5),
        BACK(6),
        CLOSE(7),
        MINIMIZE(8),
        MAXMIZE(9),
        REWIND(10),
        FAST_FORWARD(11),
        GO_HOME(12),
        GO_COMPANY(13),
        ROAD_CONDITION(14),
        SWITCH_2D_3D(15),
        SETTING(16),
        SEARCH(17),
        NAVIGATION_PREVIEW(18),
        DOWN_ARROW(19),
        DIAL(20),
        EDIT(21),
        CLEAR(22),
        CONFIRM(23),
        CANCEL(24),
        CLOSE_PAGE(25),
        REFRESH(26),
        SAVE(27),
        RESET(28),
        RETRY(29),
        OPEN(30),
        MORE(31),
        RENAME(32),
        INSTALL(33),
        DOWNLOAD(34),
        STOP(35),
        CONTINUE(36),
        UPDATE(37),
        UNLOCK(38),
        DELETE(39),
        ADD(40),
        NAVIGATE(41);

        private int id;

        InteractionButtonIntentType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum InteractionControlIntent {
        UNKNOWN(-1),
        PLAY(0),
        DOWNLOAD(1),
        DELETE(2),
        EDIT(3),
        Check(4),
        CLEAR(5),
        CONTINUE(6),
        STOP(7),
        CLOSE(8),
        OPEN(9),
        INSTALL(10),
        NAVIGATE(11),
        UPDATE(12),
        DETAIL(13),
        ADD(14),
        LIKE(15),
        UNLOCK(16),
        SEARCH(17),
        RETRY(18),
        DIAL(19),
        CONNECT(20),
        DISCONNECT(21),
        RENAME(22),
        RESET(23),
        MUTE(24),
        UNMUTE(25),
        MINIMIZE(26),
        MAXMIZE(27),
        POWERON(28),
        POWEROFF(29),
        VIEWSWITCH(30);

        private int id;

        InteractionControlIntent(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class InteractionControlTag {
        private Optional<List<String>> texts = Optional.a();
        private Optional<List<String>> categories = Optional.a();

        public Optional<List<String>> getCategories() {
            return this.categories;
        }

        public Optional<List<String>> getTexts() {
            return this.texts;
        }

        public InteractionControlTag setCategories(List<String> list) {
            this.categories = Optional.e(list);
            return this;
        }

        public InteractionControlTag setTexts(List<String> list) {
            this.texts = Optional.e(list);
            return this;
        }
    }

    public enum InteractionControlTextMatchMethod {
        DEFAULT(0),
        EXACT(1),
        SPECIFY_TEXT_INTENT(2);

        private int id;

        InteractionControlTextMatchMethod(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum InteractionControlType {
        UNKNOWN(-1),
        BUTTON(0),
        TEXT_LIST(1),
        ORDINAL(2),
        SWITCH(3),
        SLIDER(4),
        LIST_VIEW(5),
        TAB(6),
        FILTER_SORT_VIEW(7),
        INDEX(8);

        private int id;

        InteractionControlType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum InteractionDir {
        UNKNOWN(-1),
        UP(0),
        DOWN(1),
        LEFT(2),
        RIGHT(3),
        UP_MOST(4),
        DOWN_MOST(5),
        LEFT_MOST(6),
        RIGHT_MOST(7);

        private int id;

        InteractionDir(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class InteractionEntity {

        @Required
        private String name;

        @Required
        private List<InteractionEntityWord> words;

        public InteractionEntity() {
        }

        public InteractionEntity(String str, List<InteractionEntityWord> list) {
            this.name = str;
            this.words = list;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public List<InteractionEntityWord> getWords() {
            return this.words;
        }

        @Required
        public InteractionEntity setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public InteractionEntity setWords(List<InteractionEntityWord> list) {
            this.words = list;
            return this;
        }
    }

    @NamespaceName(name = "InteractionEntityInfo", namespace = AIApiConstants.UIController.NAME)
    public static class InteractionEntityInfo implements ContextPayload {

        @Required
        private List<InteractionEntity> entities;

        @Required
        private List<InteractionIntentType> intents;

        public InteractionEntityInfo() {
        }

        public InteractionEntityInfo(List<InteractionIntentType> list, List<InteractionEntity> list2) {
            this.intents = list;
            this.entities = list2;
        }

        @Required
        public List<InteractionEntity> getEntities() {
            return this.entities;
        }

        @Required
        public List<InteractionIntentType> getIntents() {
            return this.intents;
        }

        @Required
        public InteractionEntityInfo setEntities(List<InteractionEntity> list) {
            this.entities = list;
            return this;
        }

        @Required
        public InteractionEntityInfo setIntents(List<InteractionIntentType> list) {
            this.intents = list;
            return this;
        }
    }

    public static class InteractionEntityWord {

        @Required
        private String id;

        @Required
        private String text;

        public InteractionEntityWord() {
        }

        public InteractionEntityWord(String str, String str2) {
            this.text = str;
            this.id = str2;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public InteractionEntityWord setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public InteractionEntityWord setText(String str) {
            this.text = str;
            return this;
        }
    }

    public enum InteractionInfoPageType {
        UNKNOWN(-1),
        APP_DOWNLOAD(0),
        MEDIA(1),
        SYSTEM_SETTING(2),
        NAVIGATE(3),
        PHONE_CALL_DIAL(4),
        PHONE_CALL_CONTACT(5),
        QQ_MUSIC(6),
        KUGOU_MUSIC(7),
        WANGYIYUN_MUSIC(8),
        XIMALAYA_STATION(9),
        IOT_CENTER_SETTING(10),
        CONFIRM_CANCEL_BOX(11);

        private int id;

        InteractionInfoPageType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum InteractionIntentType {
        UNKNOWN(-1),
        MUSIC_SELECT(0),
        STATION_SELECT(1),
        VIDEO_SELECT(2),
        COMMON(3);

        private int id;

        InteractionIntentType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum InteractionOp {
        UNKNOWN(-1),
        CLICK(0),
        SWIPE_UP(1),
        SWIPE_DOWN(2),
        SWIPE_LEFT(3),
        SWIPE_RIGHT(4),
        BACK(5),
        EDIT(6),
        SWIPE_UP_TO_BOTTOM(7),
        SWIPE_DOWN_TO_BOTTOM(8),
        SWIPE_LEFT_TO_BOTTOM(9),
        SWIPE_RIGHT_TO_BOTTOM(10),
        SET(11),
        SWIPE(12);

        private int id;

        InteractionOp(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum InteractionScreen {
        UNKNOWN(-1),
        CENTRAL_SCREEN(0);

        private int id;

        InteractionScreen(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "Interactions", namespace = AIApiConstants.UIController.NAME)
    public static class Interactions implements InstructionPayload {

        @Required
        private List<Interaction> actions;

        public Interactions() {
        }

        public Interactions(List<Interaction> list) {
            this.actions = list;
        }

        @Required
        public List<Interaction> getActions() {
            return this.actions;
        }

        @Required
        public Interactions setActions(List<Interaction> list) {
            this.actions = list;
            return this;
        }
    }

    public static class IntervalStateV2 {
        private Optional<Float> min = Optional.a();
        private Optional<Float> current = Optional.a();
        private Optional<Float> max = Optional.a();
        private Optional<Float> step = Optional.a();

        public Optional<Float> getCurrent() {
            return this.current;
        }

        public Optional<Float> getMax() {
            return this.max;
        }

        public Optional<Float> getMin() {
            return this.min;
        }

        public Optional<Float> getStep() {
            return this.step;
        }

        public IntervalStateV2 setCurrent(float f) {
            this.current = Optional.e(Float.valueOf(f));
            return this;
        }

        public IntervalStateV2 setMax(float f) {
            this.max = Optional.e(Float.valueOf(f));
            return this;
        }

        public IntervalStateV2 setMin(float f) {
            this.min = Optional.e(Float.valueOf(f));
            return this;
        }

        public IntervalStateV2 setStep(float f) {
            this.step = Optional.e(Float.valueOf(f));
            return this;
        }
    }

    public enum NavigateOp {
        UNKNOWN(-1),
        HOME(0),
        BACK(1),
        CONFIRM(2),
        CANCEL(3),
        PREV_PAGE(4),
        NEXT_PAGE(5),
        EXIT(6),
        FULL_SCREEN(7),
        QUIT_FULL_SCREEN(8),
        EXIT_XIAOAI(9),
        EXIT_BOTTOM_CAPTURE(10),
        OPEN_BACKGROUND_APPS(11),
        CLOSE(12);

        private int id;

        NavigateOp(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum NavigateTarget {
        UNKNOWN(-1),
        MULTIPLE_ROUND_EFFECT(0),
        MAP_APP(1);

        private int id;

        NavigateTarget(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum OperateScreenProjectionType {
        UNKNOWN(-1),
        SWIPE(0);

        private int id;

        OperateScreenProjectionType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "OperateWindow", namespace = AIApiConstants.UIController.NAME)
    public static class OperateWindow implements InstructionPayload {

        @Required
        private List<WindowInfo> windows;

        public OperateWindow() {
        }

        public OperateWindow(List<WindowInfo> list) {
            this.windows = list;
        }

        @Required
        public List<WindowInfo> getWindows() {
            return this.windows;
        }

        @Required
        public OperateWindow setWindows(List<WindowInfo> list) {
            this.windows = list;
            return this;
        }
    }

    @NamespaceName(name = "PageItems", namespace = AIApiConstants.UIController.NAME)
    public static class PageItems implements ContextPayload {

        @Required
        private List<PageItem> pages;

        public PageItems() {
        }

        public PageItems(List<PageItem> list) {
            this.pages = list;
        }

        @Required
        public List<PageItem> getPages() {
            return this.pages;
        }

        @Required
        public PageItems setPages(List<PageItem> list) {
            this.pages = list;
            return this;
        }
    }

    @NamespaceName(name = "ReplyEmail", namespace = AIApiConstants.UIController.NAME)
    public static class ReplyEmail implements InstructionPayload {
        private Optional<String> name = Optional.a();
        private Optional<String> content = Optional.a();
        private Optional<String> receiver = Optional.a();
        private Optional<Boolean> reply_to_all = Optional.a();

        public Optional<String> getContent() {
            return this.content;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<String> getReceiver() {
            return this.receiver;
        }

        public Optional<Boolean> isReplyToAll() {
            return this.reply_to_all;
        }

        public ReplyEmail setContent(String str) {
            this.content = Optional.e(str);
            return this;
        }

        public ReplyEmail setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public ReplyEmail setReceiver(String str) {
            this.receiver = Optional.e(str);
            return this;
        }

        public ReplyEmail setReplyToAll(boolean z) {
            this.reply_to_all = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public enum ScreenshotType {
        UNKNOWN(-1),
        FULL_SCREEN(0),
        CURREN_WINDOW(1),
        SELECT_WINDOW(2);

        private int id;

        ScreenshotType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "SearchEmail", namespace = AIApiConstants.UIController.NAME)
    public static class SearchEmail implements InstructionPayload {
        private Optional<String> name = Optional.a();
        private Optional<String> sender = Optional.a();
        private Optional<String> receiver = Optional.a();
        private Optional<String> start_time = Optional.a();
        private Optional<String> end_time = Optional.a();

        public Optional<String> getEndTime() {
            return this.end_time;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<String> getReceiver() {
            return this.receiver;
        }

        public Optional<String> getSender() {
            return this.sender;
        }

        public Optional<String> getStartTime() {
            return this.start_time;
        }

        public SearchEmail setEndTime(String str) {
            this.end_time = Optional.e(str);
            return this;
        }

        public SearchEmail setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public SearchEmail setReceiver(String str) {
            this.receiver = Optional.e(str);
            return this;
        }

        public SearchEmail setSender(String str) {
            this.sender = Optional.e(str);
            return this;
        }

        public SearchEmail setStartTime(String str) {
            this.start_time = Optional.e(str);
            return this;
        }
    }

    public enum SearchFileType {
        UNKNOWN(-1),
        PICTURE(0),
        MUSIC(1),
        DOC(2),
        ARCHIVE(3),
        LARGE_DOC(4),
        ZIP(5),
        WORD(6),
        PPT(7),
        VIDEO(8),
        EXCEL(9),
        PDF(10),
        FOLDER(11),
        ALL(100);

        private int id;

        SearchFileType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "SendEmail", namespace = AIApiConstants.UIController.NAME)
    public static class SendEmail implements InstructionPayload {
        private Optional<String> receiver = Optional.a();
        private Optional<String> content = Optional.a();

        public Optional<String> getContent() {
            return this.content;
        }

        public Optional<String> getReceiver() {
            return this.receiver;
        }

        public SendEmail setContent(String str) {
            this.content = Optional.e(str);
            return this;
        }

        public SendEmail setReceiver(String str) {
            this.receiver = Optional.e(str);
            return this;
        }
    }

    @NamespaceName(name = "SetUIProperties", namespace = AIApiConstants.UIController.NAME)
    public static class SetUIProperties implements InstructionPayload {
        private Optional<Boolean> nav_back_from_outside = Optional.a();
        private Optional<Boolean> show_interaction_number = Optional.a();

        public Optional<Boolean> isNavBackFromOutside() {
            return this.nav_back_from_outside;
        }

        public Optional<Boolean> isShowInteractionNumber() {
            return this.show_interaction_number;
        }

        public SetUIProperties setNavBackFromOutside(boolean z) {
            this.nav_back_from_outside = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public SetUIProperties setShowInteractionNumber(boolean z) {
            this.show_interaction_number = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    @NamespaceName(name = "StartScreenProjection", namespace = AIApiConstants.UIController.NAME)
    public static class StartScreenProjection implements InstructionPayload {
        private Optional<Boolean> full_screen = Optional.a();
        private Optional<ControlDevice> control_device = Optional.a();

        public Optional<ControlDevice> getControlDevice() {
            return this.control_device;
        }

        public Optional<Boolean> isFullScreen() {
            return this.full_screen;
        }

        public StartScreenProjection setControlDevice(ControlDevice controlDevice) {
            this.control_device = Optional.e(controlDevice);
            return this;
        }

        public StartScreenProjection setFullScreen(boolean z) {
            this.full_screen = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    @NamespaceName(name = "SwitchScreen", namespace = AIApiConstants.UIController.NAME)
    public static class SwitchScreen implements InstructionPayload {
        private Optional<Integer> screen_index = Optional.a();
        private Optional<NavigateOp> screen_action = Optional.a();

        public Optional<NavigateOp> getScreenAction() {
            return this.screen_action;
        }

        public Optional<Integer> getScreenIndex() {
            return this.screen_index;
        }

        public SwitchScreen setScreenAction(NavigateOp navigateOp) {
            this.screen_action = Optional.e(navigateOp);
            return this;
        }

        public SwitchScreen setScreenIndex(int i) {
            this.screen_index = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "SwitchScreenProjection", namespace = AIApiConstants.UIController.NAME)
    public static class SwitchScreenProjection implements InstructionPayload {

        @Required
        private SwitchScreenProjectionType type;

        public SwitchScreenProjection() {
        }

        public SwitchScreenProjection(SwitchScreenProjectionType switchScreenProjectionType) {
            this.type = switchScreenProjectionType;
        }

        @Required
        public SwitchScreenProjectionType getType() {
            return this.type;
        }

        @Required
        public SwitchScreenProjection setType(SwitchScreenProjectionType switchScreenProjectionType) {
            this.type = switchScreenProjectionType;
            return this;
        }
    }

    public enum SwitchScreenProjectionType {
        UNKNOWN(-1),
        FULL(0),
        MIRROR(1);

        private int id;

        SwitchScreenProjectionType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum TurnItemOperationType {
        UNKNOWN(-1),
        ABSOLUTE(0),
        RELATIVE(1);

        private int id;

        TurnItemOperationType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ValueAdjustmentMethod {
        UNKNOWN(-1),
        BY_ABSOLUTE_VALUE(0),
        BY_PERCENTAGE(1);

        private int id;

        ValueAdjustmentMethod(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ViewPosition {
        UNKNOWN(-1),
        UP(0),
        DOWN(1),
        LEFT(2),
        RIGHT(3);

        private int id;

        ViewPosition(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class WindowInfo {

        @Required
        private WindowOperation operation;

        @Required
        private String pkg_name;

        public WindowInfo() {
        }

        public WindowInfo(String str, WindowOperation windowOperation) {
            this.pkg_name = str;
            this.operation = windowOperation;
        }

        @Required
        public WindowOperation getOperation() {
            return this.operation;
        }

        @Required
        public String getPkgName() {
            return this.pkg_name;
        }

        @Required
        public WindowInfo setOperation(WindowOperation windowOperation) {
            this.operation = windowOperation;
            return this;
        }

        @Required
        public WindowInfo setPkgName(String str) {
            this.pkg_name = str;
            return this;
        }
    }

    public enum WindowOperation {
        UNKNOWN(-1),
        DELETE(0),
        MAXIMIZE(1),
        BACK(2);

        private int id;

        WindowOperation(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class FlexibleWindow {
        private Optional<FlexibleWindowApp> app = Optional.a();

        @Required
        private int screen_index;

        @Required
        private FlexibleSize size;

        @Required
        private boolean visible;

        public FlexibleWindow() {
        }

        public Optional<FlexibleWindowApp> getApp() {
            return this.app;
        }

        @Required
        public int getScreenIndex() {
            return this.screen_index;
        }

        @Required
        public FlexibleSize getSize() {
            return this.size;
        }

        @Required
        public boolean isVisible() {
            return this.visible;
        }

        public FlexibleWindow setApp(FlexibleWindowApp flexibleWindowApp) {
            this.app = Optional.e(flexibleWindowApp);
            return this;
        }

        @Required
        public FlexibleWindow setScreenIndex(int i) {
            this.screen_index = i;
            return this;
        }

        @Required
        public FlexibleWindow setSize(FlexibleSize flexibleSize) {
            this.size = flexibleSize;
            return this;
        }

        @Required
        public FlexibleWindow setVisible(boolean z) {
            this.visible = z;
            return this;
        }

        public FlexibleWindow(FlexibleSize flexibleSize, int i, boolean z) {
            this.size = flexibleSize;
            this.screen_index = i;
            this.visible = z;
        }
    }

    @NamespaceName(name = "InputText", namespace = AIApiConstants.UIController.NAME)
    public static class InputText implements InstructionPayload {

        @Required
        private String text;
        private Optional<Template.Title> title = Optional.a();

        public InputText() {
        }

        @Required
        public String getText() {
            return this.text;
        }

        public Optional<Template.Title> getTitle() {
            return this.title;
        }

        @Required
        public InputText setText(String str) {
            this.text = str;
            return this;
        }

        public InputText setTitle(Template.Title title) {
            this.title = Optional.e(title);
            return this;
        }

        public InputText(String str) {
            this.text = str;
        }
    }

    @NamespaceName(name = "InteractionInfoList", namespace = AIApiConstants.UIController.NAME)
    public static class InteractionInfoList implements ContextPayload {
        private Optional<DisplayMetrics> metrics = Optional.a();

        @Required
        private List<InteractionInfo> pages;

        public InteractionInfoList() {
        }

        public Optional<DisplayMetrics> getMetrics() {
            return this.metrics;
        }

        @Required
        public List<InteractionInfo> getPages() {
            return this.pages;
        }

        public InteractionInfoList setMetrics(DisplayMetrics displayMetrics) {
            this.metrics = Optional.e(displayMetrics);
            return this;
        }

        @Required
        public InteractionInfoList setPages(List<InteractionInfo> list) {
            this.pages = list;
            return this;
        }

        public InteractionInfoList(List<InteractionInfo> list) {
            this.pages = list;
        }
    }

    public static class IntervalState {

        @Required
        private int current;

        @Required
        private int max;
        private Optional<Integer> min = Optional.a();

        public IntervalState() {
        }

        @Required
        public int getCurrent() {
            return this.current;
        }

        @Required
        public int getMax() {
            return this.max;
        }

        public Optional<Integer> getMin() {
            return this.min;
        }

        @Required
        public IntervalState setCurrent(int i) {
            this.current = i;
            return this;
        }

        @Required
        public IntervalState setMax(int i) {
            this.max = i;
            return this;
        }

        public IntervalState setMin(int i) {
            this.min = Optional.e(Integer.valueOf(i));
            return this;
        }

        public IntervalState(int i, int i2) {
            this.max = i;
            this.current = i2;
        }
    }

    @NamespaceName(name = "Navigate", namespace = AIApiConstants.UIController.NAME)
    public static class Navigate implements InstructionPayload {

        @Required
        private NavigateOp operation;
        private Optional<NavigateTarget> target = Optional.a();

        public Navigate() {
        }

        @Required
        public NavigateOp getOperation() {
            return this.operation;
        }

        public Optional<NavigateTarget> getTarget() {
            return this.target;
        }

        @Required
        public Navigate setOperation(NavigateOp navigateOp) {
            this.operation = navigateOp;
            return this;
        }

        public Navigate setTarget(NavigateTarget navigateTarget) {
            this.target = Optional.e(navigateTarget);
            return this;
        }

        public Navigate(NavigateOp navigateOp) {
            this.operation = navigateOp;
        }
    }

    @NamespaceName(name = "OperateScreenProjection", namespace = AIApiConstants.UIController.NAME)
    public static class OperateScreenProjection implements InstructionPayload {
        private Optional<Direction> swipe_direction = Optional.a();

        @Required
        private OperateScreenProjectionType type;

        public OperateScreenProjection() {
        }

        public Optional<Direction> getSwipeDirection() {
            return this.swipe_direction;
        }

        @Required
        public OperateScreenProjectionType getType() {
            return this.type;
        }

        public OperateScreenProjection setSwipeDirection(Direction direction) {
            this.swipe_direction = Optional.e(direction);
            return this;
        }

        @Required
        public OperateScreenProjection setType(OperateScreenProjectionType operateScreenProjectionType) {
            this.type = operateScreenProjectionType;
            return this;
        }

        public OperateScreenProjection(OperateScreenProjectionType operateScreenProjectionType) {
            this.type = operateScreenProjectionType;
        }
    }

    public static class PageItem {

        @Required
        private long cur_index;

        @Required
        private String id;

        @Required
        private long page_size;
        private Optional<String> pkg_name = Optional.a();

        @Required
        private List<Direction> support_dir;

        @Required
        private long total;

        public PageItem() {
        }

        @Required
        public long getCurIndex() {
            return this.cur_index;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public long getPageSize() {
            return this.page_size;
        }

        public Optional<String> getPkgName() {
            return this.pkg_name;
        }

        @Required
        public List<Direction> getSupportDir() {
            return this.support_dir;
        }

        @Required
        public long getTotal() {
            return this.total;
        }

        @Required
        public PageItem setCurIndex(long j) {
            this.cur_index = j;
            return this;
        }

        @Required
        public PageItem setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public PageItem setPageSize(long j) {
            this.page_size = j;
            return this;
        }

        public PageItem setPkgName(String str) {
            this.pkg_name = Optional.e(str);
            return this;
        }

        @Required
        public PageItem setSupportDir(List<Direction> list) {
            this.support_dir = list;
            return this;
        }

        @Required
        public PageItem setTotal(long j) {
            this.total = j;
            return this;
        }

        public PageItem(String str, long j, long j2, long j3, List<Direction> list) {
            this.id = str;
            this.cur_index = j;
            this.page_size = j2;
            this.total = j3;
            this.support_dir = list;
        }
    }

    @NamespaceName(name = "Screenshot", namespace = AIApiConstants.UIController.NAME)
    public static class Screenshot implements InstructionPayload {
        private Optional<String> app = Optional.a();

        @Required
        private ScreenshotType type;

        public Screenshot() {
        }

        public Optional<String> getApp() {
            return this.app;
        }

        @Required
        public ScreenshotType getType() {
            return this.type;
        }

        public Screenshot setApp(String str) {
            this.app = Optional.e(str);
            return this;
        }

        @Required
        public Screenshot setType(ScreenshotType screenshotType) {
            this.type = screenshotType;
            return this;
        }

        public Screenshot(ScreenshotType screenshotType) {
            this.type = screenshotType;
        }
    }

    @NamespaceName(name = "State", namespace = AIApiConstants.UIController.NAME)
    public static class State implements ContextPayload {
        private Optional<CardType> card_type = Optional.a();

        @Required
        private String page_id;

        public State() {
        }

        public Optional<CardType> getCardType() {
            return this.card_type;
        }

        @Required
        public String getPageId() {
            return this.page_id;
        }

        public State setCardType(CardType cardType) {
            this.card_type = Optional.e(cardType);
            return this;
        }

        @Required
        public State setPageId(String str) {
            this.page_id = str;
            return this;
        }

        public State(String str) {
            this.page_id = str;
        }
    }

    @NamespaceName(name = "FlexibleWindows", namespace = AIApiConstants.UIController.NAME)
    public static class FlexibleWindows implements ContextPayload {

        @Required
        private List<FlexibleWindow> windows;
        private Optional<FlexibleState> state = Optional.a();
        private Optional<FocusApp> focus_app = Optional.a();

        public FlexibleWindows() {
        }

        public Optional<FocusApp> getFocusApp() {
            return this.focus_app;
        }

        public Optional<FlexibleState> getState() {
            return this.state;
        }

        @Required
        public List<FlexibleWindow> getWindows() {
            return this.windows;
        }

        public FlexibleWindows setFocusApp(FocusApp focusApp) {
            this.focus_app = Optional.e(focusApp);
            return this;
        }

        public FlexibleWindows setState(FlexibleState flexibleState) {
            this.state = Optional.e(flexibleState);
            return this;
        }

        @Required
        public FlexibleWindows setWindows(List<FlexibleWindow> list) {
            this.windows = list;
            return this;
        }

        public FlexibleWindows(List<FlexibleWindow> list) {
            this.windows = list;
        }
    }

    public static class FocusApp {

        @Required
        private String package_name;
        private Optional<Float> confidence = Optional.a();
        private Optional<Long> update_time = Optional.a();

        public FocusApp() {
        }

        public Optional<Float> getConfidence() {
            return this.confidence;
        }

        @Required
        public String getPackageName() {
            return this.package_name;
        }

        public Optional<Long> getUpdateTime() {
            return this.update_time;
        }

        public FocusApp setConfidence(float f) {
            this.confidence = Optional.e(Float.valueOf(f));
            return this;
        }

        @Required
        public FocusApp setPackageName(String str) {
            this.package_name = str;
            return this;
        }

        public FocusApp setUpdateTime(long j) {
            this.update_time = Optional.e(Long.valueOf(j));
            return this;
        }

        public FocusApp(String str) {
            this.package_name = str;
        }
    }

    @NamespaceName(name = "TurnItem", namespace = AIApiConstants.UIController.NAME)
    public static class TurnItem implements InstructionPayload {

        @Required
        private String id;

        @Required
        private TurnItemOperationType type;
        private Optional<Direction> direction = Optional.a();
        private Optional<Long> value = Optional.a();

        public TurnItem() {
        }

        public Optional<Direction> getDirection() {
            return this.direction;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public TurnItemOperationType getType() {
            return this.type;
        }

        public Optional<Long> getValue() {
            return this.value;
        }

        public TurnItem setDirection(Direction direction) {
            this.direction = Optional.e(direction);
            return this;
        }

        @Required
        public TurnItem setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public TurnItem setType(TurnItemOperationType turnItemOperationType) {
            this.type = turnItemOperationType;
            return this;
        }

        public TurnItem setValue(long j) {
            this.value = Optional.e(Long.valueOf(j));
            return this;
        }

        public TurnItem(String str, TurnItemOperationType turnItemOperationType) {
            this.id = str;
            this.type = turnItemOperationType;
        }
    }

    @NamespaceName(name = "Interaction", namespace = AIApiConstants.UIController.NAME)
    public static class Interaction implements InstructionPayload {

        @Required
        private List<String> ids;

        @Required
        private String page_id;
        private Optional<InteractionOp> operation = Optional.a();
        private Optional<String> edit_content = Optional.a();

        @Deprecated
        private Optional<Integer> value = Optional.a();
        private Optional<InteractionDir> direction = Optional.a();
        private Optional<Float> value_v2 = Optional.a();

        public Interaction() {
        }

        public Optional<InteractionDir> getDirection() {
            return this.direction;
        }

        public Optional<String> getEditContent() {
            return this.edit_content;
        }

        @Required
        public List<String> getIds() {
            return this.ids;
        }

        public Optional<InteractionOp> getOperation() {
            return this.operation;
        }

        @Required
        public String getPageId() {
            return this.page_id;
        }

        @Deprecated
        public Optional<Integer> getValue() {
            return this.value;
        }

        public Optional<Float> getValueV2() {
            return this.value_v2;
        }

        public Interaction setDirection(InteractionDir interactionDir) {
            this.direction = Optional.e(interactionDir);
            return this;
        }

        public Interaction setEditContent(String str) {
            this.edit_content = Optional.e(str);
            return this;
        }

        @Required
        public Interaction setIds(List<String> list) {
            this.ids = list;
            return this;
        }

        public Interaction setOperation(InteractionOp interactionOp) {
            this.operation = Optional.e(interactionOp);
            return this;
        }

        @Required
        public Interaction setPageId(String str) {
            this.page_id = str;
            return this;
        }

        @Deprecated
        public Interaction setValue(int i) {
            this.value = Optional.e(Integer.valueOf(i));
            return this;
        }

        public Interaction setValueV2(float f) {
            this.value_v2 = Optional.e(Float.valueOf(f));
            return this;
        }

        public Interaction(String str, List<String> list) {
            this.page_id = str;
            this.ids = list;
        }
    }

    @NamespaceName(name = "SearchFile", namespace = AIApiConstants.UIController.NAME)
    public static class SearchFile implements InstructionPayload {

        @Required
        private String name;
        private Optional<SearchFileType> type = Optional.a();
        private Optional<String> start_time = Optional.a();
        private Optional<String> end_time = Optional.a();
        private Optional<Long> size = Optional.a();
        private Optional<FileSizeCompare> size_compare = Optional.a();
        private Optional<String> path = Optional.a();

        public SearchFile() {
        }

        public Optional<String> getEndTime() {
            return this.end_time;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<String> getPath() {
            return this.path;
        }

        public Optional<Long> getSize() {
            return this.size;
        }

        public Optional<FileSizeCompare> getSizeCompare() {
            return this.size_compare;
        }

        public Optional<String> getStartTime() {
            return this.start_time;
        }

        public Optional<SearchFileType> getType() {
            return this.type;
        }

        public SearchFile setEndTime(String str) {
            this.end_time = Optional.e(str);
            return this;
        }

        @Required
        public SearchFile setName(String str) {
            this.name = str;
            return this;
        }

        public SearchFile setPath(String str) {
            this.path = Optional.e(str);
            return this;
        }

        public SearchFile setSize(long j) {
            this.size = Optional.e(Long.valueOf(j));
            return this;
        }

        public SearchFile setSizeCompare(FileSizeCompare fileSizeCompare) {
            this.size_compare = Optional.e(fileSizeCompare);
            return this;
        }

        public SearchFile setStartTime(String str) {
            this.start_time = Optional.e(str);
            return this;
        }

        public SearchFile setType(SearchFileType searchFileType) {
            this.type = Optional.e(searchFileType);
            return this;
        }

        public SearchFile(String str) {
            this.name = str;
        }
    }

    @NamespaceName(name = "InteractionInfo", namespace = AIApiConstants.UIController.NAME)
    public static class InteractionInfo implements ContextPayload {

        @Required
        private List<InteractionControl> controls;

        @Required
        private String page_id;
        private Optional<String> category = Optional.a();
        private Optional<String> entity_index_key = Optional.a();
        private Optional<InteractionInfoPageType> page_type = Optional.a();
        private Optional<Long> level = Optional.a();
        private Optional<ControlLocation> location = Optional.a();
        private Optional<InteractionScreen> screens = Optional.a();
        private Optional<String> pkg_name = Optional.a();
        private Optional<Integer> number = Optional.a();

        public InteractionInfo() {
        }

        public Optional<String> getCategory() {
            return this.category;
        }

        @Required
        public List<InteractionControl> getControls() {
            return this.controls;
        }

        public Optional<String> getEntityIndexKey() {
            return this.entity_index_key;
        }

        public Optional<Long> getLevel() {
            return this.level;
        }

        public Optional<ControlLocation> getLocation() {
            return this.location;
        }

        public Optional<Integer> getNumber() {
            return this.number;
        }

        @Required
        public String getPageId() {
            return this.page_id;
        }

        public Optional<InteractionInfoPageType> getPageType() {
            return this.page_type;
        }

        public Optional<String> getPkgName() {
            return this.pkg_name;
        }

        public Optional<InteractionScreen> getScreens() {
            return this.screens;
        }

        public InteractionInfo setCategory(String str) {
            this.category = Optional.e(str);
            return this;
        }

        @Required
        public InteractionInfo setControls(List<InteractionControl> list) {
            this.controls = list;
            return this;
        }

        public InteractionInfo setEntityIndexKey(String str) {
            this.entity_index_key = Optional.e(str);
            return this;
        }

        public InteractionInfo setLevel(long j) {
            this.level = Optional.e(Long.valueOf(j));
            return this;
        }

        public InteractionInfo setLocation(ControlLocation controlLocation) {
            this.location = Optional.e(controlLocation);
            return this;
        }

        public InteractionInfo setNumber(int i) {
            this.number = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Required
        public InteractionInfo setPageId(String str) {
            this.page_id = str;
            return this;
        }

        public InteractionInfo setPageType(InteractionInfoPageType interactionInfoPageType) {
            this.page_type = Optional.e(interactionInfoPageType);
            return this;
        }

        public InteractionInfo setPkgName(String str) {
            this.pkg_name = Optional.e(str);
            return this;
        }

        public InteractionInfo setScreens(InteractionScreen interactionScreen) {
            this.screens = Optional.e(interactionScreen);
            return this;
        }

        public InteractionInfo(String str, List<InteractionControl> list) {
            this.page_id = str;
            this.controls = list;
        }
    }

    public static class InteractionControl {

        @Required
        private String id;

        @Required
        private List<InteractionOp> operation;
        private Optional<List<String>> texts = Optional.a();
        private Optional<Integer> number = Optional.a();
        private Optional<String> entity_id = Optional.a();
        private Optional<InteractionControlTextMatchMethod> text_match_method = Optional.a();

        @Deprecated
        private Optional<String> title = Optional.a();
        private Optional<List<String>> title_list = Optional.a();
        private Optional<InteractionControlType> control_type = Optional.a();
        private Optional<List<InteractionControlIntent>> intent = Optional.a();
        private Optional<InteractionButtonIntentType> button_intent = Optional.a();
        private Optional<Boolean> accessibility = Optional.a();
        private Optional<ControlState> state = Optional.a();

        @Deprecated
        private Optional<IntervalState> interval = Optional.a();
        private Optional<Integer> priority = Optional.a();
        private Optional<Long> level = Optional.a();
        private Optional<Boolean> is_select = Optional.a();
        private Optional<ViewPosition> window_view_position = Optional.a();
        private Optional<IncreasingDirection> increasing_direction = Optional.a();
        private Optional<Boolean> tts_disable = Optional.a();
        private Optional<IntervalStateV2> interval_v2 = Optional.a();
        private Optional<String> unit = Optional.a();
        private Optional<ControlLocation> location = Optional.a();
        private Optional<InteractionControlTag> tag = Optional.a();
        private Optional<ValueAdjustmentMethod> adjust_method = Optional.a();

        public InteractionControl() {
        }

        public Optional<ValueAdjustmentMethod> getAdjustMethod() {
            return this.adjust_method;
        }

        public Optional<InteractionButtonIntentType> getButtonIntent() {
            return this.button_intent;
        }

        public Optional<InteractionControlType> getControlType() {
            return this.control_type;
        }

        public Optional<String> getEntityId() {
            return this.entity_id;
        }

        @Required
        public String getId() {
            return this.id;
        }

        public Optional<IncreasingDirection> getIncreasingDirection() {
            return this.increasing_direction;
        }

        public Optional<List<InteractionControlIntent>> getIntent() {
            return this.intent;
        }

        @Deprecated
        public Optional<IntervalState> getInterval() {
            return this.interval;
        }

        public Optional<IntervalStateV2> getIntervalV2() {
            return this.interval_v2;
        }

        public Optional<Long> getLevel() {
            return this.level;
        }

        public Optional<ControlLocation> getLocation() {
            return this.location;
        }

        public Optional<Integer> getNumber() {
            return this.number;
        }

        @Required
        public List<InteractionOp> getOperation() {
            return this.operation;
        }

        public Optional<Integer> getPriority() {
            return this.priority;
        }

        public Optional<ControlState> getState() {
            return this.state;
        }

        public Optional<InteractionControlTag> getTag() {
            return this.tag;
        }

        public Optional<InteractionControlTextMatchMethod> getTextMatchMethod() {
            return this.text_match_method;
        }

        public Optional<List<String>> getTexts() {
            return this.texts;
        }

        @Deprecated
        public Optional<String> getTitle() {
            return this.title;
        }

        public Optional<List<String>> getTitleList() {
            return this.title_list;
        }

        public Optional<String> getUnit() {
            return this.unit;
        }

        public Optional<ViewPosition> getWindowViewPosition() {
            return this.window_view_position;
        }

        public Optional<Boolean> isAccessibility() {
            return this.accessibility;
        }

        public Optional<Boolean> isSelect() {
            return this.is_select;
        }

        public Optional<Boolean> isTtsDisable() {
            return this.tts_disable;
        }

        public InteractionControl setAccessibility(boolean z) {
            this.accessibility = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public InteractionControl setAdjustMethod(ValueAdjustmentMethod valueAdjustmentMethod) {
            this.adjust_method = Optional.e(valueAdjustmentMethod);
            return this;
        }

        public InteractionControl setButtonIntent(InteractionButtonIntentType interactionButtonIntentType) {
            this.button_intent = Optional.e(interactionButtonIntentType);
            return this;
        }

        public InteractionControl setControlType(InteractionControlType interactionControlType) {
            this.control_type = Optional.e(interactionControlType);
            return this;
        }

        public InteractionControl setEntityId(String str) {
            this.entity_id = Optional.e(str);
            return this;
        }

        @Required
        public InteractionControl setId(String str) {
            this.id = str;
            return this;
        }

        public InteractionControl setIncreasingDirection(IncreasingDirection increasingDirection) {
            this.increasing_direction = Optional.e(increasingDirection);
            return this;
        }

        public InteractionControl setIntent(List<InteractionControlIntent> list) {
            this.intent = Optional.e(list);
            return this;
        }

        @Deprecated
        public InteractionControl setInterval(IntervalState intervalState) {
            this.interval = Optional.e(intervalState);
            return this;
        }

        public InteractionControl setIntervalV2(IntervalStateV2 intervalStateV2) {
            this.interval_v2 = Optional.e(intervalStateV2);
            return this;
        }

        public InteractionControl setIsSelect(boolean z) {
            this.is_select = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public InteractionControl setLevel(long j) {
            this.level = Optional.e(Long.valueOf(j));
            return this;
        }

        public InteractionControl setLocation(ControlLocation controlLocation) {
            this.location = Optional.e(controlLocation);
            return this;
        }

        public InteractionControl setNumber(int i) {
            this.number = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Required
        public InteractionControl setOperation(List<InteractionOp> list) {
            this.operation = list;
            return this;
        }

        public InteractionControl setPriority(int i) {
            this.priority = Optional.e(Integer.valueOf(i));
            return this;
        }

        public InteractionControl setState(ControlState controlState) {
            this.state = Optional.e(controlState);
            return this;
        }

        public InteractionControl setTag(InteractionControlTag interactionControlTag) {
            this.tag = Optional.e(interactionControlTag);
            return this;
        }

        public InteractionControl setTextMatchMethod(InteractionControlTextMatchMethod interactionControlTextMatchMethod) {
            this.text_match_method = Optional.e(interactionControlTextMatchMethod);
            return this;
        }

        public InteractionControl setTexts(List<String> list) {
            this.texts = Optional.e(list);
            return this;
        }

        @Deprecated
        public InteractionControl setTitle(String str) {
            this.title = Optional.e(str);
            return this;
        }

        public InteractionControl setTitleList(List<String> list) {
            this.title_list = Optional.e(list);
            return this;
        }

        public InteractionControl setTtsDisable(boolean z) {
            this.tts_disable = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public InteractionControl setUnit(String str) {
            this.unit = Optional.e(str);
            return this;
        }

        public InteractionControl setWindowViewPosition(ViewPosition viewPosition) {
            this.window_view_position = Optional.e(viewPosition);
            return this;
        }

        public InteractionControl(String str, List<InteractionOp> list) {
            this.id = str;
            this.operation = list;
        }
    }
}
