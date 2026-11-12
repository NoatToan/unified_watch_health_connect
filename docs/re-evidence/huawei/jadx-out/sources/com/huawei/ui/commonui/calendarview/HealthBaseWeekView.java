package com.huawei.ui.commonui.calendarview;

import android.content.Context;
import android.view.View;
import defpackage.qjj;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
public abstract class HealthBaseWeekView extends HealthCalendarBaseView {
    protected boolean mMarkerViewClickable;

    @Override // com.huawei.ui.commonui.calendarview.HealthCalendarBaseView
    protected void onDestroy() {
    }

    public HealthBaseWeekView(Context context) {
        super(context);
        this.mMarkerViewClickable = false;
    }

    final void init(HealthCalendar healthCalendar) {
        this.mItems = qjj.e(healthCalendar, this.mManager, this.mManager.aa());
        this.mManager.e(this.mItems);
        invalidate();
    }

    final void setSelectedCalendar(HealthCalendar healthCalendar) {
        if (healthCalendar.equals(this.mManager.o)) {
            this.mCurrentItem = this.mItems.indexOf(healthCalendar);
        }
    }

    final void performClickCalendar(HealthCalendar healthCalendar, boolean z) {
        if (this.mManager.d == null || this.mItems == null || this.mItems.size() == 0) {
            return;
        }
        int dayOfWeekOffset = healthCalendar.getDayOfWeekOffset(this.mManager.aa());
        if (this.mItems.contains(this.mManager.s())) {
            dayOfWeekOffset = this.mManager.s().getDayOfWeekOffset(this.mManager.aa());
        }
        HealthCalendar healthCalendar2 = this.mItems.get(dayOfWeekOffset);
        if (!isInRange(healthCalendar2)) {
            dayOfWeekOffset = getEdgeIndex(isMinRangeEdge(healthCalendar2));
            healthCalendar2 = this.mItems.get(dayOfWeekOffset);
        }
        healthCalendar2.setPresentDay(healthCalendar2.equals(this.mManager.s()));
        this.mManager.d.onWeekDateSelected(healthCalendar2, false);
        int iE = qjj.e(healthCalendar2, this.mManager.aa());
        if (this.mParentLayout != null) {
            this.mParentLayout.b(iE);
        }
        if (this.mManager.f46319b != null && z) {
            this.mManager.f46319b.onCalendarSelect(healthCalendar2, false);
        }
        if (this.mParentLayout != null) {
            this.mParentLayout.g();
        }
        this.mCurrentItem = dayOfWeekOffset;
        this.mManager.f46318a = healthCalendar2;
        invalidate();
    }

    final boolean isMinRangeEdge(HealthCalendar healthCalendar) {
        return healthCalendar.transformCalendar().getTimeInMillis() < this.mManager.r().transformCalendar().getTimeInMillis();
    }

    final int getEdgeIndex(boolean z) {
        for (int i = 0; i < this.mItems.size(); i++) {
            boolean zIsInRange = isInRange(this.mItems.get(i));
            if (z && zIsInRange) {
                return i;
            }
            if (!z && !zIsInRange) {
                return i - 1;
            }
        }
        return z ? 6 : 0;
    }

    protected HealthCalendar getIndex() {
        if (this.mX <= this.mManager.d() || this.mX >= getWidth() - this.mManager.a()) {
            return null;
        }
        int markerViewExtendY = ((((int) this.mY) / (this.mItemHeight + (this.mMarkerViewClickable ? getMarkerViewExtendY() : 0))) * 7) + calIndex();
        if (markerViewExtendY < 0 || markerViewExtendY >= this.mItems.size()) {
            return null;
        }
        return this.mItems.get(markerViewExtendY);
    }

    private int getMarkerViewExtendY() {
        return this.mManager.i + this.mManager.g;
    }

    final void updateDisplayMode() {
        invalidate();
    }

    final void updateWeekStart() {
        HealthCalendar healthCalendarC = qjj.c(this.mManager.r(), ((Integer) getTag()).intValue() + 1, this.mManager.aa());
        setSelectedCalendar(this.mManager.o);
        init(healthCalendarC);
    }

    @Override // com.huawei.ui.commonui.calendarview.HealthCalendarBaseView
    void updatePresentDate() {
        if (this.mItems == null) {
            return;
        }
        if (this.mItems.contains(this.mManager.s())) {
            Iterator<HealthCalendar> it = this.mItems.iterator();
            while (it.hasNext()) {
                it.next().setPresentDay(false);
            }
            this.mItems.get(this.mItems.indexOf(this.mManager.s())).setPresentDay(true);
        }
        invalidate();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.mItemHeight, 1073741824));
    }

    public void setMarkerViewClickable(boolean z) {
        this.mMarkerViewClickable = z;
    }
}
