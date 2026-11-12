package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RangeWeekView extends BaseWeekView {
    public RangeWeekView(Context context) {
        super(context);
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
        if (this.isClick && (index = getIndex()) != null) {
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
            CalendarView.h hVar = this.mDelegate.s0;
            if (hVar != null) {
                hVar.a(index, true);
            }
            if (this.mParentLayout != null) {
                this.mParentLayout.w(b.v(index, this.mDelegate.S()));
            }
            c cVar5 = this.mDelegate;
            CalendarView.OnCalendarRangeSelectListener onCalendarRangeSelectListener4 = cVar5.p0;
            if (onCalendarRangeSelectListener4 != null) {
                onCalendarRangeSelectListener4.onCalendarRangeSelect(index, cVar5.D0 != null);
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mItems.size() == 0) {
            return;
        }
        this.mItemWidth = (getWidth() - (this.mDelegate.g() * 2)) / 7;
        onPreviewHook();
        for (int i = 0; i < 7; i++) {
            int iG = (this.mItemWidth * i) + this.mDelegate.g();
            onLoopStart(iG);
            Calendar calendar = this.mItems.get(i);
            boolean zIsCalendarSelected = isCalendarSelected(calendar);
            boolean zIsSelectPreCalendar = isSelectPreCalendar(calendar);
            boolean zIsSelectNextCalendar = isSelectNextCalendar(calendar);
            boolean zHasScheme = calendar.hasScheme();
            if (zHasScheme) {
                if ((zIsCalendarSelected ? onDrawSelected(canvas, calendar, iG, true, zIsSelectPreCalendar, zIsSelectNextCalendar) : false) || !zIsCalendarSelected) {
                    this.mSchemePaint.setColor(calendar.getSchemeColor() != 0 ? calendar.getSchemeColor() : this.mDelegate.H());
                    onDrawScheme(canvas, calendar, iG, zIsCalendarSelected);
                }
            } else if (zIsCalendarSelected) {
                onDrawSelected(canvas, calendar, iG, false, zIsSelectPreCalendar, zIsSelectNextCalendar);
            }
            onDrawText(canvas, calendar, iG, zHasScheme, zIsCalendarSelected);
        }
    }

    public abstract void onDrawScheme(Canvas canvas, Calendar calendar, int i, boolean z);

    public abstract boolean onDrawSelected(Canvas canvas, Calendar calendar, int i, boolean z, boolean z2, boolean z3);

    public abstract void onDrawText(Canvas canvas, Calendar calendar, int i, boolean z, boolean z2);

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        return false;
    }
}
