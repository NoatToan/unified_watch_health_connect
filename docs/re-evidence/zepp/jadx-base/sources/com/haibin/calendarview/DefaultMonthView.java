package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultMonthView extends MonthView {
    private Paint a;
    private Paint b;
    private float c;
    private int d;
    private float e;

    public DefaultMonthView(Context context) {
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

    @Override // com.haibin.calendarview.MonthView
    public void onDrawScheme(Canvas canvas, Calendar calendar, int i, int i2) {
        this.b.setColor(calendar.getSchemeColor());
        int i3 = this.mItemWidth + i;
        int i4 = this.d;
        float f = this.c;
        canvas.drawCircle((i3 - i4) - (f / 2.0f), i4 + i2 + f, f, this.b);
        canvas.drawText(calendar.getScheme(), (((i + this.mItemWidth) - this.d) - (this.c / 2.0f)) - (a(calendar.getScheme()) / 2.0f), i2 + this.d + this.e, this.a);
    }

    @Override // com.haibin.calendarview.MonthView
    public boolean onDrawSelected(Canvas canvas, Calendar calendar, int i, int i2, boolean z) {
        this.mSelectedPaint.setStyle(Paint.Style.FILL);
        int i3 = this.d;
        canvas.drawRect(i + i3, i2 + i3, (i + this.mItemWidth) - i3, (i2 + this.mItemHeight) - i3, this.mSelectedPaint);
        return true;
    }

    @Override // com.haibin.calendarview.MonthView
    public void onDrawText(Canvas canvas, Calendar calendar, int i, int i2, boolean z, boolean z2) {
        Paint paint;
        Paint paint2;
        Paint paint3;
        int i3 = i + (this.mItemWidth / 2);
        int i4 = i2 - (this.mItemHeight / 6);
        if (z2) {
            float f = i3;
            canvas.drawText(String.valueOf(calendar.getDay()), f, this.mTextBaseLine + i4, this.mSelectTextPaint);
            canvas.drawText(calendar.getLunar(), f, this.mTextBaseLine + i2 + (this.mItemHeight / 10), this.mSelectedLunarTextPaint);
            return;
        }
        if (z) {
            String strValueOf = String.valueOf(calendar.getDay());
            float f2 = i3;
            float f3 = this.mTextBaseLine + i4;
            if (calendar.isCurrentDay()) {
                paint3 = this.mCurDayTextPaint;
            } else {
                paint3 = calendar.isCurrentMonth() ? this.mSchemeTextPaint : this.mOtherMonthTextPaint;
            }
            canvas.drawText(strValueOf, f2, f3, paint3);
            canvas.drawText(calendar.getLunar(), f2, this.mTextBaseLine + i2 + (this.mItemHeight / 10), calendar.isCurrentDay() ? this.mCurDayLunarTextPaint : this.mSchemeLunarTextPaint);
            return;
        }
        String strValueOf2 = String.valueOf(calendar.getDay());
        float f4 = i3;
        float f5 = this.mTextBaseLine + i4;
        if (calendar.isCurrentDay()) {
            paint = this.mCurDayTextPaint;
        } else {
            paint = calendar.isCurrentMonth() ? this.mCurMonthTextPaint : this.mOtherMonthTextPaint;
        }
        canvas.drawText(strValueOf2, f4, f5, paint);
        String lunar = calendar.getLunar();
        float f6 = this.mTextBaseLine + i2 + (this.mItemHeight / 10);
        if (calendar.isCurrentDay()) {
            paint2 = this.mCurDayLunarTextPaint;
        } else {
            paint2 = calendar.isCurrentMonth() ? this.mCurMonthLunarTextPaint : this.mOtherMonthLunarTextPaint;
        }
        canvas.drawText(lunar, f4, f6, paint2);
    }
}
