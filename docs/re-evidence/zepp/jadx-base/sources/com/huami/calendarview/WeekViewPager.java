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
public final class WeekViewPager extends ViewPager {
    private boolean a;
    private int b;
    private c c;
    public CalendarLayout d;
    private boolean e;

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
            if (WeekViewPager.this.getVisibility() != 0) {
                WeekViewPager.this.e = false;
                return;
            }
            if (WeekViewPager.this.e) {
                WeekViewPager.this.e = false;
                return;
            }
            BaseWeekView baseWeekView = (BaseWeekView) WeekViewPager.this.findViewWithTag(Integer.valueOf(i));
            if (baseWeekView != null) {
                baseWeekView.j(WeekViewPager.this.c.L() != 0 ? WeekViewPager.this.c.C0 : WeekViewPager.this.c.B0, !WeekViewPager.this.e);
                if (WeekViewPager.this.c.y0 != null) {
                    WeekViewPager.this.c.y0.onWeekChange(WeekViewPager.this.getCurrentWeekCalendars());
                }
            }
            WeekViewPager.this.e = false;
        }
    }

    public class b extends PagerAdapter {
        private b() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            BaseWeekView baseWeekView = (BaseWeekView) obj;
            baseWeekView.onDestroy();
            viewGroup.removeView(baseWeekView);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getPagerCount() {
            return WeekViewPager.this.b;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(@NonNull Object obj) {
            if (WeekViewPager.this.a) {
                return -2;
            }
            return super.getItemPosition(obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @NonNull
        public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
            Calendar calendarF = com.huami.calendarview.b.f(WeekViewPager.this.c.z(), WeekViewPager.this.c.B(), WeekViewPager.this.c.A(), i + 1, WeekViewPager.this.c.U());
            try {
                BaseWeekView baseWeekView = (BaseWeekView) WeekViewPager.this.c.X().getConstructor(Context.class).newInstance(WeekViewPager.this.getContext());
                WeekViewPager weekViewPager = WeekViewPager.this;
                baseWeekView.b = weekViewPager.d;
                baseWeekView.setup(weekViewPager.c);
                baseWeekView.setup(calendarF);
                baseWeekView.setTag(Integer.valueOf(i));
                baseWeekView.setSelectedCalendar(WeekViewPager.this.c.B0);
                viewGroup.addView(baseWeekView);
                return baseWeekView;
            } catch (Exception e) {
                e.printStackTrace();
                return new DefaultWeekView(WeekViewPager.this.getContext());
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view.equals(obj);
        }
    }

    public WeekViewPager(Context context) {
        this(context, null);
    }

    private void i() {
        this.b = com.huami.calendarview.b.s(this.c.z(), this.c.B(), this.c.A(), this.c.u(), this.c.w(), this.c.v(), this.c.U());
        setAdapter(new b());
        addOnPageChangeListener(new a());
    }

    private void j() {
        if (getAdapter() == null) {
            return;
        }
        getAdapter().notifyDataSetChanged();
    }

    public final void f() {
        for (int i = 0; i < getChildCount(); i++) {
            BaseWeekView baseWeekView = (BaseWeekView) getChildAt(i);
            baseWeekView.g = -1;
            baseWeekView.invalidate();
        }
    }

    public final void g() {
        for (int i = 0; i < getChildCount(); i++) {
            ((BaseWeekView) getChildAt(i)).invalidate();
        }
    }

    public List<Calendar> getCurrentWeekCalendars() {
        c cVar = this.c;
        List<Calendar> listR = com.huami.calendarview.b.r(cVar.C0, cVar);
        this.c.b(listR);
        return listR;
    }

    public final void h() {
        for (int i = 0; i < getChildCount(); i++) {
            BaseWeekView baseWeekView = (BaseWeekView) getChildAt(i);
            baseWeekView.g = -1;
            baseWeekView.invalidate();
        }
    }

    public void k() {
        this.b = com.huami.calendarview.b.s(this.c.z(), this.c.B(), this.c.A(), this.c.u(), this.c.w(), this.c.v(), this.c.U());
        j();
    }

    public void l(int i, int i2, int i3, boolean z, boolean z2) {
        this.e = true;
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
        t(calendar, z);
        CalendarView.h hVar = this.c.v0;
        if (hVar != null) {
            hVar.b(calendar, false);
        }
        CalendarView.OnCalendarSelectListener onCalendarSelectListener = this.c.r0;
        if (onCalendarSelectListener != null && z2) {
            onCalendarSelectListener.onCalendarSelect(calendar, false);
        }
        this.d.w(com.huami.calendarview.b.v(calendar, this.c.U()));
    }

    public void m(boolean z) {
        this.e = true;
        int iU = com.huami.calendarview.b.u(this.c.j(), this.c.z(), this.c.B(), this.c.A(), this.c.U()) - 1;
        if (getCurrentItem() == iU) {
            this.e = false;
        }
        setCurrentItem(iU, z);
        BaseWeekView baseWeekView = (BaseWeekView) findViewWithTag(Integer.valueOf(iU));
        if (baseWeekView != null) {
            baseWeekView.j(this.c.j(), false);
            baseWeekView.setSelectedCalendar(this.c.j());
            baseWeekView.invalidate();
        }
        if (this.c.r0 != null && getVisibility() == 0) {
            c cVar = this.c;
            cVar.r0.onCalendarSelect(cVar.B0, false);
        }
        if (getVisibility() == 0) {
            c cVar2 = this.c;
            cVar2.v0.b(cVar2.j(), false);
        }
        this.d.w(com.huami.calendarview.b.v(this.c.j(), this.c.U()));
    }

    public void n() {
        for (int i = 0; i < getChildCount(); i++) {
            ((BaseWeekView) getChildAt(i)).e();
        }
    }

    public void o() {
        BaseWeekView baseWeekView = (BaseWeekView) findViewWithTag(Integer.valueOf(getCurrentItem()));
        if (baseWeekView != null) {
            baseWeekView.setSelectedCalendar(this.c.B0);
            baseWeekView.invalidate();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.c.u0() && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.c.f(), 1073741824));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.c.u0() && super.onTouchEvent(motionEvent);
    }

    public final void p() {
        for (int i = 0; i < getChildCount(); i++) {
            BaseWeekView baseWeekView = (BaseWeekView) getChildAt(i);
            baseWeekView.f();
            baseWeekView.requestLayout();
        }
    }

    public void q() {
        this.a = true;
        k();
        this.a = false;
        if (getVisibility() != 0) {
            return;
        }
        this.e = true;
        Calendar calendar = this.c.B0;
        t(calendar, false);
        CalendarView.h hVar = this.c.v0;
        if (hVar != null) {
            hVar.b(calendar, false);
        }
        CalendarView.OnCalendarSelectListener onCalendarSelectListener = this.c.r0;
        if (onCalendarSelectListener != null) {
            onCalendarSelectListener.onCalendarSelect(calendar, false);
        }
        this.d.w(com.huami.calendarview.b.v(calendar, this.c.U()));
    }

    public void r() {
        for (int i = 0; i < getChildCount(); i++) {
            ((BaseWeekView) getChildAt(i)).d();
        }
    }

    public void s() {
        for (int i = 0; i < getChildCount(); i++) {
            BaseWeekView baseWeekView = (BaseWeekView) getChildAt(i);
            baseWeekView.setSelectedCalendar(this.c.B0);
            baseWeekView.invalidate();
        }
    }

    public void setup(c cVar) {
        this.c = cVar;
        i();
    }

    public void t(Calendar calendar, boolean z) {
        int iU = com.huami.calendarview.b.u(calendar, this.c.z(), this.c.B(), this.c.A(), this.c.U()) - 1;
        this.e = getCurrentItem() != iU;
        setCurrentItem(iU, z);
        BaseWeekView baseWeekView = (BaseWeekView) findViewWithTag(Integer.valueOf(iU));
        if (baseWeekView != null) {
            baseWeekView.setSelectedCalendar(calendar);
            baseWeekView.invalidate();
        }
    }

    public void u() {
        for (int i = 0; i < getChildCount(); i++) {
            ((BaseWeekView) getChildAt(i)).k();
        }
    }

    public void v() {
        if (this.c.L() == 0) {
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((BaseWeekView) getChildAt(i)).l();
        }
    }

    public final void w() {
        for (int i = 0; i < getChildCount(); i++) {
            BaseWeekView baseWeekView = (BaseWeekView) getChildAt(i);
            baseWeekView.g();
            baseWeekView.invalidate();
        }
    }

    public void x() {
        if (getAdapter() == null) {
            return;
        }
        int count = getAdapter().getPagerCount();
        int iS = com.huami.calendarview.b.s(this.c.z(), this.c.B(), this.c.A(), this.c.u(), this.c.w(), this.c.v(), this.c.U());
        this.b = iS;
        if (count != iS) {
            this.a = true;
            getAdapter().notifyDataSetChanged();
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((BaseWeekView) getChildAt(i)).m();
        }
        this.a = false;
        t(this.c.B0, false);
    }

    public void y() {
        this.a = true;
        j();
        this.a = false;
    }

    public WeekViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
    }
}
