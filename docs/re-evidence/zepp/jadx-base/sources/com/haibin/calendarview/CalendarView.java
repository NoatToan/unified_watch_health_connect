package com.haibin.calendarview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class CalendarView extends FrameLayout {
    private final com.haibin.calendarview.c a;
    private MonthViewPager b;
    private WeekViewPager c;
    private View d;
    private YearViewPager e;
    private WeekBar f;
    public CalendarLayout g;

    public interface OnCalendarInterceptListener {
        boolean onCalendarIntercept(Calendar calendar);

        void onCalendarInterceptClick(Calendar calendar, boolean z);
    }

    public interface OnCalendarLongClickListener {
        void onCalendarLongClick(Calendar calendar);

        void onCalendarLongClickOutOfRange(Calendar calendar);
    }

    public interface OnCalendarMultiSelectListener {
        void onCalendarMultiSelect(Calendar calendar, int i, int i2);

        void onCalendarMultiSelectOutOfRange(Calendar calendar);

        void onMultiSelectOutOfSize(Calendar calendar, int i);
    }

    public interface OnCalendarRangeSelectListener {
        void onCalendarRangeSelect(Calendar calendar, boolean z);

        void onCalendarSelectOutOfRange(Calendar calendar);

        void onSelectOutOfRange(Calendar calendar, boolean z);
    }

    public interface OnCalendarSelectListener {
        void onCalendarOutOfRange(Calendar calendar);

        void onCalendarSelect(Calendar calendar, boolean z);
    }

    public interface OnMonthChangeListener {
        void onMonthChange(int i, int i2);
    }

    public interface OnViewChangeListener {
        void onViewChange(boolean z);
    }

    public interface OnWeekChangeListener {
        void onWeekChange(List<Calendar> list);
    }

    public interface OnYearChangeListener {
        void onYearChange(int i);
    }

    public interface OnYearViewChangeListener {
        void onYearViewChange(boolean z);
    }

    public class a implements ViewPager.OnPageChangeListener {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (CalendarView.this.c.getVisibility() == 0 || CalendarView.this.a.t0 == null) {
                return;
            }
            CalendarView.this.a.t0.onYearChange(i + CalendarView.this.a.x());
        }
    }

    public class b implements h {
        public b() {
        }

        @Override // com.haibin.calendarview.CalendarView.h
        public void a(Calendar calendar, boolean z) {
            CalendarView.this.a.z0 = calendar;
            if (CalendarView.this.a.J() == 0 || z || CalendarView.this.a.z0.equals(CalendarView.this.a.y0)) {
                CalendarView.this.a.y0 = calendar;
            }
            int year = (((calendar.getYear() - CalendarView.this.a.x()) * 12) + CalendarView.this.a.z0.getMonth()) - CalendarView.this.a.z();
            CalendarView.this.c.v();
            CalendarView.this.b.setCurrentItem(year, false);
            CalendarView.this.b.y();
            if (CalendarView.this.f != null) {
                if (CalendarView.this.a.J() == 0 || z || CalendarView.this.a.z0.equals(CalendarView.this.a.y0)) {
                    CalendarView.this.f.onDateSelected(calendar, CalendarView.this.a.S(), z);
                }
            }
        }

        @Override // com.haibin.calendarview.CalendarView.h
        public void b(Calendar calendar, boolean z) {
            if (calendar.getYear() == CalendarView.this.a.j().getYear() && calendar.getMonth() == CalendarView.this.a.j().getMonth() && CalendarView.this.b.getCurrentItem() != CalendarView.this.a.l0) {
                return;
            }
            CalendarView.this.a.z0 = calendar;
            if (CalendarView.this.a.J() == 0 || z) {
                CalendarView.this.a.y0 = calendar;
            }
            CalendarView.this.c.t(CalendarView.this.a.z0, false);
            CalendarView.this.b.y();
            if (CalendarView.this.f != null) {
                if (CalendarView.this.a.J() == 0 || z) {
                    CalendarView.this.f.onDateSelected(calendar, CalendarView.this.a.S(), z);
                }
            }
        }
    }

    public class c implements YearRecyclerView.b {
        public c() {
        }

        @Override // com.haibin.calendarview.YearRecyclerView.b
        public void a(int i, int i2) {
            CalendarView.this.g((((i - CalendarView.this.a.x()) * 12) + i2) - CalendarView.this.a.z());
            CalendarView.this.a.U = false;
        }
    }

    public class d extends AnimatorListenerAdapter {
        public final /* synthetic */ int a;

        public d(int i) {
            this.a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            CalendarView.this.f.setVisibility(8);
            CalendarView.this.e.setVisibility(0);
            CalendarView.this.e.g(this.a, false);
            CalendarLayout calendarLayout = CalendarView.this.g;
            if (calendarLayout == null || calendarLayout.i == null) {
                return;
            }
            calendarLayout.expand();
        }
    }

    public class e extends AnimatorListenerAdapter {
        public e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (CalendarView.this.a.x0 != null) {
                CalendarView.this.a.x0.onYearViewChange(false);
            }
        }
    }

    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            CalendarView.this.f.setVisibility(0);
        }
    }

    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (CalendarView.this.a.x0 != null) {
                CalendarView.this.a.x0.onYearViewChange(true);
            }
            CalendarView calendarView = CalendarView.this;
            CalendarLayout calendarLayout = calendarView.g;
            if (calendarLayout != null) {
                calendarLayout.q();
                if (CalendarView.this.g.isExpand()) {
                    CalendarView.this.b.setVisibility(0);
                } else {
                    CalendarView.this.c.setVisibility(0);
                    CalendarView.this.g.shrink();
                }
            } else {
                calendarView.b.setVisibility(0);
            }
            CalendarView.this.b.clearAnimation();
        }
    }

    public interface h {
        void a(Calendar calendar, boolean z);

        void b(Calendar calendar, boolean z);
    }

    public CalendarView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i) {
        this.e.setVisibility(8);
        this.f.setVisibility(0);
        if (i == this.b.getCurrentItem()) {
            com.haibin.calendarview.c cVar = this.a;
            if (cVar.o0 != null && cVar.J() != 1) {
                com.haibin.calendarview.c cVar2 = this.a;
                cVar2.o0.onCalendarSelect(cVar2.y0, false);
            }
        } else {
            this.b.setCurrentItem(i, false);
        }
        this.f.animate().translationY(0.0f).setInterpolator(new LinearInterpolator()).setDuration(280L).setListener(new f());
        this.b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).setInterpolator(new LinearInterpolator()).setListener(new g());
    }

    private void h(Context context) {
        LayoutInflater.from(context).inflate(R.layout.cv_layout_calendar_view, (ViewGroup) this, true);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frameContent);
        WeekViewPager weekViewPager = (WeekViewPager) findViewById(R.id.vp_week);
        this.c = weekViewPager;
        weekViewPager.setup(this.a);
        try {
            this.f = (WeekBar) this.a.O().getConstructor(Context.class).newInstance(getContext());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        frameLayout.addView(this.f, 2);
        this.f.setup(this.a);
        this.f.onWeekStartChange(this.a.S());
        View viewFindViewById = findViewById(R.id.line);
        this.d = viewFindViewById;
        viewFindViewById.setBackgroundColor(this.a.Q());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams.setMargins(this.a.R(), this.a.P(), this.a.R(), 0);
        this.d.setLayoutParams(layoutParams);
        MonthViewPager monthViewPager = (MonthViewPager) findViewById(R.id.vp_month);
        this.b = monthViewPager;
        monthViewPager.h = this.c;
        monthViewPager.i = this.f;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) monthViewPager.getLayoutParams();
        layoutParams2.setMargins(0, this.a.P() + com.haibin.calendarview.b.c(context, 1.0f), 0, 0);
        this.c.setLayoutParams(layoutParams2);
        YearViewPager yearViewPager = (YearViewPager) findViewById(R.id.selectLayout);
        this.e = yearViewPager;
        yearViewPager.setBackgroundColor(this.a.W());
        this.e.addOnPageChangeListener(new a());
        this.a.s0 = new b();
        if (this.a.J() != 0) {
            this.a.y0 = new Calendar();
        } else if (isInRange(this.a.j())) {
            com.haibin.calendarview.c cVar = this.a;
            cVar.y0 = cVar.e();
        } else {
            com.haibin.calendarview.c cVar2 = this.a;
            cVar2.y0 = cVar2.v();
        }
        com.haibin.calendarview.c cVar3 = this.a;
        Calendar calendar = cVar3.y0;
        cVar3.z0 = calendar;
        this.f.onDateSelected(calendar, cVar3.S(), false);
        this.b.setup(this.a);
        this.b.setCurrentItem(this.a.l0);
        this.e.setOnMonthSelectedListener(new c());
        this.e.setup(this.a);
        this.c.t(this.a.e(), false);
    }

    private void i(int i) {
        CalendarLayout calendarLayout = this.g;
        if (calendarLayout != null && calendarLayout.i != null && !calendarLayout.isExpand()) {
            this.g.expand();
        }
        this.c.setVisibility(8);
        this.a.U = true;
        CalendarLayout calendarLayout2 = this.g;
        if (calendarLayout2 != null) {
            calendarLayout2.k();
        }
        this.f.animate().translationY(-this.f.getHeight()).setInterpolator(new LinearInterpolator()).setDuration(260L).setListener(new d(i));
        this.b.animate().scaleX(0.0f).scaleY(0.0f).setDuration(260L).setInterpolator(new LinearInterpolator()).setListener(new e());
    }

    private void setShowMode(int i) {
        if ((i == 0 || i == 1 || i == 2) && this.a.B() != i) {
            this.a.y0(i);
            this.c.u();
            this.b.z();
            this.c.k();
        }
    }

    private void setWeekStart(int i) {
        if ((i == 1 || i == 2 || i == 7) && i != this.a.S()) {
            this.a.J0(i);
            this.f.onWeekStartChange(i);
            this.f.onDateSelected(this.a.y0, i, false);
            this.c.x();
            this.b.B();
            this.e.k();
        }
    }

    public final void addSchemeDate(Calendar calendar) {
        if (calendar == null || !calendar.isAvailable()) {
            return;
        }
        com.haibin.calendarview.c cVar = this.a;
        if (cVar.m0 == null) {
            cVar.m0 = new HashMap();
        }
        this.a.m0.remove(calendar.toString());
        this.a.m0.put(calendar.toString(), calendar);
        this.a.Q0();
        this.e.h();
        this.b.x();
        this.c.r();
    }

    public final void clearMultiSelect() {
        this.a.A0.clear();
        this.b.j();
        this.c.f();
    }

    public final void clearSchemeDate() {
        com.haibin.calendarview.c cVar = this.a;
        cVar.m0 = null;
        cVar.d();
        this.e.h();
        this.b.x();
        this.c.r();
    }

    public final void clearSelectRange() {
        this.a.c();
        this.b.k();
        this.c.g();
    }

    public final void clearSingleSelect() {
        this.a.y0 = new Calendar();
        this.b.l();
        this.c.h();
    }

    public void closeYearSelectLayout() {
        if (this.e.getVisibility() == 8) {
            return;
        }
        g((((this.a.y0.getYear() - this.a.x()) * 12) + this.a.y0.getMonth()) - this.a.z());
        this.a.U = false;
    }

    public int getCurDay() {
        return this.a.j().getDay();
    }

    public int getCurMonth() {
        return this.a.j().getMonth();
    }

    public int getCurYear() {
        return this.a.j().getYear();
    }

    public List<Calendar> getCurrentMonthCalendars() {
        return this.b.getCurrentMonthCalendars();
    }

    public List<Calendar> getCurrentWeekCalendars() {
        return this.c.getCurrentWeekCalendars();
    }

    public final int getMaxMultiSelectSize() {
        return this.a.p();
    }

    public Calendar getMaxRangeCalendar() {
        return this.a.q();
    }

    public final int getMaxSelectRange() {
        return this.a.r();
    }

    public Calendar getMinRangeCalendar() {
        return this.a.v();
    }

    public final int getMinSelectRange() {
        return this.a.w();
    }

    public MonthViewPager getMonthViewPager() {
        return this.b;
    }

    public final List<Calendar> getMultiSelectCalendars() {
        ArrayList arrayList = new ArrayList();
        if (this.a.A0.size() == 0) {
            return arrayList;
        }
        arrayList.addAll(this.a.A0.values());
        Collections.sort(arrayList);
        return arrayList;
    }

    public final List<Calendar> getSelectCalendarRange() {
        return this.a.I();
    }

    public Calendar getSelectedCalendar() {
        return this.a.y0;
    }

    public WeekViewPager getWeekViewPager() {
        return this.c;
    }

    public final boolean isInRange(Calendar calendar) {
        com.haibin.calendarview.c cVar = this.a;
        return cVar != null && com.haibin.calendarview.b.C(calendar, cVar);
    }

    public boolean isSingleSelectMode() {
        return this.a.J() == 1;
    }

    public boolean isYearSelectLayoutVisible() {
        return this.e.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() == null || !(getParent() instanceof CalendarLayout)) {
            return;
        }
        CalendarLayout calendarLayout = (CalendarLayout) getParent();
        this.g = calendarLayout;
        this.b.g = calendarLayout;
        this.c.d = calendarLayout;
        calendarLayout.d = this.f;
        calendarLayout.setup(this.a);
        this.g.n();
    }

    public final boolean onCalendarIntercept(Calendar calendar) {
        OnCalendarInterceptListener onCalendarInterceptListener = this.a.n0;
        return onCalendarInterceptListener != null && onCalendarInterceptListener.onCalendarIntercept(calendar);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        com.haibin.calendarview.c cVar = this.a;
        if (cVar == null || !cVar.o0()) {
            super.onMeasure(i, i2);
        } else {
            setCalendarItemHeight((size - this.a.P()) / 6);
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        Parcelable parcelable2 = bundle.getParcelable("super");
        this.a.y0 = (Calendar) bundle.getSerializable("selected_calendar");
        this.a.z0 = (Calendar) bundle.getSerializable("index_calendar");
        com.haibin.calendarview.c cVar = this.a;
        OnCalendarSelectListener onCalendarSelectListener = cVar.o0;
        if (onCalendarSelectListener != null) {
            onCalendarSelectListener.onCalendarSelect(cVar.y0, false);
        }
        Calendar calendar = this.a.z0;
        if (calendar != null) {
            scrollToCalendar(calendar.getYear(), this.a.z0.getMonth(), this.a.z0.getDay());
        }
        update();
        super.onRestoreInstanceState(parcelable2);
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        if (this.a == null) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putSerializable("selected_calendar", this.a.y0);
        bundle.putSerializable("index_calendar", this.a.z0);
        return bundle;
    }

    public final void putMultiSelect(Calendar... calendarArr) {
        if (calendarArr == null || calendarArr.length == 0) {
            return;
        }
        for (Calendar calendar : calendarArr) {
            if (calendar != null && !this.a.A0.containsKey(calendar.toString())) {
                this.a.A0.put(calendar.toString(), calendar);
            }
        }
        update();
    }

    public final void removeMultiSelect(Calendar... calendarArr) {
        if (calendarArr == null || calendarArr.length == 0) {
            return;
        }
        for (Calendar calendar : calendarArr) {
            if (calendar != null && this.a.A0.containsKey(calendar.toString())) {
                this.a.A0.remove(calendar.toString());
            }
        }
        update();
    }

    public final void removeSchemeDate(Calendar calendar) {
        Map<String, Calendar> map;
        if (calendar == null || (map = this.a.m0) == null || map.size() == 0) {
            return;
        }
        this.a.m0.remove(calendar.toString());
        if (this.a.y0.equals(calendar)) {
            this.a.d();
        }
        this.e.h();
        this.b.x();
        this.c.r();
    }

    public void scrollToCalendar(int i, int i2, int i3) {
        scrollToCalendar(i, i2, i3, false, true);
    }

    public void scrollToCurrent() {
        scrollToCurrent(false);
    }

    public void scrollToNext() {
        scrollToNext(false);
    }

    public void scrollToPre() {
        scrollToPre(false);
    }

    public void scrollToSelectCalendar() {
        if (this.a.y0.isAvailable()) {
            scrollToCalendar(this.a.y0.getYear(), this.a.y0.getMonth(), this.a.y0.getDay(), false, true);
        }
    }

    public void scrollToYear(int i) {
        scrollToYear(i, false);
    }

    public void setAllMode() {
        setShowMode(0);
    }

    public void setBackground(int i, int i2, int i3) {
        this.f.setBackgroundColor(i2);
        this.e.setBackgroundColor(i);
        this.d.setBackgroundColor(i3);
    }

    public final void setCalendarItemHeight(int i) {
        if (this.a.f() == i) {
            return;
        }
        this.a.t0(i);
        this.b.t();
        this.c.p();
        CalendarLayout calendarLayout = this.g;
        if (calendarLayout == null) {
            return;
        }
        calendarLayout.t();
    }

    public final void setDefaultMonthViewSelectDay() {
        this.a.u0(0);
    }

    public void setFixMode() {
        setShowMode(2);
    }

    public final void setLastMonthViewSelectDay() {
        this.a.u0(1);
    }

    public final void setLastMonthViewSelectDayIgnoreCurrent() {
        this.a.u0(2);
    }

    public final void setMaxMultiSelectSize(int i) {
        this.a.v0(i);
    }

    public final void setMonthView(Class<?> cls) {
        if (cls == null || this.a.A().equals(cls)) {
            return;
        }
        this.a.w0(cls);
        this.b.u();
    }

    public final void setMonthViewScrollable(boolean z) {
        this.a.x0(z);
    }

    public final void setOnCalendarInterceptListener(OnCalendarInterceptListener onCalendarInterceptListener) {
        if (onCalendarInterceptListener == null) {
            this.a.n0 = null;
        }
        if (onCalendarInterceptListener == null || this.a.J() == 0) {
            return;
        }
        com.haibin.calendarview.c cVar = this.a;
        cVar.n0 = onCalendarInterceptListener;
        if (onCalendarInterceptListener.onCalendarIntercept(cVar.y0)) {
            this.a.y0 = new Calendar();
        }
    }

    public void setOnCalendarLongClickListener(OnCalendarLongClickListener onCalendarLongClickListener) {
        this.a.r0 = onCalendarLongClickListener;
    }

    public final void setOnCalendarMultiSelectListener(OnCalendarMultiSelectListener onCalendarMultiSelectListener) {
        this.a.q0 = onCalendarMultiSelectListener;
    }

    public final void setOnCalendarRangeSelectListener(OnCalendarRangeSelectListener onCalendarRangeSelectListener) {
        this.a.p0 = onCalendarRangeSelectListener;
    }

    public void setOnCalendarSelectListener(OnCalendarSelectListener onCalendarSelectListener) {
        com.haibin.calendarview.c cVar = this.a;
        cVar.o0 = onCalendarSelectListener;
        if (onCalendarSelectListener != null && cVar.J() == 0 && isInRange(this.a.y0)) {
            this.a.Q0();
        }
    }

    public void setOnMonthChangeListener(OnMonthChangeListener onMonthChangeListener) {
        this.a.u0 = onMonthChangeListener;
    }

    public void setOnViewChangeListener(OnViewChangeListener onViewChangeListener) {
        this.a.w0 = onViewChangeListener;
    }

    public void setOnWeekChangeListener(OnWeekChangeListener onWeekChangeListener) {
        this.a.v0 = onWeekChangeListener;
    }

    public void setOnYearChangeListener(OnYearChangeListener onYearChangeListener) {
        this.a.t0 = onYearChangeListener;
    }

    public void setOnYearViewChangeListener(OnYearViewChangeListener onYearViewChangeListener) {
        this.a.x0 = onYearViewChangeListener;
    }

    public void setOnlyCurrentMode() {
        setShowMode(1);
    }

    public void setRange(int i, int i2, int i3, int i4, int i5, int i6) {
        if (com.haibin.calendarview.b.a(i, i2, i3, i4, i5, i6) > 0) {
            return;
        }
        this.a.B0(i, i2, i3, i4, i5, i6);
        this.c.k();
        this.e.f();
        this.b.o();
        if (!isInRange(this.a.y0)) {
            com.haibin.calendarview.c cVar = this.a;
            cVar.y0 = cVar.v();
            this.a.Q0();
            com.haibin.calendarview.c cVar2 = this.a;
            cVar2.z0 = cVar2.y0;
        }
        this.c.q();
        this.b.w();
        this.e.i();
    }

    public void setSchemeColor(int i, int i2, int i3) {
        com.haibin.calendarview.c cVar = this.a;
        if (cVar == null || this.b == null || this.c == null) {
            return;
        }
        cVar.C0(i, i2, i3);
        this.b.A();
        this.c.w();
    }

    public final void setSchemeDate(Map<String, Calendar> map) {
        com.haibin.calendarview.c cVar = this.a;
        cVar.m0 = map;
        cVar.Q0();
        this.e.h();
        this.b.x();
        this.c.r();
    }

    public final void setSelectCalendarRange(int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.a.J() != 2) {
            return;
        }
        Calendar calendar = new Calendar();
        calendar.setYear(i);
        calendar.setMonth(i2);
        calendar.setDay(i3);
        Calendar calendar2 = new Calendar();
        calendar2.setYear(i4);
        calendar2.setMonth(i5);
        calendar2.setDay(i6);
        setSelectCalendarRange(calendar, calendar2);
    }

    public final void setSelectDefaultMode() {
        if (this.a.J() == 0) {
            return;
        }
        com.haibin.calendarview.c cVar = this.a;
        cVar.y0 = cVar.z0;
        cVar.E0(0);
        WeekBar weekBar = this.f;
        com.haibin.calendarview.c cVar2 = this.a;
        weekBar.onDateSelected(cVar2.y0, cVar2.S(), false);
        this.b.s();
        this.c.o();
    }

    public final void setSelectEndCalendar(int i, int i2, int i3) {
        if (this.a.J() == 2 && this.a.C0 != null) {
            Calendar calendar = new Calendar();
            calendar.setYear(i);
            calendar.setMonth(i2);
            calendar.setDay(i3);
            setSelectEndCalendar(calendar);
        }
    }

    public void setSelectMultiMode() {
        if (this.a.J() == 3) {
            return;
        }
        this.a.E0(3);
        clearMultiSelect();
    }

    public final void setSelectRange(int i, int i2) {
        if (i > i2) {
            return;
        }
        this.a.F0(i, i2);
    }

    public void setSelectRangeMode() {
        if (this.a.J() == 2) {
            return;
        }
        this.a.E0(2);
        clearSelectRange();
    }

    public void setSelectSingleMode() {
        if (this.a.J() == 1) {
            return;
        }
        this.a.E0(1);
        this.c.s();
        this.b.y();
    }

    public final void setSelectStartCalendar(int i, int i2, int i3) {
        if (this.a.J() != 2) {
            return;
        }
        Calendar calendar = new Calendar();
        calendar.setYear(i);
        calendar.setMonth(i2);
        calendar.setDay(i3);
        setSelectStartCalendar(calendar);
    }

    public void setSelectedColor(int i, int i2, int i3) {
        com.haibin.calendarview.c cVar = this.a;
        if (cVar == null || this.b == null || this.c == null) {
            return;
        }
        cVar.D0(i, i2, i3);
        this.b.A();
        this.c.w();
    }

    public void setTextColor(int i, int i2, int i3, int i4, int i5) {
        com.haibin.calendarview.c cVar = this.a;
        if (cVar == null || this.b == null || this.c == null) {
            return;
        }
        cVar.G0(i, i2, i3, i4, i5);
        this.b.A();
        this.c.w();
    }

    public void setThemeColor(int i, int i2) {
        com.haibin.calendarview.c cVar = this.a;
        if (cVar == null || this.b == null || this.c == null) {
            return;
        }
        cVar.H0(i, i2);
        this.b.A();
        this.c.w();
    }

    public void setWeeColor(int i, int i2) {
        WeekBar weekBar = this.f;
        if (weekBar == null) {
            return;
        }
        weekBar.setBackgroundColor(i);
        this.f.setTextColor(i2);
    }

    public final void setWeekBar(Class<?> cls) {
        if (cls == null || this.a.O().equals(cls)) {
            return;
        }
        this.a.I0(cls);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frameContent);
        frameLayout.removeView(this.f);
        try {
            this.f = (WeekBar) cls.getConstructor(Context.class).newInstance(getContext());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        frameLayout.addView(this.f, 2);
        this.f.setup(this.a);
        this.f.onWeekStartChange(this.a.S());
        MonthViewPager monthViewPager = this.b;
        WeekBar weekBar = this.f;
        monthViewPager.i = weekBar;
        com.haibin.calendarview.c cVar = this.a;
        weekBar.onDateSelected(cVar.y0, cVar.S(), false);
    }

    public void setWeekStarWithMon() {
        setWeekStart(2);
    }

    public void setWeekStarWithSat() {
        setWeekStart(7);
    }

    public void setWeekStarWithSun() {
        setWeekStart(1);
    }

    public final void setWeekView(Class<?> cls) {
        if (cls == null || this.a.O().equals(cls)) {
            return;
        }
        this.a.K0(cls);
        this.c.y();
    }

    public final void setWeekViewScrollable(boolean z) {
        this.a.L0(z);
    }

    public final void setYearViewScrollable(boolean z) {
        this.a.M0(z);
    }

    public void setYearViewTextColor(int i, int i2, int i3) {
        com.haibin.calendarview.c cVar = this.a;
        if (cVar == null || this.e == null) {
            return;
        }
        cVar.N0(i, i2, i3);
        this.e.j();
    }

    public void showYearSelectLayout(int i) {
        i(i);
    }

    public final void update() {
        this.f.onWeekStartChange(this.a.S());
        this.e.h();
        this.b.x();
        this.c.r();
    }

    public final void updateCurrentDate() {
        if (this.a == null || this.b == null || this.c == null) {
            return;
        }
        if (getCurDay() == java.util.Calendar.getInstance().get(5)) {
            return;
        }
        this.a.P0();
        this.b.r();
        this.c.n();
    }

    public void updateWeekBar() {
        this.f.onWeekStartChange(this.a.S());
    }

    public CalendarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new com.haibin.calendarview.c(context, attributeSet);
        h(context);
    }

    public void scrollToCalendar(int i, int i2, int i3, boolean z) {
        scrollToCalendar(i, i2, i3, z, true);
    }

    public void scrollToCurrent(boolean z) {
        if (isInRange(this.a.j())) {
            Calendar calendarE = this.a.e();
            OnCalendarInterceptListener onCalendarInterceptListener = this.a.n0;
            if (onCalendarInterceptListener != null && onCalendarInterceptListener.onCalendarIntercept(calendarE)) {
                this.a.n0.onCalendarInterceptClick(calendarE, false);
                return;
            }
            com.haibin.calendarview.c cVar = this.a;
            cVar.y0 = cVar.e();
            com.haibin.calendarview.c cVar2 = this.a;
            cVar2.z0 = cVar2.y0;
            cVar2.Q0();
            WeekBar weekBar = this.f;
            com.haibin.calendarview.c cVar3 = this.a;
            weekBar.onDateSelected(cVar3.y0, cVar3.S(), false);
            if (this.b.getVisibility() == 0) {
                this.b.q(z);
                this.c.t(this.a.z0, false);
            } else {
                this.c.m(z);
            }
            this.e.g(this.a.j().getYear(), z);
        }
    }

    public void scrollToNext(boolean z) {
        if (isYearSelectLayoutVisible()) {
            YearViewPager yearViewPager = this.e;
            yearViewPager.setCurrentItem(yearViewPager.getCurrentItem() + 1, z);
        } else if (this.c.getVisibility() == 0) {
            WeekViewPager weekViewPager = this.c;
            weekViewPager.setCurrentItem(weekViewPager.getCurrentItem() + 1, z);
        } else {
            MonthViewPager monthViewPager = this.b;
            monthViewPager.setCurrentItem(monthViewPager.getCurrentItem() + 1, z);
        }
    }

    public void scrollToPre(boolean z) {
        if (isYearSelectLayoutVisible()) {
            YearViewPager yearViewPager = this.e;
            yearViewPager.setCurrentItem(yearViewPager.getCurrentItem() - 1, z);
        } else if (this.c.getVisibility() == 0) {
            WeekViewPager weekViewPager = this.c;
            weekViewPager.setCurrentItem(weekViewPager.getCurrentItem() - 1, z);
        } else {
            MonthViewPager monthViewPager = this.b;
            monthViewPager.setCurrentItem(monthViewPager.getCurrentItem() - 1, z);
        }
    }

    public void scrollToYear(int i, boolean z) {
        if (this.e.getVisibility() != 0) {
            return;
        }
        this.e.g(i, z);
    }

    public void setOnCalendarLongClickListener(OnCalendarLongClickListener onCalendarLongClickListener, boolean z) {
        com.haibin.calendarview.c cVar = this.a;
        cVar.r0 = onCalendarLongClickListener;
        cVar.z0(z);
    }

    public void scrollToCalendar(int i, int i2, int i3, boolean z, boolean z2) {
        Calendar calendar = new Calendar();
        calendar.setYear(i);
        calendar.setMonth(i2);
        calendar.setDay(i3);
        if (calendar.isAvailable() && isInRange(calendar)) {
            OnCalendarInterceptListener onCalendarInterceptListener = this.a.n0;
            if (onCalendarInterceptListener != null && onCalendarInterceptListener.onCalendarIntercept(calendar)) {
                this.a.n0.onCalendarInterceptClick(calendar, false);
            } else if (this.c.getVisibility() == 0) {
                this.c.l(i, i2, i3, z, z2);
            } else {
                this.b.p(i, i2, i3, z, z2);
            }
        }
    }

    public final void setSelectStartCalendar(Calendar calendar) {
        if (this.a.J() == 2 && calendar != null) {
            if (!isInRange(calendar)) {
                OnCalendarRangeSelectListener onCalendarRangeSelectListener = this.a.p0;
                if (onCalendarRangeSelectListener != null) {
                    onCalendarRangeSelectListener.onSelectOutOfRange(calendar, true);
                    return;
                }
                return;
            }
            if (onCalendarIntercept(calendar)) {
                OnCalendarInterceptListener onCalendarInterceptListener = this.a.n0;
                if (onCalendarInterceptListener != null) {
                    onCalendarInterceptListener.onCalendarInterceptClick(calendar, false);
                    return;
                }
                return;
            }
            com.haibin.calendarview.c cVar = this.a;
            cVar.D0 = null;
            cVar.C0 = calendar;
            scrollToCalendar(calendar.getYear(), calendar.getMonth(), calendar.getDay());
        }
    }

    public final void setSelectEndCalendar(Calendar calendar) {
        Calendar calendar2;
        if (this.a.J() == 2 && (calendar2 = this.a.C0) != null) {
            setSelectCalendarRange(calendar2, calendar);
        }
    }

    public final void addSchemeDate(Map<String, Calendar> map) {
        if (this.a == null || map == null || map.size() == 0) {
            return;
        }
        com.haibin.calendarview.c cVar = this.a;
        if (cVar.m0 == null) {
            cVar.m0 = new HashMap();
        }
        this.a.a(map);
        this.a.Q0();
        this.e.h();
        this.b.x();
        this.c.r();
    }

    public final void setSelectCalendarRange(Calendar calendar, Calendar calendar2) {
        if (this.a.J() != 2 || calendar == null || calendar2 == null) {
            return;
        }
        if (onCalendarIntercept(calendar)) {
            OnCalendarInterceptListener onCalendarInterceptListener = this.a.n0;
            if (onCalendarInterceptListener != null) {
                onCalendarInterceptListener.onCalendarInterceptClick(calendar, false);
                return;
            }
            return;
        }
        if (onCalendarIntercept(calendar2)) {
            OnCalendarInterceptListener onCalendarInterceptListener2 = this.a.n0;
            if (onCalendarInterceptListener2 != null) {
                onCalendarInterceptListener2.onCalendarInterceptClick(calendar2, false);
                return;
            }
            return;
        }
        int iDiffer = calendar2.differ(calendar);
        if (iDiffer >= 0 && isInRange(calendar) && isInRange(calendar2)) {
            if (this.a.w() != -1 && this.a.w() > iDiffer + 1) {
                OnCalendarRangeSelectListener onCalendarRangeSelectListener = this.a.p0;
                if (onCalendarRangeSelectListener != null) {
                    onCalendarRangeSelectListener.onSelectOutOfRange(calendar2, true);
                    return;
                }
                return;
            }
            if (this.a.r() != -1 && this.a.r() < iDiffer + 1) {
                OnCalendarRangeSelectListener onCalendarRangeSelectListener2 = this.a.p0;
                if (onCalendarRangeSelectListener2 != null) {
                    onCalendarRangeSelectListener2.onSelectOutOfRange(calendar2, false);
                    return;
                }
                return;
            }
            if (this.a.w() == -1 && iDiffer == 0) {
                com.haibin.calendarview.c cVar = this.a;
                cVar.C0 = calendar;
                cVar.D0 = null;
                OnCalendarRangeSelectListener onCalendarRangeSelectListener3 = cVar.p0;
                if (onCalendarRangeSelectListener3 != null) {
                    onCalendarRangeSelectListener3.onCalendarRangeSelect(calendar, false);
                }
                scrollToCalendar(calendar.getYear(), calendar.getMonth(), calendar.getDay());
                return;
            }
            com.haibin.calendarview.c cVar2 = this.a;
            cVar2.C0 = calendar;
            cVar2.D0 = calendar2;
            OnCalendarRangeSelectListener onCalendarRangeSelectListener4 = cVar2.p0;
            if (onCalendarRangeSelectListener4 != null) {
                onCalendarRangeSelectListener4.onCalendarRangeSelect(calendar, false);
                this.a.p0.onCalendarRangeSelect(calendar2, true);
            }
            scrollToCalendar(calendar.getYear(), calendar.getMonth(), calendar.getDay());
        }
    }
}
