package com.huawei.ui.commonui.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.core.view.ViewCompat;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.qjh;
import defpackage.qjj;
import defpackage.qjk;
import defpackage.xde;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes43.dex */
public final class HealthDefaultMonthView extends HealthMonthView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23324a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f23325c;
    private CalendarTouchHelper d;

    public HealthDefaultMonthView(Context context) {
        super(context);
        this.f23325c = new a(this);
        d();
    }

    private void d() {
        CalendarTouchHelper calendarTouchHelper = new CalendarTouchHelper(this);
        this.d = calendarTouchHelper;
        ViewCompat.setAccessibilityDelegate(this, calendarTouchHelper);
        ObserverManagerUtil.d(this.f23325c, ObserveLabels.CALENDAR_ACCESSIBILITY_CONTENT);
        ObserverManagerUtil.e(ObserveLabels.CALENDAR_VIEW_INITIALIZED, new Object[0]);
    }

    static class a implements Observer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<HealthDefaultMonthView> f23326a;
        private boolean e = true;

        a(HealthDefaultMonthView healthDefaultMonthView) {
            this.f23326a = new WeakReference<>(healthDefaultMonthView);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            HealthDefaultMonthView healthDefaultMonthView = this.f23326a.get();
            if (objArr.length != 4 || healthDefaultMonthView == null || !this.e || healthDefaultMonthView.d == null) {
                return;
            }
            healthDefaultMonthView.d.b(objArr);
            this.e = false;
        }
    }

    @Override // com.huawei.ui.commonui.calendarview.HealthCalendarBaseMonthView, com.huawei.ui.commonui.calendarview.HealthCalendarBaseView
    void updateItemHeight() {
        super.updateItemHeight();
        this.f23324a = this.mManager.ac() / 2;
    }

    @Override // com.huawei.ui.commonui.calendarview.HealthMonthView
    protected boolean onDrawSelected(Canvas canvas, HealthCalendar healthCalendar, int i, int i2, boolean z) {
        int i3 = this.mItemWidth / 2;
        int i4 = this.mItemHeight / 2;
        if (!this.mManager.an() || healthCalendar.isPresentDay()) {
            this.mSelectedPaint.setStyle(Paint.Style.FILL);
        } else {
            this.mSelectedPaint.setStyle(Paint.Style.STROKE);
        }
        canvas.drawCircle(i + i3, i2 + i4, this.f23324a, this.mSelectedPaint);
        return true;
    }

    @Override // com.huawei.ui.commonui.calendarview.HealthMonthView
    protected void onDrawMark(Canvas canvas, HealthCalendar healthCalendar, int i, int i2) {
        qjh.d(canvas, healthCalendar, i + (this.mItemWidth / 2), i2 + (this.mItemHeight / 2) + this.f23324a, this.mManager, this.f23324a, this.mMarkPaint, this.mMarkTextPaint);
    }

    @Override // com.huawei.ui.commonui.calendarview.HealthMonthView
    protected void onDrawText(Canvas canvas, HealthCalendar healthCalendar, int i, int i2, boolean z) {
        Paint paint;
        int i3 = i + (this.mItemWidth / 2);
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
        if (!this.mManager.an()) {
            if (z) {
                paint = this.mCurDaySelectedTextPaint;
            } else {
                paint = healthCalendar.isInRange() ? this.mCurMonthTextPaint : this.mOtherMonthTextPaint;
            }
        }
        if (paint != this.mOtherMonthTextPaint && this.d != null) {
            qjk qjkVar = new qjk(UnitUtil.e(healthCalendar.transformCalendar(), 8), i3, (this.mItemHeight / 2) + i2, this.f23324a);
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
        canvas.drawText(xde.b(healthCalendar.getDay()), i3, this.mTextBaseLine + i2, paint);
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        LogUtil.a("HealthDefaultMonthView", "enter into dispatchHoverEvent");
        CalendarTouchHelper calendarTouchHelper = this.d;
        if (calendarTouchHelper != null && calendarTouchHelper.dispatchHoverEvent(motionEvent)) {
            LogUtil.a("HealthDefaultMonthView", "enter into dispatchHoverEvent != null");
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        LogUtil.a("HealthDefaultMonthView", "enter into dispatchKeyEvent");
        CalendarTouchHelper calendarTouchHelper = this.d;
        if (calendarTouchHelper != null && calendarTouchHelper.dispatchKeyEvent(keyEvent)) {
            LogUtil.a("HealthDefaultMonthView", "enter into dispatchKeyEvent != null");
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.huawei.ui.commonui.calendarview.HealthCalendarBaseMonthView, com.huawei.ui.commonui.calendarview.HealthCalendarBaseView
    protected void onDestroy() {
        super.onDestroy();
        ObserverManagerUtil.c(this.f23325c);
    }
}
