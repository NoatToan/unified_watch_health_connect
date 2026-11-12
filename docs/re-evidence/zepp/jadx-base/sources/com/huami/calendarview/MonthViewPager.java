package com.huami.calendarview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class MonthViewPager extends ViewPager {
    private boolean a;
    private int b;
    private c c;
    private int d;
    private int e;
    private int f;
    public CalendarLayout g;
    public WeekViewPager h;
    public WeekBar i;
    private boolean j;

    public class a implements ViewPager.OnPageChangeListener {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            float f2;
            int i3;
            if (MonthViewPager.this.c.D() == 0) {
                return;
            }
            if (i < MonthViewPager.this.getCurrentItem()) {
                f2 = MonthViewPager.this.e * (1.0f - f);
                i3 = MonthViewPager.this.f;
            } else {
                f2 = MonthViewPager.this.f * (1.0f - f);
                i3 = MonthViewPager.this.d;
            }
            int i4 = (int) (f2 + (i3 * f));
            ViewGroup.LayoutParams layoutParams = MonthViewPager.this.getLayoutParams();
            layoutParams.height = i4;
            MonthViewPager.this.setLayoutParams(layoutParams);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            CalendarLayout calendarLayout;
            Calendar calendarE = com.huami.calendarview.b.e(i, MonthViewPager.this.c);
            if (MonthViewPager.this.getVisibility() == 0) {
                if (!MonthViewPager.this.c.X && MonthViewPager.this.c.C0 != null && calendarE.getYear() != MonthViewPager.this.c.C0.getYear() && MonthViewPager.this.c.w0 != null) {
                    MonthViewPager.this.c.w0.onYearChange(calendarE.getYear());
                }
                MonthViewPager.this.c.C0 = calendarE;
            }
            if (MonthViewPager.this.c.x0 != null) {
                MonthViewPager.this.c.x0.onMonthChange(calendarE.getYear(), calendarE.getMonth());
            }
            if (MonthViewPager.this.h.getVisibility() == 0) {
                MonthViewPager.this.v(calendarE.getYear(), calendarE.getMonth());
                return;
            }
            if (MonthViewPager.this.c.L() == 0) {
                if (calendarE.isCurrentMonth()) {
                    MonthViewPager.this.c.B0 = com.huami.calendarview.b.q(calendarE, MonthViewPager.this.c);
                } else {
                    MonthViewPager.this.c.B0 = calendarE;
                }
                MonthViewPager.this.c.C0 = MonthViewPager.this.c.B0;
            } else if (MonthViewPager.this.c.F0 != null && MonthViewPager.this.c.F0.isSameMonth(MonthViewPager.this.c.C0)) {
                MonthViewPager.this.c.C0 = MonthViewPager.this.c.F0;
            } else if (calendarE.isSameMonth(MonthViewPager.this.c.B0)) {
                MonthViewPager.this.c.C0 = MonthViewPager.this.c.B0;
            }
            MonthViewPager.this.c.W0();
            if (!MonthViewPager.this.j && MonthViewPager.this.c.L() == 0) {
                MonthViewPager monthViewPager = MonthViewPager.this;
                monthViewPager.i.onDateSelected(monthViewPager.c.B0, MonthViewPager.this.c.U(), false);
                if (MonthViewPager.this.c.r0 != null) {
                    MonthViewPager.this.c.r0.onCalendarSelect(MonthViewPager.this.c.B0, false);
                }
            }
            BaseMonthView baseMonthView = (BaseMonthView) MonthViewPager.this.findViewWithTag(Integer.valueOf(i));
            if (baseMonthView != null) {
                int selectedIndex = baseMonthView.getSelectedIndex(MonthViewPager.this.c.C0);
                if (MonthViewPager.this.c.L() == 0) {
                    baseMonthView.g = selectedIndex;
                }
                if (selectedIndex >= 0 && (calendarLayout = MonthViewPager.this.g) != null) {
                    calendarLayout.v(selectedIndex);
                }
                baseMonthView.invalidate();
            }
            MonthViewPager monthViewPager2 = MonthViewPager.this;
            monthViewPager2.h.t(monthViewPager2.c.C0, false);
            MonthViewPager.this.v(calendarE.getYear(), calendarE.getMonth());
            MonthViewPager.this.j = false;
        }
    }

    public final class b extends PagerAdapter {
        private boolean a;

        public b(boolean z) {
            this.a = z;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            BaseView baseView = (BaseView) obj;
            baseView.onDestroy();
            viewGroup.removeView(baseView);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return MonthViewPager.this.b;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(@NonNull Object obj) {
            if (MonthViewPager.this.a) {
                return -2;
            }
            return super.getItemPosition(obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @NonNull
        public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
            int iB;
            int iB2;
            if (this.a) {
                iB = MonthViewPager.this.c.u() - (((MonthViewPager.this.c.B() + i) - 1) / 12);
                iB2 = 12 - ((((MonthViewPager.this.c.B() + i) - 1) % 12) + 1);
            } else {
                iB = (((MonthViewPager.this.c.B() + i) - 1) / 12) + MonthViewPager.this.c.z();
                iB2 = ((MonthViewPager.this.c.B() + i) - 1) % 12;
            }
            int i2 = iB2 + 1;
            try {
                BaseMonthView baseMonthView = (BaseMonthView) MonthViewPager.this.c.C().getConstructor(Context.class).newInstance(MonthViewPager.this.getContext());
                MonthViewPager monthViewPager = MonthViewPager.this;
                baseMonthView.i = monthViewPager;
                baseMonthView.b = monthViewPager.g;
                baseMonthView.setup(monthViewPager.c);
                baseMonthView.setTag(Integer.valueOf(i));
                baseMonthView.i(iB, i2);
                baseMonthView.setSelectedCalendar(MonthViewPager.this.c.B0);
                viewGroup.addView(baseMonthView);
                return baseMonthView;
            } catch (Exception e) {
                e.printStackTrace();
                return new DefaultMonthView(MonthViewPager.this.getContext());
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, @NonNull Object obj) {
            return view.equals(obj);
        }
    }

    public MonthViewPager(Context context) {
        this(context, null);
    }

    private void m() {
        this.b = (((this.c.u() - this.c.z()) * 12) - this.c.B()) + 1 + this.c.w();
        setAdapter(new b(this.c.t0()));
        addOnPageChangeListener(new a());
    }

    private void n() {
        if (getAdapter() == null) {
            return;
        }
        getAdapter().notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(int i, int i2) {
        if (this.c.D() == 0) {
            this.f = this.c.f() * 6;
            getLayoutParams().height = this.f;
            return;
        }
        if (this.g != null) {
            if (getVisibility() != 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = com.huami.calendarview.b.k(i, i2, this.c.f(), this.c.U(), this.c.D());
                setLayoutParams(layoutParams);
            }
            this.g.u();
        }
        this.f = com.huami.calendarview.b.k(i, i2, this.c.f(), this.c.U(), this.c.D());
        if (i2 == 1) {
            this.e = com.huami.calendarview.b.k(i - 1, 12, this.c.f(), this.c.U(), this.c.D());
            this.d = com.huami.calendarview.b.k(i, 2, this.c.f(), this.c.U(), this.c.D());
            return;
        }
        this.e = com.huami.calendarview.b.k(i, i2 - 1, this.c.f(), this.c.U(), this.c.D());
        if (i2 == 12) {
            this.d = com.huami.calendarview.b.k(i + 1, 1, this.c.f(), this.c.U(), this.c.D());
        } else {
            this.d = com.huami.calendarview.b.k(i, i2 + 1, this.c.f(), this.c.U(), this.c.D());
        }
    }

    public final void A() {
        for (int i = 0; i < getChildCount(); i++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i);
            baseMonthView.g();
            baseMonthView.invalidate();
        }
    }

    public void B() {
        for (int i = 0; i < getChildCount(); i++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i);
            baseMonthView.k();
            baseMonthView.requestLayout();
        }
        v(this.c.B0.getYear(), this.c.B0.getMonth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.f;
        setLayoutParams(layoutParams);
        if (this.g != null) {
            c cVar = this.c;
            this.g.w(com.huami.calendarview.b.v(cVar.B0, cVar.U()));
        }
        y();
    }

    public List<Calendar> getCurrentMonthCalendars() {
        BaseMonthView baseMonthView = (BaseMonthView) findViewWithTag(Integer.valueOf(getCurrentItem()));
        if (baseMonthView == null) {
            return null;
        }
        return baseMonthView.c;
    }

    public final void j() {
        for (int i = 0; i < getChildCount(); i++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i);
            baseMonthView.g = -1;
            baseMonthView.invalidate();
        }
    }

    public final void k() {
        for (int i = 0; i < getChildCount(); i++) {
            ((BaseMonthView) getChildAt(i)).invalidate();
        }
    }

    public final void l() {
        for (int i = 0; i < getChildCount(); i++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i);
            baseMonthView.g = -1;
            baseMonthView.invalidate();
        }
    }

    public void o() {
        this.b = (((this.c.u() - this.c.z()) * 12) - this.c.B()) + 1 + this.c.w();
        n();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.c.r0() && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.c.r0() && super.onTouchEvent(motionEvent);
    }

    public void p(int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        this.j = true;
        Calendar calendar = new Calendar();
        calendar.setYear(i);
        calendar.setMonth(i2);
        calendar.setDay(i3);
        calendar.setCurrentDay(calendar.equals(this.c.j()));
        LunarCalendar.setupLunarCalendar(calendar);
        c cVar = this.c;
        cVar.C0 = calendar;
        cVar.B0 = calendar;
        cVar.W0();
        int iU = z3 ? ((this.c.u() - calendar.getYear()) * 12) + (12 - calendar.getMonth()) : (((calendar.getYear() - this.c.z()) * 12) + calendar.getMonth()) - this.c.B();
        if (getCurrentItem() == iU) {
            this.j = false;
        }
        setCurrentItem(iU, z);
        BaseMonthView baseMonthView = (BaseMonthView) findViewWithTag(Integer.valueOf(iU));
        if (baseMonthView != null) {
            baseMonthView.setSelectedCalendar(this.c.C0);
            baseMonthView.invalidate();
            CalendarLayout calendarLayout = this.g;
            if (calendarLayout != null) {
                calendarLayout.v(baseMonthView.getSelectedIndex(this.c.C0));
            }
        }
        if (this.g != null) {
            this.g.w(com.huami.calendarview.b.v(calendar, this.c.U()));
        }
        CalendarView.OnCalendarSelectListener onCalendarSelectListener = this.c.r0;
        if (onCalendarSelectListener != null && z2) {
            onCalendarSelectListener.onCalendarSelect(calendar, false);
        }
        CalendarView.h hVar = this.c.v0;
        if (hVar != null) {
            hVar.a(calendar, false);
        }
        y();
    }

    public void q(boolean z) {
        this.j = true;
        int year = (((this.c.j().getYear() - this.c.z()) * 12) + this.c.j().getMonth()) - this.c.B();
        if (getCurrentItem() == year) {
            this.j = false;
        }
        setCurrentItem(year, z);
        BaseMonthView baseMonthView = (BaseMonthView) findViewWithTag(Integer.valueOf(year));
        if (baseMonthView != null) {
            baseMonthView.setSelectedCalendar(this.c.j());
            baseMonthView.invalidate();
            CalendarLayout calendarLayout = this.g;
            if (calendarLayout != null) {
                calendarLayout.v(baseMonthView.getSelectedIndex(this.c.j()));
            }
        }
        if (this.c.r0 == null || getVisibility() != 0) {
            return;
        }
        c cVar = this.c;
        cVar.r0.onCalendarSelect(cVar.B0, false);
    }

    public void r() {
        for (int i = 0; i < getChildCount(); i++) {
            ((BaseMonthView) getChildAt(i)).e();
        }
    }

    public void s() {
        CalendarLayout calendarLayout;
        BaseMonthView baseMonthView = (BaseMonthView) findViewWithTag(Integer.valueOf(getCurrentItem()));
        if (baseMonthView != null) {
            int selectedIndex = baseMonthView.getSelectedIndex(this.c.B0);
            baseMonthView.g = selectedIndex;
            if (selectedIndex >= 0 && (calendarLayout = this.g) != null) {
                calendarLayout.v(selectedIndex);
            }
            baseMonthView.invalidate();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    public void setup(c cVar) {
        this.c = cVar;
        v(cVar.j().getYear(), this.c.j().getMonth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.f;
        setLayoutParams(layoutParams);
        m();
    }

    public final void t() {
        for (int i = 0; i < getChildCount(); i++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i);
            baseMonthView.f();
            baseMonthView.requestLayout();
        }
        int year = this.c.C0.getYear();
        int month = this.c.C0.getMonth();
        this.f = com.huami.calendarview.b.k(year, month, this.c.f(), this.c.U(), this.c.D());
        if (month == 1) {
            this.e = com.huami.calendarview.b.k(year - 1, 12, this.c.f(), this.c.U(), this.c.D());
            this.d = com.huami.calendarview.b.k(year, 2, this.c.f(), this.c.U(), this.c.D());
        } else {
            this.e = com.huami.calendarview.b.k(year, month - 1, this.c.f(), this.c.U(), this.c.D());
            if (month == 12) {
                this.d = com.huami.calendarview.b.k(year + 1, 1, this.c.f(), this.c.U(), this.c.D());
            } else {
                this.d = com.huami.calendarview.b.k(year, month + 1, this.c.f(), this.c.U(), this.c.D());
            }
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.f;
        setLayoutParams(layoutParams);
    }

    public void u() {
        this.a = true;
        n();
        this.a = false;
    }

    public final void w() {
        this.a = true;
        o();
        this.a = false;
        if (getVisibility() != 0) {
            return;
        }
        this.j = false;
        Calendar calendar = this.c.B0;
        int year = (((calendar.getYear() - this.c.z()) * 12) + calendar.getMonth()) - this.c.B();
        setCurrentItem(year, false);
        BaseMonthView baseMonthView = (BaseMonthView) findViewWithTag(Integer.valueOf(year));
        if (baseMonthView != null) {
            baseMonthView.setSelectedCalendar(this.c.C0);
            baseMonthView.invalidate();
            CalendarLayout calendarLayout = this.g;
            if (calendarLayout != null) {
                calendarLayout.v(baseMonthView.getSelectedIndex(this.c.C0));
            }
        }
        if (this.g != null) {
            this.g.w(com.huami.calendarview.b.v(calendar, this.c.U()));
        }
        CalendarView.h hVar = this.c.v0;
        if (hVar != null) {
            hVar.a(calendar, false);
        }
        CalendarView.OnCalendarSelectListener onCalendarSelectListener = this.c.r0;
        if (onCalendarSelectListener != null) {
            onCalendarSelectListener.onCalendarSelect(calendar, false);
        }
        y();
    }

    public void x() {
        for (int i = 0; i < getChildCount(); i++) {
            ((BaseMonthView) getChildAt(i)).d();
        }
    }

    public void y() {
        for (int i = 0; i < getChildCount(); i++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i);
            baseMonthView.setSelectedCalendar(this.c.B0);
            baseMonthView.invalidate();
        }
    }

    public void z() {
        for (int i = 0; i < getChildCount(); i++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i);
            baseMonthView.j();
            baseMonthView.requestLayout();
        }
        if (this.c.D() == 0) {
            int iF = this.c.f() * 6;
            this.f = iF;
            this.d = iF;
            this.e = iF;
        } else {
            v(this.c.B0.getYear(), this.c.B0.getMonth());
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.f;
        setLayoutParams(layoutParams);
        CalendarLayout calendarLayout = this.g;
        if (calendarLayout != null) {
            calendarLayout.u();
        }
    }

    public MonthViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i, boolean z) {
        if (Math.abs(getCurrentItem() - i) > 1) {
            super.setCurrentItem(i, false);
        } else {
            super.setCurrentItem(i, z);
        }
    }
}
