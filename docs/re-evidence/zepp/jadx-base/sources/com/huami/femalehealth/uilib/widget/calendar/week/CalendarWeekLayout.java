package com.huami.femalehealth.uilib.widget.calendar.week;

import android.content.Context;
import android.util.AttributeSet;
import com.huami.calendarview.Calendar;
import com.huami.calendarview.CalendarLayout;
import com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R?\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/week/CalendarWeekLayout;", "Lcom/huami/calendarview/CalendarLayout;", "Lkotlin/Function1;", "Lcom/huami/calendarview/Calendar;", "Lkotlin/ParameterName;", "name", "calendar", "Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "F", "Lkotlin/jvm/functions/Function1;", "getRenderStyle", "()Lkotlin/jvm/functions/Function1;", "setRenderStyle", "(Lkotlin/jvm/functions/Function1;)V", "renderStyle", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class CalendarWeekLayout extends CalendarLayout {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Calendar, ? extends CalendarPeriodStyle> renderStyle;

    public CalendarWeekLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final Function1<Calendar, CalendarPeriodStyle> getRenderStyle() {
        return this.renderStyle;
    }

    public final void setRenderStyle(@Nullable Function1<? super Calendar, ? extends CalendarPeriodStyle> function1) {
        this.renderStyle = function1;
    }
}
