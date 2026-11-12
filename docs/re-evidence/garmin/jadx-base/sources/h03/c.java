package h03;

import b71.i;
import com.garmin.android.apps.connectmobile.f3;
import vb.h;
import wr.g;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f80700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f80701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.EnumC1610a f80702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f80703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f80704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f80705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f80706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f80707h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f80708i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f80709j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f80710k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f80711l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Integer f80712m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Integer f80713n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f80714o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Integer f80715p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Integer f80716q;

    public c(a aVar, a.EnumC1610a enumC1610a) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        this.f80700a = aVar;
        a.d dVar = a.d.YEAR;
        a.d dVar2 = a.d.MONTH;
        a.d dVar3 = a.d.DAY;
        a.d dVar4 = a.d.HOUR;
        a.d dVar5 = a.d.MINUTE;
        a.d dVar6 = a.d.SECOND;
        if (!aVar.v(dVar, dVar2, dVar3, dVar4, dVar5, dVar6) && ((!aVar.v(dVar, dVar2, dVar3) || !aVar.u(dVar4, dVar5, dVar6)) && (!aVar.u(dVar, dVar2, dVar3) || !aVar.v(dVar4, dVar5, dVar6)))) {
            h.s("For interval calculations, DateTime must have year-month-day, or hour-minute-second, or both.");
            throw null;
        }
        aVar.g();
        int iIntValue6 = 1;
        if (aVar.f80659b == null) {
            iIntValue = 1;
        } else {
            aVar.g();
            iIntValue = aVar.f80659b.intValue();
        }
        this.f80710k = Integer.valueOf(iIntValue);
        aVar.g();
        if (aVar.f80660c == null) {
            iIntValue2 = 1;
        } else {
            aVar.g();
            iIntValue2 = aVar.f80660c.intValue();
        }
        this.f80711l = Integer.valueOf(iIntValue2);
        aVar.g();
        if (aVar.f80661d != null) {
            aVar.g();
            iIntValue6 = aVar.f80661d.intValue();
        }
        this.f80712m = Integer.valueOf(iIntValue6);
        aVar.g();
        int iIntValue7 = 0;
        if (aVar.f80662e == null) {
            iIntValue3 = 0;
        } else {
            aVar.g();
            iIntValue3 = aVar.f80662e.intValue();
        }
        this.f80713n = Integer.valueOf(iIntValue3);
        aVar.g();
        if (aVar.f80663f == null) {
            iIntValue4 = 0;
        } else {
            aVar.g();
            iIntValue4 = aVar.f80663f.intValue();
        }
        this.f80714o = Integer.valueOf(iIntValue4);
        aVar.g();
        if (aVar.f80664g == null) {
            iIntValue5 = 0;
        } else {
            aVar.g();
            iIntValue5 = aVar.f80664g.intValue();
        }
        this.f80715p = Integer.valueOf(iIntValue5);
        aVar.g();
        if (aVar.f80665h != null) {
            aVar.g();
            iIntValue7 = aVar.f80665h.intValue();
        }
        this.f80716q = Integer.valueOf(iIntValue7);
        this.f80702c = enumC1610a;
    }

    public static void a(Integer num, String str) {
        if (num.intValue() < 0 || num.intValue() > 9999) {
            h.s(str.concat(" is not in the range 0..9999"));
        }
    }

    public final a b(boolean z14, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.f80701b = z14;
        this.f80703d = num.intValue();
        this.f80704e = num2.intValue();
        this.f80705f = num3.intValue();
        this.f80706g = num4.intValue();
        this.f80707h = num5.intValue();
        this.f80708i = num6.intValue();
        this.f80709j = num7.intValue();
        a(Integer.valueOf(this.f80703d), "Year");
        a(Integer.valueOf(this.f80704e), "Month");
        a(Integer.valueOf(this.f80705f), "Day");
        a(Integer.valueOf(this.f80706g), "Hour");
        a(Integer.valueOf(this.f80707h), "Minute");
        a(Integer.valueOf(this.f80708i), "Second");
        int i14 = this.f80709j;
        if (i14 < 0 || i14 > 999999999) {
            h.s("Nanosecond interval is not in the range 0..999999999");
            return null;
        }
        if (this.f80701b) {
            this.f80710k = Integer.valueOf(this.f80710k.intValue() + this.f80703d);
        } else {
            a aVar = this.f80700a;
            aVar.g();
            this.f80710k = Integer.valueOf(aVar.f80659b.intValue() - this.f80703d);
        }
        for (int i15 = 0; i15 < this.f80704e; i15++) {
            f();
        }
        Integer numL = a.l(this.f80710k, this.f80711l);
        int iIntValue = numL.intValue();
        if (this.f80712m.intValue() > iIntValue) {
            a.EnumC1610a enumC1610a = a.EnumC1610a.Abort;
            a.EnumC1610a enumC1610a2 = this.f80702c;
            if (enumC1610a == enumC1610a2) {
                StringBuilder sb3 = new StringBuilder("Day Overflow: Year:");
                sb3.append(this.f80710k);
                sb3.append(" Month:");
                sb3.append(this.f80711l);
                sb3.append(" has ");
                sb3.append(iIntValue);
                sb3.append(" days, but day has value:");
                kg.f.n(f3.i(sb3, this.f80712m, " To avoid these exceptions, please specify a different DayOverflow policy."));
                return null;
            }
            if (a.EnumC1610a.FirstDay == enumC1610a2) {
                this.f80712m = 1;
                f();
            } else if (a.EnumC1610a.LastDay == enumC1610a2) {
                this.f80712m = numL;
            } else if (a.EnumC1610a.Spillover == enumC1610a2) {
                this.f80712m = i.e(iIntValue, this.f80712m);
                f();
            }
        }
        for (int i16 = 0; i16 < this.f80705f; i16++) {
            c();
        }
        for (int i17 = 0; i17 < this.f80706g; i17++) {
            d();
        }
        for (int i18 = 0; i18 < this.f80707h; i18++) {
            e();
        }
        for (int i19 = 0; i19 < this.f80708i; i19++) {
            g();
        }
        boolean z15 = this.f80701b;
        Integer num8 = this.f80716q;
        if (z15) {
            this.f80716q = Integer.valueOf(num8.intValue() + this.f80709j);
        } else {
            this.f80716q = Integer.valueOf(num8.intValue() - this.f80709j);
        }
        if (this.f80716q.intValue() > 999999999) {
            g();
            this.f80716q = i.e(1000000000, this.f80716q);
        } else if (this.f80716q.intValue() < 0) {
            g();
            this.f80716q = g.m(1000000000, this.f80716q);
        }
        return new a(this.f80710k, this.f80711l, this.f80712m, this.f80713n, this.f80714o, this.f80715p, this.f80716q);
    }

    public final void c() {
        boolean z14 = this.f80701b;
        Integer num = this.f80712m;
        if (z14) {
            this.f80712m = g.m(1, num);
        } else {
            this.f80712m = i.e(1, num);
        }
        if (this.f80712m.intValue() > a.l(this.f80710k, this.f80711l).intValue()) {
            this.f80712m = 1;
            f();
        } else if (this.f80712m.intValue() < 1) {
            int iIntValue = this.f80711l.intValue();
            Integer num2 = this.f80710k;
            this.f80712m = Integer.valueOf(iIntValue > 1 ? a.l(num2, Integer.valueOf(this.f80711l.intValue() - 1)).intValue() : a.l(i.e(1, num2), 12).intValue());
            f();
        }
    }

    public final void d() {
        boolean z14 = this.f80701b;
        Integer num = this.f80713n;
        if (z14) {
            this.f80713n = g.m(1, num);
        } else {
            this.f80713n = i.e(1, num);
        }
        if (this.f80713n.intValue() > 23) {
            this.f80713n = 0;
            c();
        } else if (this.f80713n.intValue() < 0) {
            this.f80713n = 23;
            c();
        }
    }

    public final void e() {
        boolean z14 = this.f80701b;
        Integer num = this.f80714o;
        if (z14) {
            this.f80714o = g.m(1, num);
        } else {
            this.f80714o = i.e(1, num);
        }
        if (this.f80714o.intValue() > 59) {
            this.f80714o = 0;
            d();
        } else if (this.f80714o.intValue() < 0) {
            this.f80714o = 59;
            d();
        }
    }

    public final void f() {
        boolean z14 = this.f80701b;
        Integer num = this.f80711l;
        if (z14) {
            this.f80711l = g.m(1, num);
        } else {
            this.f80711l = i.e(1, num);
        }
        if (this.f80711l.intValue() > 12) {
            this.f80711l = 1;
            h();
        } else if (this.f80711l.intValue() < 1) {
            this.f80711l = 12;
            h();
        }
    }

    public final void g() {
        boolean z14 = this.f80701b;
        Integer num = this.f80715p;
        if (z14) {
            this.f80715p = g.m(1, num);
        } else {
            this.f80715p = i.e(1, num);
        }
        if (this.f80715p.intValue() > 59) {
            this.f80715p = 0;
            e();
        } else if (this.f80715p.intValue() < 0) {
            this.f80715p = 59;
            e();
        }
    }

    public final void h() {
        boolean z14 = this.f80701b;
        Integer num = this.f80710k;
        if (z14) {
            this.f80710k = g.m(1, num);
        } else {
            this.f80710k = i.e(1, num);
        }
    }
}
