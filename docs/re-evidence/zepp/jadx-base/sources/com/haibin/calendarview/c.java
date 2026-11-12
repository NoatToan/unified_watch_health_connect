package com.haibin.calendarview;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import com.autonavi.base.amap.mapcore.tools.GLMapStaticValue;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class c {
    public static final int G0 = 1;
    public static final int H0 = 2;
    public static final int I0 = 7;
    public static final int J0 = 0;
    public static final int K0 = 1;
    public static final int L0 = 2;
    public static final int M0 = 0;
    public static final int N0 = 1;
    public static final int O0 = 2;
    public static final int P0 = 0;
    public static final int Q0 = 1;
    public static final int R0 = 2;
    public static final int S0 = 3;
    public static final int T0 = 1900;
    private static final int U0 = 2099;
    private int A;
    public Map<String, Calendar> A0 = new HashMap();
    private int B;
    private int B0;
    private int C;
    public Calendar C0;
    private int D;
    public Calendar D0;
    private int E;
    private int E0;
    private int F;
    private int F0;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private String M;
    private Class<?> N;
    private String O;
    private Class<?> P;
    private String Q;
    private Class<?> R;
    private String S;
    private Class<?> T;
    public boolean U;
    private String V;
    private int W;
    private int X;
    private int Y;
    private int Z;
    private int a;
    private int a0;
    private int b;
    private int b0;
    private int c;
    private int c0;
    private int d;
    private int d0;
    private int e;
    private int e0;
    private int f;
    private boolean f0;
    private int g;
    private int g0;
    private int h;
    private Calendar h0;
    private int i;
    private boolean i0;
    private int j;
    private boolean j0;
    private int k;
    private boolean k0;
    private int l;
    public int l0;
    private int m;
    public Map<String, Calendar> m0;
    private int n;
    public CalendarView.OnCalendarInterceptListener n0;
    private int o;
    public CalendarView.OnCalendarSelectListener o0;
    private boolean p;
    public CalendarView.OnCalendarRangeSelectListener p0;
    private int q;
    public CalendarView.OnCalendarMultiSelectListener q0;
    private int r;
    public CalendarView.OnCalendarLongClickListener r0;
    private int s;
    public CalendarView.h s0;
    private int t;
    public CalendarView.OnYearChangeListener t0;
    private int u;
    public CalendarView.OnMonthChangeListener u0;
    private int v;
    public CalendarView.OnWeekChangeListener v0;
    private int w;
    public CalendarView.OnViewChangeListener w0;
    private int x;
    public CalendarView.OnYearViewChangeListener x0;
    private int y;
    public Calendar y0;
    private int z;
    public Calendar z0;

    public c(Context context, @Nullable AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CalendarView);
        LunarCalendar.h(context);
        this.q = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.CalendarView_calendar_padding, 0.0f);
        this.h = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_scheme_text_color, -1);
        this.i = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_scheme_lunar_text_color, -1973791);
        this.K = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_scheme_theme_color, 1355796431);
        this.M = typedArrayObtainStyledAttributes.getString(R.styleable.CalendarView_month_view);
        this.Q = typedArrayObtainStyledAttributes.getString(R.styleable.CalendarView_year_view);
        this.O = typedArrayObtainStyledAttributes.getString(R.styleable.CalendarView_week_view);
        this.S = typedArrayObtainStyledAttributes.getString(R.styleable.CalendarView_week_bar_view);
        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CalendarView_week_text_size, b.c(context, 12.0f));
        this.g0 = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.CalendarView_week_bar_height, b.c(context, 40.0f));
        this.I = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.CalendarView_week_line_margin, b.c(context, 0.0f));
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.CalendarView_scheme_text);
        this.V = string;
        if (TextUtils.isEmpty(string)) {
            this.V = "记";
        }
        this.i0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CalendarView_month_view_scrollable, true);
        this.j0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CalendarView_week_view_scrollable, true);
        this.k0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CalendarView_year_view_scrollable, true);
        this.a = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_month_view_auto_select_day, 0);
        this.c = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_month_view_show_mode, 0);
        this.b = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_week_start_with, 1);
        this.d = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_select_mode, 0);
        this.B0 = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_max_multi_select_size, Integer.MAX_VALUE);
        this.E0 = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_min_select_range, -1);
        int i = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_max_select_range, -1);
        this.F0 = i;
        F0(this.E0, i);
        this.H = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_week_background, -1);
        this.F = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_week_line_background, 0);
        this.G = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_year_view_background, -1);
        this.g = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_week_text_color, -13421773);
        this.e = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_current_day_text_color, SupportMenu.CATEGORY_MASK);
        this.f = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_current_day_lunar_text_color, SupportMenu.CATEGORY_MASK);
        this.L = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_selected_theme_color, 1355796431);
        this.l = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_selected_text_color, -15658735);
        this.m = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_selected_lunar_text_color, -15658735);
        this.k = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_current_month_text_color, -15658735);
        this.j = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_other_month_text_color, -1973791);
        this.n = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_current_month_lunar_text_color, -1973791);
        this.o = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_other_month_lunar_text_color, -1973791);
        this.W = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_min_year, 1971);
        this.X = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_max_year, GLMapStaticValue.MAP_PARAMETERNAME_POLYGON_FILL_CONTROL);
        this.Y = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_min_year_month, 1);
        this.Z = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_max_year_month, 12);
        this.a0 = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_min_year_day, 1);
        this.b0 = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarView_max_year_day, -1);
        this.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CalendarView_day_text_size, b.c(context, 16.0f));
        this.d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CalendarView_lunar_text_size, b.c(context, 10.0f));
        this.e0 = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.CalendarView_calendar_height, b.c(context, 56.0f));
        this.f0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CalendarView_calendar_match_parent, false);
        this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CalendarView_year_view_month_text_size, b.c(context, 18.0f));
        this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CalendarView_year_view_day_text_size, b.c(context, 7.0f));
        this.z = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_year_view_month_text_color, -15658735);
        this.A = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_year_view_day_text_color, -15658735);
        this.B = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_year_view_scheme_color, this.K);
        this.E = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_year_view_week_text_color, -13421773);
        this.D = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_year_view_current_day_text_color, this.e);
        this.C = typedArrayObtainStyledAttributes.getColor(R.styleable.CalendarView_year_view_select_text_color, -13421773);
        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CalendarView_year_view_week_text_size, b.c(context, 8.0f));
        this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CalendarView_year_view_month_height, b.c(context, 32.0f));
        this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CalendarView_year_view_week_height, b.c(context, 0.0f));
        this.w = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.CalendarView_year_view_padding, b.c(context, 6.0f));
        this.x = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.CalendarView_year_view_month_margin_top, b.c(context, 4.0f));
        this.y = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.CalendarView_year_view_month_margin_bottom, b.c(context, 4.0f));
        if (this.W <= 1900) {
            this.W = 1900;
        }
        if (this.X >= U0) {
            this.X = U0;
        }
        typedArrayObtainStyledAttributes.recycle();
        n0();
    }

    private void A0(int i, int i2, int i3, int i4) {
        this.W = i;
        this.Y = i2;
        this.X = i3;
        this.Z = i4;
        if (i3 < this.h0.getYear()) {
            this.X = this.h0.getYear();
        }
        if (this.b0 == -1) {
            this.b0 = b.g(this.X, this.Z);
        }
        this.l0 = (((this.h0.getYear() - this.W) * 12) + this.h0.getMonth()) - this.Y;
    }

    private void n0() {
        Class<?> cls;
        Class<?> cls2;
        this.h0 = new Calendar();
        Date date = new Date();
        this.h0.setYear(b.d("yyyy", date));
        this.h0.setMonth(b.d("MM", date));
        this.h0.setDay(b.d("dd", date));
        this.h0.setCurrentDay(true);
        LunarCalendar.setupLunarCalendar(this.h0);
        A0(this.W, this.Y, this.X, this.Z);
        try {
            if (TextUtils.isEmpty(this.S)) {
                cls2 = WeekBar.class;
                this.T = cls2;
            } else {
                cls2 = Class.forName(this.S);
            }
            this.T = cls2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (TextUtils.isEmpty(this.Q)) {
                cls = DefaultYearView.class;
                this.R = cls;
            } else {
                cls = Class.forName(this.Q);
            }
            this.R = cls;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            this.N = TextUtils.isEmpty(this.M) ? DefaultMonthView.class : Class.forName(this.M);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        try {
            this.P = TextUtils.isEmpty(this.O) ? DefaultWeekView.class : Class.forName(this.O);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public Class<?> A() {
        return this.N;
    }

    public int B() {
        return this.c;
    }

    public void B0(int i, int i2, int i3, int i4, int i5, int i6) {
        this.W = i;
        this.Y = i2;
        this.a0 = i3;
        this.X = i4;
        this.Z = i5;
        this.b0 = i6;
        if (i6 == -1) {
            this.b0 = b.g(i4, i5);
        }
        this.l0 = (((this.h0.getYear() - this.W) * 12) + this.h0.getMonth()) - this.Y;
    }

    public int C() {
        return this.o;
    }

    public void C0(int i, int i2, int i3) {
        this.K = i;
        this.h = i2;
        this.i = i3;
    }

    public int D() {
        return this.j;
    }

    public void D0(int i, int i2, int i3) {
        this.L = i;
        this.l = i2;
        this.m = i3;
    }

    public int E() {
        return this.i;
    }

    public void E0(int i) {
        this.d = i;
    }

    public String F() {
        return this.V;
    }

    public final void F0(int i, int i2) {
        if (i > i2 && i2 > 0) {
            this.F0 = i;
            this.E0 = i;
            return;
        }
        if (i <= 0) {
            this.E0 = -1;
        } else {
            this.E0 = i;
        }
        if (i2 <= 0) {
            this.F0 = -1;
        } else {
            this.F0 = i2;
        }
    }

    public int G() {
        return this.h;
    }

    public void G0(int i, int i2, int i3, int i4, int i5) {
        this.e = i;
        this.j = i3;
        this.k = i2;
        this.n = i4;
        this.o = i5;
    }

    public int H() {
        return this.K;
    }

    public void H0(int i, int i2) {
        this.L = i;
        this.K = i2;
    }

    public final List<Calendar> I() {
        if (this.d != 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.C0 != null && this.D0 != null) {
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.set(this.C0.getYear(), this.C0.getMonth() - 1, this.C0.getDay());
            calendar.set(this.D0.getYear(), this.D0.getMonth() - 1, this.D0.getDay());
            long timeInMillis = calendar.getTimeInMillis();
            for (long timeInMillis2 = calendar.getTimeInMillis(); timeInMillis2 <= timeInMillis; timeInMillis2 += 86400000) {
                calendar.setTimeInMillis(timeInMillis2);
                Calendar calendar2 = new Calendar();
                calendar2.setYear(calendar.get(1));
                calendar2.setMonth(calendar.get(2) + 1);
                calendar2.setDay(calendar.get(5));
                LunarCalendar.setupLunarCalendar(calendar2);
                O0(calendar2);
                CalendarView.OnCalendarInterceptListener onCalendarInterceptListener = this.n0;
                if (onCalendarInterceptListener == null || !onCalendarInterceptListener.onCalendarIntercept(calendar2)) {
                    arrayList.add(calendar2);
                }
            }
            b(arrayList);
        }
        return arrayList;
    }

    public void I0(Class<?> cls) {
        this.T = cls;
    }

    public int J() {
        return this.d;
    }

    public void J0(int i) {
        this.b = i;
    }

    public int K() {
        return this.m;
    }

    public void K0(Class<?> cls) {
        this.P = cls;
    }

    public int L() {
        return this.l;
    }

    public void L0(boolean z) {
        this.j0 = z;
    }

    public int M() {
        return this.L;
    }

    public void M0(boolean z) {
        this.k0 = z;
    }

    public int N() {
        return this.H;
    }

    public void N0(int i, int i2, int i3) {
        this.z = i;
        this.A = i2;
        this.B = i3;
    }

    public Class<?> O() {
        return this.T;
    }

    public final void O0(Calendar calendar) {
        Map<String, Calendar> map;
        if (calendar == null || (map = this.m0) == null || map.size() == 0) {
            return;
        }
        String string = calendar.toString();
        if (this.m0.containsKey(string)) {
            calendar.b(this.m0.get(string), F());
        }
    }

    public int P() {
        return this.g0;
    }

    public void P0() {
        Date date = new Date();
        this.h0.setYear(b.d("yyyy", date));
        this.h0.setMonth(b.d("MM", date));
        this.h0.setDay(b.d("dd", date));
        LunarCalendar.setupLunarCalendar(this.h0);
    }

    public int Q() {
        return this.F;
    }

    public final void Q0() {
        Map<String, Calendar> map = this.m0;
        if (map == null || map.size() <= 0) {
            d();
            return;
        }
        String string = this.y0.toString();
        if (this.m0.containsKey(string)) {
            this.y0.b(this.m0.get(string), F());
        }
    }

    public int R() {
        return this.I;
    }

    public int S() {
        return this.b;
    }

    public int T() {
        return this.g;
    }

    public int U() {
        return this.J;
    }

    public Class<?> V() {
        return this.P;
    }

    public int W() {
        return this.G;
    }

    public Class<?> X() {
        return this.R;
    }

    public String Y() {
        return this.Q;
    }

    public int Z() {
        return this.D;
    }

    public final void a(Map<String, Calendar> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        if (this.m0 == null) {
            this.m0 = new HashMap();
        }
        for (String str : map.keySet()) {
            this.m0.remove(str);
            Calendar calendar = map.get(str);
            if (calendar != null) {
                this.m0.put(str, calendar);
            }
        }
    }

    public int a0() {
        return this.A;
    }

    public final void b(List<Calendar> list) {
        Map<String, Calendar> map = this.m0;
        if (map == null || map.size() == 0) {
            return;
        }
        for (Calendar calendar : list) {
            if (this.m0.containsKey(calendar.toString())) {
                Calendar calendar2 = this.m0.get(calendar.toString());
                if (calendar2 != null) {
                    calendar.setScheme(TextUtils.isEmpty(calendar2.getScheme()) ? F() : calendar2.getScheme());
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
        return this.s;
    }

    public final void c() {
        this.C0 = null;
        this.D0 = null;
    }

    public int c0() {
        return this.u;
    }

    public void d() {
        this.y0.a();
    }

    public int d0() {
        return this.y;
    }

    public Calendar e() {
        Calendar calendar = new Calendar();
        calendar.setYear(this.h0.getYear());
        calendar.setWeek(this.h0.getWeek());
        calendar.setMonth(this.h0.getMonth());
        calendar.setDay(this.h0.getDay());
        calendar.setCurrentDay(true);
        LunarCalendar.setupLunarCalendar(calendar);
        return calendar;
    }

    public int e0() {
        return this.x;
    }

    public int f() {
        return this.e0;
    }

    public int f0() {
        return this.z;
    }

    public int g() {
        return this.q;
    }

    public int g0() {
        return this.r;
    }

    public int h() {
        return this.f;
    }

    public int h0() {
        return this.w;
    }

    public int i() {
        return this.e;
    }

    public int i0() {
        return this.B;
    }

    public Calendar j() {
        return this.h0;
    }

    public int j0() {
        return this.C;
    }

    public int k() {
        return this.n;
    }

    public int k0() {
        return this.v;
    }

    public int l() {
        return this.k;
    }

    public int l0() {
        return this.E;
    }

    public int m() {
        return this.c0;
    }

    public int m0() {
        return this.t;
    }

    public int n() {
        return this.a;
    }

    public int o() {
        return this.d0;
    }

    public boolean o0() {
        return this.f0;
    }

    public int p() {
        return this.B0;
    }

    public boolean p0() {
        return this.i0;
    }

    public final Calendar q() {
        Calendar calendar = new Calendar();
        calendar.setYear(this.X);
        calendar.setMonth(this.Z);
        calendar.setDay(this.b0);
        calendar.setCurrentDay(calendar.equals(this.h0));
        LunarCalendar.setupLunarCalendar(calendar);
        return calendar;
    }

    public boolean q0() {
        return this.p;
    }

    public int r() {
        return this.F0;
    }

    public boolean r0() {
        return this.j0;
    }

    public int s() {
        return this.X;
    }

    public boolean s0() {
        return this.k0;
    }

    public int t() {
        return this.b0;
    }

    public void t0(int i) {
        this.e0 = i;
    }

    public int u() {
        return this.Z;
    }

    public void u0(int i) {
        this.a = i;
    }

    public final Calendar v() {
        Calendar calendar = new Calendar();
        calendar.setYear(this.W);
        calendar.setMonth(this.Y);
        calendar.setDay(this.a0);
        calendar.setCurrentDay(calendar.equals(this.h0));
        LunarCalendar.setupLunarCalendar(calendar);
        return calendar;
    }

    public void v0(int i) {
        this.B0 = i;
    }

    public int w() {
        return this.E0;
    }

    public void w0(Class<?> cls) {
        this.N = cls;
    }

    public int x() {
        return this.W;
    }

    public void x0(boolean z) {
        this.i0 = z;
    }

    public int y() {
        return this.a0;
    }

    public void y0(int i) {
        this.c = i;
    }

    public int z() {
        return this.Y;
    }

    public void z0(boolean z) {
        this.p = z;
    }
}
