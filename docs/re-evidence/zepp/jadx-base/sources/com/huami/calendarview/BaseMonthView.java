package com.huami.calendarview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseMonthView extends BaseView {
    public MonthViewPager i;
    public int mHeight;
    public int mLineCount;
    public int mMonth;
    public int mNextDiff;
    public int mYear;

    public BaseMonthView(Context context) {
        super(context);
    }

    @SuppressLint({"WrongConstant"})
    private void h() {
        c cVar;
        CalendarView.OnCalendarInterceptListener onCalendarInterceptListener;
        this.mNextDiff = b.h(this.mYear, this.mMonth, this.a.U());
        int iM = b.m(this.mYear, this.mMonth, this.a.U());
        int iG = b.g(this.mYear, this.mMonth);
        List<Calendar> listZ = b.z(this.mYear, this.mMonth, this.a.j(), this.a.U());
        this.c = listZ;
        if (listZ.contains(this.a.j())) {
            this.g = this.c.indexOf(this.a.j());
        } else {
            this.g = this.c.indexOf(this.a.B0);
        }
        if (this.g > 0 && (onCalendarInterceptListener = (cVar = this.a).q0) != null && onCalendarInterceptListener.onCalendarIntercept(cVar.B0)) {
            this.g = -1;
        }
        if (this.a.D() == 0) {
            this.mLineCount = 6;
        } else {
            this.mLineCount = ((iM + iG) + this.mNextDiff) / 7;
        }
        a();
        invalidate();
    }

    @Override // com.huami.calendarview.BaseView
    public void e() {
        List<Calendar> list = this.c;
        if (list == null) {
            return;
        }
        if (list.contains(this.a.j())) {
            Iterator<Calendar> it2 = this.c.iterator();
            while (it2.hasNext()) {
                it2.next().setCurrentDay(false);
            }
            this.c.get(this.c.indexOf(this.a.j())).setCurrentDay(true);
        }
        invalidate();
    }

    @Override // com.huami.calendarview.BaseView
    public void f() {
        super.f();
        this.mHeight = b.k(this.mYear, this.mMonth, this.mItemHeight, this.a.U(), this.a.D());
    }

    public Calendar getIndex() {
        if (this.mItemWidth != 0 && this.mItemHeight != 0) {
            int iG = ((int) (this.d - this.a.g())) / this.mItemWidth;
            if (this.a.t0()) {
                iG = 6 - iG;
            }
            if (iG >= 7) {
                iG = 6;
            }
            int i = ((((int) this.e) / this.mItemHeight) * 7) + iG;
            if (i >= 0 && i < this.c.size()) {
                return this.c.get(i);
            }
        }
        return null;
    }

    public final int getSelectedIndex(Calendar calendar) {
        return this.c.indexOf(calendar);
    }

    public final void i(int i, int i2) {
        this.mYear = i;
        this.mMonth = i2;
        h();
        this.mHeight = b.k(i, i2, this.mItemHeight, this.a.U(), this.a.D());
    }

    public final void j() {
        this.mLineCount = b.l(this.mYear, this.mMonth, this.a.U(), this.a.D());
        this.mHeight = b.k(this.mYear, this.mMonth, this.mItemHeight, this.a.U(), this.a.D());
        invalidate();
    }

    public final void k() {
        h();
        this.mHeight = b.k(this.mYear, this.mMonth, this.mItemHeight, this.a.U(), this.a.D());
    }

    @Override // com.huami.calendarview.BaseView
    public void onDestroy() {
    }

    public void onLoopStart(int i, int i2) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mLineCount != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.mHeight, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // com.huami.calendarview.BaseView
    public void onPreviewHook() {
    }

    public final void setSelectedCalendar(Calendar calendar) {
        this.g = this.c.indexOf(calendar);
    }
}
