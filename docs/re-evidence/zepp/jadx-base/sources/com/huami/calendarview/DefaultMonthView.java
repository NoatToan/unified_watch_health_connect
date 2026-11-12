package com.huami.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes6.dex */
public final class DefaultMonthView extends MonthView {
    private Paint j;
    private Paint k;
    private float l;
    private int m;
    private float n;

    public DefaultMonthView(Context context) {
        super(context);
        this.j = new Paint();
        this.k = new Paint();
        this.j.setTextSize(b.c(context, 8.0f));
        this.j.setColor(-1);
        this.j.setAntiAlias(true);
        this.j.setFakeBoldText(true);
        this.k.setAntiAlias(true);
        this.k.setStyle(Paint.Style.FILL);
        this.k.setTextAlign(Paint.Align.CENTER);
        this.k.setColor(-1223853);
        this.k.setFakeBoldText(true);
        this.l = b.c(getContext(), 7.0f);
        this.m = b.c(getContext(), 4.0f);
        Paint.FontMetrics fontMetrics = this.k.getFontMetrics();
        this.n = (this.l - fontMetrics.descent) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f) + b.c(getContext(), 1.0f);
    }

    private float m(String str) {
        return this.j.measureText(str);
    }

    @Override // com.huami.calendarview.MonthView
    public void onDrawScheme(Canvas canvas, Calendar calendar, int i, int i2) {
        this.k.setColor(calendar.getSchemeColor());
        int i3 = this.mItemWidth + i;
        int i4 = this.m;
        float f = this.l;
        canvas.drawCircle((i3 - i4) - (f / 2.0f), i4 + i2 + f, f, this.k);
        canvas.drawText(calendar.getScheme(), (((i + this.mItemWidth) - this.m) - (this.l / 2.0f)) - (m(calendar.getScheme()) / 2.0f), i2 + this.m + this.n, this.j);
    }

    @Override // com.huami.calendarview.MonthView
    public boolean onDrawSelected(Canvas canvas, Calendar calendar, int i, int i2, boolean z) {
        this.mSelectedPaint.setStyle(Paint.Style.FILL);
        int i3 = this.m;
        canvas.drawRect(i + i3, i2 + i3, (i + this.mItemWidth) - i3, (i2 + this.mItemHeight) - i3, this.mSelectedPaint);
        return true;
    }

    @Override // com.huami.calendarview.MonthView
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
