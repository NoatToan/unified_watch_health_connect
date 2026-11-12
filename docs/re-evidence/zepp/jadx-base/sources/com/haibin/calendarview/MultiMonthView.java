package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MultiMonthView extends BaseMonthView {
    public MultiMonthView(Context context) {
        super(context);
    }

    private void a(Canvas canvas, Calendar calendar, int i, int i2) {
        int iG = (i2 * this.mItemWidth) + this.mDelegate.g();
        int i3 = i * this.mItemHeight;
        onLoopStart(iG, i3);
        boolean zIsCalendarSelected = isCalendarSelected(calendar);
        boolean zHasScheme = calendar.hasScheme();
        boolean zIsSelectPreCalendar = isSelectPreCalendar(calendar);
        boolean zIsSelectNextCalendar = isSelectNextCalendar(calendar);
        if (zHasScheme) {
            if ((zIsCalendarSelected ? onDrawSelected(canvas, calendar, iG, i3, true, zIsSelectPreCalendar, zIsSelectNextCalendar) : false) || !zIsCalendarSelected) {
                this.mSchemePaint.setColor(calendar.getSchemeColor() != 0 ? calendar.getSchemeColor() : this.mDelegate.H());
                onDrawScheme(canvas, calendar, iG, i3, true);
            }
        } else if (zIsCalendarSelected) {
            onDrawSelected(canvas, calendar, iG, i3, false, zIsSelectPreCalendar, zIsSelectNextCalendar);
        }
        onDrawText(canvas, calendar, iG, i3, zHasScheme, zIsCalendarSelected);
    }

    public boolean isCalendarSelected(Calendar calendar) {
        return !onCalendarIntercept(calendar) && this.mDelegate.A0.containsKey(calendar.toString());
    }

    public final boolean isSelectNextCalendar(Calendar calendar) {
        Calendar calendarO = b.o(calendar);
        this.mDelegate.O0(calendarO);
        return isCalendarSelected(calendarO);
    }

    public final boolean isSelectPreCalendar(Calendar calendar) {
        Calendar calendarP = b.p(calendar);
        this.mDelegate.O0(calendarP);
        return isCalendarSelected(calendarP);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Calendar index;
        MonthViewPager monthViewPager;
        if (this.isClick && (index = getIndex()) != null) {
            if (this.mDelegate.B() != 1 || index.isCurrentMonth()) {
                if (onCalendarIntercept(index)) {
                    this.mDelegate.n0.onCalendarInterceptClick(index, true);
                    return;
                }
                if (!isInRange(index)) {
                    CalendarView.OnCalendarMultiSelectListener onCalendarMultiSelectListener = this.mDelegate.q0;
                    if (onCalendarMultiSelectListener != null) {
                        onCalendarMultiSelectListener.onCalendarMultiSelectOutOfRange(index);
                        return;
                    }
                    return;
                }
                String string = index.toString();
                if (this.mDelegate.A0.containsKey(string)) {
                    this.mDelegate.A0.remove(string);
                } else {
                    if (this.mDelegate.A0.size() >= this.mDelegate.p()) {
                        c cVar = this.mDelegate;
                        CalendarView.OnCalendarMultiSelectListener onCalendarMultiSelectListener2 = cVar.q0;
                        if (onCalendarMultiSelectListener2 != null) {
                            onCalendarMultiSelectListener2.onMultiSelectOutOfSize(index, cVar.p());
                            return;
                        }
                        return;
                    }
                    this.mDelegate.A0.put(string, index);
                }
                this.mCurrentItem = this.mItems.indexOf(index);
                if (!index.isCurrentMonth() && (monthViewPager = this.mMonthViewPager) != null) {
                    int currentItem = monthViewPager.getCurrentItem();
                    this.mMonthViewPager.setCurrentItem(this.mCurrentItem < 7 ? currentItem - 1 : currentItem + 1);
                }
                CalendarView.h hVar = this.mDelegate.s0;
                if (hVar != null) {
                    hVar.b(index, true);
                }
                if (this.mParentLayout != null) {
                    if (index.isCurrentMonth()) {
                        this.mParentLayout.v(this.mItems.indexOf(index));
                    } else {
                        this.mParentLayout.w(b.v(index, this.mDelegate.S()));
                    }
                }
                c cVar2 = this.mDelegate;
                CalendarView.OnCalendarMultiSelectListener onCalendarMultiSelectListener3 = cVar2.q0;
                if (onCalendarMultiSelectListener3 != null) {
                    onCalendarMultiSelectListener3.onCalendarMultiSelect(index, cVar2.A0.size(), this.mDelegate.p());
                }
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mLineCount == 0) {
            return;
        }
        this.mItemWidth = (getWidth() - (this.mDelegate.g() * 2)) / 7;
        onPreviewHook();
        int i = this.mLineCount * 7;
        int i2 = 0;
        for (int i3 = 0; i3 < this.mLineCount; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                Calendar calendar = this.mItems.get(i2);
                if (this.mDelegate.B() == 1) {
                    if (i2 > this.mItems.size() - this.mNextDiff) {
                        return;
                    }
                    if (!calendar.isCurrentMonth()) {
                    }
                    i2++;
                } else if (this.mDelegate.B() == 2 && i2 >= i) {
                    return;
                }
                a(canvas, calendar, i3, i4);
                i2++;
            }
        }
    }

    public abstract void onDrawScheme(Canvas canvas, Calendar calendar, int i, int i2, boolean z);

    public abstract boolean onDrawSelected(Canvas canvas, Calendar calendar, int i, int i2, boolean z, boolean z2, boolean z3);

    public abstract void onDrawText(Canvas canvas, Calendar calendar, int i, int i2, boolean z, boolean z2);

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        return false;
    }
}
