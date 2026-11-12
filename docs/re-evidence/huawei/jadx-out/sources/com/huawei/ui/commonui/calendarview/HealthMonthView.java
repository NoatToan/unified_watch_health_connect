package com.huawei.ui.commonui.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import defpackage.njy;
import defpackage.qjj;

/* JADX INFO: loaded from: classes43.dex */
public abstract class HealthMonthView extends HealthCalendarBaseMonthView {
    protected abstract void onDrawMark(Canvas canvas, HealthCalendar healthCalendar, int i, int i2);

    protected abstract boolean onDrawSelected(Canvas canvas, HealthCalendar healthCalendar, int i, int i2, boolean z);

    protected abstract void onDrawText(Canvas canvas, HealthCalendar healthCalendar, int i, int i2, boolean z);

    public HealthMonthView(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.mLineCount == 0) {
            return;
        }
        updateItemsPresentDay();
        if (!this.mManager.an()) {
            drawWhenNotDisplayFullMonth(canvas);
            return;
        }
        int i = this.mLineCount;
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.mLineCount) {
            int i4 = i2;
            for (int i5 = 0; i5 < 7; i5++) {
                if (njy.e(this.mItems, i4)) {
                    return;
                }
                HealthCalendar healthCalendar = this.mItems.get(i4);
                if (this.mManager.q() == 1) {
                    if (i4 > this.mItems.size() - this.mNextOffset) {
                        return;
                    }
                    if (!healthCalendar.isPresentMonth()) {
                        continue;
                    }
                    i4++;
                } else if (this.mManager.q() == 2 && i4 >= 7 * i) {
                    return;
                }
                if (healthCalendar.isPresentDay() && !this.mManager.ao()) {
                    draw(canvas, healthCalendar, i3, i5, i4);
                    return;
                } else {
                    draw(canvas, healthCalendar, i3, i5, i4);
                    i4++;
                }
            }
            i3++;
            i2 = i4;
        }
    }

    private void drawWhenNotDisplayFullMonth(Canvas canvas) {
        int i = this.mLineCount;
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.mLineCount) {
            int i4 = i2;
            for (int i5 = 0; i5 < 7; i5++) {
                if (njy.e(this.mItems, i4)) {
                    return;
                }
                HealthCalendar healthCalendar = this.mItems.get(i4);
                if (i4 >= 7 * i) {
                    return;
                }
                draw(canvas, healthCalendar, i3, i5, i4);
                i4++;
            }
            i3++;
            i2 = i4;
        }
    }

    private void draw(Canvas canvas, HealthCalendar healthCalendar, int i, int i2, int i3) {
        int i4;
        int i5;
        boolean z = false;
        if (getLayoutDirection() == 1) {
            i4 = 6;
            i5 = -1;
        } else {
            i4 = 0;
            i5 = 1;
        }
        int iD = this.mManager.d() + ((i4 + (i5 * i2)) * (this.mHorizontalSpacing + this.mItemWidth));
        if (i3 == this.mCurrentItem && this.mManager.ai()) {
            z = true;
        }
        boolean zHasMark = healthCalendar.hasMark();
        int iO = (i * this.mItemHeight) + (this.mMarkedRowCount[i] * this.mManager.o());
        if (zHasMark) {
            onDrawMark(canvas, healthCalendar, iD, iO);
        }
        if (z) {
            onDrawSelected(canvas, healthCalendar, iD, iO, zHasMark);
        }
        onDrawText(canvas, healthCalendar, iD, iO, z);
    }

    @Override // com.huawei.ui.commonui.calendarview.HealthCalendarBaseMonthView, com.huawei.ui.commonui.calendarview.HealthCalendarBaseView
    void update() {
        super.update();
        updateExSpace();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        HealthCalendar index;
        if (this.mIsClick && (index = getIndex()) != null) {
            if (this.mManager.q() != 1 || index.isPresentMonth()) {
                if (!(this.mManager.ao() && this.mManager.aj()) && qjj.i(index, this.mManager)) {
                    return;
                }
                if (!isInRange(index) || (isInRangeOfGray(index) && !this.mManager.ak())) {
                    if (this.mManager.f46319b != null) {
                        this.mManager.f46319b.onCalendarOutOfRange(index);
                        return;
                    }
                    return;
                }
                this.mCurrentItem = this.mItems.indexOf(index);
                if (this.mManager.an() && !index.isPresentMonth() && this.mHealthMonthViewPager != null) {
                    int currentItem = this.mHealthMonthViewPager.getCurrentItem();
                    this.mHealthMonthViewPager.setCurrentItem(this.mCurrentItem < 7 ? currentItem - 1 : currentItem + 1);
                }
                if (this.mManager.d != null) {
                    this.mManager.d.onMonthDateSelected(index, true);
                }
                if (this.mParentLayout != null) {
                    if (index.isPresentMonth()) {
                        this.mParentLayout.e(this.mItems.indexOf(index));
                    } else {
                        this.mParentLayout.b(qjj.e(index, this.mManager.aa()));
                    }
                }
                if (this.mManager.f46319b != null) {
                    this.mManager.f46319b.onCalendarSelect(index, true);
                }
            }
        }
    }
}
