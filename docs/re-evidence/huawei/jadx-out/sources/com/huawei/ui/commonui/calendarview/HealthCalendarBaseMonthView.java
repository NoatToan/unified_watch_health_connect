package com.huawei.ui.commonui.calendarview;

import android.content.Context;
import android.view.View;
import defpackage.njy;
import defpackage.qjj;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
public abstract class HealthCalendarBaseMonthView extends HealthCalendarBaseView {
    HealthMonthViewPager mHealthMonthViewPager;
    protected int mHeight;
    protected int mLineCount;
    int[] mMarkedRowCount;
    protected int mMonth;
    protected int mNextOffset;
    protected int mYear;

    @Override // com.huawei.ui.commonui.calendarview.HealthCalendarBaseView
    protected void onDestroy() {
    }

    public HealthCalendarBaseMonthView(Context context) {
        super(context);
    }

    final void initMonthWithDate(int i, int i2) {
        this.mYear = i;
        this.mMonth = i2;
        initCalendar();
        this.mHeight = qjj.a(i, i2, this.mManager);
    }

    private void initCalendar() {
        this.mNextOffset = qjj.a(this.mYear, this.mMonth, this.mManager.aa());
        if (this.mManager.an()) {
            this.mItems = qjj.d(this.mYear, this.mMonth, this.mManager);
            this.mLineCount = qjj.c(this.mYear, this.mMonth, this.mManager);
        } else {
            this.mLineCount = qjj.c(this.mManager.r(), this.mManager.m(), this.mManager.aa());
            this.mItems = qjj.d(this.mManager, this.mLineCount);
        }
        if (this.mItems.contains(this.mManager.s())) {
            this.mCurrentItem = this.mItems.indexOf(this.mManager.s());
        } else {
            this.mCurrentItem = this.mItems.indexOf(this.mManager.o);
        }
        this.mMarkedRowCount = new int[this.mLineCount + 1];
        this.mManager.e(this.mItems);
        updateExSpace();
        invalidate();
    }

    void updateExSpace() {
        resetMarkedRowCount();
        int i = 0;
        int i2 = 0;
        while (i < this.mLineCount) {
            boolean z = false;
            for (int i3 = 0; i3 < 7 && !njy.e(this.mItems, i2); i3++) {
                HealthCalendar healthCalendar = this.mItems.get(i2);
                if (this.mManager.q() == 1) {
                    if (i2 > this.mItems.size() - this.mNextOffset) {
                        break;
                    }
                    if (!healthCalendar.isPresentMonth()) {
                        continue;
                    }
                    i2++;
                }
                if (healthCalendar.hasMark()) {
                    z = true;
                }
                if (healthCalendar.isPresentDay() && !this.mManager.ao()) {
                    break;
                }
                i2++;
            }
            int[] iArr = this.mMarkedRowCount;
            int i4 = i + 1;
            int i5 = iArr[i];
            iArr[i4] = i5;
            if (z) {
                iArr[i4] = i5 + 1;
            }
            i = i4;
        }
        this.mManager.b(new HealthCalendar(this.mYear, this.mMonth, 1).toString(), this.mMarkedRowCount);
        this.mHeight = qjj.a(this.mYear, this.mMonth, this.mManager);
    }

    private void resetMarkedRowCount() {
        int i = 0;
        while (true) {
            int[] iArr = this.mMarkedRowCount;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    protected HealthCalendar getIndex() {
        if (this.mItemWidth == 0 || this.mItemHeight == 0 || this.mX <= this.mManager.d() || this.mX >= getWidth() - this.mManager.a()) {
            return null;
        }
        int iCalIndexY = (calIndexY() * 7) + calIndex();
        if (njy.c(this.mItems, iCalIndexY)) {
            return this.mItems.get(iCalIndexY);
        }
        return null;
    }

    @Override // com.huawei.ui.commonui.calendarview.HealthCalendarBaseView
    protected int calIndexY() {
        float fO;
        int i = 0;
        while (i < this.mLineCount) {
            int i2 = i + 1;
            float fO2 = (this.mItemHeight * i2) + (this.mMarkedRowCount[this.mManager.ae() ? i2 : i] * this.mManager.o());
            if (i == 0) {
                fO = 0.0f;
            } else {
                fO = (this.mItemHeight * i) + (this.mMarkedRowCount[this.mManager.ae() ? i : i - 1] * this.mManager.o());
            }
            if (this.mY > fO && this.mY < fO2) {
                return i;
            }
            i = i2;
        }
        return super.calIndexY();
    }

    final void setSelectedCalendar(HealthCalendar healthCalendar) {
        this.mCurrentItem = this.mItems.indexOf(healthCalendar);
    }

    final void updateDisplayMode() {
        this.mLineCount = qjj.c(this.mYear, this.mMonth, this.mManager);
        this.mHeight = qjj.a(this.mYear, this.mMonth, this.mManager);
        invalidate();
    }

    final void updateWeekStart() {
        initCalendar();
        this.mHeight = qjj.a(this.mYear, this.mMonth, this.mManager);
    }

    @Override // com.huawei.ui.commonui.calendarview.HealthCalendarBaseView
    void updateItemHeight() {
        super.updateItemHeight();
        this.mHeight = qjj.a(this.mYear, this.mMonth, this.mManager);
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

    protected final int getSelectedIndex(HealthCalendar healthCalendar) {
        return this.mItems.indexOf(healthCalendar);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.mLineCount == 0) {
            super.onMeasure(i, i2);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.mHeight, 1073741824));
    }

    @Override // com.huawei.ui.commonui.calendarview.HealthCalendarBaseView
    void update() {
        super.update();
        updateExSpace();
    }

    @Override // com.huawei.ui.commonui.calendarview.HealthCalendarBaseView
    void removeMarks() {
        super.removeMarks();
        updateExSpace();
        this.mHeight = qjj.a(this.mYear, this.mMonth, this.mManager);
    }
}
