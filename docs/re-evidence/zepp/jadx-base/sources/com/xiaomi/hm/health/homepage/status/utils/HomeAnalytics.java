package com.xiaomi.hm.health.homepage.status.utils;

import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CalculationEventBuilder;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.device.event.StatEvent;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0007\u001a\u000e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0000\u001a\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0000\u001a\u0016\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¨\u0006\u000b"}, d2 = {"", DbUtils.Const.Columns.Event.EVENT_ID, "value", "", "analytics", "tabEvent", "analysisTabClick", "analysisTabVisible", "", "duration", "analyticsVisibleTime", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
@JvmName(name = "HomeAnalytics")
public final class HomeAnalytics {
    public static final void analysisTabClick(@NotNull String str) {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.BASE_TAB_C).addExtra("tp", str));
    }

    public static final void analysisTabVisible(@NotNull String str) {
        Analytics.recordEvent(new CountEventBuilder("BASE_TAB_V").addExtra("tp", str));
    }

    @JvmOverloads
    public static final void analytics(@NotNull String str) {
        analytics$default(str, null, 2, null);
    }

    @JvmOverloads
    public static final void analytics(@NotNull String str, @Nullable String str2) {
        Analytics.recordEvent(new CountEventBuilder(str).setValue(str2));
    }

    public static /* synthetic */ void analytics$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        analytics(str, str2);
    }

    public static final void analyticsVisibleTime(@NotNull String str, long j) {
        new CalculationEventBuilder(StatEvent.BASE_TAB_T, j).addExtra("tp", str).addExtra("time", String.valueOf(j));
    }
}
