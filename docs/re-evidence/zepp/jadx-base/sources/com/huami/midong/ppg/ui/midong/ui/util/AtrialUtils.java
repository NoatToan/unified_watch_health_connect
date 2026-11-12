package com.huami.midong.ppg.ui.midong.ui.util;

import android.content.Context;
import com.huami.bodymeasurements.common.utils.TimeFormatUtils;
import com.huami.midong.ppg.ui.midong.R;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002J\u0016\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0002R\u0016\u0010\u0016\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/huami/midong/ppg/ui/midong/ui/util/AtrialUtils;", "", "", "currentTimeStamp", "timestampOfMonthAgo", "beginOfToday", "endOfToday", "Ljava/util/Calendar;", "date", "dayBegin", "dayEnd", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "timeInMilli", "", "formatDate", "simpleFormatDate", "ctx", "timestamp", "formatTime", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "afppg-ui-midong_release"}, k = 1, mv = {1, 5, 1})
public final class AtrialUtils {

    @NotNull
    public static final AtrialUtils INSTANCE = new AtrialUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "AtrialUtils";

    private AtrialUtils() {
    }

    public final long beginOfToday() {
        return dayBegin(Calendar.getInstance());
    }

    public final long currentTimeStamp() {
        return System.currentTimeMillis();
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
    public final String formatDate(@NotNull Context context, long timeInMilli) {
        if (timeInMilli <= endOfToday() && timeInMilli >= beginOfToday()) {
            return context.getString(R.string.today);
        }
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar2.setTimeInMillis(timeInMilli);
        return calendar2.get(1) < calendar.get(1) ? TimeUtils.formatDate(context, new Date(timeInMilli)) : TimeUtils.formatDate_no_y(context, timeInMilli, false);
    }

    @NotNull
    public final String formatTime(@NotNull Context ctx, long timestamp) {
        return TimeUtils.formatTime(ctx, timestamp);
    }

    @NotNull
    public final String simpleFormatDate(long timeInMilli) {
        return new SimpleDateFormat(TimeFormatUtils.PATTERN_YYY_MM_DD_HH_MM, Locale.getDefault()).format(new Date(timeInMilli));
    }

    public final long timestampOfMonthAgo() {
        return System.currentTimeMillis() - 44640000;
    }
}
