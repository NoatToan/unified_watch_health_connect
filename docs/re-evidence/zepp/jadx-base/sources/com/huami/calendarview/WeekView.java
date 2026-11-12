package com.huami.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public abstract class WeekView extends BaseWeekView {
    public WeekView(Context context) {
        super(context);
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
                CalendarView.OnCalendarSelectListener onCalendarSelectListener = this.a.r0;
                if (onCalendarSelectListener != null) {
                    onCalendarSelectListener.onCalendarOutOfRange(index);
                    return;
                }
                return;
            }
            this.g = this.c.indexOf(index);
            CalendarView.h hVar = this.a.v0;
            if (hVar != null) {
                hVar.b(index, true);
            }
            if (this.b != null) {
                this.b.w(b.v(index, this.a.U()));
            }
            CalendarView.OnCalendarSelectListener onCalendarSelectListener2 = this.a.r0;
            if (onCalendarSelectListener2 != null) {
                onCalendarSelectListener2.onCalendarSelect(index, true);
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
        int i = 0;
        while (i < this.c.size()) {
            int iG = (this.mItemWidth * i) + this.a.g();
            onLoopStart(iG);
            Calendar calendar = this.c.get(i);
            boolean z = i == this.g;
            boolean zHasScheme = calendar.hasScheme();
            if (zHasScheme) {
                if ((z ? onDrawSelected(canvas, calendar, iG, true) : false) || !z) {
                    this.mSchemePaint.setColor(calendar.getSchemeColor() != 0 ? calendar.getSchemeColor() : this.a.J());
                    onDrawScheme(canvas, calendar, iG);
                }
            } else if (z) {
                onDrawSelected(canvas, calendar, iG, false);
            }
            onDrawText(canvas, calendar, iG, zHasScheme, z);
            i++;
        }
    }

    public abstract void onDrawScheme(Canvas canvas, Calendar calendar, int i);

    public abstract boolean onDrawSelected(Canvas canvas, Calendar calendar, int i, boolean z);

    public abstract void onDrawText(Canvas canvas, Calendar calendar, int i, boolean z, boolean z2);

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        Calendar index;
        if (this.a.u0 == null || !this.f || (index = getIndex()) == null) {
            return false;
        }
        if (onCalendarIntercept(index)) {
            this.a.q0.onCalendarInterceptClick(index, true);
            return true;
        }
        if (!isInRange(index)) {
            CalendarView.OnCalendarLongClickListener onCalendarLongClickListener = this.a.u0;
            if (onCalendarLongClickListener != null) {
                onCalendarLongClickListener.onCalendarLongClickOutOfRange(index);
            }
            return true;
        }
        if (this.a.s0()) {
            CalendarView.OnCalendarLongClickListener onCalendarLongClickListener2 = this.a.u0;
            if (onCalendarLongClickListener2 != null) {
                onCalendarLongClickListener2.onCalendarLongClick(index);
            }
            return true;
        }
        this.g = this.c.indexOf(index);
        c cVar = this.a;
        cVar.C0 = cVar.B0;
        CalendarView.h hVar = cVar.v0;
        if (hVar != null) {
            hVar.b(index, true);
        }
        if (this.b != null) {
            this.b.w(b.v(index, this.a.U()));
        }
        CalendarView.OnCalendarSelectListener onCalendarSelectListener = this.a.r0;
        if (onCalendarSelectListener != null) {
            onCalendarSelectListener.onCalendarSelect(index, true);
        }
        CalendarView.OnCalendarLongClickListener onCalendarLongClickListener3 = this.a.u0;
        if (onCalendarLongClickListener3 != null) {
            onCalendarLongClickListener3.onCalendarLongClick(index);
        }
        invalidate();
        return true;
    }
}
