package com.xiaomi.hm.health.healthtag.ui.utils;

import android.util.Pair;
import com.huami.sleep.util.SleepTimeUtil;
import java.util.Calendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/healthtag/ui/utils/TagUtils;", "", "", "timeStamp", "getTagTimeStamp", "(Ljava/lang/Long;)J", "Landroid/util/Pair;", "getDayStartEndTimeStamp", "(Ljava/lang/Long;)Landroid/util/Pair;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class TagUtils {

    @NotNull
    public static final TagUtils INSTANCE = new TagUtils();

    private TagUtils() {
    }

    @NotNull
    public final Pair<Long, Long> getDayStartEndTimeStamp(@Nullable Long timeStamp) {
        Calendar calendar = Calendar.getInstance();
        if (timeStamp != null) {
            timeStamp.longValue();
            calendar.setTimeInMillis(timeStamp.longValue());
        }
        SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
        sleepTimeUtil.resetCalendarTimeToEarliest(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        sleepTimeUtil.resetCalendarTimeToLast(calendar);
        return new Pair<>(Long.valueOf(timeInMillis), Long.valueOf(calendar.getTimeInMillis()));
    }

    public final long getTagTimeStamp(@Nullable Long timeStamp) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        if (timeStamp != null) {
            timeStamp.longValue();
            calendar2.setTimeInMillis(timeStamp.longValue());
        }
        calendar.set(1, calendar2.get(1));
        calendar.set(2, calendar2.get(2));
        calendar.set(5, calendar2.get(5));
        return calendar.getTimeInMillis();
    }
}
