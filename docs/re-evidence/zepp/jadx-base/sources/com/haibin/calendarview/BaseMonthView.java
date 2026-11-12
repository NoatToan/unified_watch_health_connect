package com.haibin.calendarview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseMonthView extends BaseView {
    public int mHeight;
    public int mLineCount;
    public int mMonth;
    public MonthViewPager mMonthViewPager;
    public int mNextDiff;
    public int mYear;

    public BaseMonthView(Context context) {
        super(context);
    }

    @SuppressLint({"WrongConstant"})
    private void initCalendar() {
        c cVar;
        CalendarView.OnCalendarInterceptListener onCalendarInterceptListener;
        this.mNextDiff = b.h(this.mYear, this.mMonth, this.mDelegate.S());
        int iM = b.m(this.mYear, this.mMonth, this.mDelegate.S());
        int iG = b.g(this.mYear, this.mMonth);
        List<Calendar> listZ = b.z(this.mYear, this.mMonth, this.mDelegate.j(), this.mDelegate.S());
        this.mItems = listZ;
        if (listZ.contains(this.mDelegate.j())) {
            this.mCurrentItem = this.mItems.indexOf(this.mDelegate.j());
        } else {
            this.mCurrentItem = this.mItems.indexOf(this.mDelegate.y0);
        }
        if (this.mCurrentItem > 0 && (onCalendarInterceptListener = (cVar = this.mDelegate).n0) != null && onCalendarInterceptListener.onCalendarIntercept(cVar.y0)) {
            this.mCurrentItem = -1;
        }
        if (this.mDelegate.B() == 0) {
            this.mLineCount = 6;
        } else {
            this.mLineCount = ((iM + iG) + this.mNextDiff) / 7;
        }
        addSchemesFromMap();
        invalidate();
    }

    public Calendar getIndex() {
        if (this.mItemWidth != 0 && this.mItemHeight != 0) {
            int iG = ((int) (this.mX - this.mDelegate.g())) / this.mItemWidth;
            if (iG >= 7) {
                iG = 6;
            }
            int i = ((((int) this.mY) / this.mItemHeight) * 7) + iG;
            if (i >= 0 && i < this.mItems.size()) {
                return this.mItems.get(i);
            }
        }
        return null;
    }

    public final int getSelectedIndex(Calendar calendar) {
        return this.mItems.indexOf(calendar);
    }

    public final void initMonthWithDate(int i, int i2) {
        this.mYear = i;
        this.mMonth = i2;
        initCalendar();
        this.mHeight = b.k(i, i2, this.mItemHeight, this.mDelegate.S(), this.mDelegate.B());
    }

    @Override // com.haibin.calendarview.BaseView
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

    @Override // com.haibin.calendarview.BaseView
    public void onPreviewHook() {
    }

    public final void setSelectedCalendar(Calendar calendar) {
        this.mCurrentItem = this.mItems.indexOf(calendar);
    }

    @Override // com.haibin.calendarview.BaseView
    public void updateCurrentDate() {
        List<Calendar> list = this.mItems;
        if (list == null) {
            return;
        }
        if (list.contains(this.mDelegate.j())) {
            Iterator<Calendar> it2 = this.mItems.iterator();
            while (it2.hasNext()) {
                it2.next().setCurrentDay(false);
            }
            this.mItems.get(this.mItems.indexOf(this.mDelegate.j())).setCurrentDay(true);
        }
        invalidate();
    }

    @Override // com.haibin.calendarview.BaseView
    public void updateItemHeight() {
        super.updateItemHeight();
        this.mHeight = b.k(this.mYear, this.mMonth, this.mItemHeight, this.mDelegate.S(), this.mDelegate.B());
    }

    public final void updateShowMode() {
        this.mLineCount = b.l(this.mYear, this.mMonth, this.mDelegate.S(), this.mDelegate.B());
        this.mHeight = b.k(this.mYear, this.mMonth, this.mItemHeight, this.mDelegate.S(), this.mDelegate.B());
        invalidate();
    }

    public final void updateWeekStart() {
        initCalendar();
        this.mHeight = b.k(this.mYear, this.mMonth, this.mItemHeight, this.mDelegate.S(), this.mDelegate.B());
    }
}
