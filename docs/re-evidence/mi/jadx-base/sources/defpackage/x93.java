package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.calendar.view.MonthCalendarView;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public class x93 extends RecyclerView.Adapter<a> implements MonthCalendarView.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f38878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinkedList<Long> f38879b;
    public LayoutInflater c;
    public RecyclerView d;
    public final HashMap<Long, HashMap<Long, Integer>> e;
    public LocalDate f;
    public b g;

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MonthCalendarView f38880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f38881b;

        public a(View view) {
            super(view);
            this.f38881b = (TextView) view.findViewById(gsi.r0);
            this.f38880a = (MonthCalendarView) view.findViewById(gsi.M);
        }

        public void a(long j, LocalDate localDate) {
            HashMap<Long, Integer> map = (HashMap) x93.this.e.get(Long.valueOf(j));
            LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(j);
            this.f38880a.c(localDateTimestampToLocalDate, localDate, map);
            this.f38881b.setText(localDateTimestampToLocalDate.getYear() + "");
        }
    }

    public interface b {
        void onMonthSelected(LocalDate localDate);
    }

    public x93(Context context, LinkedList<Long> linkedList, RecyclerView recyclerView, LocalDate localDate, HashMap<Long, HashMap<Long, Integer>> map) {
        this.f38878a = context;
        this.f38879b = linkedList;
        this.e = map;
        this.d = recyclerView;
        this.f = localDate;
        this.c = LayoutInflater.from(context);
    }

    @Override // com.xiaomi.fitness.baseui.calendar.view.MonthCalendarView.c
    public void d(LocalDate localDate) {
        m(localDate);
        b bVar = this.g;
        if (bVar != null) {
            bVar.onMonthSelected(localDate);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f38879b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        aVar.a(this.f38879b.get(i).longValue(), TimeDateUtil.getFirstDayOfMonth(this.f));
        aVar.f38880a.setOnYearCalendarItemClickListener(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(this.c.inflate(mvi.i, viewGroup, false));
    }

    public void l(LocalDate localDate) {
        int iBinarySearch = Collections.binarySearch(this.f38879b, Long.valueOf(TimeDateUtil.changZeroOfTheDay(TimeDateUtil.getFirstMonthOfTheYear(localDate))));
        if (iBinarySearch > 1) {
            this.d.scrollToPosition(iBinarySearch);
        } else {
            this.d.scrollToPosition(iBinarySearch);
        }
    }

    public void m(LocalDate localDate) {
        this.f = localDate;
        notifyDataSetChanged();
    }

    public void setOnMonthSelectListener(b bVar) {
        this.g = bVar;
    }
}
