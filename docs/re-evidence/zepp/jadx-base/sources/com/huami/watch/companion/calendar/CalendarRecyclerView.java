package com.huami.watch.companion.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.huami.watch.util.DateDay;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class CalendarRecyclerView extends RecyclerView {
    private CalendarAdapter a;

    public class a implements BaseQuickAdapter.OnItemClickListener {
        public a() {
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            DateManager.OnDayChangeListener dayChangeListener;
            CalendarDate calendarDate = (CalendarDate) baseQuickAdapter.getData().get(i);
            if (calendarDate.getDay() == 0 || DateDay.from(calendarDate.millis()).after(DateDay.from(DateManager.get().getStopDate().millis())) || DateDay.from(calendarDate.millis()).before(DateDay.from(DateManager.get().getStartDate().millis())) || (dayChangeListener = DateManager.get().getDayChangeListener()) == null) {
                return;
            }
            dayChangeListener.onDayChange(calendarDate.date());
        }
    }

    public CalendarRecyclerView(Context context, List<CalendarDate> list) {
        this(context, null, 0);
        a(list);
    }

    private void a(List<CalendarDate> list) {
        CalendarAdapter calendarAdapter = new CalendarAdapter();
        this.a = calendarAdapter;
        calendarAdapter.setNewData(list);
        setAdapter(this.a);
        this.a.setOnItemClickListener(new a());
    }

    public CalendarRecyclerView(Context context) {
        this(context, null, 0);
    }

    public CalendarRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CalendarRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        setNestedScrollingEnabled(false);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 7, 1, false);
        gridLayoutManager.setSmoothScrollbarEnabled(false);
        setLayoutManager(gridLayoutManager);
        setHasFixedSize(true);
    }
}
