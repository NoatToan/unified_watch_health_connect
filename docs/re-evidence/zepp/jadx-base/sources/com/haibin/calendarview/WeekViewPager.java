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
                baseWeekView.performClickCalendar(WeekViewPager.this.c.J() != 0 ? WeekViewPager.this.c.z0 : WeekViewPager.this.c.y0, !WeekViewPager.this.e);
                if (WeekViewPager.this.c.v0 != null) {
                    WeekViewPager.this.c.v0.onWeekChange(WeekViewPager.this.getCurrentWeekCalendars());
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
            Calendar calendarF = com.haibin.calendarview.b.f(WeekViewPager.this.c.x(), WeekViewPager.this.c.z(), WeekViewPager.this.c.y(), i + 1, WeekViewPager.this.c.S());
            try {
                BaseWeekView baseWeekView = (BaseWeekView) WeekViewPager.this.c.V().getConstructor(Context.class).newInstance(WeekViewPager.this.getContext());
                WeekViewPager weekViewPager = WeekViewPager.this;
                baseWeekView.mParentLayout = weekViewPager.d;
                baseWeekView.setup(weekViewPager.c);
                baseWeekView.setup(calendarF);
                baseWeekView.setTag(Integer.valueOf(i));
                baseWeekView.setSelectedCalendar(WeekViewPager.this.c.y0);
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

        public /* synthetic */ b(WeekViewPager weekViewPager, a aVar) {
            this();
        }
    }

    public WeekViewPager(Context context) {
        this(context, null);
    }

    private void i() {
        this.b = com.haibin.calendarview.b.s(this.c.x(), this.c.z(), this.c.y(), this.c.s(), this.c.u(), this.c.t(), this.c.S());
        setAdapter(new b(this, null));
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
            baseWeekView.mCurrentItem = -1;
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
        List<Calendar> listR = com.haibin.calendarview.b.r(cVar.z0, cVar);
        this.c.b(listR);
        return listR;
    }

    public final void h() {
        for (int i = 0; i < getChildCount(); i++) {
            BaseWeekView baseWeekView = (BaseWeekView) getChildAt(i);
            baseWeekView.mCurrentItem = -1;
            baseWeekView.invalidate();
        }
    }

    public void k() {
        this.b = com.haibin.calendarview.b.s(this.c.x(), this.c.z(), this.c.y(), this.c.s(), this.c.u(), this.c.t(), this.c.S());
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
        cVar.z0 = calendar;
        cVar.y0 = calendar;
        cVar.Q0();
        t(calendar, z);
        CalendarView.h hVar = this.c.s0;
        if (hVar != null) {
            hVar.a(calendar, false);
        }
        CalendarView.OnCalendarSelectListener onCalendarSelectListener = this.c.o0;
        if (onCalendarSelectListener != null && z2) {
            onCalendarSelectListener.onCalendarSelect(calendar, false);
        }
        this.d.w(com.haibin.calendarview.b.v(calendar, this.c.S()));
    }

    public void m(boolean z) {
        this.e = true;
        int iU = com.haibin.calendarview.b.u(this.c.j(), this.c.x(), this.c.z(), this.c.y(), this.c.S()) - 1;
        if (getCurrentItem() == iU) {
            this.e = false;
        }
        setCurrentItem(iU, z);
        BaseWeekView baseWeekView = (BaseWeekView) findViewWithTag(Integer.valueOf(iU));
        if (baseWeekView != null) {
            baseWeekView.performClickCalendar(this.c.j(), false);
            baseWeekView.setSelectedCalendar(this.c.j());
            baseWeekView.invalidate();
        }
        if (this.c.o0 != null && getVisibility() == 0) {
            c cVar = this.c;
            cVar.o0.onCalendarSelect(cVar.y0, false);
        }
        if (getVisibility() == 0) {
            c cVar2 = this.c;
            cVar2.s0.a(cVar2.j(), false);
        }
        this.d.w(com.haibin.calendarview.b.v(this.c.j(), this.c.S()));
    }

    public void n() {
        for (int i = 0; i < getChildCount(); i++) {
            ((BaseWeekView) getChildAt(i)).updateCurrentDate();
        }
    }

    public void o() {
        BaseWeekView baseWeekView = (BaseWeekView) findViewWithTag(Integer.valueOf(getCurrentItem()));
        if (baseWeekView != null) {
            baseWeekView.setSelectedCalendar(this.c.y0);
            baseWeekView.invalidate();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.c.r0() && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.c.f(), 1073741824));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.c.r0() && super.onTouchEvent(motionEvent);
    }

    public final void p() {
        for (int i = 0; i < getChildCount(); i++) {
            BaseWeekView baseWeekView = (BaseWeekView) getChildAt(i);
            baseWeekView.updateItemHeight();
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
        Calendar calendar = this.c.y0;
        t(calendar, false);
        CalendarView.h hVar = this.c.s0;
        if (hVar != null) {
            hVar.a(calendar, false);
        }
        CalendarView.OnCalendarSelectListener onCalendarSelectListener = this.c.o0;
        if (onCalendarSelectListener != null) {
            onCalendarSelectListener.onCalendarSelect(calendar, false);
        }
        this.d.w(com.haibin.calendarview.b.v(calendar, this.c.S()));
    }

    public void r() {
        for (int i = 0; i < getChildCount(); i++) {
            ((BaseWeekView) getChildAt(i)).update();
        }
    }

    public void s() {
        for (int i = 0; i < getChildCount(); i++) {
            BaseWeekView baseWeekView = (BaseWeekView) getChildAt(i);
            baseWeekView.setSelectedCalendar(this.c.y0);
            baseWeekView.invalidate();
        }
    }

    public void setup(c cVar) {
        this.c = cVar;
        i();
    }

    public void t(Calendar calendar, boolean z) {
        int iU = com.haibin.calendarview.b.u(calendar, this.c.x(), this.c.z(), this.c.y(), this.c.S()) - 1;
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
            ((BaseWeekView) getChildAt(i)).updateShowMode();
        }
    }

    public void v() {
        if (this.c.J() == 0) {
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((BaseWeekView) getChildAt(i)).updateSingleSelect();
        }
    }

    public final void w() {
        for (int i = 0; i < getChildCount(); i++) {
            BaseWeekView baseWeekView = (BaseWeekView) getChildAt(i);
            baseWeekView.updateStyle();
            baseWeekView.invalidate();
        }
    }

    public void x() {
        if (getAdapter() == null) {
            return;
        }
        int count = getAdapter().getPagerCount();
        int iS = com.haibin.calendarview.b.s(this.c.x(), this.c.z(), this.c.y(), this.c.s(), this.c.u(), this.c.t(), this.c.S());
        this.b = iS;
        if (count != iS) {
            this.a = true;
            getAdapter().notifyDataSetChanged();
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((BaseWeekView) getChildAt(i)).updateWeekStart();
        }
        this.a = false;
        t(this.c.y0, false);
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
