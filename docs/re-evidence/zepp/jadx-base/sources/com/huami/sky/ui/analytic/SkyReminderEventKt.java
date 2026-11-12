package com.huami.sky.ui.analytic;

import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.sky.lib.entity.SleepReminderInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\r\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0016\u0010\n\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002\"\u0016\u0010\u000b\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0016\u0010\r\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\f\"\u0016\u0010\u000e\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\f\"\u0016\u0010\u000f\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\f\"\u0016\u0010\u0010\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\f\"\u0016\u0010\u0011\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\f\"\u0016\u0010\u0012\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\f\"\u0016\u0010\u0013\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\f\"\u0016\u0010\u0014\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"", "from", "Lcom/huami/sky/lib/entity/SleepReminderInfo;", "sleepReminderInfo", "", "recordReminderEvent", "recordReminderViewEvent", "", "", "days", "a", SkyReminderEventKt.AIMUSIC_SLEEP_REMIND_V, "Ljava/lang/String;", SkyReminderEventKt.AIMUSIC_SLEEP_REMIND_NONOTIFICATION_V, SkyReminderEventKt.AIMUSIC_SLEEP_REMIND_LATER_C, SkyReminderEventKt.AIMUSIC_SLEEP_REMIND_OPEN_C, SkyReminderEventKt.AIMUSIC_SLEEP_PUSH_SUCCESS_V, SkyReminderEventKt.AIMUSIC_SLEEP_PUSH_V, SkyReminderEventKt.AIMUSIC_SLEEP_PUSH_C, "FROM_FIRST_INIT", "FROM_SETTING", "sky-ui_release"}, k = 2, mv = {1, 5, 1})
public final class SkyReminderEventKt {

    @NotNull
    public static final String AIMUSIC_SLEEP_PUSH_C = "AIMUSIC_SLEEP_PUSH_C";

    @NotNull
    public static final String AIMUSIC_SLEEP_PUSH_SUCCESS_V = "AIMUSIC_SLEEP_PUSH_SUCCESS_V";

    @NotNull
    public static final String AIMUSIC_SLEEP_PUSH_V = "AIMUSIC_SLEEP_PUSH_V";

    @NotNull
    public static final String AIMUSIC_SLEEP_REMIND_LATER_C = "AIMUSIC_SLEEP_REMIND_LATER_C";

    @NotNull
    public static final String AIMUSIC_SLEEP_REMIND_NONOTIFICATION_V = "AIMUSIC_SLEEP_REMIND_NONOTIFICATION_V";

    @NotNull
    public static final String AIMUSIC_SLEEP_REMIND_OPEN_C = "AIMUSIC_SLEEP_REMIND_OPEN_C";

    @NotNull
    public static final String AIMUSIC_SLEEP_REMIND_V = "AIMUSIC_SLEEP_REMIND_V";

    @NotNull
    public static final String FROM_FIRST_INIT = "0";

    @NotNull
    public static final String FROM_SETTING = "1";

    private static final String a(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        int iIntValue = ((Number) CollectionsKt.last((List) list)).intValue();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            int iIntValue2 = ((Number) it2.next()).intValue();
            if (iIntValue == iIntValue2) {
                sb.append(String.valueOf(iIntValue2));
            } else {
                sb.append(iIntValue2 + ",");
            }
        }
        return sb.toString();
    }

    public static final void recordReminderEvent(@NotNull String str, @NotNull SleepReminderInfo sleepReminderInfo) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(AIMUSIC_SLEEP_REMIND_OPEN_C);
        countEventBuilder.addExtra("from", str);
        countEventBuilder.addExtra("time", String.valueOf(sleepReminderInfo.getTime()));
        countEventBuilder.addExtra("repetition", a(sleepReminderInfo.getDays()));
        Analytics.recordEvent(countEventBuilder);
    }

    public static final void recordReminderViewEvent(@NotNull String str) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(AIMUSIC_SLEEP_REMIND_V);
        countEventBuilder.addExtra("from", str);
        Analytics.recordEvent(countEventBuilder);
    }
}
