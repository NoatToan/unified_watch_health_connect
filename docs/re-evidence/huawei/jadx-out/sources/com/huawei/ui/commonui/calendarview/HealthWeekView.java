package com.huawei.ui.commonui.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import defpackage.qjj;

/* JADX INFO: loaded from: classes43.dex */
public abstract class HealthWeekView extends HealthBaseWeekView {
    protected abstract void onDrawMark(Canvas canvas, HealthCalendar healthCalendar, int i);

    protected abstract boolean onDrawSelected(Canvas canvas, HealthCalendar healthCalendar, int i, boolean z);

    protected abstract void onDrawText(Canvas canvas, HealthCalendar healthCalendar, int i, int i2, boolean z);

    public HealthWeekView(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.mItems.size() == 0) {
            return;
        }
        updateItemsPresentDay();
        int i = 0;
        while (i < this.mItems.size()) {
            HealthCalendar healthCalendar = this.mItems.get(i);
            int i2 = getLayoutDirection() == 1 ? 6 - i : i;
            boolean z = i == this.mCurrentItem && this.mManager.ai();
            int iD = (i2 * (this.mItemWidth + this.mHorizontalSpacing)) + this.mManager.d();
            boolean zHasMark = healthCalendar.hasMark();
            if (zHasMark) {
                onDrawMark(canvas, healthCalendar, iD);
            }
            if (z) {
                onDrawSelected(canvas, healthCalendar, iD, zHasMark);
            }
            onDrawText(canvas, healthCalendar, i, iD, z);
            i++;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        HealthCalendar index;
        if (this.mIsClick && (index = getIndex()) != null) {
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
            if (this.mManager.d != null) {
                this.mManager.d.onWeekDateSelected(index, true);
            }
            if (this.mParentLayout != null) {
                this.mParentLayout.b(qjj.e(index, this.mManager.aa()));
            }
            if (this.mManager.f46319b != null) {
                this.mManager.f46319b.onCalendarSelect(index, true);
            }
            invalidate();
        }
    }
}
