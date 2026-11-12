package com.huami.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public abstract class MultiWeekView extends BaseWeekView {
    public MultiWeekView(Context context) {
        super(context);
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
        if (this.f && (index = getIndex()) != null) {
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
            CalendarView.h hVar = this.a.v0;
            if (hVar != null) {
                hVar.b(index, true);
            }
            if (this.b != null) {
                this.b.w(b.v(index, this.a.U()));
            }
            c cVar2 = this.a;
            CalendarView.OnCalendarMultiSelectListener onCalendarMultiSelectListener3 = cVar2.t0;
            if (onCalendarMultiSelectListener3 != null) {
                onCalendarMultiSelectListener3.onCalendarMultiSelect(index, cVar2.D0.size(), this.a.r());
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
