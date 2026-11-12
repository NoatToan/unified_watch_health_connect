package com.xiaomi.fitness.baseui.calendar.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.Toast;
import androidx.viewpager.widget.ViewPager;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.lah;
import defpackage.m22;
import defpackage.mad;
import defpackage.o93;
import defpackage.p93;
import defpackage.q22;
import defpackage.w7h;
import defpackage.y93;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseCalendar extends ViewPager {
    public Context j0;
    public o93 k0;
    public BaseCalendarView l0;
    public BaseCalendarView m0;
    public BaseCalendarView n0;
    public LocalDate o0;
    public LocalDate p0;
    public LocalDate q0;
    public LocalDate r0;
    public LocalDate s0;
    public LocalDate t0;
    public q22 u0;

    public class a extends ViewPager.k {

        /* JADX INFO: renamed from: com.xiaomi.fitness.baseui.calendar.view.BaseCalendar$a$a, reason: collision with other inner class name */
        public class RunnableC0382a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f11589a;

            public RunnableC0382a(int i) {
                this.f11589a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                BaseCalendar.this.T(this.f11589a);
            }
        }

        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.k, androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i) {
            BaseCalendar.this.post(new RunnableC0382a(i));
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseCalendar baseCalendar = BaseCalendar.this;
            baseCalendar.T(baseCalendar.getCurrentItem());
        }
    }

    public BaseCalendar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o93 o93VarA = p93.a(context, attributeSet);
        this.k0 = o93VarA;
        this.u0 = new mad(o93VarA);
        a0(context);
    }

    public final void S(boolean z, boolean z2) {
        if (this.o0.equals(this.t0)) {
            return;
        }
        if (z) {
            h0(this.o0, z2);
            this.t0 = this.o0;
        }
        i0(this.o0, z2);
    }

    public final void T(int i) {
        this.l0 = (BaseCalendarView) findViewWithTag(Integer.valueOf(i));
        this.m0 = (BaseCalendarView) findViewWithTag(Integer.valueOf(i - 1));
        boolean z = true;
        this.n0 = (BaseCalendarView) findViewWithTag(Integer.valueOf(i + 1));
        BaseCalendarView baseCalendarView = this.l0;
        if (baseCalendarView == null) {
            return;
        }
        int iZ = Z(this.o0, baseCalendarView.getInitialDate(), this.k0.x);
        if (iZ != 0) {
            this.o0 = V(this.o0, iZ);
        }
        this.o0 = Y(this.o0);
        if (!this.k0.K && !this.l0.a(this.p0)) {
            z = false;
        }
        S(z, false);
        d0();
    }

    public abstract m22 U(Context context, o93 o93Var, LocalDate localDate);

    public abstract LocalDate V(LocalDate localDate, int i);

    public abstract LocalDate W(LocalDate localDate);

    public abstract LocalDate X(LocalDate localDate);

    public final LocalDate Y(LocalDate localDate) {
        if (localDate.isBefore(this.q0)) {
            return this.q0;
        }
        if (localDate.isAfter(this.r0)) {
            return this.r0;
        }
        return TimeDateUtil.isFuture(localDate) ? LocalDate.now() : localDate;
    }

    public abstract int Z(LocalDate localDate, LocalDate localDate2, int i);

    public final void a0(Context context) {
        this.j0 = context;
        setBackgroundColor(this.k0.I);
        addOnPageChangeListener(new a());
        LocalDate localDate = new LocalDate();
        this.o0 = localDate;
        this.s0 = localDate;
        b0(localDate);
    }

    public final void b0(LocalDate localDate) {
        o93 o93Var = this.k0;
        String str = o93Var.L;
        String str2 = o93Var.M;
        try {
            this.q0 = new LocalDate(str);
            LocalDate localDate2 = new LocalDate(str2);
            this.r0 = localDate2;
            if (this.q0.isAfter(localDate2)) {
                throw new RuntimeException("startDate必须在endDate之前");
            }
            if (this.q0.isBefore(new LocalDate("1901-01-01"))) {
                throw new RuntimeException("startDate必须在1901-01-01之后");
            }
            if (this.r0.isAfter(new LocalDate("2099-12-31"))) {
                throw new RuntimeException("endDate必须在2099-12-31之前");
            }
            m22 m22VarU = U(this.j0, this.k0, localDate);
            int iA = m22VarU.a();
            setAdapter(m22VarU);
            if (iA == 0) {
                post(new b());
            }
            setCurrentItem(iA);
        } catch (Exception unused) {
            throw new RuntimeException(" yyyy-MM-dd 格式的日期");
        }
    }

    public boolean c0(LocalDate localDate) {
        return (localDate.isBefore(this.q0) || localDate.isAfter(this.r0)) ? false : true;
    }

    public void d0() {
        if (this.l0 == null) {
            this.l0 = (BaseCalendarView) findViewWithTag(Integer.valueOf(getCurrentItem()));
        }
        BaseCalendarView baseCalendarView = this.l0;
        if (baseCalendarView != null) {
            boolean z = this.k0.K || baseCalendarView.a(this.p0);
            BaseCalendarView baseCalendarView2 = this.l0;
            baseCalendarView2.e(baseCalendarView2.a(this.p0) ? this.p0 : this.o0, z);
        }
        if (this.m0 == null) {
            this.m0 = (BaseCalendarView) findViewWithTag(Integer.valueOf(getCurrentItem() - 1));
        }
        BaseCalendarView baseCalendarView3 = this.m0;
        if (baseCalendarView3 != null) {
            boolean z2 = this.k0.K || baseCalendarView3.a(this.p0);
            BaseCalendarView baseCalendarView4 = this.m0;
            baseCalendarView4.e(Y(baseCalendarView4.a(this.p0) ? this.p0 : W(this.o0)), z2);
        }
        if (this.n0 == null) {
            this.n0 = (BaseCalendarView) findViewWithTag(Integer.valueOf(getCurrentItem() + 1));
        }
        BaseCalendarView baseCalendarView5 = this.n0;
        if (baseCalendarView5 != null) {
            boolean z3 = this.k0.K || baseCalendarView5.a(this.p0);
            BaseCalendarView baseCalendarView6 = this.n0;
            baseCalendarView6.e(Y(baseCalendarView6.a(this.p0) ? this.p0 : X(this.o0)), z3);
        }
    }

    public void e0(LocalDate localDate, int i) {
        f0(localDate, i, true);
    }

    public void f0(LocalDate localDate, int i, boolean z) {
        if (TimeDateUtil.isFuture(localDate)) {
            return;
        }
        this.p0 = localDate;
        this.o0 = localDate;
        S(true, z);
        if (i != 0) {
            L(getCurrentItem() + i, Math.abs(i) == 1);
        } else {
            d0();
        }
    }

    public void g0(LocalDate localDate) {
        Toast.makeText(getContext(), TextUtils.isEmpty(this.k0.P) ? "不可用" : this.k0.P, 0).show();
    }

    public y93 getCalendarPainter() {
        return this.u0;
    }

    public LocalDate getEndDate() {
        return this.r0;
    }

    public LocalDate getStartDate() {
        return this.q0;
    }

    public abstract void h0(LocalDate localDate, boolean z);

    public void i0(LocalDate localDate, boolean z) {
    }

    public void setCalendarPainter(q22 q22Var) {
        this.u0 = q22Var;
    }

    public void setInitializeDate(String str) {
        try {
            LocalDate localDate = new LocalDate(str);
            this.o0 = localDate;
            this.s0 = localDate;
            b0(localDate);
        } catch (Exception unused) {
            throw new RuntimeException("setInitializeDate的参数需要 yyyy-MM-dd 格式的日期");
        }
    }

    public void setOnClickDisableDateListener(w7h w7hVar) {
    }

    public void setOnYearMonthChangeListener(lah lahVar) {
    }
}
