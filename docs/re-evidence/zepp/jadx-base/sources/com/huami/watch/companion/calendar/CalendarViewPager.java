package com.huami.watch.companion.calendar;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.huami.watch.util.DateDay;

/* JADX INFO: loaded from: classes16.dex */
public class CalendarViewPager extends ViewPager {
    private int a;

    public class a implements ViewPager.OnPageChangeListener {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            DateManager.get().onMonthChange(DateDay.today().addMonth((i - CalendarViewPager.this.a) + 1).str());
        }
    }

    public CalendarViewPager(Context context) {
        this(context, null);
    }

    private void b(Context context) {
        this.a = DateManager.get().getPageCount();
        CalendarDate currentSelectDay = DateManager.get().getCurrentSelectDay();
        setAdapter(new CalendarViewPageAdapter(context, this.a));
        setCurrentItem((this.a - 1) + DateDay.from(currentSelectDay.millis()).offsetMonth(DateDay.today()));
        addOnPageChangeListener(new a());
    }

    public CalendarViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }
}
