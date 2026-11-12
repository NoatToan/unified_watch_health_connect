package com.huawei.ui.commonui.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.core.view.ViewCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import defpackage.qjh;
import defpackage.qjj;
import defpackage.qjk;
import defpackage.xde;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public final class HealthDefaultWeekView extends HealthWeekView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<HealthCalendar, String> f23327c;
    private CalendarTouchHelper d;
    private final b e;

    public HealthDefaultWeekView(Context context) {
        super(context);
        this.f23327c = new HashMap<>();
        this.e = new b(this);
    }

    private void c() {
        CalendarTouchHelper calendarTouchHelper = new CalendarTouchHelper(this);
        this.d = calendarTouchHelper;
        ViewCompat.setAccessibilityDelegate(this, calendarTouchHelper);
        ObserverManagerUtil.d(this.e, ObserveLabels.CALENDAR_ACCESSIBILITY_CONTENT);
        ObserverManagerUtil.e(ObserveLabels.CALENDAR_VIEW_INITIALIZED, new Object[0]);
    }

    static class b implements Observer {
        private boolean d = true;
        private WeakReference<HealthDefaultWeekView> e;

        b(HealthDefaultWeekView healthDefaultWeekView) {
            this.e = new WeakReference<>(healthDefaultWeekView);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            HealthDefaultWeekView healthDefaultWeekView = this.e.get();
            if (objArr.length != 4 || healthDefaultWeekView == null || !this.d || healthDefaultWeekView.d == null) {
                return;
            }
            healthDefaultWeekView.d.b(objArr);
            this.d = false;
        }
    }

    @Override // com.huawei.ui.commonui.calendarview.HealthWeekView
    protected boolean onDrawSelected(Canvas canvas, HealthCalendar healthCalendar, int i, boolean z) {
        if (this.mManager.am() && !healthCalendar.hasMark()) {
            return false;
        }
        int i2 = this.mItemWidth / 2;
        int i3 = this.mTextMidY;
        this.mSelectedPaint.setStyle(healthCalendar.isPresentDay() ? Paint.Style.FILL : Paint.Style.STROKE);
        canvas.drawCircle(i + i2, i3, this.mRadius, this.mSelectedPaint);
        return true;
    }

    @Override // com.huawei.ui.commonui.calendarview.HealthWeekView
    protected void onDrawMark(Canvas canvas, HealthCalendar healthCalendar, int i) {
        qjh.d(canvas, healthCalendar, i + (this.mItemWidth / 2), this.mTextOccupiedHeight + this.mManager.m, this.mManager, this.mRadius, this.mMarkPaint, this.mMarkTextPaint);
    }

    @Override // com.huawei.ui.commonui.calendarview.HealthWeekView
    protected void onDrawText(Canvas canvas, HealthCalendar healthCalendar, int i, int i2, boolean z) {
        Paint paint;
        String strB;
        int i3 = i2 + (this.mItemWidth / 2);
        boolean zI = qjj.i(healthCalendar, this.mManager);
        if (z && healthCalendar.isPresentDay()) {
            paint = this.mCurDaySelectedTextPaint;
        } else if (healthCalendar.isPresentDay()) {
            paint = this.mCurDayTextPaint;
        } else if (z) {
            paint = this.mCurMonthTextPaint;
        } else if ((!this.mManager.am() || healthCalendar.hasMark()) && ((!this.mManager.al() || !zI) && !isInRangeOfGray(healthCalendar) && healthCalendar.isPresentMonth())) {
            paint = this.mCurMonthTextPaint;
        } else {
            paint = this.mOtherMonthTextPaint;
        }
        if (paint != this.mOtherMonthTextPaint && this.d != null) {
            qjk qjkVar = new qjk(UnitUtil.e(healthCalendar.transformCalendar(), 18), i3, this.mTextMidY, this.mRadius);
            qjkVar.d(Boolean.valueOf(z));
            qjkVar.e(Boolean.valueOf(healthCalendar.isPresentDay()));
            qjkVar.a(healthCalendar.hasMark());
            if (this.d.d(healthCalendar.toString())) {
                CalendarTouchHelper calendarTouchHelper = this.d;
                calendarTouchHelper.c(calendarTouchHelper.a(healthCalendar.toString()), qjkVar);
            } else {
                this.d.d(healthCalendar.toString(), Integer.valueOf(this.d.c()));
                this.d.d(qjkVar);
            }
        }
        String str = this.f23327c.get(healthCalendar);
        if (!TextUtils.isEmpty(str) && !this.mManager.ar()) {
            canvas.drawText(str, i3, this.mTextBaseLine, paint);
            return;
        }
        if (this.mManager.ar()) {
            if (healthCalendar.isPresentDay() && LanguageUtil.f(BaseApplication.b())) {
                strB = qjj.d();
            } else {
                strB = qjj.e(getContext(), i, this.mManager.aa());
            }
        } else {
            strB = xde.b(healthCalendar.getDay());
        }
        this.f23327c.put(healthCalendar, strB);
        canvas.drawText(strB, i3, this.mTextBaseLine, paint);
    }

    @Override // com.huawei.ui.commonui.calendarview.HealthCalendarBaseView
    void updateItemHeight() {
        super.updateItemHeight();
        this.mRadius = this.mManager.k / 2;
        Paint.FontMetrics fontMetrics = this.mCurMonthTextPaint.getFontMetrics();
        float f = (fontMetrics.ascent + fontMetrics.descent) / 2.0f;
        int i = this.mManager.s;
        this.mTextMidY = this.mRadius + i;
        float f2 = this.mTextMidY;
        if (fontMetrics.descent < (-fontMetrics.ascent)) {
            f = -f;
        }
        this.mTextBaseLine = f2 + f;
        this.mTextOccupiedHeight = (int) (i + Math.max(this.mRadius * 2.0f, fontMetrics.bottom - fontMetrics.top));
    }

    @Override // com.huawei.ui.commonui.calendarview.HealthBaseWeekView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int dimensionPixelSize = this.mTextOccupiedHeight + getContext().getResources().getDimensionPixelSize(R.dimen.health_common_2dp);
        if (b()) {
            dimensionPixelSize += this.mManager.i + this.mManager.g + this.mManager.o();
        }
        setMeasuredDimension(getMeasuredWidth(), dimensionPixelSize);
    }

    private boolean b() {
        if (this.mItems == null) {
            return false;
        }
        for (HealthCalendar healthCalendar : this.mItems) {
            if (healthCalendar != null && healthCalendar.hasMark()) {
                for (HealthMark healthMark : healthCalendar.getMarks()) {
                    if (healthMark.d() != null || healthMark.j() != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        LogUtil.a("HealthDefaultWeekView", "enter into dispatchHoverEvent");
        CalendarTouchHelper calendarTouchHelper = this.d;
        if (calendarTouchHelper != null && calendarTouchHelper.dispatchHoverEvent(motionEvent)) {
            LogUtil.a("HealthDefaultWeekView", "enter into dispatchHoverEvent != null");
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        LogUtil.a("HealthDefaultWeekView", "enter into dispatchKeyEvent");
        CalendarTouchHelper calendarTouchHelper = this.d;
        if (calendarTouchHelper != null && calendarTouchHelper.dispatchKeyEvent(keyEvent)) {
            LogUtil.a("HealthDefaultWeekView", "enter into dispatchKeyEvent != null");
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.huawei.ui.commonui.calendarview.HealthBaseWeekView, com.huawei.ui.commonui.calendarview.HealthCalendarBaseView
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObserverManagerUtil.c(this.e);
    }
}
