package com.xiaomi.hm.health.baseui.calendar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.Keep;
import com.haibin.calendarview.Calendar;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0014J0\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0014J(\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014J \u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/baseui/calendar/WeekView;", "Lcom/haibin/calendarview/WeekView;", "", "onPreviewHook", "Landroid/graphics/Canvas;", "canvas", "Lcom/haibin/calendarview/Calendar;", "calendar", "", "x", "", "hasScheme", "isSelected", "onDrawText", "onDrawSelected", "onDrawScheme", "", "radius", "F", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WeekView extends com.haibin.calendarview.WeekView {
    private float radius;

    public WeekView(@NotNull Context context) {
        super(context);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.haibin.calendarview.WeekView
    public void onDrawScheme(@NotNull Canvas canvas, @NotNull Calendar calendar, int x) {
    }

    @Override // com.haibin.calendarview.WeekView
    public boolean onDrawSelected(@NotNull Canvas canvas, @NotNull Calendar calendar, int x, boolean hasScheme) {
        canvas.drawCircle(x + (this.mItemWidth / 2), this.mItemHeight / 2, this.radius, this.mSelectedPaint);
        return false;
    }

    @Override // com.haibin.calendarview.WeekView
    public void onDrawText(@NotNull Canvas canvas, @NotNull Calendar calendar, int x, boolean hasScheme, boolean isSelected) {
        Paint paint;
        Paint paint2;
        float f = this.mTextBaseLine;
        int i = x + (this.mItemWidth / 2);
        if (isSelected) {
            canvas.drawText(String.valueOf(calendar.getDay()), i, f, this.mSelectTextPaint);
            return;
        }
        if (hasScheme) {
            String strValueOf = String.valueOf(calendar.getDay());
            float f2 = i;
            if (calendar.isCurrentDay()) {
                paint2 = this.mCurDayTextPaint;
            } else {
                calendar.isCurrentMonth();
                paint2 = this.mSchemeTextPaint;
            }
            canvas.drawText(strValueOf, f2, f, paint2);
            return;
        }
        String strValueOf2 = String.valueOf(calendar.getDay());
        float f3 = i;
        if (calendar.isCurrentDay()) {
            paint = this.mCurDayTextPaint;
        } else {
            calendar.isCurrentMonth();
            paint = this.mCurMonthTextPaint;
        }
        canvas.drawText(strValueOf2, f3, f, paint);
    }

    @Override // com.haibin.calendarview.BaseWeekView, com.haibin.calendarview.BaseView
    public void onPreviewHook() {
        this.radius = (Math.min(this.mItemWidth, this.mItemHeight) / 5) * 2;
    }
}
