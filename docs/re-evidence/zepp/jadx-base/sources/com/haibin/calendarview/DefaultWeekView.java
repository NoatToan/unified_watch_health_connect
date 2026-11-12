package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultWeekView extends WeekView {
    private Paint a;
    private Paint b;
    private float c;
    private int d;
    private float e;

    public DefaultWeekView(Context context) {
        super(context);
        this.a = new Paint();
        this.b = new Paint();
        this.a.setTextSize(b.c(context, 8.0f));
        this.a.setColor(-1);
        this.a.setAntiAlias(true);
        this.a.setFakeBoldText(true);
        this.b.setAntiAlias(true);
        this.b.setStyle(Paint.Style.FILL);
        this.b.setTextAlign(Paint.Align.CENTER);
        this.b.setColor(-1223853);
        this.b.setFakeBoldText(true);
        this.c = b.c(getContext(), 7.0f);
        this.d = b.c(getContext(), 4.0f);
        Paint.FontMetrics fontMetrics = this.b.getFontMetrics();
        this.e = (this.c - fontMetrics.descent) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f) + b.c(getContext(), 1.0f);
    }

    private float a(String str) {
        return this.a.measureText(str);
    }

    @Override // com.haibin.calendarview.WeekView
    public void onDrawScheme(Canvas canvas, Calendar calendar, int i) {
        this.b.setColor(calendar.getSchemeColor());
        int i2 = this.mItemWidth + i;
        int i3 = this.d;
        float f = this.c;
        canvas.drawCircle((i2 - i3) - (f / 2.0f), i3 + f, f, this.b);
        canvas.drawText(calendar.getScheme(), (((i + this.mItemWidth) - this.d) - (this.c / 2.0f)) - (a(calendar.getScheme()) / 2.0f), this.d + this.e, this.a);
    }

    @Override // com.haibin.calendarview.WeekView
    public boolean onDrawSelected(Canvas canvas, Calendar calendar, int i, boolean z) {
        this.mSelectedPaint.setStyle(Paint.Style.FILL);
        int i2 = this.d;
        canvas.drawRect(i + i2, i2, (i + this.mItemWidth) - i2, this.mItemHeight - i2, this.mSelectedPaint);
        return true;
    }

    @Override // com.haibin.calendarview.WeekView
    public void onDrawText(Canvas canvas, Calendar calendar, int i, boolean z, boolean z2) {
        Paint paint;
        Paint paint2;
        Paint paint3;
        int i2 = i + (this.mItemWidth / 2);
        int i3 = (-this.mItemHeight) / 6;
        if (z2) {
            float f = i2;
            canvas.drawText(String.valueOf(calendar.getDay()), f, this.mTextBaseLine + i3, this.mSelectTextPaint);
            canvas.drawText(calendar.getLunar(), f, this.mTextBaseLine + (this.mItemHeight / 10), this.mSelectedLunarTextPaint);
            return;
        }
        if (z) {
            String strValueOf = String.valueOf(calendar.getDay());
            float f2 = i2;
            float f3 = this.mTextBaseLine + i3;
            if (calendar.isCurrentDay()) {
                paint3 = this.mCurDayTextPaint;
            } else {
                paint3 = calendar.isCurrentMonth() ? this.mSchemeTextPaint : this.mOtherMonthTextPaint;
            }
            canvas.drawText(strValueOf, f2, f3, paint3);
            canvas.drawText(calendar.getLunar(), f2, this.mTextBaseLine + (this.mItemHeight / 10), calendar.isCurrentDay() ? this.mCurDayLunarTextPaint : this.mSchemeLunarTextPaint);
            return;
        }
        String strValueOf2 = String.valueOf(calendar.getDay());
        float f4 = i2;
        float f5 = this.mTextBaseLine + i3;
        if (calendar.isCurrentDay()) {
            paint = this.mCurDayTextPaint;
        } else {
            paint = calendar.isCurrentMonth() ? this.mCurMonthTextPaint : this.mOtherMonthTextPaint;
        }
        canvas.drawText(strValueOf2, f4, f5, paint);
        String lunar = calendar.getLunar();
        float f6 = this.mTextBaseLine + (this.mItemHeight / 10);
        if (calendar.isCurrentDay()) {
            paint2 = this.mCurDayLunarTextPaint;
        } else {
            paint2 = calendar.isCurrentMonth() ? this.mCurMonthLunarTextPaint : this.mOtherMonthLunarTextPaint;
        }
        canvas.drawText(lunar, f4, f6, paint2);
    }
}
