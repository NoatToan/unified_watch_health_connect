package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public abstract class WeekView extends BaseWeekView {
    public WeekView(Context context) {
        super(context);
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
                CalendarView.OnCalendarSelectListener onCalendarSelectListener = this.mDelegate.o0;
                if (onCalendarSelectListener != null) {
                    onCalendarSelectListener.onCalendarOutOfRange(index);
                    return;
                }
                return;
            }
            this.mCurrentItem = this.mItems.indexOf(index);
            CalendarView.h hVar = this.mDelegate.s0;
            if (hVar != null) {
                hVar.a(index, true);
            }
            if (this.mParentLayout != null) {
                this.mParentLayout.w(b.v(index, this.mDelegate.S()));
            }
            CalendarView.OnCalendarSelectListener onCalendarSelectListener2 = this.mDelegate.o0;
            if (onCalendarSelectListener2 != null) {
                onCalendarSelectListener2.onCalendarSelect(index, true);
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
        int i = 0;
        while (i < this.mItems.size()) {
            int iG = (this.mItemWidth * i) + this.mDelegate.g();
            onLoopStart(iG);
            Calendar calendar = this.mItems.get(i);
            boolean z = i == this.mCurrentItem;
            boolean zHasScheme = calendar.hasScheme();
            if (zHasScheme) {
                if ((z ? onDrawSelected(canvas, calendar, iG, true) : false) || !z) {
                    this.mSchemePaint.setColor(calendar.getSchemeColor() != 0 ? calendar.getSchemeColor() : this.mDelegate.H());
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
        if (this.mDelegate.r0 == null || !this.isClick || (index = getIndex()) == null) {
            return false;
        }
        if (onCalendarIntercept(index)) {
            this.mDelegate.n0.onCalendarInterceptClick(index, true);
            return true;
        }
        if (!isInRange(index)) {
            CalendarView.OnCalendarLongClickListener onCalendarLongClickListener = this.mDelegate.r0;
            if (onCalendarLongClickListener != null) {
                onCalendarLongClickListener.onCalendarLongClickOutOfRange(index);
            }
            return true;
        }
        if (this.mDelegate.q0()) {
            CalendarView.OnCalendarLongClickListener onCalendarLongClickListener2 = this.mDelegate.r0;
            if (onCalendarLongClickListener2 != null) {
                onCalendarLongClickListener2.onCalendarLongClick(index);
            }
            return true;
        }
        this.mCurrentItem = this.mItems.indexOf(index);
        c cVar = this.mDelegate;
        cVar.z0 = cVar.y0;
        CalendarView.h hVar = cVar.s0;
        if (hVar != null) {
            hVar.a(index, true);
        }
        if (this.mParentLayout != null) {
            this.mParentLayout.w(b.v(index, this.mDelegate.S()));
        }
        CalendarView.OnCalendarSelectListener onCalendarSelectListener = this.mDelegate.o0;
        if (onCalendarSelectListener != null) {
            onCalendarSelectListener.onCalendarSelect(index, true);
        }
        CalendarView.OnCalendarLongClickListener onCalendarLongClickListener3 = this.mDelegate.r0;
        if (onCalendarLongClickListener3 != null) {
            onCalendarLongClickListener3.onCalendarLongClick(index);
        }
        invalidate();
        return true;
    }
}
