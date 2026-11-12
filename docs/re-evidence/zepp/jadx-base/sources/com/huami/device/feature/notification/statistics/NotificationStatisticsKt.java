package com.huami.device.feature.notification.statistics;

import android.text.TextUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\u0007"}, d2 = {"", "result", "pkg", "reason", "", "recordEvent", "recordRemindNumber", "notification_release"}, k = 2, mv = {1, 5, 1})
public final class NotificationStatisticsKt {
    public static final void recordEvent(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        CountEventBuilder countEventBuilderAddExtra = new CountEventBuilder(NotificationEvent.STATISTIC_ID).setValue(str).addExtra(NotificationEvent.KEY_PACKAGE, str2);
        if (!TextUtils.isEmpty(str3)) {
            countEventBuilderAddExtra.addExtra("reason", str3);
        }
        Analytics.recordEvent(countEventBuilderAddExtra);
    }

    public static final void recordRemindNumber() {
        Analytics.recordEvent(new CountEventBuilder("APPRemindNum"));
    }

    public static final void recordEvent(@NotNull String str, @NotNull String str2) {
        recordEvent(str, str2, "");
    }
}
