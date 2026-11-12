package com.huami.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public abstract class RangeWeekView extends BaseWeekView {
    public RangeWeekView(Context context) {
        super(context);
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
        if (this.f && (index = getIndex()) != null) {
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
            CalendarView.h hVar = this.a.v0;
            if (hVar != null) {
                hVar.b(index, true);
            }
            if (this.b != null) {
                this.b.w(b.v(index, this.a.U()));
            }
            c cVar5 = this.a;
            CalendarView.OnCalendarRangeSelectListener onCalendarRangeSelectListener4 = cVar5.s0;
            if (onCalendarRangeSelectListener4 != null) {
                onCalendarRangeSelectListener4.onCalendarRangeSelect(index, cVar5.G0 != null);
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.c.size() == 0) {
            return;
        }
        this.mItemWidth = (getWidth() - (this.a.g() * 2)) / 7;
        onPreviewHook();
        for (int i = 0; i < 7; i++) {
            int iG = (this.mItemWidth * i) + this.a.g();
            onLoopStart(iG);
            Calendar calendar = this.c.get(i);
            boolean zIsCalendarSelected = isCalendarSelected(calendar);
            boolean zIsSelectPreCalendar = isSelectPreCalendar(calendar);
            boolean zIsSelectNextCalendar = isSelectNextCalendar(calendar);
            boolean zHasScheme = calendar.hasScheme();
            if (zHasScheme) {
                if ((zIsCalendarSelected ? onDrawSelected(canvas, calendar, iG, true, zIsSelectPreCalendar, zIsSelectNextCalendar) : false) || !zIsCalendarSelected) {
                    this.mSchemePaint.setColor(calendar.getSchemeColor() != 0 ? calendar.getSchemeColor() : this.a.J());
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
