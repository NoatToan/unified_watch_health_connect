package com.huami.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public abstract class RangeMonthView extends BaseMonthView {
    public RangeMonthView(Context context) {
        super(context);
    }

    private void l(Canvas canvas, Calendar calendar, int i, int i2) {
        int iG = (i2 * this.mItemWidth) + this.a.g();
        int i3 = i * this.mItemHeight;
        onLoopStart(iG, i3);
        boolean zIsCalendarSelected = isCalendarSelected(calendar);
        boolean zHasScheme = calendar.hasScheme();
        boolean zIsSelectPreCalendar = isSelectPreCalendar(calendar);
        boolean zIsSelectNextCalendar = isSelectNextCalendar(calendar);
        if (zHasScheme) {
            if ((zIsCalendarSelected ? onDrawSelected(canvas, calendar, iG, i3, true, zIsSelectPreCalendar, zIsSelectNextCalendar) : false) || !zIsCalendarSelected) {
                this.mSchemePaint.setColor(calendar.getSchemeColor() != 0 ? calendar.getSchemeColor() : this.a.J());
                onDrawScheme(canvas, calendar, iG, i3, true);
            }
        } else if (zIsCalendarSelected) {
            onDrawSelected(canvas, calendar, iG, i3, false, zIsSelectPreCalendar, zIsSelectNextCalendar);
        }
        onDrawText(canvas, calendar, iG, i3, zHasScheme, zIsCalendarSelected);
    }

    public boolean isCalendarSelected(Calendar calendar) {
        if (this.a.F0 == null || onCalendarIntercept(calendar)) {
            return false;
        }
        c cVar = this.a;
        if (cVar.G0 == null) {
            return calendar.compareTo(cVar.F0) == 0;
        }
        return calendar.compareTo(cVar.F0) >= 0 && calendar.compareTo(this.a.G0) <= 0;
    }

    public final boolean isSelectNextCalendar(Calendar calendar) {
        Calendar calendarO = b.o(calendar);
        this.a.U0(calendarO);
        return this.a.F0 != null && isCalendarSelected(calendarO);
    }

    public final boolean isSelectPreCalendar(Calendar calendar) {
        Calendar calendarP = b.p(calendar);
        this.a.U0(calendarP);
        return this.a.F0 != null && isCalendarSelected(calendarP);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Calendar index;
        MonthViewPager monthViewPager;
        if (this.f && (index = getIndex()) != null) {
            if (this.a.D() != 1 || index.isCurrentMonth()) {
                if (onCalendarIntercept(index)) {
                    this.a.q0.onCalendarInterceptClick(index, true);
                    return;
                }
                if (!isInRange(index)) {
                    CalendarView.OnCalendarRangeSelectListener onCalendarRangeSelectListener = this.a.s0;
                    if (onCalendarRangeSelectListener != null) {
                        onCalendarRangeSelectListener.onCalendarSelectOutOfRange(index);
                        return;
                    }
                    return;
                }
                c cVar = this.a;
                Calendar calendar = cVar.F0;
                if (calendar != null && cVar.G0 == null) {
                    int iB = b.b(index, calendar);
                    if (iB >= 0 && this.a.y() != -1 && this.a.y() > iB + 1) {
                        CalendarView.OnCalendarRangeSelectListener onCalendarRangeSelectListener2 = this.a.s0;
                        if (onCalendarRangeSelectListener2 != null) {
                            onCalendarRangeSelectListener2.onSelectOutOfRange(index, true);
                            return;
                        }
                        return;
                    }
                    if (this.a.t() != -1 && this.a.t() < b.b(index, this.a.F0) + 1) {
                        CalendarView.OnCalendarRangeSelectListener onCalendarRangeSelectListener3 = this.a.s0;
                        if (onCalendarRangeSelectListener3 != null) {
                            onCalendarRangeSelectListener3.onSelectOutOfRange(index, false);
                            return;
                        }
                        return;
                    }
                }
                c cVar2 = this.a;
                Calendar calendar2 = cVar2.F0;
                if (calendar2 == null || cVar2.G0 != null) {
                    cVar2.F0 = index;
                    cVar2.G0 = null;
                } else {
                    int iCompareTo = index.compareTo(calendar2);
                    if (this.a.y() == -1 && iCompareTo <= 0) {
                        c cVar3 = this.a;
                        cVar3.F0 = index;
                        cVar3.G0 = null;
                    } else if (iCompareTo < 0) {
                        c cVar4 = this.a;
                        cVar4.F0 = index;
                        cVar4.G0 = null;
                    } else if (iCompareTo != 0 || this.a.y() == 1) {
                        this.a.G0 = index;
                    } else {
                        this.a.G0 = index;
                    }
                }
                this.g = this.c.indexOf(index);
                if (!index.isCurrentMonth() && (monthViewPager = this.i) != null) {
                    int currentItem = monthViewPager.getCurrentItem();
                    this.i.setCurrentItem(this.g < 7 ? currentItem - 1 : currentItem + 1);
                }
                CalendarView.h hVar = this.a.v0;
                if (hVar != null) {
                    hVar.a(index, true);
                }
                if (this.b != null) {
                    if (index.isCurrentMonth()) {
                        this.b.v(this.c.indexOf(index));
                    } else {
                        this.b.w(b.v(index, this.a.U()));
                    }
                }
                c cVar5 = this.a;
                CalendarView.OnCalendarRangeSelectListener onCalendarRangeSelectListener4 = cVar5.s0;
                if (onCalendarRangeSelectListener4 != null) {
                    onCalendarRangeSelectListener4.onCalendarRangeSelect(index, cVar5.G0 != null);
                }
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mLineCount == 0) {
            return;
        }
        this.mItemWidth = (getWidth() - (this.a.g() * 2)) / 7;
        onPreviewHook();
        int i = this.mLineCount * 7;
        int i2 = 0;
        for (int i3 = 0; i3 < this.mLineCount; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                Calendar calendar = this.c.get(i2);
                if (this.a.D() == 1) {
                    if (i2 > this.c.size() - this.mNextDiff) {
                        return;
                    }
                    if (!calendar.isCurrentMonth()) {
                    }
                    i2++;
                } else if (this.a.D() == 2 && i2 >= i) {
                    return;
                }
                l(canvas, calendar, i3, i4);
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
