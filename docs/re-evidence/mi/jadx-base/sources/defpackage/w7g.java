package defpackage;

import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.trail.widget.MonthPanelView;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class w7g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37687b;
    public int c;
    public List<List<tp5>> d;
    public int e;
    public long f;
    public int g;
    public int h;
    public int i;
    public tp5 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f9h f37688k;
    public MonthPanelView l;
    public int m;
    public int n;
    public int o;

    public w7g(MonthPanelView monthPanelView) {
        this(monthPanelView, 0L);
    }

    public void a() {
        for (int i = 0; i < h(); i++) {
            for (int i2 = 0; i2 < b(); i2++) {
                tp5 tp5VarD = d(i, i2);
                if (tp5VarD != null) {
                    tp5VarD.p(false);
                }
            }
        }
    }

    public int b() {
        return 7;
    }

    public int c(int i) {
        if (i < h()) {
            return this.d.get(i).size();
        }
        return 0;
    }

    public tp5 d(int i, int i2) {
        if (k(i, i2)) {
            return this.d.get(i).get(i2);
        }
        return null;
    }

    public Date e() {
        Calendar zeroOClockToday = TimeUtils.getZeroOClockToday();
        zeroOClockToday.set(1, this.f37686a);
        zeroOClockToday.set(2, this.f37687b);
        zeroOClockToday.set(5, 1);
        return zeroOClockToday.getTime();
    }

    public Date f() {
        for (int iH = h() - 1; iH >= 0; iH--) {
            List<tp5> list = this.d.get(iH);
            for (int size = list.size() - 1; size >= 0; size--) {
                tp5 tp5Var = list.get(size);
                if (tp5Var.d() == 2) {
                    return tp5Var.a();
                }
            }
        }
        throw new IllegalStateException("there is no last date");
    }

    public int g() {
        return this.f37687b;
    }

    public int h() {
        return this.d.size();
    }

    public Date i() {
        tp5 tp5Var = this.j;
        if (tp5Var != null) {
            return tp5Var.a();
        }
        return null;
    }

    public int j() {
        return this.f37686a;
    }

    public final boolean k(int i, int i2) {
        return this.d.size() > i && this.d.get(i).size() > i2;
    }

    public final void l() {
        int i;
        int i2;
        Calendar zeroOClockToday = TimeUtils.getZeroOClockToday();
        this.g = zeroOClockToday.get(1);
        this.h = zeroOClockToday.get(2);
        this.i = zeroOClockToday.get(5);
        int i3 = this.m;
        if (i3 == 0 || (i = this.n) == 0 || (i2 = this.o) == 0) {
            zeroOClockToday.add(5, 1);
        } else {
            zeroOClockToday.set(i3, i, i2);
        }
        this.f = zeroOClockToday.getTimeInMillis();
    }

    public final boolean m(Calendar calendar) {
        return calendar.getTimeInMillis() >= this.f;
    }

    public final boolean n(Calendar calendar) {
        return this.g == calendar.get(1) && this.h == calendar.get(2) && this.i == calendar.get(5);
    }

    public final void o() {
        if (this.f37688k != null) {
            this.f37688k.m(this.l, e(), f());
        }
    }

    public void p(Map<Long, Integer> map, boolean z) {
        if (map == null) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        for (int i = 0; i < h(); i++) {
            for (int i2 = 0; i2 < b(); i2++) {
                tp5 tp5VarD = d(i, i2);
                if (tp5VarD != null) {
                    tp5VarD.o(z);
                    calendar.setTimeInMillis(tp5VarD.a().getTime());
                    TimeUtils.setToZeroOClock(calendar);
                    Integer num = map.get(Long.valueOf(calendar.getTimeInMillis()));
                    tp5VarD.l(num == null ? 0 : num.intValue());
                }
            }
        }
    }

    public void q(int i, int i2) {
        tp5 tp5Var = this.j;
        if (tp5Var != null) {
            tp5Var.p(false);
        }
        tp5 tp5VarD = d(i, i2);
        if (tp5VarD != null) {
            tp5VarD.p(true);
            this.j = tp5VarD;
        }
    }

    public void r(Map<Long, List<Integer>> map) {
        if (map == null) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        for (int i = 0; i < h(); i++) {
            for (int i2 = 0; i2 < b(); i2++) {
                tp5 tp5VarD = d(i, i2);
                if (tp5VarD != null) {
                    calendar.setTimeInMillis(tp5VarD.a().getTime());
                    TimeUtils.setToZeroOClock(calendar);
                    tp5VarD.m(map.get(Long.valueOf(calendar.getTimeInMillis())));
                }
            }
        }
    }

    public boolean s(Date date) {
        if (date == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(date.getTime());
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        for (int i4 = 0; i4 < h(); i4++) {
            for (int i5 = 0; i5 < b(); i5++) {
                tp5 tp5VarD = d(i4, i5);
                if (tp5VarD != null) {
                    tp5VarD.p(false);
                    calendar.setTimeInMillis(tp5VarD.a().getTime());
                    int i6 = calendar.get(1);
                    int i7 = calendar.get(2);
                    int i8 = calendar.get(5);
                    if (i6 == i && i7 == i2 && i8 == i3) {
                        tp5VarD.p(true);
                        this.j = tp5VarD;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void setOnMonthPreparedListener(f9h f9hVar) {
        this.f37688k = f9hVar;
    }

    public void t(int i, int i2) {
        int i3;
        Calendar calendar = Calendar.getInstance();
        l();
        calendar.set(i, i2, 1);
        this.f37686a = calendar.get(1);
        this.f37687b = calendar.get(2);
        this.c = calendar.getActualMaximum(5);
        this.e = calendar.getFirstDayOfWeek();
        this.d = new LinkedList();
        calendar.set(5, this.c);
        calendar.add(5, 1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        calendar.set(1, this.f37686a);
        calendar.set(2, this.f37687b);
        calendar.set(5, 1);
        for (int i4 = calendar.get(7); i4 != this.e; i4 = calendar.get(7)) {
            calendar.add(5, -1);
        }
        while (calendar.before(calendar2)) {
            LinkedList linkedList = new LinkedList();
            boolean zM = false;
            for (int i5 = 0; i5 < 7; i5++) {
                int i6 = calendar.get(1);
                int i7 = calendar.get(2);
                tp5 tp5Var = new tp5(calendar.getTime(), (i6 >= this.f37686a && i7 >= (i3 = this.f37687b)) ? i7 > i3 ? 3 : 2 : 1);
                boolean zN = n(calendar);
                if (zN) {
                    tp5Var.n(zN);
                }
                linkedList.add(tp5Var);
                calendar.add(5, 1);
                zM = m(calendar);
                if (zM) {
                    break;
                }
            }
            this.d.add(linkedList);
            if (zM) {
                break;
            }
        }
        o();
    }

    public w7g(MonthPanelView monthPanelView, long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        this.l = monthPanelView;
        t(calendar.get(1), calendar.get(2));
    }
}
