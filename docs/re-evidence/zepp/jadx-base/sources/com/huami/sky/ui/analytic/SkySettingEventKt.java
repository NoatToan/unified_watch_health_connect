package com.huami.sky.ui.analytic;

import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\"\u0016\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0016\u0010\n\u001a\u00020\u00078\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\t\"\u0016\u0010\u000b\u001a\u00020\u00078\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\t\"\u0016\u0010\f\u001a\u00020\u00078\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\t\"\u0016\u0010\r\u001a\u00020\u00078\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\t\"\u0016\u0010\u000e\u001a\u00020\u00078\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\t¨\u0006\u000f"}, d2 = {"", "time", "", "recordPlayStopTimeEvent", "", "isOpen", "recordReminderOpen", "", SkySettingEventKt.AIMUSIC_AISLEEP_OPEN_C, "Ljava/lang/String;", SkySettingEventKt.AIMUSIC_AISLEEP_CLOSE_C, SkySettingEventKt.AIMUSIC_TIMING_C, SkySettingEventKt.AIMUSIC_SETTING_V, SkySettingEventKt.AIMUSIC_PLAYER_FEEDBACK_C, SkySettingEventKt.AIMUSIC_SLEEP_REMIND_SWITCH_C, "sky-ui_release"}, k = 2, mv = {1, 5, 1})
public final class SkySettingEventKt {

    @NotNull
    public static final String AIMUSIC_AISLEEP_CLOSE_C = "AIMUSIC_AISLEEP_CLOSE_C";

    @NotNull
    public static final String AIMUSIC_AISLEEP_OPEN_C = "AIMUSIC_AISLEEP_OPEN_C";

    @NotNull
    public static final String AIMUSIC_PLAYER_FEEDBACK_C = "AIMUSIC_PLAYER_FEEDBACK_C";

    @NotNull
    public static final String AIMUSIC_SETTING_V = "AIMUSIC_SETTING_V";

    @NotNull
    public static final String AIMUSIC_SLEEP_REMIND_SWITCH_C = "AIMUSIC_SLEEP_REMIND_SWITCH_C";

    @NotNull
    public static final String AIMUSIC_TIMING_C = "AIMUSIC_TIMING_C";

    public static final void recordPlayStopTimeEvent(int i) {
        Analytics.recordEvent(new CountEventBuilder(AIMUSIC_TIMING_C).addExtra("set_time", i == -1 ? "infinity" : String.valueOf(i)));
    }

    public static final void recordReminderOpen(boolean z) {
        Analytics.recordEvent(new CountEventBuilder(AIMUSIC_SLEEP_REMIND_SWITCH_C).addExtra("from", String.valueOf(z ? 1 : 0)));
    }
}
