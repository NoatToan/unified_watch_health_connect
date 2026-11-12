package com.xiaomi.hm.health.calendar.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.xiaomi.hm.health.calendar.CalendarRecyclerView;
import com.xiaomi.hm.health.calendar.utils.DateSingleInstance;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class CalendarViewPagerAdapter extends PagerAdapter {
    private List<CalendarRecyclerView> a = new ArrayList();

    public CalendarViewPagerAdapter(Context context) {
        int weekCount = DateSingleInstance.getInstance().getWeekCount();
        for (int i = 0; i < weekCount; i++) {
            this.a.add(new CalendarRecyclerView(context, DateSingleInstance.getInstance().getWeekAt(i)));
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView(this.a.get(i));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* JADX INFO: renamed from: getCount */
    public int getPagerCount() {
        List<CalendarRecyclerView> list = this.a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public CalendarRecyclerView getViewAt(int i) {
        return this.a.get(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        CalendarRecyclerView calendarRecyclerView = this.a.get(i);
        viewGroup.addView(calendarRecyclerView);
        calendarRecyclerView.getAdapter().notifyDataSetChanged();
        return calendarRecyclerView;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public void refrestView(int i) {
        this.a.get(i).getAdapter().notifyDataSetChanged();
    }
}
