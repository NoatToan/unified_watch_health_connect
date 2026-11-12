package com.huami.femalehealth.uilib.widget.calendar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewParent;
import com.huami.calendarview.Calendar;
import com.huami.calendarview.MonthView;
import com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.StatusKt;
import com.huami.femalehealth.uilib.widget.calendar.status.StyleAdapter;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0014J0\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0014J(\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0014J8\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0014J\b\u0010\u0012\u001a\u00020\tH\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/CalendarMonthView;", "Lcom/huami/calendarview/MonthView;", "Lcom/huami/femalehealth/uilib/widget/calendar/status/StyleAdapter;", "", "onPreviewHook", "Landroid/graphics/Canvas;", "canvas", "Lcom/huami/calendarview/Calendar;", "calendar", "", "x", "y", "", "hasScheme", "onDrawSelected", "onDrawScheme", "isSelected", "onDrawText", "getItemWidth", "getItemHeight", "Lcom/huami/femalehealth/uilib/widget/calendar/FemaleHealthCalendarView;", z.j, "Lcom/huami/femalehealth/uilib/widget/calendar/FemaleHealthCalendarView;", "calendarView", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class CalendarMonthView extends MonthView implements StyleAdapter {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private FemaleHealthCalendarView calendarView;

    public CalendarMonthView(@NotNull Context context) {
        super(context);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.status.StyleAdapter
    public int getItemHeight() {
        return this.mItemHeight;
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.status.StyleAdapter
    public int getItemWidth() {
        return this.mItemWidth;
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.status.StyleAdapter
    @NotNull
    public Pair<Float, Float> getTextPos(@NotNull Paint paint, @NotNull String str, int i, int i2) {
        return StyleAdapter.DefaultImpls.getTextPos(this, paint, str, i, i2);
    }

    @Override // com.huami.calendarview.MonthView
    public void onDrawScheme(@NotNull Canvas canvas, @NotNull Calendar calendar, int x, int y) {
    }

    @Override // com.huami.calendarview.MonthView
    public boolean onDrawSelected(@NotNull Canvas canvas, @NotNull Calendar calendar, int x, int y, boolean hasScheme) {
        return false;
    }

    @Override // com.huami.calendarview.MonthView
    public void onDrawText(@NotNull Canvas canvas, @NotNull Calendar calendar, int x, int y, boolean hasScheme, boolean isSelected) {
        FemaleHealthCalendarView femaleHealthCalendarView = this.calendarView;
        FemaleHealthCalendarView femaleHealthCalendarView2 = null;
        if (femaleHealthCalendarView == null) {
            ViewParent parent = getParent();
            while (true) {
                if (parent == null) {
                    parent = null;
                    break;
                } else if (parent instanceof FemaleHealthCalendarView) {
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
            femaleHealthCalendarView = (FemaleHealthCalendarView) parent;
        }
        FemaleHealthCalendarView femaleHealthCalendarView3 = femaleHealthCalendarView;
        if (femaleHealthCalendarView3 != null) {
            Function1<Calendar, CalendarPeriodStyle> renderStyle = femaleHealthCalendarView3.getRenderStyle();
            CalendarPeriodStyle calendarPeriodStyleInvoke = renderStyle != null ? renderStyle.invoke(calendar) : null;
            (calendarPeriodStyleInvoke == null ? StatusKt.getNormalStyle() : calendarPeriodStyleInvoke).render(this, canvas, calendar, x, y, hasScheme, isSelected, femaleHealthCalendarView3.getContext());
            Unit unit = Unit.INSTANCE;
            femaleHealthCalendarView2 = femaleHealthCalendarView3;
        }
        this.calendarView = femaleHealthCalendarView2;
    }

    @Override // com.huami.calendarview.BaseMonthView, com.huami.calendarview.BaseView
    public void onPreviewHook() {
    }
}
