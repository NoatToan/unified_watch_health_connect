package com.xiaomi.hm.health.atrialfibrillation;

import android.content.Context;
import com.huami.chart.data.RangeIndex;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.health.afppg.model.AtrialFibrillation;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002J\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002J$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/atrialfibrillation/AtrialUtils;", "", "", "beginOfToday", "endOfToday", "Ljava/util/Calendar;", "date", "dayBegin", "dayEnd", "timeInMilli", "", "formatDate", "Landroid/content/Context;", "ctx", "timestamp", "formatTime", "calendar", "", "Lcom/huami/health/afppg/model/AtrialFibrillation;", "slices", "Ljava/util/ArrayList;", "Lcom/huami/chart/data/RangeIndex;", "atrialFibrillationItemToRange", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AtrialUtils {

    @NotNull
    public static final AtrialUtils INSTANCE = new AtrialUtils();

    private AtrialUtils() {
    }

    @NotNull
    public final ArrayList<RangeIndex> atrialFibrillationItemToRange(@Nullable Calendar calendar, @NotNull List<AtrialFibrillation> slices) {
        ArrayList<RangeIndex> arrayList = new ArrayList<>();
        if (calendar == null) {
            return arrayList;
        }
        long jDayBegin = dayBegin(calendar);
        long jDayEnd = dayEnd(calendar);
        for (AtrialFibrillation atrialFibrillation : slices) {
            long eventTime = atrialFibrillation.getEventTime();
            long endTime = atrialFibrillation.getEndTime();
            if (eventTime < jDayEnd && jDayEnd > jDayBegin) {
                arrayList.add(new RangeIndex(eventTime <= jDayBegin ? 0 : (int) ((eventTime - jDayBegin) / 300000), endTime >= jDayEnd ? 288 : ((int) ((endTime - jDayBegin) / 300000)) + 1));
            }
        }
        return arrayList;
    }

    public final long beginOfToday() {
        return dayBegin(Calendar.getInstance());
    }

    public final long dayBegin(@NotNull Calendar date) {
        date.set(11, 0);
        date.set(12, 0);
        date.set(13, 0);
        date.set(14, 0);
        return date.getTimeInMillis();
    }

    public final long dayEnd(@NotNull Calendar date) {
        date.set(11, 23);
        date.set(12, 59);
        date.set(13, 59);
        date.set(14, 999);
        return date.getTimeInMillis();
    }

    public final long endOfToday() {
        return dayEnd(Calendar.getInstance());
    }

    @NotNull
    public final String formatDate(long timeInMilli) {
        if (timeInMilli <= endOfToday() && timeInMilli >= beginOfToday()) {
            return DeviceXFunctionsKt.getContext().getString(R.string.today);
        }
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar2.setTimeInMillis(timeInMilli);
        return calendar2.get(1) < calendar.get(1) ? TimeUtils.formatDate(DeviceXFunctionsKt.getContext(), new Date(timeInMilli)) : TimeUtils.formatDate_no_y((Context) DeviceXFunctionsKt.getContext(), timeInMilli, false);
    }

    @NotNull
    public final String formatTime(@NotNull Context ctx, long timestamp) {
        return TimeUtils.formatTime(ctx, timestamp);
    }
}
