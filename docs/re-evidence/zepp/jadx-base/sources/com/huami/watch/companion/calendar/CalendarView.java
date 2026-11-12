package com.huami.watch.companion.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.huami.watch.companionlib.R;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.Rx;
import com.huami.watch.util.TimeUtil;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class CalendarView extends LinearLayout implements DateManager.a {
    private TextView a;
    private CalendarViewPager b;
    private DateManager c;
    private onLoadMarkListener d;

    public class a implements Consumer<List<String>> {
        public a() {
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(List<String> list) throws Exception {
            DateManager.get().setMonthMasks(list);
            ((CalendarViewPageAdapter) CalendarView.this.b.getAdapter()).refresh(CalendarView.this.b.getCurrentItem());
        }
    }

    public class b implements ObservableOnSubscribe<List<String>> {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<List<String>> observableEmitter) throws Exception {
            List<String> listLoadMark = CalendarView.this.d.loadMark(this.a);
            if (listLoadMark != null) {
                observableEmitter.onNext(listLoadMark);
            }
        }
    }

    public interface onLoadMarkListener {
        List<String> loadMark(String str);
    }

    public CalendarView(Context context, DateDay dateDay, DateDay dateDay2, DateDay dateDay3, String str) {
        this(context, null);
        e(dateDay, dateDay2, dateDay3, str);
        d();
        c();
    }

    private void c() {
        this.a = (TextView) findViewById(R.id.tv_calendar_title);
        this.b = (CalendarViewPager) findViewById(R.id.view_pager);
        this.a.setText(TimeUtil.formatDateTime(DateManager.get().getCurrentSelectDay().millis(), getContext().getString(R.string.sport_history_date_year_month_format)));
    }

    private void d() {
        LayoutInflater.from(getContext()).inflate(R.layout.view_calendar, (ViewGroup) this, true);
    }

    private void e(DateDay dateDay, DateDay dateDay2, DateDay dateDay3, String str) {
        DateManager.get().reset();
        this.c.setStartDate(CalendarUtil.dateDayToDate(dateDay));
        this.c.setStopDate(CalendarUtil.dateDayToDate(dateDay2));
        this.c.setPageCount(dateDay2.offsetMonth(dateDay) + 1);
        this.c.setCurrentSelectDate(CalendarUtil.dateDayToDate(dateDay3));
        this.c.setMaskColor(str);
        this.c.setMonthChangeLister(this);
    }

    public void loadMasks(String str) {
        Rx.io(new b(str)).subscribe(new a());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.setMonthChangeLister(null);
        this.c.setDayChangeLister(null);
    }

    @Override // com.huami.watch.companion.calendar.DateManager.a
    public void onMonthChange(String str) {
        TextView textView = this.a;
        if (textView != null) {
            textView.setText(TimeUtil.formatDateTime(DateDay.from(str).timeInMillis(), getContext().getString(R.string.sport_history_date_year_month_format)));
        }
        loadMasks(str);
    }

    public void setLoadMarkListener(onLoadMarkListener onloadmarklistener) {
        this.d = onloadmarklistener;
    }

    public void setOnDayChangeListener(DateManager.OnDayChangeListener onDayChangeListener) {
        this.c.setDayChangeLister(onDayChangeListener);
    }

    public CalendarView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CalendarView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = DateManager.get();
    }
}
