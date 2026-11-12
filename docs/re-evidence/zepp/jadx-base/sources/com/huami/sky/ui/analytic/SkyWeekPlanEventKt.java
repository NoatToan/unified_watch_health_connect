package com.huami.sky.ui.analytic;

import android.text.TextUtils;
import com.amazon.identity.auth.device.authorization.RegionUtil;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\f\u001a,\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000\"\u0016\u0010\u0007\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0016\u0010\t\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\b\"\u0016\u0010\n\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\b\"\u0016\u0010\u000b\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\b\"\u0016\u0010\f\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\b\"\u0016\u0010\r\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\b\"\u0016\u0010\u000e\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\b\"\u0016\u0010\u000f\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\b\"\u0016\u0010\u0010\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"", DbUtils.Const.Columns.Event.EVENT_ID, "from", "day", "data", "", "recordWeekPlanEvent", SkyWeekPlanEventKt.AIMUSIC_PLAYER_HABIT_V, "Ljava/lang/String;", SkyWeekPlanEventKt.AIMUSIC_PLAYER_HABIT_CLOSE_C, SkyWeekPlanEventKt.AIMUSIC_PLAYER_HABIT_ICON_C, SkyWeekPlanEventKt.AIMUSIC_PLAYER_HABIT_FINISH_E, SkyWeekPlanEventKt.AIMUSIC_PLAYER_HABIT_ASK_CLOSE_V, SkyWeekPlanEventKt.AIMUSIC_PLAYER_HABIT_ASK_YES_C, SkyWeekPlanEventKt.AIMUSIC_PLAYER_HABIT_ASK_NO_C, "MANUAL", RegionUtil.REGION_STRING_AUTO, "sky-ui_release"}, k = 2, mv = {1, 5, 1})
public final class SkyWeekPlanEventKt {

    @NotNull
    public static final String AIMUSIC_PLAYER_HABIT_ASK_CLOSE_V = "AIMUSIC_PLAYER_HABIT_ASK_CLOSE_V";

    @NotNull
    public static final String AIMUSIC_PLAYER_HABIT_ASK_NO_C = "AIMUSIC_PLAYER_HABIT_ASK_NO_C";

    @NotNull
    public static final String AIMUSIC_PLAYER_HABIT_ASK_YES_C = "AIMUSIC_PLAYER_HABIT_ASK_YES_C";

    @NotNull
    public static final String AIMUSIC_PLAYER_HABIT_CLOSE_C = "AIMUSIC_PLAYER_HABIT_CLOSE_C";

    @NotNull
    public static final String AIMUSIC_PLAYER_HABIT_FINISH_E = "AIMUSIC_PLAYER_HABIT_FINISH_E";

    @NotNull
    public static final String AIMUSIC_PLAYER_HABIT_ICON_C = "AIMUSIC_PLAYER_HABIT_ICON_C";

    @NotNull
    public static final String AIMUSIC_PLAYER_HABIT_V = "AIMUSIC_PLAYER_HABIT_V";

    @NotNull
    public static final String AUTO = "1";

    @NotNull
    public static final String MANUAL = "0";

    public static final void recordWeekPlanEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(str);
        if (!TextUtils.isEmpty(str2)) {
            countEventBuilder.addExtra("from", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            countEventBuilder.addExtra("day", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            countEventBuilder.addExtra("data", str4);
        }
        Analytics.recordEvent(countEventBuilder);
    }

    public static /* synthetic */ void recordWeekPlanEvent$default(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        recordWeekPlanEvent(str, str2, str3, str4);
    }
}
