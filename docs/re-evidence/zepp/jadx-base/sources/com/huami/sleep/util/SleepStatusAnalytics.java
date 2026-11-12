package com.huami.sleep.util;

import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\n\u000bB\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J&\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H\u0007¨\u0006\f"}, d2 = {"Lcom/huami/sleep/util/SleepStatusAnalytics;", "", "", "id", "", "recordEvent", "", "extras", "<init>", "()V", "EventId", "EventParams", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepStatusAnalytics {

    @NotNull
    public static final SleepStatusAnalytics INSTANCE = new SleepStatusAnalytics();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b,\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0016\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0016\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0016\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0016\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0016\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004R\u0016\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0016\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0004R\u0016\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0016\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0004R\u0016\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0016\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0004R\u0016\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0004R\u0016\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0004R\u0016\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0004R\u0016\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0004R\u0016\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0004R\u0016\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0004R\u0016\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0004R\u0016\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0004¨\u0006."}, d2 = {"Lcom/huami/sleep/util/SleepStatusAnalytics$EventId;", "", "", "SLP_DAY_NAP", "Ljava/lang/String;", "SLP_WEEK_NAP", "SLP_MONTH_NAP", "SLP_YEAR_NAP", "SLP_STATUS_CLICK", "SLP_MOOD_CLICK", "SLP_POSITION_DRAG", "SLP_BREATH_DETAIL", "SLP_DETAIL_DEEP", "SLP_DETAIL_LIGHT", "SLP_DETAIL_AWAKE", "SLP_DETAIL_INTO_SLEEP", "SLP_DETAIL_SLEEP_DURATION", "SLP_DETAIL_REM", "SLP_DETAIL_START_SLEEP_TIME", "SLP_DETAIL_STOP_SLEEP_TIME", "SLP_INTO_DETAIL_TONALITY_EXPOSE", "SLP_INTO_DETAIL_TONALITY_CLICK", "SLP_BREATH_FEED_BACK", "SLP_DETAIL_TAP_CLICK", "SLP_DETAIL_TAP_DIY_CLICK", "SLP_DETAIL_HEARTRATE_CLICK", "CHART_SLEEP_VIEW_NUM", "SHARE_SLEEP_VIEW_NUM", "MINE_SLEEP_NOTIFICATION_CLICKNUM", "DETAIL_SLEEP_V_DAY", "DETAIL_SLEEP_V_WEEK", "DETAIL_SLEEP_V_MONTH", "DETAIL_SLEEP_V_YEAR", "CHART_EDIT_SLEEP", "DETAIL_POINTER_DRAG_REGULARITY", "SKY_SLEEP_TONALITY", "SLEEP_BANNER", "SLP_TONALITY_QUESTION", "SLP_TONALITY_FEELING_EXPOSE", "SLP_TONALITY_FEELING_CLICK", EventId.DETAIL_SLEEP_DAY_SOURCE_V, EventId.DETAIL_SLEEP_WEEK_SOURCE_V, EventId.DETAIL_SLEEP_MONTH_SOURCE_V, EventId.DETAIL_SLEEP_YEAR_SOURCE_V, "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class EventId {

        @NotNull
        public static final String CHART_EDIT_SLEEP = "Edit_Sleep";

        @NotNull
        public static final String CHART_SLEEP_VIEW_NUM = "Chart_SleepViewNum";

        @NotNull
        public static final String DETAIL_POINTER_DRAG_REGULARITY = "DETAIL_POINTER_DRAG_REGULARITY ";

        @NotNull
        public static final String DETAIL_SLEEP_DAY_SOURCE_V = "DETAIL_SLEEP_DAY_SOURCE_V";

        @NotNull
        public static final String DETAIL_SLEEP_MONTH_SOURCE_V = "DETAIL_SLEEP_MONTH_SOURCE_V";

        @NotNull
        public static final String DETAIL_SLEEP_V_DAY = "DETAIL_SLEEP_V_DAY";

        @NotNull
        public static final String DETAIL_SLEEP_V_MONTH = "DETAIL_SLEEP_V_MONTH";

        @NotNull
        public static final String DETAIL_SLEEP_V_WEEK = "DETAIL_SLEEP_V_WEEK";

        @NotNull
        public static final String DETAIL_SLEEP_V_YEAR = "DETAIL_SLEEP_V_YEAR";

        @NotNull
        public static final String DETAIL_SLEEP_WEEK_SOURCE_V = "DETAIL_SLEEP_WEEK_SOURCE_V";

        @NotNull
        public static final String DETAIL_SLEEP_YEAR_SOURCE_V = "DETAIL_SLEEP_YEAR_SOURCE_V";

        @NotNull
        public static final EventId INSTANCE = new EventId();

        @NotNull
        public static final String MINE_SLEEP_NOTIFICATION_CLICKNUM = "Sleep_NotificationClickNum";

        @NotNull
        public static final String SHARE_SLEEP_VIEW_NUM = "Sleep_ViewNum";

        @NotNull
        public static final String SKY_SLEEP_TONALITY = "AIMUSIC_SLEEPDETAIL_MUSIC_V";

        @NotNull
        public static final String SLEEP_BANNER = "SLEEP_BANNER_C";

        @NotNull
        public static final String SLP_BREATH_DETAIL = "DETAIL_BREATHING";

        @NotNull
        public static final String SLP_BREATH_FEED_BACK = "DETAIL_BREATHING_SUGGEST";

        @NotNull
        public static final String SLP_DAY_NAP = "DETAIL_NAP_V_DAY";

        @NotNull
        public static final String SLP_DETAIL_AWAKE = "DETAIL_AWAKE";

        @NotNull
        public static final String SLP_DETAIL_DEEP = "DETAIL_DEEP";

        @NotNull
        public static final String SLP_DETAIL_HEARTRATE_CLICK = "DETAIL_HEARTRATE_CLICK";

        @NotNull
        public static final String SLP_DETAIL_INTO_SLEEP = "DETAIL_LATENCY";

        @NotNull
        public static final String SLP_DETAIL_LIGHT = "DETAIL_LIGHT";

        @NotNull
        public static final String SLP_DETAIL_REM = "DETAIL_REM";

        @NotNull
        public static final String SLP_DETAIL_SLEEP_DURATION = "DETAIL_DURATION";

        @NotNull
        public static final String SLP_DETAIL_START_SLEEP_TIME = "DETAIL_FALL";

        @NotNull
        public static final String SLP_DETAIL_STOP_SLEEP_TIME = "DETAIL_WAKE";

        @NotNull
        public static final String SLP_DETAIL_TAP_CLICK = "DETAIL_TAP_CLICK";

        @NotNull
        public static final String SLP_DETAIL_TAP_DIY_CLICK = "DETAIL_TAP_DIY_CLICK";

        @NotNull
        public static final String SLP_INTO_DETAIL_TONALITY_CLICK = "DETAIL_LATENCY_AIMUSIC_V";

        @NotNull
        public static final String SLP_INTO_DETAIL_TONALITY_EXPOSE = "DETAIL_LATENCY_AIMUSIC_C";

        @NotNull
        public static final String SLP_MONTH_NAP = "DETAIL_NAP_V_MONTH";

        @NotNull
        public static final String SLP_MOOD_CLICK = "DETAIL_MOOD_CLICK";

        @NotNull
        public static final String SLP_POSITION_DRAG = "DETAIL_POINTER_DRAG";

        @NotNull
        public static final String SLP_STATUS_CLICK = "DETAIL_STATUS_CLICK";

        @NotNull
        public static final String SLP_TONALITY_FEELING_CLICK = "AIMUSIC_DATA_FEELING_C";

        @NotNull
        public static final String SLP_TONALITY_FEELING_EXPOSE = "AIMUSIC_DATA_FEELING_V";

        @NotNull
        public static final String SLP_TONALITY_QUESTION = "AIMUSIC_DATA_MOREINFO_C";

        @NotNull
        public static final String SLP_WEEK_NAP = "DETAIL_NAP_V_WEEK";

        @NotNull
        public static final String SLP_YEAR_NAP = "DETAIL_NAP_V_YEAR";

        private EventId() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/huami/sleep/util/SleepStatusAnalytics$EventParams;", "", "", "DETAIL", "Ljava/lang/String;", "DATA_TRUE", "DATA_FALSE", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class EventParams {

        @NotNull
        public static final String DATA_FALSE = "Data_False";

        @NotNull
        public static final String DATA_TRUE = "Data_True";

        @NotNull
        public static final String DETAIL = "Detail";

        @NotNull
        public static final EventParams INSTANCE = new EventParams();

        private EventParams() {
        }
    }

    private SleepStatusAnalytics() {
    }

    @JvmStatic
    public static final void recordEvent(@NotNull String id) {
        recordEvent(id, r.emptyMap());
    }

    public static /* synthetic */ void recordEvent$default(String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = r.emptyMap();
        }
        recordEvent(str, map);
    }

    @JvmStatic
    public static final void recordEvent(@NotNull String id, @NotNull Map<String, String> extras) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(id);
        countEventBuilder.setAnonymous(false);
        countEventBuilder.setIdentified(true);
        for (Map.Entry<String, String> entry : extras.entrySet()) {
            countEventBuilder.addExtra(entry.getKey(), entry.getValue());
        }
        Analytics.recordEvent(countEventBuilder);
    }
}
