package com.haibin.calendarview;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseWeekView extends BaseView {
    public BaseWeekView(Context context) {
        super(context);
    }

    public final int getEdgeIndex(boolean z) {
        for (int i = 0; i < this.mItems.size(); i++) {
            boolean zIsInRange = isInRange(this.mItems.get(i));
            if (z && zIsInRange) {
                return i;
            }
            if (!z && !zIsInRange) {
                return i - 1;
            }
        }
        return z ? 6 : 0;
    }

    public Calendar getIndex() {
        int iG = ((int) (this.mX - this.mDelegate.g())) / this.mItemWidth;
        if (iG >= 7) {
            iG = 6;
        }
        int i = ((((int) this.mY) / this.mItemHeight) * 7) + iG;
        if (i < 0 || i >= this.mItems.size()) {
            return null;
        }
        return this.mItems.get(i);
    }

    public final boolean isMinRangeEdge(Calendar calendar) {
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(this.mDelegate.x(), this.mDelegate.z() - 1, this.mDelegate.y());
        long timeInMillis = calendar2.getTimeInMillis();
        calendar2.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay());
        return calendar2.getTimeInMillis() < timeInMillis;
    }

    @Override // com.haibin.calendarview.BaseView
    public void onDestroy() {
    }

    public void onLoopStart(int i) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.mItemHeight, 1073741824));
    }

    @Override // com.haibin.calendarview.BaseView
    public void onPreviewHook() {
    }

    public final void performClickCalendar(Calendar calendar, boolean z) {
        List<Calendar> list;
        c cVar;
        CalendarView.OnYearChangeListener onYearChangeListener;
        if (this.mParentLayout == null || this.mDelegate.s0 == null || (list = this.mItems) == null || list.size() == 0) {
            return;
        }
        int iX = b.x(calendar, this.mDelegate.S());
        if (this.mItems.contains(this.mDelegate.j())) {
            iX = b.x(this.mDelegate.j(), this.mDelegate.S());
        }
        Calendar calendar2 = this.mItems.get(iX);
        if (this.mDelegate.J() != 0) {
            if (this.mItems.contains(this.mDelegate.y0)) {
                calendar2 = this.mDelegate.y0;
            } else {
                this.mCurrentItem = -1;
            }
        }
        if (!isInRange(calendar2)) {
            iX = getEdgeIndex(isMinRangeEdge(calendar2));
            calendar2 = this.mItems.get(iX);
        }
        calendar2.setCurrentDay(calendar2.equals(this.mDelegate.j()));
        this.mDelegate.s0.a(calendar2, false);
        this.mParentLayout.w(b.v(calendar2, this.mDelegate.S()));
        c cVar2 = this.mDelegate;
        if (cVar2.o0 != null && z && cVar2.J() == 0) {
            this.mDelegate.o0.onCalendarSelect(calendar2, false);
        }
        this.mParentLayout.u();
        if (this.mDelegate.J() == 0) {
            this.mCurrentItem = iX;
        }
        c cVar3 = this.mDelegate;
        if (!cVar3.U && cVar3.z0 != null && calendar.getYear() != this.mDelegate.z0.getYear() && (onYearChangeListener = (cVar = this.mDelegate).t0) != null) {
            onYearChangeListener.onYearChange(cVar.z0.getYear());
        }
        this.mDelegate.z0 = calendar2;
        invalidate();
    }

    public final void setSelectedCalendar(Calendar calendar) {
        if (this.mDelegate.J() != 1 || calendar.equals(this.mDelegate.y0)) {
            this.mCurrentItem = this.mItems.indexOf(calendar);
        }
    }

    public final void setup(Calendar calendar) {
        c cVar = this.mDelegate;
        this.mItems = b.A(calendar, cVar, cVar.S());
        addSchemesFromMap();
        invalidate();
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

    public final void updateShowMode() {
        invalidate();
    }

    public final void updateSingleSelect() {
        if (this.mItems.contains(this.mDelegate.y0)) {
            return;
        }
        this.mCurrentItem = -1;
        invalidate();
    }

    public final void updateWeekStart() {
        Calendar calendarF = b.f(this.mDelegate.x(), this.mDelegate.z(), this.mDelegate.y(), ((Integer) getTag()).intValue() + 1, this.mDelegate.S());
        setSelectedCalendar(this.mDelegate.y0);
        setup(calendarF);
    }
}
