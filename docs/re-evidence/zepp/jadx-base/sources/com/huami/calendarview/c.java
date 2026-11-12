package com.huami.calendarview;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import com.autonavi.base.amap.mapcore.tools.GLMapStaticValue;
import com.huami.femalehealth.uilib.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class c {
    public static final int J0 = 1;
    public static final int K0 = 2;
    public static final int L0 = 7;
    public static final int M0 = 0;
    public static final int N0 = 1;
    public static final int O0 = 2;
    public static final int P0 = 0;
    public static final int Q0 = 1;
    public static final int R0 = 2;
    public static final int S0 = 0;
    public static final int T0 = 1;
    public static final int U0 = 2;
    public static final int V0 = 3;
    public static final int W0 = 1900;
    private static final int X0 = 2099;
    private int A;
    public CalendarView.OnYearViewChangeListener A0;
    private int B;
    public Calendar B0;
    private int C;
    public Calendar C0;
    private int D;
    private int E;
    private int E0;
    private int F;
    public Calendar F0;
    private int G;
    public Calendar G0;
    private int H;
    private int H0;
    private int I;
    private int I0;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private String P;
    private Class<?> Q;
    private String R;
    private Class<?> S;
    private String T;
    private Class<?> U;
    private String V;
    private Class<?> W;
    public boolean X;
    private String Y;
    private int Z;
    private int a0;
    private int b0;
    private int c0;
    private int d;
    private int d0;
    private int e;
    private int e0;
    private int f;
    private int f0;
    private int g;
    private int g0;
    private int h;
    private int h0;
    private int i;
    private boolean i0;
    private int j;
    private int j0;
    private int k;
    private Calendar k0;
    private int l;
    private boolean l0;
    private int m;
    private boolean m0;
    private int n;
    private boolean n0;
    private int o;
    public int o0;
    private int p;
    public Map<String, Calendar> p0;
    private int q;
    public CalendarView.OnCalendarInterceptListener q0;
    private int r;
    public CalendarView.OnCalendarSelectListener r0;
    private boolean s;
    public CalendarView.OnCalendarRangeSelectListener s0;
    private int t;
    public CalendarView.OnCalendarMultiSelectListener t0;
    private int u;
    public CalendarView.OnCalendarLongClickListener u0;
    private int v;
    public CalendarView.h v0;
    private int w;
    public CalendarView.OnYearChangeListener w0;
    private int x;
    public CalendarView.OnMonthChangeListener x0;
    private int y;
    public CalendarView.OnWeekChangeListener y0;
    private int z;
    public CalendarView.OnViewChangeListener z0;
    private boolean a = false;
    private int b = 1971;
    private int c = GLMapStaticValue.MAP_PARAMETERNAME_POLYGON_FILL_CONTROL;
    public Map<String, Calendar> D0 = new HashMap();

    public c(Context context, @Nullable AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CalendarView);
        LunarCalendar.h(context);
        this.t = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.CalendarView_calendar_padding, 0.0f);
        this.k = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_scheme_text_color, -1);
        int i = R.styleable.CalendarView_scheme_lunar_text_color;
        int i2 = R.color.s3;
        this.l = typedArrayObtainStyledAttributes.getColor(i, ContextCompat.getColor(context, i2));
        this.N = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_scheme_theme_color, 1355796431);
        this.P = typedArrayObtainStyledAttributes.getString(R.styleable.CalendarView_month_view);
        this.T = typedArrayObtainStyledAttributes.getString(R.styleable.CalendarView_year_view);
        this.R = typedArrayObtainStyledAttributes.getString(R.styleable.CalendarView_week_view);
        this.V = typedArrayObtainStyledAttributes.getString(R.styleable.CalendarView_week_bar_view);
        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CalendarView_week_text_size, b.c(context, 12.0f));
        this.j0 = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.CalendarView_week_bar_height, b.c(context, 40.0f));
        this.L = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.CalendarView_week_line_margin, b.c(context, 0.0f));
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.CalendarView_scheme_text);
        this.Y = string;
        if (TextUtils.isEmpty(string)) {
            this.Y = "记";
        }
        this.l0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CalendarView_month_view_scrollable, true);
        this.m0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CalendarView_week_view_scrollable, true);
        this.n0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CalendarView_year_view_scrollable, true);
        this.d = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_month_view_auto_select_day, 0);
        this.f = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_month_view_show_mode, 0);
        this.e = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_week_start_with, 1);
        this.g = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_select_mode, 0);
        this.E0 = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_max_multi_select_size, Integer.MAX_VALUE);
        this.H0 = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_min_select_range, -1);
        int i3 = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_max_select_range, -1);
        this.I0 = i3;
        L0(this.H0, i3);
        this.K = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_week_background, -1);
        this.I = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_week_line_background, 0);
        this.J = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_year_view_background, -1);
        this.j = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_week_text_color, -13421773);
        this.h = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_current_day_text_color, SupportMenu.CATEGORY_MASK);
        this.i = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_current_day_lunar_text_color, SupportMenu.CATEGORY_MASK);
        this.O = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_selected_theme_color, 1355796431);
        this.o = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_selected_text_color, -15658735);
        this.p = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_selected_lunar_text_color, -15658735);
        this.n = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_current_month_text_color, -15658735);
        this.m = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_other_month_text_color, ContextCompat.getColor(context, i2));
        this.q = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_current_month_lunar_text_color, ContextCompat.getColor(context, i2));
        this.r = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_other_month_lunar_text_color, ContextCompat.getColor(context, i2));
        this.Z = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_min_year, this.b);
        this.a0 = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_max_year, this.c);
        this.b0 = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_min_year_month, 1);
        this.c0 = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_max_year_month, 12);
        this.d0 = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_min_year_day, 1);
        this.e0 = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_max_year_day, -1);
        this.f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CalendarView_day_text_size, b.c(context, 16.0f));
        this.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CalendarView_lunar_text_size, b.c(context, 10.0f));
        this.h0 = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.CalendarView_calendar_height, b.c(context, 56.0f));
        this.i0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CalendarView_calendar_match_parent, false);
        this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CalendarView_year_view_month_text_size, b.c(context, 18.0f));
        this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CalendarView_year_view_day_text_size, b.c(context, 7.0f));
        this.C = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_year_view_month_text_color, -15658735);
        this.D = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_year_view_day_text_color, -15658735);
        this.E = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_year_view_scheme_color, this.N);
        this.H = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_year_view_week_text_color, -13421773);
        this.G = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_year_view_current_day_text_color, this.h);
        this.F = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_year_view_select_text_color, -13421773);
        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CalendarView_year_view_week_text_size, b.c(context, 8.0f));
        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CalendarView_year_view_month_height, b.c(context, 32.0f));
        this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CalendarView_year_view_week_height, b.c(context, 0.0f));
        this.z = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.CalendarView_year_view_padding, b.c(context, 6.0f));
        this.A = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.CalendarView_year_view_month_margin_top, b.c(context, 4.0f));
        this.B = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.CalendarView_year_view_month_margin_bottom, b.c(context, 4.0f));
        if (this.Z <= 1900) {
            this.Z = 1900;
        }
        if (this.a0 >= X0) {
            this.a0 = X0;
        }
        typedArrayObtainStyledAttributes.recycle();
        p0();
    }

    private void G0(int i, int i2, int i3, int i4) {
        this.Z = i;
        this.b0 = i2;
        this.a0 = i3;
        this.c0 = i4;
        if (i3 < this.k0.getYear()) {
            this.a0 = this.k0.getYear();
        }
        if (this.e0 == -1) {
            this.e0 = b.g(this.a0, this.c0);
        }
        if (this.a) {
            this.o0 = ((this.a0 - this.k0.getYear()) * 12) + (12 - this.k0.getMonth());
        } else {
            this.o0 = (((this.k0.getYear() - this.Z) * 12) + this.k0.getMonth()) - this.b0;
        }
    }

    private void p0() {
        Class<?> cls;
        Class<?> cls2;
        this.k0 = new Calendar();
        Date date = new Date();
        this.k0.setYear(b.d("yyyy", date));
        this.k0.setMonth(b.d("MM", date));
        this.k0.setDay(b.d("dd", date));
        this.k0.setCurrentDay(true);
        LunarCalendar.setupLunarCalendar(this.k0);
        G0(this.Z, this.b0, this.a0, this.c0);
        try {
            if (TextUtils.isEmpty(this.V)) {
                cls2 = WeekBar.class;
                this.W = cls2;
            } else {
                cls2 = Class.forName(this.V);
            }
            this.W = cls2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (TextUtils.isEmpty(this.T)) {
                cls = DefaultYearView.class;
                this.U = cls;
            } else {
                cls = Class.forName(this.T);
            }
            this.U = cls;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            this.Q = TextUtils.isEmpty(this.P) ? DefaultMonthView.class : Class.forName(this.P);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        try {
            this.S = TextUtils.isEmpty(this.R) ? DefaultWeekView.class : Class.forName(this.R);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public int A() {
        return this.d0;
    }

    public void A0(int i) {
        this.E0 = i;
    }

    public int B() {
        return this.b0;
    }

    public void B0(Class<?> cls) {
        this.Q = cls;
    }

    public Class<?> C() {
        return this.Q;
    }

    public void C0(boolean z) {
        this.l0 = z;
    }

    public int D() {
        return this.f;
    }

    public void D0(int i) {
        this.f = i;
    }

    public int E() {
        return this.r;
    }

    public void E0(boolean z) {
        this.s = z;
    }

    public int F() {
        return this.m;
    }

    public void F0(boolean z) {
        this.a = z;
    }

    public int G() {
        return this.l;
    }

    public String H() {
        return this.Y;
    }

    public void H0(int i, int i2, int i3, int i4, int i5, int i6) {
        this.Z = i;
        this.b0 = i2;
        this.d0 = i3;
        this.a0 = i4;
        this.c0 = i5;
        this.e0 = i6;
        if (i6 == -1) {
            this.e0 = b.g(i4, i5);
        }
        if (this.a) {
            this.o0 = ((this.a0 - this.k0.getYear()) * 12) + (12 - this.k0.getMonth());
        } else {
            this.o0 = (((this.k0.getYear() - this.Z) * 12) + this.k0.getMonth()) - this.b0;
        }
    }

    public int I() {
        return this.k;
    }

    public void I0(int i, int i2, int i3) {
        this.N = i;
        this.k = i2;
        this.l = i3;
    }

    public int J() {
        return this.N;
    }

    public void J0(int i, int i2, int i3) {
        this.O = i;
        this.o = i2;
        this.p = i3;
    }

    public final List<Calendar> K() {
        if (this.g != 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.F0 != null && this.G0 != null) {
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.set(this.F0.getYear(), this.F0.getMonth() - 1, this.F0.getDay());
            calendar.set(this.G0.getYear(), this.G0.getMonth() - 1, this.G0.getDay());
            long timeInMillis = calendar.getTimeInMillis();
            for (long timeInMillis2 = calendar.getTimeInMillis(); timeInMillis2 <= timeInMillis; timeInMillis2 += 86400000) {
                calendar.setTimeInMillis(timeInMillis2);
                Calendar calendar2 = new Calendar();
                calendar2.setYear(calendar.get(1));
                calendar2.setMonth(calendar.get(2) + 1);
                calendar2.setDay(calendar.get(5));
                LunarCalendar.setupLunarCalendar(calendar2);
                U0(calendar2);
                CalendarView.OnCalendarInterceptListener onCalendarInterceptListener = this.q0;
                if (onCalendarInterceptListener == null || !onCalendarInterceptListener.onCalendarIntercept(calendar2)) {
                    arrayList.add(calendar2);
                }
            }
            b(arrayList);
        }
        return arrayList;
    }

    public void K0(int i) {
        this.g = i;
    }

    public int L() {
        return this.g;
    }

    public final void L0(int i, int i2) {
        if (i > i2 && i2 > 0) {
            this.I0 = i;
            this.H0 = i;
            return;
        }
        if (i <= 0) {
            this.H0 = -1;
        } else {
            this.H0 = i;
        }
        if (i2 <= 0) {
            this.I0 = -1;
        } else {
            this.I0 = i2;
        }
    }

    public int M() {
        return this.p;
    }

    public void M0(int i, int i2, int i3, int i4, int i5) {
        this.h = i;
        this.m = i3;
        this.n = i2;
        this.q = i4;
        this.r = i5;
    }

    public int N() {
        return this.o;
    }

    public void N0(int i, int i2) {
        this.O = i;
        this.N = i2;
    }

    public int O() {
        return this.O;
    }

    public void O0(Class<?> cls) {
        this.W = cls;
    }

    public int P() {
        return this.K;
    }

    public void P0(int i) {
        this.e = i;
    }

    public Class<?> Q() {
        return this.W;
    }

    public void Q0(Class<?> cls) {
        this.S = cls;
    }

    public int R() {
        return this.j0;
    }

    public void R0(boolean z) {
        this.m0 = z;
    }

    public int S() {
        return this.I;
    }

    public void S0(boolean z) {
        this.n0 = z;
    }

    public int T() {
        return this.L;
    }

    public void T0(int i, int i2, int i3) {
        this.C = i;
        this.D = i2;
        this.E = i3;
    }

    public int U() {
        return this.e;
    }

    public final void U0(Calendar calendar) {
        Map<String, Calendar> map;
        if (calendar == null || (map = this.p0) == null || map.size() == 0) {
            return;
        }
        String string = calendar.toString();
        if (this.p0.containsKey(string)) {
            calendar.b(this.p0.get(string), H());
        }
    }

    public int V() {
        return this.j;
    }

    public void V0() {
        Date date = new Date();
        this.k0.setYear(b.d("yyyy", date));
        this.k0.setMonth(b.d("MM", date));
        this.k0.setDay(b.d("dd", date));
        LunarCalendar.setupLunarCalendar(this.k0);
    }

    public int W() {
        return this.M;
    }

    public final void W0() {
        Map<String, Calendar> map = this.p0;
        if (map == null || map.size() <= 0) {
            d();
            return;
        }
        String string = this.B0.toString();
        if (this.p0.containsKey(string)) {
            this.B0.b(this.p0.get(string), H());
        }
    }

    public Class<?> X() {
        return this.S;
    }

    public int Y() {
        return this.J;
    }

    public Class<?> Z() {
        return this.U;
    }

    public final void a(Map<String, Calendar> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        if (this.p0 == null) {
            this.p0 = new HashMap();
        }
        for (String str : map.keySet()) {
            this.p0.remove(str);
            Calendar calendar = map.get(str);
            if (calendar != null) {
                this.p0.put(str, calendar);
            }
        }
    }

    public String a0() {
        return this.T;
    }

    public final void b(List<Calendar> list) {
        Map<String, Calendar> map = this.p0;
        if (map == null || map.size() == 0) {
            return;
        }
        for (Calendar calendar : list) {
            if (this.p0.containsKey(calendar.toString())) {
                Calendar calendar2 = this.p0.get(calendar.toString());
                if (calendar2 != null) {
                    calendar.setScheme(TextUtils.isEmpty(calendar2.getScheme()) ? H() : calendar2.getScheme());
                    calendar.setSchemeColor(calendar2.getSchemeColor());
                    calendar.setSchemes(calendar2.getSchemes());
                }
            } else {
                calendar.setScheme("");
                calendar.setSchemeColor(0);
                calendar.setSchemes(null);
            }
        }
    }

    public int b0() {
        return this.G;
    }

    public final void c() {
        this.F0 = null;
        this.G0 = null;
    }

    public int c0() {
        return this.D;
    }

    public void d() {
        this.B0.a();
    }

    public int d0() {
        return this.v;
    }

    public Calendar e() {
        Calendar calendar = new Calendar();
        calendar.setYear(this.k0.getYear());
        calendar.setWeek(this.k0.getWeek());
        calendar.setMonth(this.k0.getMonth());
        calendar.setDay(this.k0.getDay());
        calendar.setCurrentDay(true);
        LunarCalendar.setupLunarCalendar(calendar);
        return calendar;
    }

    public int e0() {
        return this.x;
    }

    public int f() {
        return this.h0;
    }

    public int f0() {
        return this.B;
    }

    public int g() {
        return this.t;
    }

    public int g0() {
        return this.A;
    }

    public int h() {
        return this.i;
    }

    public int h0() {
        return this.C;
    }

    public int i() {
        return this.h;
    }

    public int i0() {
        return this.u;
    }

    public Calendar j() {
        return this.k0;
    }

    public int j0() {
        return this.z;
    }

    public int k() {
        return this.q;
    }

    public int k0() {
        return this.E;
    }

    public int l() {
        return this.n;
    }

    public int l0() {
        return this.F;
    }

    public int m() {
        return this.f0;
    }

    public int m0() {
        return this.y;
    }

    public int n() {
        return this.d;
    }

    public int n0() {
        return this.H;
    }

    public int o() {
        return this.c;
    }

    public int o0() {
        return this.w;
    }

    public int p() {
        return this.b;
    }

    public int q() {
        return this.g0;
    }

    public boolean q0() {
        return this.i0;
    }

    public int r() {
        return this.E0;
    }

    public boolean r0() {
        return this.l0;
    }

    public final Calendar s() {
        Calendar calendar = new Calendar();
        calendar.setYear(this.a0);
        calendar.setMonth(this.c0);
        calendar.setDay(this.e0);
        calendar.setCurrentDay(calendar.equals(this.k0));
        LunarCalendar.setupLunarCalendar(calendar);
        return calendar;
    }

    public boolean s0() {
        return this.s;
    }

    public int t() {
        return this.I0;
    }

    public boolean t0() {
        return this.a;
    }

    public int u() {
        return this.a0;
    }

    public boolean u0() {
        return this.m0;
    }

    public int v() {
        return this.e0;
    }

    public boolean v0() {
        return this.n0;
    }

    public int w() {
        return this.c0;
    }

    public void w0(int i) {
        this.h0 = i;
    }

    public final Calendar x() {
        Calendar calendar = new Calendar();
        calendar.setYear(this.Z);
        calendar.setMonth(this.b0);
        calendar.setDay(this.d0);
        calendar.setCurrentDay(calendar.equals(this.k0));
        LunarCalendar.setupLunarCalendar(calendar);
        return calendar;
    }

    public void x0(int i) {
        this.d = i;
    }

    public int y() {
        return this.H0;
    }

    public void y0(int i) {
        this.c = i;
    }

    public int z() {
        return this.Z;
    }

    public void z0(int i) {
        this.b = i;
    }
}
