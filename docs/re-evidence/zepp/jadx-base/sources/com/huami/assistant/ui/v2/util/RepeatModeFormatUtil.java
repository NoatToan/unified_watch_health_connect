package com.huami.assistant.ui.v2.util;

import android.content.Context;
import com.huami.assistant.R;
import com.huami.assistant.ui.v2.model.ScheduleRepeatMode;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\t"}, d2 = {"Lcom/huami/assistant/ui/v2/util/RepeatModeFormatUtil;", "", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "formatStr", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class RepeatModeFormatUtil {

    @NotNull
    public static final RepeatModeFormatUtil INSTANCE = new RepeatModeFormatUtil();

    private RepeatModeFormatUtil() {
    }

    @NotNull
    public final String formatStr(@NotNull ScheduleRepeatMode scheduleRepeatMode, @NotNull Context context) {
        int i;
        if (Intrinsics.areEqual(scheduleRepeatMode, ScheduleRepeatMode.Once.INSTANCE)) {
            return context.getString(R.string.repeat_once);
        }
        if (Intrinsics.areEqual(scheduleRepeatMode, ScheduleRepeatMode.Week.INSTANCE)) {
            return context.getString(R.string.repeat_every_week);
        }
        if (Intrinsics.areEqual(scheduleRepeatMode, ScheduleRepeatMode.Fortnight.INSTANCE)) {
            return context.getString(R.string.repeat_every_two_week);
        }
        if (Intrinsics.areEqual(scheduleRepeatMode, ScheduleRepeatMode.Month.INSTANCE)) {
            return context.getString(R.string.repeat_every_month);
        }
        if (Intrinsics.areEqual(scheduleRepeatMode, ScheduleRepeatMode.Year.INSTANCE)) {
            return context.getString(R.string.repeat_every_year);
        }
        if (Intrinsics.areEqual(scheduleRepeatMode, ScheduleRepeatMode.WorkDay.INSTANCE)) {
            return context.getString(R.string.repeat_every_workday);
        }
        boolean[] zArr = {false, false, false, false, false, false, false};
        if ((scheduleRepeatMode.getMode() & ScheduleRepeatMode.Sunday.INSTANCE.getMode()) != 0) {
            zArr[0] = true;
            i = 1;
        } else {
            i = 0;
        }
        if ((scheduleRepeatMode.getMode() & ScheduleRepeatMode.Monday.INSTANCE.getMode()) != 0) {
            zArr[1] = true;
            i++;
        }
        if ((scheduleRepeatMode.getMode() & ScheduleRepeatMode.Tuesday.INSTANCE.getMode()) != 0) {
            zArr[2] = true;
            i++;
        }
        if ((scheduleRepeatMode.getMode() & ScheduleRepeatMode.Wednesday.INSTANCE.getMode()) != 0) {
            zArr[3] = true;
            i++;
        }
        if ((scheduleRepeatMode.getMode() & ScheduleRepeatMode.Thursday.INSTANCE.getMode()) != 0) {
            zArr[4] = true;
            i++;
        }
        if ((scheduleRepeatMode.getMode() & ScheduleRepeatMode.Friday.INSTANCE.getMode()) != 0) {
            zArr[5] = true;
            i++;
        }
        if ((scheduleRepeatMode.getMode() & ScheduleRepeatMode.Saturday.INSTANCE.getMode()) != 0) {
            zArr[6] = true;
            i++;
        }
        if (i == 0) {
            return context.getString(R.string.repeat_once);
        }
        if (i == 7) {
            return context.getString(R.string.repeat_every_day);
        }
        if (i == 2 && zArr[0] && zArr[6]) {
            return context.getString(R.string.repeat_every_weekend);
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (zArr[1]) {
            stringBuffer.append(context.getString(R.string.repeat_on_mo));
            stringBuffer.append(",");
        }
        if (zArr[2]) {
            stringBuffer.append(context.getString(R.string.repeat_on_tu));
            stringBuffer.append(",");
        }
        if (zArr[3]) {
            stringBuffer.append(context.getString(R.string.repeat_on_we));
            stringBuffer.append(",");
        }
        if (zArr[4]) {
            stringBuffer.append(context.getString(R.string.repeat_on_th));
            stringBuffer.append(",");
        }
        if (zArr[5]) {
            stringBuffer.append(context.getString(R.string.repeat_on_fr));
            stringBuffer.append(",");
        }
        if (zArr[6]) {
            stringBuffer.append(context.getString(R.string.repeat_on_sa));
            stringBuffer.append(",");
        }
        if (zArr[0]) {
            stringBuffer.append(context.getString(R.string.repeat_on_su));
            stringBuffer.append(",");
        }
        return stringBuffer.toString().substring(0, stringBuffer.length() - 1);
    }
}
