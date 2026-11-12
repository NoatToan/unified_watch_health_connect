package com.huami.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.huami.femalehealth.uilib.R;

/* JADX INFO: loaded from: classes6.dex */
public class DefaultYearView extends YearView {
    private int c;

    public DefaultYearView(Context context) {
        super(context);
        this.c = b.c(context, 3.0f);
    }

    @Override // com.huami.calendarview.YearView
    public void onDrawMonth(Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6) {
        canvas.drawText(getContext().getResources().getStringArray(R.array.month_string_array)[i2 - 1], (i3 + (this.mItemWidth / 2)) - this.c, i4 + this.mMonthTextBaseLine, this.mMonthTextPaint);
    }

    @Override // com.huami.calendarview.YearView
    public void onDrawScheme(Canvas canvas, Calendar calendar, int i, int i2) {
    }

    @Override // com.huami.calendarview.YearView
    public boolean onDrawSelected(Canvas canvas, Calendar calendar, int i, int i2, boolean z) {
        return false;
    }

    @Override // com.huami.calendarview.YearView
    public void onDrawText(Canvas canvas, Calendar calendar, int i, int i2, boolean z, boolean z2) {
        Paint paint;
        Paint paint2;
        float f = this.mTextBaseLine + i2;
        int i3 = i + (this.mItemWidth / 2);
        if (z2) {
            canvas.drawText(String.valueOf(calendar.getDay()), i3, f, z ? this.mSchemeTextPaint : this.mSelectTextPaint);
            return;
        }
        if (z) {
            String strValueOf = String.valueOf(calendar.getDay());
            float f2 = i3;
            if (calendar.isCurrentDay()) {
                paint2 = this.mCurDayTextPaint;
            } else {
                paint2 = calendar.isCurrentMonth() ? this.mSchemeTextPaint : this.mOtherMonthTextPaint;
            }
            canvas.drawText(strValueOf, f2, f, paint2);
            return;
        }
        String strValueOf2 = String.valueOf(calendar.getDay());
        float f3 = i3;
        if (calendar.isCurrentDay()) {
            paint = this.mCurDayTextPaint;
        } else {
            paint = calendar.isCurrentMonth() ? this.mCurMonthTextPaint : this.mOtherMonthTextPaint;
        }
        canvas.drawText(strValueOf2, f3, f, paint);
    }

    @Override // com.huami.calendarview.YearView
    public void onDrawWeek(Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        canvas.drawText(getContext().getResources().getStringArray(R.array.year_view_week_string_array)[i], i2 + (i4 / 2), i3 + this.mWeekTextBaseLine, this.mWeekTextPaint);
    }
}
