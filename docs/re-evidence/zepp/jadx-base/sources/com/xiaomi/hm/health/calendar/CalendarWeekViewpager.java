package com.xiaomi.hm.health.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import androidx.viewpager.widget.ViewPager;
import com.xiaomi.hm.health.calendar.adapter.CalendarViewPagerAdapter;
import com.xiaomi.hm.health.calendar.utils.DateSingleInstance;

/* JADX INFO: loaded from: classes20.dex */
public class CalendarWeekViewpager extends ViewPager {
    private CalendarViewPagerAdapter a;

    public class a extends ViewPager.SimpleOnPageChangeListener {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            int canScrollWeekCount = DateSingleInstance.getInstance().getCanScrollWeekCount();
            if (i != canScrollWeekCount) {
                Log.d("adsf", "position:" + i + "       lastPosition:" + canScrollWeekCount);
                CalendarRecyclerView viewAt = CalendarWeekViewpager.this.a.getViewAt(i);
                DateSingleInstance.getInstance().setNextWeekDate(i > canScrollWeekCount);
                viewAt.getAdapter().notifyDataSetChanged();
                DateSingleInstance.getInstance().getOnWeekDayChangeListener().onWeekDayChange();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CalendarWeekViewpager.this.refreshWeekAdapter();
        }
    }

    public CalendarWeekViewpager(Context context) {
        this(context, null);
    }

    public void jumpToChooseDate() {
        int canScrollWeekCount = DateSingleInstance.getInstance().getCanScrollWeekCount();
        setCurrentItem(canScrollWeekCount, false);
        CalendarViewPagerAdapter calendarViewPagerAdapter = this.a;
        if (calendarViewPagerAdapter != null) {
            if (canScrollWeekCount > 0) {
                calendarViewPagerAdapter.refrestView(canScrollWeekCount - 1);
            }
            this.a.refrestView(canScrollWeekCount);
            if (canScrollWeekCount < DateSingleInstance.getInstance().getWeekCount() - 1) {
                this.a.refrestView(canScrollWeekCount + 1);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        post(new b());
    }

    public void refreshWeekAdapter() {
        CalendarViewPagerAdapter calendarViewPagerAdapter = new CalendarViewPagerAdapter(getContext());
        this.a = calendarViewPagerAdapter;
        setAdapter(calendarViewPagerAdapter);
        setCurrentItem(DateSingleInstance.getInstance().getCanScrollWeekCount(), false);
    }

    public void setAutoCheckedNextWeek(boolean z) {
        if (z) {
            addOnPageChangeListener(new a());
        }
    }

    public CalendarWeekViewpager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
