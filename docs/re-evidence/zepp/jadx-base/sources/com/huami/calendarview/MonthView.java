package com.huami.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public abstract class MonthView extends BaseMonthView {
    public MonthView(Context context) {
        super(context);
    }

    private void l(Canvas canvas, Calendar calendar, int i, int i2, int i3) {
        int i4;
        int iG;
        int i5 = i * this.mItemHeight;
        if (this.a.t0()) {
            i4 = (6 - i2) * this.mItemWidth;
            iG = this.a.g();
        } else {
            i4 = i2 * this.mItemWidth;
            iG = this.a.g();
        }
        int i6 = i4 + iG;
        onLoopStart(i6, i5);
        boolean z = i3 == this.g;
        boolean zHasScheme = calendar.hasScheme();
        if (zHasScheme) {
            if ((z ? onDrawSelected(canvas, calendar, i6, i5, true) : false) || !z) {
                this.mSchemePaint.setColor(calendar.getSchemeColor() != 0 ? calendar.getSchemeColor() : this.a.J());
                onDrawScheme(canvas, calendar, i6, i5);
            }
        } else if (z) {
            onDrawSelected(canvas, calendar, i6, i5, false);
        }
        onDrawText(canvas, calendar, i6, i5, zHasScheme, z);
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
                    CalendarView.OnCalendarSelectListener onCalendarSelectListener = this.a.r0;
                    if (onCalendarSelectListener != null) {
                        onCalendarSelectListener.onCalendarOutOfRange(index);
                        return;
                    }
                    return;
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
                CalendarView.OnCalendarSelectListener onCalendarSelectListener2 = this.a.r0;
                if (onCalendarSelectListener2 != null) {
                    onCalendarSelectListener2.onCalendarSelect(index, true);
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
        int i3 = 0;
        while (i3 < this.mLineCount) {
            int i4 = i2;
            for (int i5 = 0; i5 < 7; i5++) {
                Calendar calendar = this.c.get(i4);
                if (this.a.D() == 1) {
                    if (i4 > this.c.size() - this.mNextDiff) {
                        return;
                    }
                    if (!calendar.isCurrentMonth()) {
                    }
                    i4++;
                } else if (this.a.D() == 2 && i4 >= i) {
                    return;
                }
                l(canvas, calendar, i3, i5, i4);
                i4++;
            }
            i3++;
            i2 = i4;
        }
    }

    public abstract void onDrawScheme(Canvas canvas, Calendar calendar, int i, int i2);

    public abstract boolean onDrawSelected(Canvas canvas, Calendar calendar, int i, int i2, boolean z);

    public abstract void onDrawText(Canvas canvas, Calendar calendar, int i, int i2, boolean z, boolean z2);

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        Calendar index;
        MonthViewPager monthViewPager;
        if (this.a.u0 == null || !this.f || (index = getIndex()) == null) {
            return false;
        }
        if (this.a.D() == 1 && !index.isCurrentMonth()) {
            return false;
        }
        if (onCalendarIntercept(index)) {
            this.a.q0.onCalendarInterceptClick(index, true);
            return false;
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
