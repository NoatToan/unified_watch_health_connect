package com.huami.sky.ui.analytic;

import android.text.TextUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sky.ui.koin.SkyServiceKoinScopeKt;
import com.huami.sky.ui.play.SkyPlayServiceHelper;
import com.huami.tools.analytics.DbUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b5\u001a6\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0000\u001a\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000\u001a\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0000\u001a\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0000\u001a\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0000\u001a\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000\u001a\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000f\"\u0016\u0010\u0011\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0016\u0010\u0013\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012\"\u0016\u0010\u0014\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"\u0016\u0010\u0015\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012\"\u0016\u0010\u0016\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012\"\u0016\u0010\u0017\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012\"\u0016\u0010\u0018\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012\"\u0016\u0010\u0019\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012\"\u0016\u0010\u001a\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012\"\u0016\u0010\u001b\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012\"\u0016\u0010\u001c\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012\"\u0016\u0010\u001d\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0012\"\u0016\u0010\u001e\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012\"\u0016\u0010\u001f\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0012\"\u0016\u0010 \u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0012\"\u0016\u0010!\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\u0012\"\u0016\u0010\"\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010\u0012\"\u0016\u0010#\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010\u0012\"\u0016\u0010$\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010\u0012\"\u0016\u0010%\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010\u0012\"\u0016\u0010&\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010\u0012\"\u0016\u0010'\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010\u0012\"\u0016\u0010(\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010\u0012\"\u0016\u0010)\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b)\u0010\u0012\"\u0016\u0010*\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b*\u0010\u0012\"\u0016\u0010+\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b+\u0010\u0012\"\u0016\u0010,\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b,\u0010\u0012\"\u0016\u0010-\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b-\u0010\u0012\"\u0016\u0010.\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b.\u0010\u0012\"\u0016\u0010/\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u0010\u0012\"\u0016\u00100\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u0010\u0012\"\u0016\u00101\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010\u0012\"\u0016\u00102\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b2\u0010\u0012\"\u0016\u00103\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u0012\"\u0016\u00104\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u0012\"\u0016\u00105\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\u0012\"\u0016\u00106\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u0012\"\u0016\u00107\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\u0012\"\u0016\u00108\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\u0012\"\u0016\u00109\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b9\u0010\u0012\"\u0016\u0010:\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b:\u0010\u0012\"\u0016\u0010;\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b;\u0010\u0012\"\u0016\u0010<\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b<\u0010\u0012\"\u0016\u0010=\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b=\u0010\u0012\"\u0016\u0010>\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b>\u0010\u0012\"\u0016\u0010?\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b?\u0010\u0012\"\u0016\u0010@\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b@\u0010\u0012\"\u0016\u0010A\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bA\u0010\u0012\"\u0016\u0010B\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bB\u0010\u0012\"\u0016\u0010C\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bC\u0010\u0012¨\u0006D"}, d2 = {"", DbUtils.Const.Columns.Event.EVENT_ID, "from", "musicId", "status", "sessionId", "", "recordEvent", "type", "recordDeviceStatus", "error", "recordPlayError", WebConstant.QueryParam.CLIP_ID, "recordPlayLoaded", "recordPlayStarted", "", "extras", SkyPlayEventKt.AIMUSIC_PLAYER_V, "Ljava/lang/String;", SkyPlayEventKt.AIMUSIC_PLAYER_T, SkyPlayEventKt.AIMUSIC_PLAYER_PLAY_C, SkyPlayEventKt.AIMUSIC_PLAYER_PAUSE_C, SkyPlayEventKt.AIMUSIC_PLAYER_LIKE_C, SkyPlayEventKt.AIMUSIC_PLAYER_DISLIKE_C, SkyPlayEventKt.AIMUSIC_PLAYER_AUTOPAUSE_C, SkyPlayEventKt.AIMUSIC_GUIDE1_V, SkyPlayEventKt.AIMUSIC_GUIDE2_V, SkyPlayEventKt.AIMUSIC_GUIDE3_V, SkyPlayEventKt.AIMUSIC_GUIDE4_V, SkyPlayEventKt.AIMUSIC_GUIDE_QUIT_C, SkyPlayEventKt.AIMUSIC_GUIDE_PLAY_C, SkyPlayEventKt.AIMUSIC_PLAYER_TIMING_C, SkyPlayEventKt.AIMUSIC_PLAYER_INTRO_C, SkyPlayEventKt.AIMUSIC_INTRO_V, SkyPlayEventKt.AIMUSIC_INTRO_C, SkyPlayEventKt.AIMUSIC_PLAYER_DATA_C, SkyPlayEventKt.AIMUSIC_PLAYER_SETTING_C, SkyPlayEventKt.AIMUSIC_PLAYER_MUSICLIKE_C, SkyPlayEventKt.AIMUSIC_PLAYER_NOTICE_V, SkyPlayEventKt.AIMUSIC_UPDATE_POPUP_V, SkyPlayEventKt.AIMUSIC_UPDATE_POPUP_OK_V, SkyPlayEventKt.AIMUSIC_UPDATE_POPUP_DIRECT_V, SkyPlayEventKt.AIMUSIC_UPDATE_POPUP_UPDATE_V, SkyPlayEventKt.AIMUSIC_DATA_T, SkyPlayEventKt.AIMUSIC_DATA_C, SkyPlayEventKt.AIMUSIC_RTDATA_MOREINFO_C, SkyPlayEventKt.AIMUSIC_PLAYER_PLAYSTART_E, SkyPlayEventKt.AIMUSIC_PLAYER_PLAYSTART_URL_E, SkyPlayEventKt.AIMUSIC_PLAYER_PLAYSUCCESS_URL_E, SkyPlayEventKt.AIMUSIC_PLAYERCOMEFROM_V, SkyPlayEventKt.AIMUSIC_PLAYER_NOTICE_CLOSE_C, "AUTO_PAUSE_STATUS", "MANUAL_PAUSE_STATUS", "SKY_MUSIC_LIKE", "SKY_MUSIC_LIKE_CANCEL", "FROM_PLAYER", "FROM_NOTIFICATION", "DEVICE_NOT_SUPPORT_SKY", "DEVICE_NOT_CONNECTED", "DEVICE_CONNECTING", "DEVICE_CONNECT_SUCCESS", "REQUEST_ERROR", "PLAY_ERROR", SkyPlayEventKt.AIMUSIC_VOLUME_PLUS_C, SkyPlayEventKt.AIMUSIC_VOLUME_REDUCTION_C, "AIMUSIC_SURVEY_SHOW", "AIMUSIC_SURVEY_LOADING_START", "AIMUSIC_SURVEY_LOADING_SUCCESS", "sky-ui_release"}, k = 2, mv = {1, 5, 1})
public final class SkyPlayEventKt {

