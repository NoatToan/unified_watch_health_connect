package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.calendar.view.WeekCalendarView;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public class ja3 extends RecyclerView.Adapter<a> implements WeekCalendarView.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f22577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinkedList<Long> f22578b;
    public LayoutInflater c;
    public RecyclerView d;
    public LocalDate e;
    public final HashMap<Long, HashMap<Long, Integer>> f;
    public b g;

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeekCalendarView f22579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f22580b;

        public a(View view) {
            super(view);
            this.f22580b = (TextView) view.findViewById(gsi.q0);
            this.f22579a = (WeekCalendarView) view.findViewById(gsi.M);
        }

        public void a(long j) {
            HashMap<Long, Integer> map = (HashMap) ja3.this.f.get(Long.valueOf(j));
            LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(j);
            this.f22579a.l(localDateTimestampToLocalDate, map);
            this.f22580b.setText(TimeDateUtil.getDateMMFormat(localDateTimestampToLocalDate));
        }
    }

    public interface b {
        void onWeekSelected(LocalDate localDate);
    }

    public ja3(Context context, LinkedList<Long> linkedList, RecyclerView recyclerView, LocalDate localDate, HashMap<Long, HashMap<Long, Integer>> map) {
        this.f22577a = context;
        this.f22578b = linkedList;
        this.f = map;
        this.d = recyclerView;
        this.e = localDate;
        this.c = LayoutInflater.from(context);
    }

    @Override // com.xiaomi.fitness.baseui.calendar.view.WeekCalendarView.d
    public void f(LocalDate localDate) {
        m(localDate);
        b bVar = this.g;
        if (bVar != null) {
            bVar.onWeekSelected(localDate);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f22578b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        aVar.a(this.f22578b.get(i).longValue());
        aVar.f22579a.setOnWeekCalendarItemSelectListener(this);
        LocalDate localDate = this.e;
        if (localDate != null) {
            aVar.f22579a.setSelectDate(localDate);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(this.c.inflate(mvi.j, viewGroup, false));
    }

    public void l(LocalDate localDate) {
        int iBinarySearch = Collections.binarySearch(this.f22578b, Long.valueOf(TimeDateUtil.changZeroOfTheDay(TimeDateUtil.getFirstDayOfNextMonth(localDate))));
        if (iBinarySearch > 1) {
            this.d.scrollToPosition(iBinarySearch);
        } else {
            this.d.scrollToPosition(iBinarySearch);
        }
    }

    public void m(LocalDate localDate) {
        this.e = localDate;
        notifyDataSetChanged();
    }

    public void setOnWeekSelectListener(b bVar) {
        this.g = bVar;
    }
}
