package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.trail.widget.MonthPanelStyle;
import com.xiaomi.fitness.trail.widget.MonthPanelView;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class t7g extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<y7g> f34417a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b8g f34418b;
    public f9h c;
    public int d;

    public t7g(int i) {
        this.d = i;
        k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<y7g> list = this.f34417a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int j() {
        return this.d;
    }

    public final void k() {
        long[] normalDateRange = TimeUtils.getNormalDateRange();
        long j = normalDateRange[0];
        long j2 = normalDateRange[1];
        Calendar zeroOClockToday = TimeUtils.getZeroOClockToday();
        zeroOClockToday.setTimeInMillis(j2);
        int i = zeroOClockToday.get(1);
        int i2 = zeroOClockToday.get(2);
        Calendar zeroOClockToday2 = TimeUtils.getZeroOClockToday();
        zeroOClockToday2.setTimeInMillis(j);
        while (true) {
            int i3 = zeroOClockToday2.get(1);
            int i4 = zeroOClockToday2.get(2);
            this.f34417a.add(new y7g(zeroOClockToday2));
            if (i == i3 && i2 == i4) {
                return;
            } else {
                zeroOClockToday2.add(2, 1);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        aVar.setOnMonthPreparedListener(this.c);
        aVar.j(null);
        y7g y7gVar = this.f34417a.get(i);
        aVar.i(y7gVar.b(), y7gVar.a());
        aVar.b();
        aVar.k();
        int iA = this.f34418b.a();
        int iC = this.f34418b.c();
        if (iC != iA) {
            this.f34418b.e(iC);
        }
        if (iC == i) {
            aVar.h(this.f34418b.b());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(ivi.n0, viewGroup, false), this);
    }

    public int n(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(date.getTime());
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int itemCount = getItemCount() - 1;
        for (int i3 = 0; i3 < getItemCount(); i3++) {
            y7g y7gVar = this.f34417a.get(i3);
            if (y7gVar.b() == i && y7gVar.a() == i2) {
                itemCount = i3;
            }
        }
        this.f34418b.f(date);
        this.f34418b.g(itemCount);
        return itemCount;
    }

    public void o(ruc rucVar) {
    }

    public final void p(Date date, int i) {
        if (i < 0) {
            return;
        }
        this.f34418b.f(date);
        this.f34418b.g(i);
        int iA = this.f34418b.a();
        int iC = this.f34418b.c();
        if (iC != iA) {
            if (iA >= 0) {
                notifyDataSetChanged();
            } else {
                this.f34418b.e(iC);
            }
        }
    }

    public void q(b8g b8gVar) {
        this.f34418b = b8gVar;
    }

    public void setOnMonthPreparedListener(f9h f9hVar) {
        this.c = f9hVar;
    }

    public static class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f34419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MonthPanelView f34420b;
        public t7g c;
        public Context d;

        public a(View view) {
            super(view);
            this.d = view.getContext();
            this.f34419a = (TextView) view.findViewById(bsi.m8);
            MonthPanelView monthPanelView = (MonthPanelView) view.findViewById(bsi.w4);
            this.f34420b = monthPanelView;
            monthPanelView.setOnDateSelectedListener(new b8h() { // from class: s7g
                @Override // defpackage.b8h
                public final void q(Date date) {
                    this.f33379a.g(date);
                }
            });
        }

        public void b() {
            this.f34420b.f();
        }

        public final MonthPanelStyle c() {
            Resources resources = this.d.getResources();
            MonthPanelStyle selectedBackground = new MonthPanelStyle().setDateNumWidth(resources.getDimensionPixelSize(tli.f)).setDateNumHeight(resources.getDimensionPixelSize(tli.f)).setSelectedCircleWidth(resources.getDimensionPixelSize(tli.c)).setSelectedCircleRadius(resources.getDimensionPixelSize(tli.d)).setDateNumCommonColor(resources.getColor(dki.n, null)).setDateNumTextSize(resources.getDimensionPixelSize(tli.f34833b)).setSelectedCircleColor(resources.getColor(dki.y, null)).setSelectedDateNumColor(resources.getColor(dki.y, null)).setTodayColor(resources.getColor(dki.p, null)).setSelectedBackground(resources.getColor(dki.s, null));
            HashMap map = new HashMap();
            map.put(0, Integer.valueOf(resources.getColor(dki.n, null)));
            selectedBackground.addMonthDateNumPropertyColor(1, map);
            return selectedBackground;
        }

        public int d() {
            return this.f34420b.getMonth();
        }

        public final MonthPanelStyle e() {
            Resources resources = this.d.getResources();
            MonthPanelStyle monthPanelStyleAddDecorateColor = new MonthPanelStyle().setDateNumWidth(resources.getDimensionPixelSize(tli.f)).setDateNumHeight(resources.getDimensionPixelSize(tli.f)).setSelectedCircleWidth(resources.getDimensionPixelSize(tli.c)).setSelectedCircleRadius(resources.getDimensionPixelSize(tli.d)).setDecroMarginToCenter(resources.getDimensionPixelSize(tli.f34833b)).setDecroRadius(resources.getDimensionPixelSize(tli.e)).setDateNumCommonColor(resources.getColor(dki.m, null)).setDateNumTextSize(resources.getDimensionPixelSize(tli.f34832a)).setSelectedCircleColor(resources.getColor(dki.o, null)).setSelectedDateNumColor(resources.getColor(dki.p, null)).setTodayColor(resources.getColor(dki.p, null)).addDecorateColor(1, resources.getColor(dki.l, null));
            HashMap map = new HashMap();
            map.put(0, Integer.valueOf(resources.getColor(dki.n, null)));
            monthPanelStyleAddDecorateColor.addMonthDateNumPropertyColor(1, map);
            return monthPanelStyleAddDecorateColor;
        }

        public int f() {
            return this.f34420b.getYear();
        }

        public final /* synthetic */ void g(Date date) {
            if (date == null) {
                return;
            }
            this.c.p(date, getAdapterPosition());
        }

        public boolean h(Date date) {
            return this.f34420b.n(date);
        }

        public void i(int i, int i2) {
            this.f34420b.m(i, i2);
            this.itemView.setContentDescription(TimeUtils.formatDate("yyyy-MM", Long.valueOf(this.f34420b.getFirstDate().getTime())));
        }

        public void j(ruc rucVar) {
            this.f34420b.setMonthDateContentDescriptionProvider(rucVar);
        }

        public void k() {
            this.f34419a.setText(TimeUtils.formatDate("MMM", Long.valueOf(this.f34420b.getFirstDate().getTime())));
        }

        public void setOnMonthPreparedListener(f9h f9hVar) {
            this.f34420b.setOnMonthPreparedListener(f9hVar);
        }

        public a(View view, t7g t7gVar) {
            this(view);
            this.c = t7gVar;
            if (t7gVar.j() == 1) {
                this.f34420b.setMonthPanelStyle(c());
            } else {
                this.f34420b.setMonthPanelStyle(e());
            }
        }
    }
}
