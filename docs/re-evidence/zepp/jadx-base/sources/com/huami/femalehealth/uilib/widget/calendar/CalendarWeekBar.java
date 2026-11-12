package com.huami.femalehealth.uilib.widget.calendar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.calendarview.Calendar;
import com.huami.calendarview.WeekBar;
import com.huami.femalehealth.uilib.R;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014R\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/CalendarWeekBar;", "Lcom/huami/calendarview/WeekBar;", "Lcom/huami/calendarview/Calendar;", "calendar", "", "weekStart", "", "isClick", "", "onDateSelected", "onWeekStartChange", "b", LogUtil.I, "preSelectedIndex", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class CalendarWeekBar extends WeekBar {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int preSelectedIndex;

    public CalendarWeekBar(@Nullable Context context) {
        super(context);
        if (context == null) {
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.fh_custom_week_bar, (ViewGroup) this, true);
        setBackgroundResource(R.color.s38);
        setTextColor(context.getResources().getColor(R.color.fh_week_text_color));
        setTextSize((int) context.getResources().getDimension(R.dimen.fh_week_text_size));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.calendarview.WeekBar
    public void onDateSelected(@NotNull Calendar calendar, int weekStart, boolean isClick) {
        getChildAt(this.preSelectedIndex).setSelected(false);
        int viewIndexByCalendar = getViewIndexByCalendar(calendar, weekStart);
        getChildAt(viewIndexByCalendar).setSelected(true);
        this.preSelectedIndex = viewIndexByCalendar;
    }

    @Override // com.huami.calendarview.WeekBar
    public void onWeekStartChange(int weekStart) {
    }
}
