package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.calendar.view.DayCalendarView;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public class t93 extends RecyclerView.Adapter<a> implements c8h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<Long, HashMap<Long, Integer>> f34468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinkedList<Long> f34469b;
    public LayoutInflater c = LayoutInflater.from(AppUtil.getApp());
    public RecyclerView d;
    public LocalDate e;
    public Boolean f;
    public d8h g;

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DayCalendarView f34470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f34471b;

        public a(View view) {
            super(view);
            this.f34471b = (TextView) view.findViewById(gsi.q0);
            this.f34470a = (DayCalendarView) view.findViewById(gsi.M);
        }

        public void a(long j) {
            HashMap<Long, Integer> map = (HashMap) t93.this.f34468a.get(Long.valueOf(j));
            LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(j);
            this.f34470a.k(t93.this.f);
            this.f34470a.m(localDateTimestampToLocalDate, map);
            this.f34471b.setText(TimeDateUtil.getDateMMFormat(localDateTimestampToLocalDate));
        }
    }

    public t93(LinkedList<Long> linkedList, RecyclerView recyclerView, LocalDate localDate, HashMap<Long, HashMap<Long, Integer>> map) {
        this.f34469b = linkedList;
        this.f34468a = map;
        this.d = recyclerView;
        this.e = localDate;
    }

    @Override // defpackage.c8h
    public void g(LocalDate localDate) {
        n(localDate);
        d8h d8hVar = this.g;
        if (d8hVar != null) {
            d8hVar.onDaySelected(localDate);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.f34469b.size();
    }

    public void j(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        aVar.a(this.f34469b.get(i).longValue());
        aVar.f34470a.setOnDayCalendarItemSelectListener(this);
        LocalDate localDate = this.e;
        if (localDate != null) {
            aVar.f34470a.setSelectDate(localDate);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(this.c.inflate(mvi.g, viewGroup, false));
    }

    public void m(LocalDate localDate) {
        int iBinarySearch = Collections.binarySearch(this.f34469b, Long.valueOf(TimeDateUtil.changZeroOfTheDay(TimeDateUtil.getFirstDayOfNextMonth(localDate))));
        if (iBinarySearch > 1) {
            this.d.scrollToPosition(iBinarySearch);
        } else {
            this.d.scrollToPosition(iBinarySearch);
        }
    }

    public void n(LocalDate localDate) {
        this.e = localDate;
        notifyDataSetChanged();
    }

    public void setOnDaySelectListener(d8h d8hVar) {
        this.g = d8hVar;
    }
}
