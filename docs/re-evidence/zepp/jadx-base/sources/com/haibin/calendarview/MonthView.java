package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MonthView extends BaseMonthView {
    public MonthView(Context context) {
        super(context);
    }

    private void draw(Canvas canvas, Calendar calendar, int i, int i2, int i3) {
        int iG = (i2 * this.mItemWidth) + this.mDelegate.g();
        int i4 = i * this.mItemHeight;
        onLoopStart(iG, i4);
        boolean z = i3 == this.mCurrentItem;
        boolean zHasScheme = calendar.hasScheme();
        if (zHasScheme) {
            if ((z ? onDrawSelected(canvas, calendar, iG, i4, true) : false) || !z) {
                this.mSchemePaint.setColor(calendar.getSchemeColor() != 0 ? calendar.getSchemeColor() : this.mDelegate.H());
                onDrawScheme(canvas, calendar, iG, i4);
            }
        } else if (z) {
            onDrawSelected(canvas, calendar, iG, i4, false);
        }
        onDrawText(canvas, calendar, iG, i4, zHasScheme, z);
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
                    CalendarView.OnCalendarSelectListener onCalendarSelectListener = this.mDelegate.o0;
                    if (onCalendarSelectListener != null) {
                        onCalendarSelectListener.onCalendarOutOfRange(index);
                        return;
                    }
                    return;
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
                CalendarView.OnCalendarSelectListener onCalendarSelectListener2 = this.mDelegate.o0;
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
        this.mItemWidth = (getWidth() - (this.mDelegate.g() * 2)) / 7;
        onPreviewHook();
        int i = this.mLineCount * 7;
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.mLineCount) {
            int i4 = i2;
            for (int i5 = 0; i5 < 7; i5++) {
                Calendar calendar = this.mItems.get(i4);
                if (this.mDelegate.B() == 1) {
                    if (i4 > this.mItems.size() - this.mNextDiff) {
                        return;
                    }
                    if (!calendar.isCurrentMonth()) {
                    }
                    i4++;
                } else if (this.mDelegate.B() == 2 && i4 >= i) {
                    return;
                }
                draw(canvas, calendar, i3, i5, i4);
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
        if (this.mDelegate.r0 == null || !this.isClick || (index = getIndex()) == null) {
            return false;
        }
        if (this.mDelegate.B() == 1 && !index.isCurrentMonth()) {
            return false;
        }
        if (onCalendarIntercept(index)) {
            this.mDelegate.n0.onCalendarInterceptClick(index, true);
            return false;
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
