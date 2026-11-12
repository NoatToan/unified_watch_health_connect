package com.huami.feedback.util;

import com.huami.feedback.zepp.ui.FeedbackActivity;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.q;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a2\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00002\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0007\u001a\u001e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b\u001a\u0006\u0010\u000f\u001a\u00020\u0002\u001a\u0016\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0000\u001a \u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0000H\u0002\u001a&\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0010¨\u0006\u001b"}, d2 = {"", FeedbackActivity.KEY_FEEDBACK_SOURCE, "", "feedbackFrom", "feedbackFromAnalytics", "id", "value", "", "extra", "doAnalytics", "deviceType", "", "appCheck", "deviceCheck", "doAnalyticsLogType", "feedbackSuccessAnalytics", "", "code", "message", "feedbackFailAnalytics", "result", "a", "", "syncLogDuration", "postFileDuration", "duration", "feedbackDurationAnalytics", "feedback-impl_release"}, k = 2, mv = {1, 5, 1})
public final class AnalyticsKt {
    private static final void a(int i, int i2, String str) {
        CountEventBuilder countEventBuilder = new CountEventBuilder("FEEDBACK_RESULT");
        countEventBuilder.addExtra("result", String.valueOf(i));
        countEventBuilder.addExtra("code", String.valueOf(i2));
        countEventBuilder.addExtra("message", str);
        Analytics.recordEvent(countEventBuilder);
    }

    public static final void doAnalytics(@NotNull String str, @Nullable String str2, @Nullable Map<String, String> map) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(str);
        if (str2 != null) {
            countEventBuilder.setValue(str2);
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                countEventBuilder.addExtra(entry.getKey(), entry.getValue());
            }
        }
        Analytics.recordEvent(countEventBuilder);
    }

    public static /* synthetic */ void doAnalytics$default(String str, String str2, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        doAnalytics(str, str2, map);
    }

    public static final void doAnalyticsLogType(@NotNull String str, boolean z, boolean z2) {
        String str2;
        if (z && z2) {
            str2 = "[app," + str + JsonLexerKt.END_LIST;
        } else if (z2) {
            str2 = JsonLexerKt.BEGIN_LIST + str + JsonLexerKt.END_LIST;
        } else {
            str2 = "[app]";
        }
        doAnalytics$default("MINE_FEEDBACK_SUBMIT_C", null, q.mapOf(TuplesKt.to("tp", str2)), 2, null);
    }

    public static final void feedbackDurationAnalytics(long j, long j2, long j3, int i) {
        CountEventBuilder countEventBuilder = new CountEventBuilder("FEEDBACK_TIME_CONSUMING");
        countEventBuilder.addExtra("connectDuration", String.valueOf(UtilsKt.getConnectDuration()));
        countEventBuilder.addExtra("syncLogDuration", String.valueOf(j));
        countEventBuilder.addExtra("postFileDuration", String.valueOf(j2));
        countEventBuilder.addExtra("duration", String.valueOf(j3));
        countEventBuilder.addExtra("result", String.valueOf(i));
        Analytics.recordEvent(countEventBuilder);
        UtilsKt.setConnectDuration(0L);
    }

    public static final void feedbackFailAnalytics(int i, @NotNull String str) {
        a(0, i, str);
    }

    public static final void feedbackFrom(@NotNull String str) {
        doAnalytics$default("Feedback_Nums_Entrance", str, null, 4, null);
    }

    public static final void feedbackFromAnalytics(@NotNull String str) {
        doAnalytics$default("Feedback_Nums_Entrance", str, null, 4, null);
    }

    public static final void feedbackSuccessAnalytics() {
        a(1, ErrorConstKt.FEEDBACK_SUCCESS, "日志上传成功");
    }
}
