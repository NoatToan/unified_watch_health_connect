package com.huawei.ui.commonui.calendarview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.uikit.hwviewpager.widget.HwPagerAdapter;
import defpackage.qjj;
import defpackage.qjo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class HealthWeekViewPager extends HealthViewPager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    HealthCalendarLayout f23349c;
    private boolean d;
    private boolean e;
    private qjo h;
    private int i;

    public HealthWeekViewPager(Context context) {
        this(context, null);
    }

    public HealthWeekViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    void setup(qjo qjoVar) {
        this.h = qjoVar;
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.h.n != null) {
            this.h.n.onWeekChange(getCurrentWeekCalendars());
        }
    }

    private void f() {
        this.i = qjj.c(this.h.r(), this.h.m(), this.h.aa());
        setAdapter(new c());
        addOnPageChangeListener(new HealthViewPager.OnPageChangeListener() { // from class: com.huawei.ui.commonui.calendarview.HealthWeekViewPager.3
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                if (HealthWeekViewPager.this.getVisibility() != 0) {
                    HealthWeekViewPager.this.d = false;
                    HealthWeekViewPager.this.k();
                } else {
                    if (HealthWeekViewPager.this.d) {
                        HealthWeekViewPager.this.d = false;
                        return;
                    }
                    HealthBaseWeekView healthBaseWeekView = (HealthBaseWeekView) HealthWeekViewPager.this.findViewWithTag(Integer.valueOf(i));
                    if (healthBaseWeekView != null) {
                        healthBaseWeekView.performClickCalendar(HealthWeekViewPager.this.h.o, !HealthWeekViewPager.this.d);
                        HealthWeekViewPager.this.k();
                    }
                    HealthWeekViewPager.this.d = false;
                }
            }
        });
    }

    List<HealthCalendar> getCurrentWeekCalendars() {
        List<HealthCalendar> listA = qjj.a(this.h.f46318a, this.h);
        this.h.e(listA);
        return listA;
    }

    void b() {
        this.i = qjj.c(this.h.r(), this.h.m(), this.h.aa());
        h();
    }

    @Override // com.huawei.ui.commonui.viewpager.HealthViewPager, com.huawei.uikit.hwviewpager.widget.HwViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.h.aq() && super.onTouchEvent(motionEvent);
    }

    @Override // com.huawei.ui.commonui.viewpager.HealthViewPager, com.huawei.uikit.hwviewpager.widget.HwViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.h.aq() && super.onInterceptTouchEvent(motionEvent);
    }

    void e() {
        this.e = true;
        b();
        this.e = false;
        if (getVisibility() != 0) {
            return;
        }
        this.d = true;
        HealthCalendar healthCalendar = this.h.o;
        a(healthCalendar, false);
        if (this.h.d != null) {
            this.h.d.onWeekDateSelected(healthCalendar, false);
        }
        if (this.h.f46319b != null) {
            this.h.f46319b.onCalendarSelect(healthCalendar, false);
        }
        int iE = qjj.e(healthCalendar, this.h.aa());
        HealthCalendarLayout healthCalendarLayout = this.f23349c;
        if (healthCalendarLayout != null) {
            healthCalendarLayout.b(iE);
        }
    }

    void e(HealthCalendar healthCalendar, boolean z, boolean z2) {
        this.d = true;
        HealthCalendar healthCalendar2 = new HealthCalendar(healthCalendar.getYear(), healthCalendar.getMonth(), healthCalendar.getDay());
        healthCalendar2.setPresentDay(healthCalendar2.equals(this.h.s()));
        this.h.f46318a = healthCalendar2;
        this.h.o = healthCalendar2;
        a(healthCalendar2, z);
        if (this.h.d != null) {
            this.h.d.onWeekDateSelected(healthCalendar2, false);
        }
        if (this.h.f46319b != null && z2) {
            this.h.f46319b.onCalendarSelect(healthCalendar2, false);
        }
        int iE = qjj.e(healthCalendar2, this.h.aa());
        HealthCalendarLayout healthCalendarLayout = this.f23349c;
        if (healthCalendarLayout != null) {
            healthCalendarLayout.b(iE);
        }
    }

    void e(boolean z) {
        this.d = true;
        int iD = qjj.d(this.h.s(), this.h.r(), this.h.aa()) - 1;
        if (getCurrentItem() == iD) {
            this.d = false;
        }
        setCurrentItem(iD, z);
        HealthBaseWeekView healthBaseWeekView = (HealthBaseWeekView) findViewWithTag(Integer.valueOf(iD));
        if (healthBaseWeekView != null) {
            healthBaseWeekView.performClickCalendar(this.h.s(), false);
            healthBaseWeekView.setSelectedCalendar(this.h.s());
            healthBaseWeekView.invalidate();
        }
        if (this.h.f46319b != null && getVisibility() == 0) {
            this.h.f46319b.onCalendarSelect(this.h.o, false);
        }
        if (getVisibility() == 0) {
            this.h.d.onWeekDateSelected(this.h.s(), false);
        }
        int iE = qjj.e(this.h.s(), this.h.aa());
        HealthCalendarLayout healthCalendarLayout = this.f23349c;
        if (healthCalendarLayout != null) {
            healthCalendarLayout.b(iE);
        }
    }

    void a(HealthCalendar healthCalendar, boolean z) {
        int iD = qjj.d(healthCalendar, this.h.r(), this.h.aa()) - 1;
        this.d = getCurrentItem() != iD;
        setCurrentItem(iD, z);
        HealthBaseWeekView healthBaseWeekView = (HealthBaseWeekView) findViewWithTag(Integer.valueOf(iD));
        if (healthBaseWeekView != null) {
            healthBaseWeekView.setSelectedCalendar(healthCalendar);
            healthBaseWeekView.invalidate();
        }
    }

    void a() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof HealthBaseWeekView) {
                ((HealthBaseWeekView) childAt).updatePresentDate();
            }
        }
    }

    void d() {
        for (int i = 0; i < getChildCount(); i++) {
            ((HealthBaseWeekView) getChildAt(i)).update();
        }
    }

    void c() {
        for (int i = 0; i < getChildCount(); i++) {
            ((HealthBaseWeekView) getChildAt(i)).updateDisplayMode();
        }
    }

    void i() {
        if (getAdapter() == null) {
            return;
        }
        int count = getAdapter().getCount();
        int iC = qjj.c(this.h.r(), this.h.m(), this.h.aa());
        this.i = iC;
        if (count != iC) {
            this.e = true;
            getAdapter().notifyDataSetChanged();
        }
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i) instanceof HealthBaseWeekView) {
                ((HealthBaseWeekView) getChildAt(i)).updateWeekStart();
            }
        }
        this.e = false;
        a(this.h.o, false);
    }

    private void h() {
        if (getAdapter() == null) {
            return;
        }
        getAdapter().notifyDataSetChanged();
    }

    /* JADX INFO: loaded from: classes43.dex */
    class c extends HwPagerAdapter {
        private c() {
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public int getCount() {
            return HealthWeekViewPager.this.i;
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public int getItemPosition(Object obj) {
            if (HealthWeekViewPager.this.e) {
                return -2;
            }
            return super.getItemPosition(obj);
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view.equals(obj);
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            HealthBaseWeekView healthBaseWeekView;
            try {
                Constructor<?> constructor = HealthWeekViewPager.this.h.ag().getConstructor(Context.class);
                healthBaseWeekView = constructor.newInstance(HealthWeekViewPager.this.getContext()) instanceof HealthBaseWeekView ? (HealthBaseWeekView) constructor.newInstance(HealthWeekViewPager.this.getContext()) : null;
            } catch (IllegalAccessException unused) {
                Log.e("HealthWeekViewPager", "IllegalAccessException in reflect call HealthCalendarBaseMonthView constructor");
            } catch (InstantiationException unused2) {
                Log.e("HealthWeekViewPager", "InstantiationException in reflect call HealthCalendarBaseMonthView constructor");
            } catch (NoSuchMethodException unused3) {
                Log.e("HealthWeekViewPager", "NoSuchMethodException in reflect call HealthCalendarBaseMonthView constructor");
            } catch (InvocationTargetException unused4) {
                Log.e("HealthWeekViewPager", "InvocationTargetException in reflect call HealthCalendarBaseMonthView constructor");
            }
            if (healthBaseWeekView == null) {
                return new HealthDefaultWeekView(HealthWeekViewPager.this.getContext());
            }
            healthBaseWeekView.mParentLayout = HealthWeekViewPager.this.f23349c;
            healthBaseWeekView.init(HealthWeekViewPager.this.h);
            healthBaseWeekView.init(qjj.c(HealthWeekViewPager.this.h.r(), i + 1, HealthWeekViewPager.this.h.aa()));
            healthBaseWeekView.setTag(Integer.valueOf(i));
            healthBaseWeekView.setSelectedCalendar(HealthWeekViewPager.this.h.o);
            healthBaseWeekView.setMarkerViewClickable(HealthWeekViewPager.this.h.ae());
            viewGroup.addView(healthBaseWeekView);
            return healthBaseWeekView;
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (obj instanceof HealthBaseWeekView) {
                HealthBaseWeekView healthBaseWeekView = (HealthBaseWeekView) obj;
                healthBaseWeekView.onDestroy();
                viewGroup.removeView(healthBaseWeekView);
            }
        }
    }
}
