package com.huami.femalehealth.uilib.widget.calendar.week;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewParent;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.calendarview.Calendar;
import com.huami.calendarview.WeekView;
import com.huami.femalehealth.logiclib.calculation.Milli;
import com.huami.femalehealth.uilib.helper.ExtKt;
import com.huami.femalehealth.uilib.helper.RTLHelper;
import com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.StatusKt;
import com.huami.femalehealth.uilib.widget.calendar.status.StyleAdapter;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J,\u0010\u0010\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J\b\u0010\u0012\u001a\u00020\u0011H\u0014J$\u0010\u0013\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u0003H\u0014J4\u0010\u0015\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0014J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006'"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/week/CalendarWeekView;", "Lcom/huami/calendarview/WeekView;", "Lcom/huami/femalehealth/uilib/widget/calendar/status/StyleAdapter;", "", "dayOffset", "Lcom/huami/calendarview/Calendar;", "o", "Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "style", GoogleApiAvailabilityLight.b, "Landroid/graphics/Canvas;", "canvas", "calendar", "x", "", "hasScheme", "onDrawSelected", "", "onPreviewHook", "onDrawScheme", "isSelected", "onDrawText", "getItemWidth", "getItemHeight", "Lcom/huami/femalehealth/uilib/widget/calendar/week/CalendarWeekLayout;", "i", "Lcom/huami/femalehealth/uilib/widget/calendar/week/CalendarWeekLayout;", "weekLayout", "", z.j, "Ljava/util/List;", "week", hl.k, LogUtil.I, "current", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class CalendarWeekView extends WeekView implements StyleAdapter {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private CalendarWeekLayout weekLayout;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final List<Calendar> week;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int current;

    public CalendarWeekView(@NotNull Context context) {
        super(context);
        ArrayList arrayList = new ArrayList(7);
        for (int i = 0; i < 7; i++) {
            arrayList.add(new Calendar());
        }
        this.week = arrayList;
        if (RTLHelper.INSTANCE.isRTL(context)) {
            arrayList.set(0, o(3));
            arrayList.set(1, o(2));
            arrayList.set(2, o(1));
            Calendar calendarO = o(0);
            calendarO.setCurrentDay(true);
            arrayList.set(3, calendarO);
            arrayList.set(4, o(-1));
            arrayList.set(5, o(-2));
            arrayList.set(6, o(-3));
            return;
        }
        arrayList.set(0, o(-3));
        arrayList.set(1, o(-2));
        arrayList.set(2, o(-1));
        Calendar calendarO2 = o(0);
        calendarO2.setCurrentDay(true);
        arrayList.set(3, calendarO2);
        arrayList.set(4, o(1));
        arrayList.set(5, o(2));
        arrayList.set(6, o(3));
    }

    private final CalendarPeriodStyle n(CalendarPeriodStyle style) {
        return Intrinsics.areEqual(style, StatusKt.getNormalStyle()) ? StatusKt.getNormalWeekStyle() : style;
    }

    private final Calendar o(int dayOffset) {
        return ExtKt.toCalendar(new Milli(System.currentTimeMillis()), dayOffset);
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

    @Override // com.huami.calendarview.WeekView
    public void onDrawScheme(@Nullable Canvas canvas, @Nullable Calendar calendar, int x) {
    }

    @Override // com.huami.calendarview.WeekView
    public boolean onDrawSelected(@Nullable Canvas canvas, @Nullable Calendar calendar, int x, boolean hasScheme) {
        return false;
    }

    @Override // com.huami.calendarview.WeekView
    public void onDrawText(@Nullable Canvas canvas, @Nullable Calendar calendar, int x, boolean hasScheme, boolean isSelected) {
        if (this.current <= this.week.size() - 1 && canvas != null) {
            CalendarWeekLayout calendarWeekLayout = this.weekLayout;
            CalendarWeekLayout calendarWeekLayout2 = null;
            if (calendarWeekLayout == null) {
                ViewParent parent = getParent();
                while (true) {
                    if (parent == null) {
                        parent = null;
                        break;
                    } else if (parent instanceof CalendarWeekLayout) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                calendarWeekLayout = (CalendarWeekLayout) parent;
            }
            if (calendarWeekLayout != null) {
                Function1<Calendar, CalendarPeriodStyle> renderStyle = calendarWeekLayout.getRenderStyle();
                CalendarPeriodStyle calendarPeriodStyleInvoke = renderStyle != null ? renderStyle.invoke(this.week.get(this.current)) : null;
                if (calendarPeriodStyleInvoke == null) {
                    calendarPeriodStyleInvoke = StatusKt.getNormalStyle();
                }
                n(calendarPeriodStyleInvoke).render(this, canvas, this.week.get(this.current), x, 0, hasScheme, this.current == 3, calendarWeekLayout.getContext());
                this.current++;
                Unit unit = Unit.INSTANCE;
                calendarWeekLayout2 = calendarWeekLayout;
            }
            this.weekLayout = calendarWeekLayout2;
        }
    }

    @Override // com.huami.calendarview.BaseWeekView, com.huami.calendarview.BaseView
    public void onPreviewHook() {
        this.current = 0;
    }
}
