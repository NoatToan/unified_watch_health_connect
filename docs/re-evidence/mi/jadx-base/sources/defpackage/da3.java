package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.calendar.view.DayThreeCircleFiveLineCalendarView;
import com.xiaomi.fitness.baseui.calendar.view.DayThreeCircleFourLineCalendarView;
import com.xiaomi.fitness.baseui.calendar.view.DayThreeCircleSixLineCalendarView;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public class da3 extends RecyclerView.Adapter<RecyclerView.d0> implements c8h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<Long, Map<Long, cdp>> f15289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinkedList<Long> f15290b;
    public LayoutInflater c = LayoutInflater.from(AppUtil.getApp());
    public RecyclerView d;
    public LocalDate e;
    public d8h f;
    public cdp g;

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DayThreeCircleFiveLineCalendarView f15291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f15292b;

        public a(View view) {
            super(view);
            this.f15292b = (TextView) view.findViewById(gsi.q0);
            this.f15291a = (DayThreeCircleFiveLineCalendarView) view.findViewById(gsi.M);
        }

        public void a(long j) {
            Map<Long, cdp> map = (Map) da3.this.f15289a.get(Long.valueOf(j));
            LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(j);
            this.f15291a.j(localDateTimestampToLocalDate, map, da3.this.g);
            this.f15292b.setText(TimeDateUtil.getDateMMFormat(localDateTimestampToLocalDate));
        }
    }

    public class b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DayThreeCircleSixLineCalendarView f15293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f15294b;

        public b(View view) {
            super(view);
            this.f15294b = (TextView) view.findViewById(gsi.q0);
            this.f15293a = (DayThreeCircleSixLineCalendarView) view.findViewById(gsi.M);
        }

        public void a(long j) {
            Map<Long, cdp> map = (Map) da3.this.f15289a.get(Long.valueOf(j));
            LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(j);
            this.f15293a.j(localDateTimestampToLocalDate, map, da3.this.g);
            this.f15294b.setText(TimeDateUtil.getDateMMFormat(localDateTimestampToLocalDate));
        }
    }

    public class c extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DayThreeCircleFourLineCalendarView f15295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f15296b;

        public c(View view) {
            super(view);
            this.f15296b = (TextView) view.findViewById(gsi.q0);
            this.f15295a = (DayThreeCircleFourLineCalendarView) view.findViewById(gsi.M);
        }

        public void a(long j) {
            Map<Long, cdp> map = (Map) da3.this.f15289a.get(Long.valueOf(j));
            LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(j);
            this.f15295a.j(localDateTimestampToLocalDate, map, da3.this.g);
            this.f15296b.setText(TimeDateUtil.getDateMMFormat(localDateTimestampToLocalDate));
        }
    }

    public da3(LinkedList<Long> linkedList, RecyclerView recyclerView, LocalDate localDate, Map<Long, Map<Long, cdp>> map, cdp cdpVar) {
        this.f15290b = linkedList;
        this.d = recyclerView;
        this.e = localDate;
        this.f15289a = map;
        this.g = cdpVar;
    }

    @Override // defpackage.c8h
    public void g(LocalDate localDate) {
        l(localDate);
        d8h d8hVar = this.f;
        if (d8hVar != null) {
            d8hVar.onDaySelected(localDate);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.f15290b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int size = TimeDateUtil.getMonthLocalDateCalendar(TimeDateUtil.timestampToLocalDate(this.f15290b.get(i).longValue())).size() / 7;
        if (size == 4) {
            return 4;
        }
        return size == 6 ? 6 : 5;
    }

    public void k(LocalDate localDate) {
        int iBinarySearch = Collections.binarySearch(this.f15290b, Long.valueOf(TimeDateUtil.changZeroOfTheDay(TimeDateUtil.getFirstDayOfNextMonth(localDate))));
        if (iBinarySearch > 1) {
            this.d.scrollToPosition(iBinarySearch);
        } else {
            this.d.scrollToPosition(iBinarySearch);
        }
    }

    public void l(LocalDate localDate) {
        this.e = localDate;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        Long l = this.f15290b.get(i);
        int itemViewType = getItemViewType(i);
        if (itemViewType == 4) {
            c cVar = (c) d0Var;
            cVar.a(l.longValue());
            cVar.f15295a.setOnDayCalendarItemSelectListener(this);
            LocalDate localDate = this.e;
            if (localDate != null) {
                cVar.f15295a.setSelectDate(localDate);
                return;
            }
            return;
        }
        if (itemViewType == 6) {
            b bVar = (b) d0Var;
            bVar.a(l.longValue());
            bVar.f15293a.setOnDayCalendarItemSelectListener(this);
            LocalDate localDate2 = this.e;
            if (localDate2 != null) {
                bVar.f15293a.setSelectDate(localDate2);
                return;
            }
            return;
        }
        a aVar = (a) d0Var;
        aVar.a(l.longValue());
        aVar.f15291a.setOnDayCalendarItemSelectListener(this);
        LocalDate localDate3 = this.e;
        if (localDate3 != null) {
            aVar.f15291a.setSelectDate(localDate3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 4) {
            return new c(this.c.inflate(mvi.f, viewGroup, false));
        }
        return i == 6 ? new b(this.c.inflate(mvi.h, viewGroup, false)) : new a(this.c.inflate(mvi.e, viewGroup, false));
    }

    public void setOnDaySelectListener(d8h d8hVar) {
        this.f = d8hVar;
    }
}
