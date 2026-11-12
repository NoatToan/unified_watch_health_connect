package com.huami.message.ui.base.date;

import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bodymeasurements.common.utils.TimeFormatUtils;
import com.huami.message.ui.R;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.ecg.media.MediaRecorderHelper;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002\"\u0016\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0016\u0010\f\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "millis", "", "parseMillisToShow", StatEvent.TP_FIRST, "second", "", "getDifferDay", "DURATION_THREE_MIN", LogUtil.I, "DURATION_ONE_MIN", "message-mifit_release"}, k = 2, mv = {1, 5, 1})
public final class DateExKt {
    public static final int DURATION_ONE_MIN = 60000;
    public static final int DURATION_THREE_MIN = 180000;

    public static final int getDifferDay(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        int i = calendar.get(5);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(j2));
        return Math.abs(i - calendar2.get(5));
    }

    @NotNull
    public static final String parseMillisToShow(@NotNull Context context, long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int differDay = getDifferDay(jCurrentTimeMillis, j);
        if (differDay != 0) {
            if (differDay != 1) {
                return differDay != 2 ? new SimpleDateFormat(TimeFormatUtils.PATTERN_YYY_MM_DD, Locale.getDefault()).format(Long.valueOf(j)) : context.getResources().getString(R.string.mc_before_yesterday, new SimpleDateFormat("HH:mm", Locale.getDefault()).format(Long.valueOf(j)));
            }
            return context.getResources().getString(R.string.mc_yesterday, new SimpleDateFormat("HH:mm", Locale.getDefault()).format(Long.valueOf(j)));
        }
        long j2 = jCurrentTimeMillis - j;
        if (j2 < 60000) {
            return context.getString(R.string.mc_now);
        }
        return j2 <= MediaRecorderHelper.MAX_RECORD_TIME ? context.getString(R.string.mc_minute_ago) : context.getResources().getString(R.string.mc_less_day, new SimpleDateFormat("HH:mm", Locale.getDefault()).format(Long.valueOf(j)));
    }
}