    @NotNull
    public static final String AIMUSIC_DATA_C = "AIMUSIC_DATA_C";

    @NotNull
    public static final String AIMUSIC_DATA_T = "AIMUSIC_DATA_T";

    @NotNull
    public static final String AIMUSIC_GUIDE1_V = "AIMUSIC_GUIDE1_V";

    @NotNull
    public static final String AIMUSIC_GUIDE2_V = "AIMUSIC_GUIDE2_V";

    @NotNull
    public static final String AIMUSIC_GUIDE3_V = "AIMUSIC_GUIDE3_V";

    @NotNull
    public static final String AIMUSIC_GUIDE4_V = "AIMUSIC_GUIDE4_V";

    @NotNull
    public static final String AIMUSIC_GUIDE_PLAY_C = "AIMUSIC_GUIDE_PLAY_C";

    @NotNull
    public static final String AIMUSIC_GUIDE_QUIT_C = "AIMUSIC_GUIDE_QUIT_C";

    @NotNull
    public static final String AIMUSIC_INTRO_C = "AIMUSIC_INTRO_C";

    @NotNull
    public static final String AIMUSIC_INTRO_V = "AIMUSIC_INTRO_V";

    @NotNull
    public static final String AIMUSIC_PLAYERCOMEFROM_V = "AIMUSIC_PLAYERCOMEFROM_V";

