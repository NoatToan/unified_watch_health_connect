package com.huami.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public abstract class MultiMonthView extends BaseMonthView {
    public MultiMonthView(Context context) {
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
        return !onCalendarIntercept(calendar) && this.a.D0.containsKey(calendar.toString());
    }

    public final boolean isSelectNextCalendar(Calendar calendar) {
        Calendar calendarO = b.o(calendar);
        this.a.U0(calendarO);
        return isCalendarSelected(calendarO);
    }

    public final boolean isSelectPreCalendar(Calendar calendar) {
        Calendar calendarP = b.p(calendar);
        this.a.U0(calendarP);
        return isCalendarSelected(calendarP);
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
                    CalendarView.OnCalendarMultiSelectListener onCalendarMultiSelectListener = this.a.t0;
                    if (onCalendarMultiSelectListener != null) {
                        onCalendarMultiSelectListener.onCalendarMultiSelectOutOfRange(index);
                        return;
                    }
                    return;
                }
                String string = index.toString();
                if (this.a.D0.containsKey(string)) {
                    this.a.D0.remove(string);
                } else {
                    if (this.a.D0.size() >= this.a.r()) {
                        c cVar = this.a;
                        CalendarView.OnCalendarMultiSelectListener onCalendarMultiSelectListener2 = cVar.t0;
                        if (onCalendarMultiSelectListener2 != null) {
                            onCalendarMultiSelectListener2.onMultiSelectOutOfSize(index, cVar.r());
                            return;
                        }
                        return;
                    }
                    this.a.D0.put(string, index);
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
                c cVar2 = this.a;
                CalendarView.OnCalendarMultiSelectListener onCalendarMultiSelectListener3 = cVar2.t0;
                if (onCalendarMultiSelectListener3 != null) {
                    onCalendarMultiSelectListener3.onCalendarMultiSelect(index, cVar2.D0.size(), this.a.r());
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
