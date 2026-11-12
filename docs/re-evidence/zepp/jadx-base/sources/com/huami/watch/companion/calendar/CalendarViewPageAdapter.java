package com.huami.watch.companion.calendar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.huami.watch.util.DateDay;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public class CalendarViewPageAdapter extends PagerAdapter {
    private Context a;
    private int b;
    private HashMap<Integer, CalendarRecyclerView> c = new HashMap<>();

    public CalendarViewPageAdapter(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
        this.c.remove(Integer.valueOf(i));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.b;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        DateDay dateDayAddMonth = DateDay.today().addMonth((i - this.b) + 1);
        CalendarRecyclerView calendarRecyclerView = new CalendarRecyclerView(this.a, CalendarUtil.generateDayData(new CalendarDate(dateDayAddMonth.year(), dateDayAddMonth.month(), dateDayAddMonth.day())));
        viewGroup.addView(calendarRecyclerView);
        this.c.put(Integer.valueOf(i), calendarRecyclerView);
        return calendarRecyclerView;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public void refresh(int i) {
        CalendarRecyclerView calendarRecyclerView = this.c.get(Integer.valueOf(i));
        if (calendarRecyclerView != null) {
            calendarRecyclerView.getAdapter().notifyDataSetChanged();
        }
    }
}
