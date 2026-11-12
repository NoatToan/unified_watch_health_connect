package com.haibin.calendarview;

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

/* JADX INFO: loaded from: classes4.dex */
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
            if (MonthViewPager.this.c.B() == 0) {
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
            Calendar calendarE = com.haibin.calendarview.b.e(i, MonthViewPager.this.c);
            if (MonthViewPager.this.getVisibility() == 0) {
                if (!MonthViewPager.this.c.U && MonthViewPager.this.c.z0 != null && calendarE.getYear() != MonthViewPager.this.c.z0.getYear() && MonthViewPager.this.c.t0 != null) {
                    MonthViewPager.this.c.t0.onYearChange(calendarE.getYear());
                }
                MonthViewPager.this.c.z0 = calendarE;
            }
            if (MonthViewPager.this.c.u0 != null) {
                MonthViewPager.this.c.u0.onMonthChange(calendarE.getYear(), calendarE.getMonth());
            }
            if (MonthViewPager.this.h.getVisibility() == 0) {
                MonthViewPager.this.v(calendarE.getYear(), calendarE.getMonth());
                return;
            }
            if (MonthViewPager.this.c.J() == 0) {
                if (calendarE.isCurrentMonth()) {
                    MonthViewPager.this.c.y0 = com.haibin.calendarview.b.q(calendarE, MonthViewPager.this.c);
                } else {
                    MonthViewPager.this.c.y0 = calendarE;
                }
                MonthViewPager.this.c.z0 = MonthViewPager.this.c.y0;
            } else if (MonthViewPager.this.c.C0 != null && MonthViewPager.this.c.C0.isSameMonth(MonthViewPager.this.c.z0)) {
                MonthViewPager.this.c.z0 = MonthViewPager.this.c.C0;
            } else if (calendarE.isSameMonth(MonthViewPager.this.c.y0)) {
                MonthViewPager.this.c.z0 = MonthViewPager.this.c.y0;
            }
            MonthViewPager.this.c.Q0();
            if (!MonthViewPager.this.j && MonthViewPager.this.c.J() == 0) {
                MonthViewPager monthViewPager = MonthViewPager.this;
                monthViewPager.i.onDateSelected(monthViewPager.c.y0, MonthViewPager.this.c.S(), false);
                if (MonthViewPager.this.c.o0 != null) {
                    MonthViewPager.this.c.o0.onCalendarSelect(MonthViewPager.this.c.y0, false);
                }
            }
            BaseMonthView baseMonthView = (BaseMonthView) MonthViewPager.this.findViewWithTag(Integer.valueOf(i));
            if (baseMonthView != null) {
                int selectedIndex = baseMonthView.getSelectedIndex(MonthViewPager.this.c.z0);
                if (MonthViewPager.this.c.J() == 0) {
                    baseMonthView.mCurrentItem = selectedIndex;
                }
                if (selectedIndex >= 0 && (calendarLayout = MonthViewPager.this.g) != null) {
                    calendarLayout.v(selectedIndex);
                }
                baseMonthView.invalidate();
            }
            MonthViewPager monthViewPager2 = MonthViewPager.this;
            monthViewPager2.h.t(monthViewPager2.c.z0, false);
            MonthViewPager.this.v(calendarE.getYear(), calendarE.getMonth());
            MonthViewPager.this.j = false;
        }
    }

    public final class b extends PagerAdapter {
        private b() {
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
            int iZ = (((MonthViewPager.this.c.z() + i) - 1) / 12) + MonthViewPager.this.c.x();
            int iZ2 = (((MonthViewPager.this.c.z() + i) - 1) % 12) + 1;
            try {
                BaseMonthView baseMonthView = (BaseMonthView) MonthViewPager.this.c.A().getConstructor(Context.class).newInstance(MonthViewPager.this.getContext());
                MonthViewPager monthViewPager = MonthViewPager.this;
                baseMonthView.mMonthViewPager = monthViewPager;
                baseMonthView.mParentLayout = monthViewPager.g;
                baseMonthView.setup(monthViewPager.c);
                baseMonthView.setTag(Integer.valueOf(i));
                baseMonthView.initMonthWithDate(iZ, iZ2);
                baseMonthView.setSelectedCalendar(MonthViewPager.this.c.y0);
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

        public /* synthetic */ b(MonthViewPager monthViewPager, a aVar) {
            this();
        }
    }

    public MonthViewPager(Context context) {
        this(context, null);
    }

    private void m() {
        this.b = (((this.c.s() - this.c.x()) * 12) - this.c.z()) + 1 + this.c.u();
        setAdapter(new b(this, null));
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
        if (this.c.B() == 0) {
            this.f = this.c.f() * 6;
            getLayoutParams().height = this.f;
            return;
        }
        if (this.g != null) {
            if (getVisibility() != 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = com.haibin.calendarview.b.k(i, i2, this.c.f(), this.c.S(), this.c.B());
                setLayoutParams(layoutParams);
            }
            this.g.u();
        }
        this.f = com.haibin.calendarview.b.k(i, i2, this.c.f(), this.c.S(), this.c.B());
        if (i2 == 1) {
            this.e = com.haibin.calendarview.b.k(i - 1, 12, this.c.f(), this.c.S(), this.c.B());
            this.d = com.haibin.calendarview.b.k(i, 2, this.c.f(), this.c.S(), this.c.B());
            return;
        }
        this.e = com.haibin.calendarview.b.k(i, i2 - 1, this.c.f(), this.c.S(), this.c.B());
        if (i2 == 12) {
            this.d = com.haibin.calendarview.b.k(i + 1, 1, this.c.f(), this.c.S(), this.c.B());
        } else {
            this.d = com.haibin.calendarview.b.k(i, i2 + 1, this.c.f(), this.c.S(), this.c.B());
        }
    }

    public final void A() {
        for (int i = 0; i < getChildCount(); i++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i);
            baseMonthView.updateStyle();
            baseMonthView.invalidate();
        }
    }

    public void B() {
        for (int i = 0; i < getChildCount(); i++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i);
            baseMonthView.updateWeekStart();
            baseMonthView.requestLayout();
        }
        v(this.c.y0.getYear(), this.c.y0.getMonth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.f;
        setLayoutParams(layoutParams);
        if (this.g != null) {
            c cVar = this.c;
            this.g.w(com.haibin.calendarview.b.v(cVar.y0, cVar.S()));
        }
        y();
    }

    public List<Calendar> getCurrentMonthCalendars() {
        BaseMonthView baseMonthView = (BaseMonthView) findViewWithTag(Integer.valueOf(getCurrentItem()));
        if (baseMonthView == null) {
            return null;
        }
        return baseMonthView.mItems;
    }

    public final void j() {
        for (int i = 0; i < getChildCount(); i++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i);
            baseMonthView.mCurrentItem = -1;
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
            baseMonthView.mCurrentItem = -1;
            baseMonthView.invalidate();
        }
    }

    public void o() {
        this.b = (((this.c.s() - this.c.x()) * 12) - this.c.z()) + 1 + this.c.u();
        n();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.c.p0() && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.c.p0() && super.onTouchEvent(motionEvent);
    }

    public void p(int i, int i2, int i3, boolean z, boolean z2) {
        this.j = true;
        Calendar calendar = new Calendar();
        calendar.setYear(i);
        calendar.setMonth(i2);
        calendar.setDay(i3);
        calendar.setCurrentDay(calendar.equals(this.c.j()));
        LunarCalendar.setupLunarCalendar(calendar);
        c cVar = this.c;
        cVar.z0 = calendar;
        cVar.y0 = calendar;
        cVar.Q0();
        int year = (((calendar.getYear() - this.c.x()) * 12) + calendar.getMonth()) - this.c.z();
        if (getCurrentItem() == year) {
            this.j = false;
        }
        setCurrentItem(year, z);
        BaseMonthView baseMonthView = (BaseMonthView) findViewWithTag(Integer.valueOf(year));
        if (baseMonthView != null) {
            baseMonthView.setSelectedCalendar(this.c.z0);
            baseMonthView.invalidate();
            CalendarLayout calendarLayout = this.g;
            if (calendarLayout != null) {
                calendarLayout.v(baseMonthView.getSelectedIndex(this.c.z0));
            }
        }
        if (this.g != null) {
            this.g.w(com.haibin.calendarview.b.v(calendar, this.c.S()));
        }
        CalendarView.OnCalendarSelectListener onCalendarSelectListener = this.c.o0;
        if (onCalendarSelectListener != null && z2) {
            onCalendarSelectListener.onCalendarSelect(calendar, false);
        }
        CalendarView.h hVar = this.c.s0;
        if (hVar != null) {
            hVar.b(calendar, false);
        }
        y();
    }

    public void q(boolean z) {
        this.j = true;
        int year = (((this.c.j().getYear() - this.c.x()) * 12) + this.c.j().getMonth()) - this.c.z();
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
        if (this.c.o0 == null || getVisibility() != 0) {
            return;
        }
        c cVar = this.c;
        cVar.o0.onCalendarSelect(cVar.y0, false);
    }

    public void r() {
        for (int i = 0; i < getChildCount(); i++) {
            ((BaseMonthView) getChildAt(i)).updateCurrentDate();
        }
    }

    public void s() {
        CalendarLayout calendarLayout;
        BaseMonthView baseMonthView = (BaseMonthView) findViewWithTag(Integer.valueOf(getCurrentItem()));
        if (baseMonthView != null) {
            int selectedIndex = baseMonthView.getSelectedIndex(this.c.y0);
            baseMonthView.mCurrentItem = selectedIndex;
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
            baseMonthView.updateItemHeight();
            baseMonthView.requestLayout();
        }
        int year = this.c.z0.getYear();
        int month = this.c.z0.getMonth();
        this.f = com.haibin.calendarview.b.k(year, month, this.c.f(), this.c.S(), this.c.B());
        if (month == 1) {
            this.e = com.haibin.calendarview.b.k(year - 1, 12, this.c.f(), this.c.S(), this.c.B());
            this.d = com.haibin.calendarview.b.k(year, 2, this.c.f(), this.c.S(), this.c.B());
        } else {
            this.e = com.haibin.calendarview.b.k(year, month - 1, this.c.f(), this.c.S(), this.c.B());
            if (month == 12) {
                this.d = com.haibin.calendarview.b.k(year + 1, 1, this.c.f(), this.c.S(), this.c.B());
            } else {
                this.d = com.haibin.calendarview.b.k(year, month + 1, this.c.f(), this.c.S(), this.c.B());
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
        Calendar calendar = this.c.y0;
        int year = (((calendar.getYear() - this.c.x()) * 12) + calendar.getMonth()) - this.c.z();
        setCurrentItem(year, false);
        BaseMonthView baseMonthView = (BaseMonthView) findViewWithTag(Integer.valueOf(year));
        if (baseMonthView != null) {
            baseMonthView.setSelectedCalendar(this.c.z0);
            baseMonthView.invalidate();
            CalendarLayout calendarLayout = this.g;
            if (calendarLayout != null) {
                calendarLayout.v(baseMonthView.getSelectedIndex(this.c.z0));
            }
        }
        if (this.g != null) {
            this.g.w(com.haibin.calendarview.b.v(calendar, this.c.S()));
        }
        CalendarView.h hVar = this.c.s0;
        if (hVar != null) {
            hVar.b(calendar, false);
        }
        CalendarView.OnCalendarSelectListener onCalendarSelectListener = this.c.o0;
        if (onCalendarSelectListener != null) {
            onCalendarSelectListener.onCalendarSelect(calendar, false);
        }
        y();
    }

    public void x() {
        for (int i = 0; i < getChildCount(); i++) {
            ((BaseMonthView) getChildAt(i)).update();
        }
    }

    public void y() {
        for (int i = 0; i < getChildCount(); i++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i);
            baseMonthView.setSelectedCalendar(this.c.y0);
            baseMonthView.invalidate();
        }
    }

    public void z() {
        for (int i = 0; i < getChildCount(); i++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i);
            baseMonthView.updateShowMode();
            baseMonthView.requestLayout();
        }
        if (this.c.B() == 0) {
            int iF = this.c.f() * 6;
            this.f = iF;
            this.d = iF;
            this.e = iF;
        } else {
            v(this.c.y0.getYear(), this.c.y0.getMonth());
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