    @NotNull
    public static final String AIMUSIC_PLAYER_AUTOPAUSE_C = "AIMUSIC_PLAYER_AUTOPAUSE_C";

    @NotNull
    public static final String AIMUSIC_PLAYER_DATA_C = "AIMUSIC_PLAYER_DATA_C";

    @NotNull
    public static final String AIMUSIC_PLAYER_DISLIKE_C = "AIMUSIC_PLAYER_DISLIKE_C";

    @NotNull
    public static final String AIMUSIC_PLAYER_INTRO_C = "AIMUSIC_PLAYER_INTRO_C";

    @NotNull
    public static final String AIMUSIC_PLAYER_LIKE_C = "AIMUSIC_PLAYER_LIKE_C";

    @NotNull
    public static final String AIMUSIC_PLAYER_MUSICLIKE_C = "AIMUSIC_PLAYER_MUSICLIKE_C";

    @NotNull
    public static final String AIMUSIC_PLAYER_NOTICE_CLOSE_C = "AIMUSIC_PLAYER_NOTICE_CLOSE_C";

    @NotNull
    public static final String AIMUSIC_PLAYER_NOTICE_V = "AIMUSIC_PLAYER_NOTICE_V";

    @NotNull
    public static final String AIMUSIC_PLAYER_PAUSE_C = "AIMUSIC_PLAYER_PAUSE_C";

    @NotNull
    public static final String AIMUSIC_PLAYER_PLAYSTART_E = "AIMUSIC_PLAYER_PLAYSTART_E";

    @NotNull
    public static final String AIMUSIC_PLAYER_PLAYSTART_URL_E = "AIMUSIC_PLAYER_PLAYSTART_URL_E";

    @NotNull
    public static final String AIMUSIC_PLAYER_PLAYSUCCESS_URL_E = "AIMUSIC_PLAYER_PLAYSUCCESS_URL_E";

    @NotNull
    public static final String AIMUSIC_PLAYER_PLAY_C = "AIMUSIC_PLAYER_PLAY_C";

    @NotNull
    public static final String AIMUSIC_PLAYER_SETTING_C = "AIMUSIC_PLAYER_SETTING_C";

    @NotNull
    public static final String AIMUSIC_PLAYER_T = "AIMUSIC_PLAYER_T";

    @NotNull
    public static final String AIMUSIC_PLAYER_TIMING_C = "AIMUSIC_PLAYER_TIMING_C";

    @NotNull
    public static final String AIMUSIC_PLAYER_V = "AIMUSIC_PLAYER_V";

    @NotNull
    public static final String AIMUSIC_RTDATA_MOREINFO_C = "AIMUSIC_RTDATA_MOREINFO_C";

    @NotNull
    public static final String AIMUSIC_SURVEY_LOADING_START = "AIMUSIC_PLAYER_JUMPFEEDBACK_SUBMIT_LOADING_E";

    @NotNull
    public static final String AIMUSIC_SURVEY_LOADING_SUCCESS = "AIMUSIC_PLAYER_JUMPFEEDBACK_SUBMIT_LOADING_SUCCESS_E";

    @NotNull
    public static final String AIMUSIC_SURVEY_SHOW = "AIMUSIC_PLAYER_JUMPFEEDBACK_V";

    @NotNull
    public static final String AIMUSIC_UPDATE_POPUP_DIRECT_V = "AIMUSIC_UPDATE_POPUP_DIRECT_V";

