package com.huami.sky.lib.constant;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.huami.android.zxing.Intents;
import com.huami.hmchartui.utils.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/huami/sky/lib/constant/WebConstant;", "", "<init>", "()V", MAPCookie.KEY_PATH, "QueryParam", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class WebConstant {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/huami/sky/lib/constant/WebConstant$Path;", "", "", "RECOMMEND_MUSIC", "Ljava/lang/String;", "RECOMMEND_MUSIC_EVENTS", "GET_SLEEP_RELAX_DATA", "GET_MUSIC_CARD", "GET_MUSIC_PREFERENCE_INFO", "GET_RELAX_SCORE", "FEATURE_UPDATE_TIP", "GET_RELAX_SURVEY", "APP_SETTING_URL", "<init>", "()V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Path {

        @NotNull
        public static final String APP_SETTING_URL = "apps/%s/settings";

        @NotNull
        public static final String FEATURE_UPDATE_TIP = "discovery/watch/cards/feature_update_tips";

        @NotNull
        public static final String GET_MUSIC_CARD = "relaxMusic/card";

        @NotNull
        public static final String GET_MUSIC_PREFERENCE_INFO = "relaxMusic/preferenceItems";

        @NotNull
        public static final String GET_RELAX_SCORE = "relaxMusic/relaxationValues";

        @NotNull
        public static final String GET_RELAX_SURVEY = "relaxMusic/userReach/surveyUrl";

        @NotNull
        public static final String GET_SLEEP_RELAX_DATA = "relaxMusic/sleepDetails";

        @NotNull
        public static final Path INSTANCE = new Path();

        @NotNull
        public static final String RECOMMEND_MUSIC = "relaxMusic";

        @NotNull
        public static final String RECOMMEND_MUSIC_EVENTS = "relaxMusic/events";

        private Path() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b*\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0016\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0016\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0016\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0016\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0016\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004R\u0016\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0016\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0004R\u0016\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0016\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0004R\u0016\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0016\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0004R\u0016\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0004R\u0016\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0004R\u0016\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0004R\u0016\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0004R\u0016\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0004R\u0016\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0004¨\u0006,"}, d2 = {"Lcom/huami/sky/lib/constant/WebConstant$QueryParam;", "", "", "LAUNCH", "Ljava/lang/String;", "SWITCH", "TYPE_ACTIVITY", "TYPE_RR_INTERVAL", "TYPE_MUSIC_PLAY_RECORD", "TYPE_HUMAN_ACTION", "TYPE_HEART_RATE", "TYPE_DEVICE_STATUS", "VALUE", "SLEEP_PROBABILITY", "DEEP_SLEEP_PROBABILITY", "REM_PROBABILITY", QueryParam.TYPE_RR_INTERVAL, "RR_INTERVAL_TIME", "CLIP_ID", "STATUS", Intents.WifiConnect.TYPE, "GENERATED_AT", "DATA", "SLEEP_START_TIME", "SLEEP_END_TIME", "START_TIME", "END_TIME", "TOP", "PAUSE_TYPE", "TIMESTAMP", "USER_COUNTRY", "USER_REGION", "TYPE_MUSIC", "TYPE_MUSIC_DETAIL", "LAST_SHOW_AT", Constant.USER_ID, "USER_COUNTRY_PROMOTION", "USER_REGION_PROMOTION", "DEVICE_ID_PROMOTION", "DEVICE_SOURCE", "FADE_IN_OUT_SETTING_NAME", "APP_SETTING_URL_MODE", "<init>", "()V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryParam {

        @NotNull
        public static final String APP_SETTING_URL_MODE = "SINGLE";

        @NotNull
        public static final String CLIP_ID = "clipId";

        @NotNull
        public static final String DATA = "data";

        @NotNull
        public static final String DEEP_SLEEP_PROBABILITY = "deepSleepProbability";

        @NotNull
        public static final String DEVICE_ID_PROMOTION = "device_id";

        @NotNull
        public static final String DEVICE_SOURCE = "source";

        @NotNull
        public static final String END_TIME = "endTimestamp";

        @NotNull
        public static final String FADE_IN_OUT_SETTING_NAME = "relax.music.fadeInOut";

        @NotNull
        public static final String GENERATED_AT = "generatedAt";

        @NotNull
        public static final QueryParam INSTANCE = new QueryParam();

        @NotNull
        public static final String LAST_SHOW_AT = "lastUpgradeInfoShowedAt";

        @NotNull
        public static final String LAUNCH = "launch";

        @NotNull
        public static final String PAUSE_TYPE = "pauseType";

        @NotNull
        public static final String REM_PROBABILITY = "remProbability";

        @NotNull
        public static final String RR_INTERVAL = "rrInterval";

        @NotNull
        public static final String RR_INTERVAL_TIME = "rrIntervalTimestamp";

        @NotNull
        public static final String SLEEP_END_TIME = "sleepEndTimestamp";

        @NotNull
        public static final String SLEEP_PROBABILITY = "sleepProbability";

        @NotNull
        public static final String SLEEP_START_TIME = "sleepStartTimestamp";

        @NotNull
        public static final String START_TIME = "startTimestamp";

        @NotNull
        public static final String STATUS = "status";

        @NotNull
        public static final String SWITCH = "switch";

        @NotNull
        public static final String TIMESTAMP = "timestamp";

        @NotNull
        public static final String TOP = "top";

        @NotNull
        public static final String TYPE = "type";

        @NotNull
        public static final String TYPE_ACTIVITY = "ACTIVITY";

        @NotNull
        public static final String TYPE_DEVICE_STATUS = "DEVICE_STATUS";

        @NotNull
        public static final String TYPE_HEART_RATE = "HEART_RATE";

        @NotNull
        public static final String TYPE_HUMAN_ACTION = "HUMAN_ACTION";

        @NotNull
        public static final String TYPE_MUSIC = "music";

        @NotNull
        public static final String TYPE_MUSIC_DETAIL = "musicDetail";

        @NotNull
        public static final String TYPE_MUSIC_PLAY_RECORD = "MUSIC_PLAY_RECORD";

        @NotNull
        public static final String TYPE_RR_INTERVAL = "RR_INTERVAL";

        @NotNull
        public static final String USER_COUNTRY = "userCountry";

        @NotNull
        public static final String USER_COUNTRY_PROMOTION = "user_country";

        @NotNull
        public static final String USER_ID = "userid";

        @NotNull
        public static final String USER_REGION = "userRegion";

        @NotNull
        public static final String USER_REGION_PROMOTION = "user_region";

        @NotNull
        public static final String VALUE = "value";

        private QueryParam() {
        }
    }
}
