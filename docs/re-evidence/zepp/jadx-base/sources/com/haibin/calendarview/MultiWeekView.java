package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MultiWeekView extends BaseWeekView {
    public MultiWeekView(Context context) {
        super(context);
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
        if (this.isClick && (index = getIndex()) != null) {
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
            CalendarView.h hVar = this.mDelegate.s0;
            if (hVar != null) {
                hVar.a(index, true);
            }
            if (this.mParentLayout != null) {
                this.mParentLayout.w(b.v(index, this.mDelegate.S()));
            }
            c cVar2 = this.mDelegate;
            CalendarView.OnCalendarMultiSelectListener onCalendarMultiSelectListener3 = cVar2.q0;
            if (onCalendarMultiSelectListener3 != null) {
                onCalendarMultiSelectListener3.onCalendarMultiSelect(index, cVar2.A0.size(), this.mDelegate.p());
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
