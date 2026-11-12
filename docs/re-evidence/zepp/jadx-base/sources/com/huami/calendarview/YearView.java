package com.huami.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import com.huami.femalehealth.uilib.R;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class YearView extends View {
    public c a;
    public List<Calendar> b;
    public Paint mCurDayLunarTextPaint;
    public Paint mCurDayTextPaint;
    public Paint mCurMonthLunarTextPaint;
    public Paint mCurMonthTextPaint;
    public int mItemHeight;
    public int mItemWidth;
    public int mLineCount;
    public int mMonth;
    public float mMonthTextBaseLine;
    public Paint mMonthTextPaint;
    public int mNextDiff;
    public Paint mOtherMonthLunarTextPaint;
    public Paint mOtherMonthTextPaint;
    public Paint mSchemeLunarTextPaint;
    public Paint mSchemePaint;
    public Paint mSchemeTextPaint;
    public Paint mSelectTextPaint;
    public Paint mSelectedLunarTextPaint;
    public Paint mSelectedPaint;
    public float mTextBaseLine;
    public int mWeekStart;
    public float mWeekTextBaseLine;
    public Paint mWeekTextPaint;
    public int mYear;

    public YearView(Context context) {
        this(context, null);
    }

    private void a() {
        Map<String, Calendar> map = this.a.p0;
        if (map == null || map.size() == 0) {
            return;
        }
        for (Calendar calendar : this.b) {
            if (this.a.p0.containsKey(calendar.toString())) {
                Calendar calendar2 = this.a.p0.get(calendar.toString());
                if (calendar2 != null) {
                    calendar.setScheme(TextUtils.isEmpty(calendar2.getScheme()) ? this.a.H() : calendar2.getScheme());
                    calendar.setSchemeColor(calendar2.getSchemeColor());
                    calendar.setSchemes(calendar2.getSchemes());
                }
            } else {
                calendar.setScheme("");
                calendar.setSchemeColor(0);
                calendar.setSchemes(null);
            }
        }
    }

    private void b(Canvas canvas, Calendar calendar, int i, int i2, int i3) {
        int iJ0 = (i2 * this.mItemWidth) + this.a.j0();
        int monthViewTop = (i * this.mItemHeight) + getMonthViewTop();
        boolean zEquals = calendar.equals(this.a.B0);
        boolean zHasScheme = calendar.hasScheme();
        if (zHasScheme) {
            if ((zEquals ? onDrawSelected(canvas, calendar, iJ0, monthViewTop, true) : false) || !zEquals) {
                this.mSchemePaint.setColor(calendar.getSchemeColor() != 0 ? calendar.getSchemeColor() : this.a.J());
                onDrawScheme(canvas, calendar, iJ0, monthViewTop);
            }
        } else if (zEquals) {
            onDrawSelected(canvas, calendar, iJ0, monthViewTop, false);
        }
        onDrawText(canvas, calendar, iJ0, monthViewTop, zHasScheme, zEquals);
    }

    private void d() {
        this.mCurMonthTextPaint.setAntiAlias(true);
        this.mCurMonthTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mCurMonthTextPaint.setColor(-15658735);
        this.mCurMonthTextPaint.setFakeBoldText(true);
        this.mOtherMonthTextPaint.setAntiAlias(true);
        this.mOtherMonthTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mOtherMonthTextPaint.setColor(ContextCompat.getColor(getContext(), R.color.s3));
        this.mOtherMonthTextPaint.setFakeBoldText(true);
        this.mCurMonthLunarTextPaint.setAntiAlias(true);
        this.mCurMonthLunarTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mSelectedLunarTextPaint.setAntiAlias(true);
        this.mSelectedLunarTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mOtherMonthLunarTextPaint.setAntiAlias(true);
        this.mOtherMonthLunarTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mMonthTextPaint.setAntiAlias(true);
        this.mMonthTextPaint.setFakeBoldText(true);
        this.mWeekTextPaint.setAntiAlias(true);
        this.mWeekTextPaint.setFakeBoldText(true);
        this.mWeekTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mSchemeLunarTextPaint.setAntiAlias(true);
        this.mSchemeLunarTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mSchemeTextPaint.setAntiAlias(true);
        this.mSchemeTextPaint.setStyle(Paint.Style.FILL);
        this.mSchemeTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mSchemeTextPaint.setColor(-1223853);
        this.mSchemeTextPaint.setFakeBoldText(true);
        this.mSelectTextPaint.setAntiAlias(true);
        this.mSelectTextPaint.setStyle(Paint.Style.FILL);
        this.mSelectTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mSelectTextPaint.setColor(-1223853);
        this.mSelectTextPaint.setFakeBoldText(true);
        this.mSchemePaint.setAntiAlias(true);
        this.mSchemePaint.setStyle(Paint.Style.FILL);
        this.mSchemePaint.setStrokeWidth(2.0f);
        this.mSchemePaint.setColor(-1052689);
        this.mCurDayTextPaint.setAntiAlias(true);
        this.mCurDayTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mCurDayTextPaint.setColor(SupportMenu.CATEGORY_MASK);
        this.mCurDayTextPaint.setFakeBoldText(true);
        this.mCurDayLunarTextPaint.setAntiAlias(true);
        this.mCurDayLunarTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mCurDayLunarTextPaint.setColor(SupportMenu.CATEGORY_MASK);
        this.mCurDayLunarTextPaint.setFakeBoldText(true);
        this.mSelectedPaint.setAntiAlias(true);
        this.mSelectedPaint.setStyle(Paint.Style.FILL);
        this.mSelectedPaint.setStrokeWidth(2.0f);
    }

    private void f(Canvas canvas) {
        onDrawMonth(canvas, this.mYear, this.mMonth, this.a.j0(), this.a.g0(), getWidth() - (this.a.j0() * 2), this.a.e0() + this.a.g0());
    }

    private void g(Canvas canvas) {
        int i = 0;
        int i2 = 0;
        while (i2 < this.mLineCount) {
            int i3 = i;
            for (int i4 = 0; i4 < 7; i4++) {
                Calendar calendar = this.b.get(i3);
                if (i3 > this.b.size() - this.mNextDiff) {
                    return;
                }
                if (calendar.isCurrentMonth()) {
                    b(canvas, calendar, i2, i4, i3);
                }
                i3++;
            }
            i2++;
            i = i3;
        }
    }

    private int getMonthViewTop() {
        return this.a.g0() + this.a.e0() + this.a.f0() + this.a.m0();
    }

    private void h(Canvas canvas) {
        if (this.a.m0() <= 0) {
            return;
        }
        int iU = this.a.U();
        if (iU > 0) {
            iU--;
        }
        int width = (getWidth() - (this.a.j0() * 2)) / 7;
        for (int i = 0; i < 7; i++) {
            onDrawWeek(canvas, iU, this.a.j0() + (i * width), this.a.e0() + this.a.g0() + this.a.f0(), width, this.a.m0());
            iU++;
            if (iU >= 7) {
                iU = 0;
            }
        }
    }

    public final void c(int i, int i2) {
        this.mYear = i;
        this.mMonth = i2;
        this.mNextDiff = b.h(i, i2, this.a.U());
        b.m(this.mYear, this.mMonth, this.a.U());
        this.b = b.z(this.mYear, this.mMonth, this.a.j(), this.a.U());
        this.mLineCount = 6;
        a();
    }

    public final void e(int i, int i2) {
        Rect rect = new Rect();
        this.mCurMonthTextPaint.getTextBounds("1", 0, 1, rect);
        int iHeight = (rect.height() * 12) + getMonthViewTop();
        if (i2 < iHeight) {
            i2 = iHeight;
        }
        getLayoutParams().width = i;
        getLayoutParams().height = i2;
        this.mItemHeight = (i2 - getMonthViewTop()) / 6;
        Paint.FontMetrics fontMetrics = this.mCurMonthTextPaint.getFontMetrics();
        this.mTextBaseLine = ((this.mItemHeight / 2) - fontMetrics.descent) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f);
        Paint.FontMetrics fontMetrics2 = this.mMonthTextPaint.getFontMetrics();
        this.mMonthTextBaseLine = ((this.a.e0() / 2) - fontMetrics2.descent) + ((fontMetrics2.bottom - fontMetrics2.top) / 2.0f);
        Paint.FontMetrics fontMetrics3 = this.mWeekTextPaint.getFontMetrics();
        this.mWeekTextBaseLine = ((this.a.m0() / 2) - fontMetrics3.descent) + ((fontMetrics3.bottom - fontMetrics3.top) / 2.0f);
        invalidate();
    }

    public final void i() {
        c cVar = this.a;
        if (cVar == null) {
            return;
        }
        this.mCurMonthTextPaint.setTextSize(cVar.d0());
        this.mSchemeTextPaint.setTextSize(this.a.d0());
        this.mOtherMonthTextPaint.setTextSize(this.a.d0());
        this.mCurDayTextPaint.setTextSize(this.a.d0());
        this.mSelectTextPaint.setTextSize(this.a.d0());
        this.mSchemeTextPaint.setColor(this.a.k0());
        this.mCurMonthTextPaint.setColor(this.a.c0());
        this.mOtherMonthTextPaint.setColor(this.a.c0());
        this.mCurDayTextPaint.setColor(this.a.b0());
        this.mSelectTextPaint.setColor(this.a.l0());
        this.mMonthTextPaint.setTextSize(this.a.i0());
        this.mMonthTextPaint.setColor(this.a.h0());
        this.mWeekTextPaint.setColor(this.a.n0());
        this.mWeekTextPaint.setTextSize(this.a.o0());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.mItemWidth = (getWidth() - (this.a.j0() * 2)) / 7;
        onPreviewHook();
        f(canvas);
        h(canvas);
        g(canvas);
    }

    public abstract void onDrawMonth(Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6);

    public abstract void onDrawScheme(Canvas canvas, Calendar calendar, int i, int i2);

    public abstract boolean onDrawSelected(Canvas canvas, Calendar calendar, int i, int i2, boolean z);

    public abstract void onDrawText(Canvas canvas, Calendar calendar, int i, int i2, boolean z, boolean z2);

    public abstract void onDrawWeek(Canvas canvas, int i, int i2, int i3, int i4, int i5);

    public void onPreviewHook() {
    }

    public final void setup(c cVar) {
        this.a = cVar;
        i();
    }

    public YearView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCurMonthTextPaint = new Paint();
        this.mOtherMonthTextPaint = new Paint();
        this.mCurMonthLunarTextPaint = new Paint();
        this.mSelectedLunarTextPaint = new Paint();
        this.mOtherMonthLunarTextPaint = new Paint();
        this.mSchemeLunarTextPaint = new Paint();
        this.mSchemePaint = new Paint();
        this.mSelectedPaint = new Paint();
        this.mSchemeTextPaint = new Paint();
        this.mSelectTextPaint = new Paint();
        this.mCurDayTextPaint = new Paint();
        this.mCurDayLunarTextPaint = new Paint();
        this.mMonthTextPaint = new Paint();
        this.mWeekTextPaint = new Paint();
        d();
    }
}