    @NotNull
    public static final String AIMUSIC_UPDATE_POPUP_OK_V = "AIMUSIC_UPDATE_POPUP_OK_V";

    @NotNull
    public static final String AIMUSIC_UPDATE_POPUP_UPDATE_V = "AIMUSIC_UPDATE_POPUP_UPDATE_V";

    @NotNull
    public static final String AIMUSIC_UPDATE_POPUP_V = "AIMUSIC_UPDATE_POPUP_V";

    @NotNull
    public static final String AIMUSIC_VOLUME_PLUS_C = "AIMUSIC_VOLUME_PLUS_C";

    @NotNull
    public static final String AIMUSIC_VOLUME_REDUCTION_C = "AIMUSIC_VOLUME_REDUCTION_C";

    @NotNull
    public static final String AUTO_PAUSE_STATUS = "0";

    @NotNull
    public static final String DEVICE_CONNECTING = "2";

    @NotNull
    public static final String DEVICE_CONNECT_SUCCESS = "0";

    @NotNull
    public static final String DEVICE_NOT_CONNECTED = "1";

    @NotNull
    public static final String DEVICE_NOT_SUPPORT_SKY = "0";

    @NotNull
    public static final String FROM_NOTIFICATION = "2";

    @NotNull
    public static final String FROM_PLAYER = "1";

    @NotNull
    public static final String MANUAL_PAUSE_STATUS = "1";

    @NotNull
    public static final String PLAY_ERROR = "2";

    @NotNull
    public static final String REQUEST_ERROR = "1";

    @NotNull
    public static final String SKY_MUSIC_LIKE = "0";

    @NotNull
    public static final String SKY_MUSIC_LIKE_CANCEL = "1";

    public static final void recordDeviceStatus(@NotNull String str, @NotNull String str2) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(str);
        countEventBuilder.addExtra("type", str2);
        Analytics.recordEvent(countEventBuilder);
    }

    public static final void recordEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(str);
        if (!TextUtils.isEmpty(str2)) {
            countEventBuilder.addExtra("from", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            countEventBuilder.addExtra("id", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            countEventBuilder.addExtra("status", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            countEventBuilder.addExtra("sid", str5);
        }
        Analytics.recordEvent(countEventBuilder);
    }

    public static /* synthetic */ void recordEvent$default(String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        if ((i & 16) != 0) {
            str5 = "";
        }
        recordEvent(str, str2, str3, str4, str5);
    }

    public static final void recordPlayError(@NotNull String str) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(AIMUSIC_PLAYER_PLAYSTART_E);
        countEventBuilder.addExtra("error", str);
        String value = ((SkyPlayServiceHelper) SkyServiceKoinScopeKt.skyServiceScope().get(Reflection.getOrCreateKotlinClass(SkyPlayServiceHelper.class), null, null)).getEventSessionId().getValue();
        if (!TextUtils.isEmpty(value)) {
            countEventBuilder.addExtra("sid", value);
        }
        Analytics.recordEvent(countEventBuilder);
    }

    public static final void recordPlayLoaded(@NotNull String str) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(AIMUSIC_PLAYER_PLAYSTART_URL_E);
        countEventBuilder.addExtra(WebConstant.QueryParam.CLIP_ID, str);
        Analytics.recordEvent(countEventBuilder);
    }

    public static final void recordPlayStarted(@NotNull String str) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(AIMUSIC_PLAYER_PLAYSUCCESS_URL_E);
        countEventBuilder.addExtra(WebConstant.QueryParam.CLIP_ID, str);
        Analytics.recordEvent(countEventBuilder);
    }

    public static final void recordEvent(@NotNull String str) {
        Analytics.recordEvent(new CountEventBuilder(str));
    }

    public static final void recordEvent(@NotNull String str, @NotNull Map<String, String> map) {
        Analytics.recordEvent(new CountEventBuilder(str).putExtras(map));
    }
}
