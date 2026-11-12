package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.mj1;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class Common {

    public enum AudioType {
        UNKNOWN(-1),
        MUSIC(0),
        NEWS(1),
        RADIO_STATION(2),
        BOOKS(3),
        ANCIENT_POEM(4),
        WHITE_NOISE(5),
        VOICE(6),
        JOKE(7),
        TRANSLATION(8),
        TTS(9),
        ALERT_SOUND(10),
        QABOT_VIDEO(11),
        REST_MODE(12);

        private int id;

        AudioType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum BLNMode {
        UNKNOWN(-1),
        STATIC(0),
        SLOW(1),
        QUICK(2);

        private int id;

        BLNMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class ClipResource {
        private Optional<String> style = Optional.a();
        private Optional<String> desc = Optional.a();

        public Optional<String> getDesc() {
            return this.desc;
        }

        public Optional<String> getStyle() {
            return this.style;
        }

        public ClipResource setDesc(String str) {
            this.desc = Optional.e(str);
            return this;
        }

        public ClipResource setStyle(String str) {
            this.style = Optional.e(str);
            return this;
        }
    }

    public enum Color {
        UNKNOWN(-1),
        WHITE(0),
        BLUE(1),
        DARK_BLUE(2),
        BLUE_PURPLE(3),
        PURPLE(4),
        PINK(5),
        ROSE_RED(6),
        RED(7),
        ORANGE(8),
        YELLOW(9),
        YELLOW_GREEN(10),
        GREEN(11),
        BLUE_GREEN(12),
        CYAN(13),
        RED_BLUE(14),
        YELLOW_RED(15),
        CYAN_BLUE(16),
        PURPLE_CYAN_BLUE(17),
        PINK_YELLOW(18),
        CYAN_YELLOW_GREEN(19),
        BRIGHT_WHITE(20),
        DARK_PINK(21);

        private int id;

        Color(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum CommonDeviceCategory {
        UNKNOWN(-1),
        DEVICE_SOUNDBOX(0),
        DEVICE_STORYTELLER(1),
        DEVICE_TV(2),
        DEVICE_APPLIANCES(3),
        DEVICE_SMARTHOME(4),
        DEVICE_WEARABLES(5),
        DEVICE_PHONE(6),
        DEVICE_ROBOTS(7),
        DEVICE_HEADPHONES(8),
        DEVICE_AUTOMOTIVE(9),
        DEVICE_PC(10),
        DEVICE_TRANSPORTATIONS(11),
        APP_APPLICATION(12),
        DEVICE_PAD(13);

        private int id;

        CommonDeviceCategory(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum CommonMode {
        UNKNOWN(-1),
        AUTO(0),
        MODE_1(1),
        MODE_2(2),
        MODE_3(3),
        MODE_4(4),
        MODE_5(5),
        MODE_6(6);

        private int id;

        CommonMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum DriveMode {
        UNKNOWN(-1),
        SPORT(0),
        COSY(1),
        RACE(2),
        USER_DEFINED_1(3),
        USER_DEFINED_2(4),
        SPORT_PLUS(5);

        private int id;

        DriveMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum DriveSceneMode {
        UNKNOWN(-1),
        ECONOMICAL(0),
        SNOW(1),
        PULL_CAR(2),
        CAR_WASH(3),
        RESCUE(4),
        CATAPULT(5),
        VIOLENT(6),
        TRAILER(7);

        private int id;

        DriveSceneMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ElectricityUnit {
        UNKNOWN(-1),
        PERCENT(0),
        STANDARD_ENDURANCE(1),
        ESTIMATED_ENDURANCE(2);

        private int id;

        ElectricityUnit(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum EmotionType {
        UNKNOWN(-1),
        JOYFUL(0),
        SAD(1),
        STUCK_ON(2),
        EXCITED(3),
        ANXIETY(4),
        EXPECT(5),
        PROUND(6),
        SHY(7),
        NAUGHTY(8),
        HAPPY(9),
        CONFUSED(10),
        DELIGHTED(11),
        EMBARRASS(12),
        THANKFUL(13),
        CALM(14),
        AMUSE(15),
        WORRY(16),
        AMAZE(17),
        ANGRY(18),
        DOUBT(19),
        TRUST(20),
        HATE(21),
        FEAR(22),
        CARE(23),
        ENCOURAGE(24),
        SATISFIED(25),
        PASSION(26),
        WARMHEARTED(27),
        INTERESTED(28);

        private int id;

        EmotionType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum Gender {
        UNKNOWN(0),
        MALE(1),
        FEMALE(2),
        CHILD(3);

        private int id;

        Gender(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum GenderType {
        UNKNOWN(-1),
        MALE(0),
        FEMALE(1),
        CHILD(2);

        private int id;

        GenderType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum KeyWordFreeType {
        UNKNOWN(-1),
        INSTRUCTION_KEY_WORD_FREE(0),
        PREFIX_NICKNAME_KEY_WORD_FREE(1),
        SUFFIX_NICKNAME_KEY_WORD_FREE(2);

        private int id;

        KeyWordFreeType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum LightMode {
        UNKNOWN(-1),
        TOPIC(0),
        EASY(1),
        SKY_WALK(2),
        USER_DEFINED(3),
        SPEED_SURGING(4),
        QUIET_IMAGINATION(5),
        ALWAYS_ON_MODE(6),
        BREATH_MODE(7),
        RHYTHM_MODE(8);

        private int id;

        LightMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class LoadmoreInfo {
        private Optional<Boolean> needs_loadmore = Optional.a();
        private Optional<String> origin_id = Optional.a();
        private Optional<Integer> delta = Optional.a();
        private Optional<String> token = Optional.a();

        public Optional<Integer> getDelta() {
            return this.delta;
        }

        public Optional<String> getOriginId() {
            return this.origin_id;
        }

        public Optional<String> getToken() {
            return this.token;
        }

        public Optional<Boolean> isNeedsLoadmore() {
            return this.needs_loadmore;
        }

        public LoadmoreInfo setDelta(int i) {
            this.delta = Optional.e(Integer.valueOf(i));
            return this;
        }

        public LoadmoreInfo setNeedsLoadmore(boolean z) {
            this.needs_loadmore = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public LoadmoreInfo setOriginId(String str) {
            this.origin_id = Optional.e(str);
            return this;
        }

        public LoadmoreInfo setToken(String str) {
            this.token = Optional.e(str);
            return this;
        }
    }

    public enum LocaleRegion {
        UNKNOWN(-1),
        MAINLAND(0),
        SINGAPORE(1);

        private int id;

        LocaleRegion(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum MobileMIUI13DeviceAuthCode {
        UNKNOWN(-1),
        READ_WRITE_STORAGE(0),
        CAMERA(1),
        RECORDING(2),
        SEND_MESSAGE(3),
        READ_MESSAGE(4),
        READ_MULTIMEDIA_MESSAGE(5),
        CALL_TELEPHONE(6),
        TELEPHONE(7),
        CHANGE_CONTACTS(8),
        READ_CONTACTS(9),
        READ_TEL_RECORDS(10),
        LOCATION(11),
        ACCESS_MOBILE_INFO(12),
        READ_APPLICATIONS(13),
        ACCESS_CALENDAR(14),
        ACCESS_MOBILEPHONE_ACCOUNT(15),
        SYSTEM_SETTING(16),
        SHOW_FLOATING_WINDOW(17),
        READ_PHONE_STATE(18),
        BLUETOOTH_CONNECT(19),
        BLUETOOTH_PRIVILEGED(20);

        private int id;

        MobileMIUI13DeviceAuthCode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class MultiExecutionSequences {

        @Required
        private List<mj1> secondaries;

        public MultiExecutionSequences() {
        }

        public MultiExecutionSequences(List<mj1> list) {
            this.secondaries = list;
        }

        @Required
        public List<mj1> getSecondaries() {
            return this.secondaries;
        }

        @Required
        public MultiExecutionSequences setSecondaries(List<mj1> list) {
            this.secondaries = list;
            return this;
        }
    }

    public enum PageLoadType {
        UNKNOWN(-1),
        REFRESH(0),
        APPEND(1),
        PARTIAL_REFRESH(2);

        private int id;

        PageLoadType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum PaymentType {
        UNKNOWN(-1),
        Free(1),
        Pay(2);

        private int id;

        PaymentType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum PlayMode {
        UNKNOWN(-1),
        SINGLE_LOOP(0),
        LIST_LOOP(1),
        RANDOM_LOOP(2),
        SEQUENCE(3);

        private int id;

        PlayMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class PropItem {

        @Required
        private String name;

        @Required
        private String value;

        public PropItem() {
        }

        public PropItem(String str, String str2) {
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
        public PropItem setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public PropItem setValue(String str) {
            this.value = str;
            return this;
        }
    }

    public enum RhythmType {
        UNKNOWN(-1),
        CURRENT_COLOR(0),
        CURRENT_MUSIC_PAGE_COLOR(1),
        BOTTOM_TO_TOP(2),
        TOP_TO_BOTTOM(3),
        MIDDLE_TO_SIDE(4),
        SIDE_TO_MIDDLE(5);

        private int id;

        RhythmType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class SlotInfo {

        @Required
        private String name;

        @Required
        private String value;

        public SlotInfo() {
        }

        public SlotInfo(String str, String str2) {
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
        public SlotInfo setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public SlotInfo setValue(String str) {
            this.value = str;
            return this;
        }
    }

    public enum TTSCodec {
        UNKNOWN(-1),
        MP3(0),
        WAV(1),
        OPUS(2),
        OPUS2(3),
        PCM(4);

        private int id;

        TTSCodec(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum TimeFormat {
        UNKNOWN(-1),
        HOUR_12(0),
        HOUR_24(1);

        private int id;

        TimeFormat(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class VideoCutMessage {

        @Required
        private VideoCutStatusCode code;

        @Required
        private String message;

        public VideoCutMessage() {
        }

        public VideoCutMessage(VideoCutStatusCode videoCutStatusCode, String str) {
            this.code = videoCutStatusCode;
            this.message = str;
        }

        @Required
        public VideoCutStatusCode getCode() {
            return this.code;
        }

        @Required
        public String getMessage() {
            return this.message;
        }

        @Required
        public VideoCutMessage setCode(VideoCutStatusCode videoCutStatusCode) {
            this.code = videoCutStatusCode;
            return this;
        }

        @Required
        public VideoCutMessage setMessage(String str) {
            this.message = str;
            return this;
        }
    }

    public enum VideoCutStatusCode {
        UNKNOWN(-1),
        SUC(0),
        NO_MATERIAL(1),
        DEVICE_NOT_SUPPORT(2),
        VERSION_NOT_SUPPORT(3),
        ALGO_NOT_DOWNLOAD_DONE(4),
        MODEL_NOT_COMPLETE(5),
        LARGE_MODEL_CLOSED(6),
        MATERIAL_TOO_MUCH(7),
        PROCESSING(8),
        CTA_NOT_PASS(9),
        CUT_FAIL(10),
        CONNECTION_FAIL(11),
        MATERIAL_SEARCH_FAIL(12),
        AUTOVIDEO_ERROR_FILES_NOT_SUPPORT(13),
        AI_SYSTEM_NOT_INSTALL(14),
        URI_OR_METHOD_IS_NULL(15),
        URI_NOT_KNOWN(16),
        AI_SYSTEM_VERSION_NOT_SUPPORT(17),
        NO_PERMISSION(18),
        ALBUM_VERSION_LOW(19),
        ALBUM_EDIT_VERSION_LOW(20),
        ALBUM_CTA_NOT_PASS(21),
        ALBUM_EDIT_CTA_NOT_PASS(22);

        private int id;

        VideoCutStatusCode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum VideoMediaType {
        UNKNOWN(-1),
        LONG_VIDEO(0),
        SHORT_VIDEO(1),
        STATION(2),
        NEWS(3),
        GAME(4),
        OPEN_CLASS(5),
        STATION_VIDEO(6),
        NEWS_VIDEO(7),
        GAME_VIDEO(8),
        OPEN_CLASS_VIDEO(9);

        private int id;

        VideoMediaType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum Weekday {
        UNKNOWN(-1),
        MONDAY(0),
        TUESDAY(1),
        WEDNESDAY(2),
        THURSDAY(3),
        FRIDAY(4),
        SATURDAY(5),
        SUNDAY(6);

        private int id;

        Weekday(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class UserInfo {

        @Required
        private Gender gender;
        private Optional<Long> user_id = Optional.a();

        public UserInfo() {
        }

        @Required
        public Gender getGender() {
            return this.gender;
        }

        public Optional<Long> getUserId() {
            return this.user_id;
        }

        @Required
        public UserInfo setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public UserInfo setUserId(long j) {
            this.user_id = Optional.e(Long.valueOf(j));
            return this;
        }

        public UserInfo(Gender gender) {
            this.gender = gender;
        }
    }

    public static class GeneralQuickAppInfo {

        @Required
        private String path;

        @Required
        private String pkg_name;
        private Optional<String> parameters = Optional.a();
        private Optional<c4h> extra = Optional.a();

        public GeneralQuickAppInfo() {
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

        public GeneralQuickAppInfo setExtra(c4h c4hVar) {
            this.extra = Optional.e(c4hVar);
            return this;
        }

        public GeneralQuickAppInfo setParameters(String str) {
            this.parameters = Optional.e(str);
            return this;
        }

        @Required
        public GeneralQuickAppInfo setPath(String str) {
            this.path = str;
            return this;
        }

        @Required
        public GeneralQuickAppInfo setPkgName(String str) {
            this.pkg_name = str;
            return this;
        }

        public GeneralQuickAppInfo(String str, String str2) {
            this.pkg_name = str;
            this.path = str2;
        }
    }

    public static class TTSTone {

        @Required
        private String vendor;
        private Optional<String> speaker = Optional.a();
        private Optional<String> lang = Optional.a();

        public TTSTone() {
        }

        public Optional<String> getLang() {
            return this.lang;
        }

        public Optional<String> getSpeaker() {
            return this.speaker;
        }

        @Required
        public String getVendor() {
            return this.vendor;
        }

        public TTSTone setLang(String str) {
            this.lang = Optional.e(str);
            return this;
        }

        public TTSTone setSpeaker(String str) {
            this.speaker = Optional.e(str);
            return this;
        }

        @Required
        public TTSTone setVendor(String str) {
            this.vendor = str;
            return this;
        }

        public TTSTone(String str) {
            this.vendor = str;
        }
    }
}
