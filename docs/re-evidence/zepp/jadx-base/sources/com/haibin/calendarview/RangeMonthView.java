package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RangeMonthView extends BaseMonthView {
    public RangeMonthView(Context context) {
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
        if (this.mDelegate.C0 == null || onCalendarIntercept(calendar)) {
            return false;
        }
        c cVar = this.mDelegate;
        if (cVar.D0 == null) {
            return calendar.compareTo(cVar.C0) == 0;
        }
        return calendar.compareTo(cVar.C0) >= 0 && calendar.compareTo(this.mDelegate.D0) <= 0;
    }

    public final boolean isSelectNextCalendar(Calendar calendar) {
        Calendar calendarO = b.o(calendar);
        this.mDelegate.O0(calendarO);
        return this.mDelegate.C0 != null && isCalendarSelected(calendarO);
    }

    public final boolean isSelectPreCalendar(Calendar calendar) {
        Calendar calendarP = b.p(calendar);
        this.mDelegate.O0(calendarP);
        return this.mDelegate.C0 != null && isCalendarSelected(calendarP);
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
                    CalendarView.OnCalendarRangeSelectListener onCalendarRangeSelectListener = this.mDelegate.p0;
                    if (onCalendarRangeSelectListener != null) {
                        onCalendarRangeSelectListener.onCalendarSelectOutOfRange(index);
                        return;
                    }
                    return;
                }
                c cVar = this.mDelegate;
                Calendar calendar = cVar.C0;
                if (calendar != null && cVar.D0 == null) {
                    int iB = b.b(index, calendar);
                    if (iB >= 0 && this.mDelegate.w() != -1 && this.mDelegate.w() > iB + 1) {
                        CalendarView.OnCalendarRangeSelectListener onCalendarRangeSelectListener2 = this.mDelegate.p0;
                        if (onCalendarRangeSelectListener2 != null) {
                            onCalendarRangeSelectListener2.onSelectOutOfRange(index, true);
                            return;
                        }
                        return;
                    }
                    if (this.mDelegate.r() != -1 && this.mDelegate.r() < b.b(index, this.mDelegate.C0) + 1) {
                        CalendarView.OnCalendarRangeSelectListener onCalendarRangeSelectListener3 = this.mDelegate.p0;
                        if (onCalendarRangeSelectListener3 != null) {
                            onCalendarRangeSelectListener3.onSelectOutOfRange(index, false);
                            return;
                        }
                        return;
                    }
                }
                c cVar2 = this.mDelegate;
                Calendar calendar2 = cVar2.C0;
                if (calendar2 == null || cVar2.D0 != null) {
                    cVar2.C0 = index;
                    cVar2.D0 = null;
                } else {
                    int iCompareTo = index.compareTo(calendar2);
                    if (this.mDelegate.w() == -1 && iCompareTo <= 0) {
                        c cVar3 = this.mDelegate;
                        cVar3.C0 = index;
                        cVar3.D0 = null;
                    } else if (iCompareTo < 0) {
                        c cVar4 = this.mDelegate;
                        cVar4.C0 = index;
                        cVar4.D0 = null;
                    } else if (iCompareTo != 0 || this.mDelegate.w() == 1) {
                        this.mDelegate.D0 = index;
                    } else {
                        this.mDelegate.D0 = index;
                    }
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
                c cVar5 = this.mDelegate;
                CalendarView.OnCalendarRangeSelectListener onCalendarRangeSelectListener4 = cVar5.p0;
                if (onCalendarRangeSelectListener4 != null) {
                    onCalendarRangeSelectListener4.onCalendarRangeSelect(index, cVar5.D0 != null);
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
