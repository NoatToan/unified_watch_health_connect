package com.huawei.ui.commonui.calendarview;

import android.content.Context;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.uikit.hwviewpager.widget.HwPagerAdapter;
import defpackage.qjj;
import defpackage.qjo;
import health.compact.a.UnitUtil;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class HealthMonthViewPager extends HealthViewPager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    HealthWeekViewPager f23340c;
    HealthCalendarLayout d;
    HealthTextView e;
    private boolean f;
    private boolean g;
    private int h;
    private qjo i;
    private HwPagerAdapter j;
    private int k;
    private int l;
    private int m;

    public HealthMonthViewPager(Context context) {
        this(context, null);
    }

    public HealthMonthViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    void setup(qjo qjoVar) {
        this.i = qjoVar;
        d(qjoVar.s());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.h;
        setLayoutParams(layoutParams);
        k();
    }

    private void k() {
        this.m = qjj.d(this.i);
        d dVar = new d();
        this.j = dVar;
        setAdapter(dVar);
        addOnPageChangeListener(new HealthViewPager.OnPageChangeListener() { // from class: com.huawei.ui.commonui.calendarview.HealthMonthViewPager.5
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                HealthMonthViewPager.this.a(i, f);
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                HealthCalendar healthCalendarB = qjj.b(i, HealthMonthViewPager.this.i);
                HealthMonthViewPager healthMonthViewPager = HealthMonthViewPager.this;
                healthMonthViewPager.c(healthMonthViewPager.i.as() ? HealthMonthViewPager.this.i.f46318a : healthCalendarB);
                if (HealthMonthViewPager.this.getVisibility() == 0) {
                    HealthMonthViewPager.this.i.f46318a = healthCalendarB;
                }
                if (HealthMonthViewPager.this.f23340c.getVisibility() == 0) {
                    HealthMonthViewPager.this.d(healthCalendarB);
                    return;
                }
                if (!healthCalendarB.isPresentMonth()) {
                    HealthMonthViewPager.this.i.o = healthCalendarB;
                } else {
                    HealthMonthViewPager.this.i.o = qjj.d(healthCalendarB, HealthMonthViewPager.this.i);
                }
                HealthMonthViewPager.this.i.f46318a = HealthMonthViewPager.this.i.o;
                if (!HealthMonthViewPager.this.f && HealthMonthViewPager.this.i.f46319b != null) {
                    HealthMonthViewPager.this.i.f46319b.onCalendarSelect(HealthMonthViewPager.this.i.o, false);
                }
                HealthCalendarBaseMonthView healthCalendarBaseMonthView = (HealthCalendarBaseMonthView) HealthMonthViewPager.this.findViewWithTag(Integer.valueOf(i));
                if (healthCalendarBaseMonthView != null) {
                    int selectedIndex = healthCalendarBaseMonthView.getSelectedIndex(HealthMonthViewPager.this.i.f46318a);
                    healthCalendarBaseMonthView.mCurrentItem = selectedIndex;
                    if (selectedIndex >= 0 && HealthMonthViewPager.this.d != null) {
                        HealthMonthViewPager.this.d.e(selectedIndex);
                    }
                    healthCalendarBaseMonthView.invalidate();
                }
                HealthMonthViewPager.this.f23340c.a(HealthMonthViewPager.this.i.f46318a, false);
                HealthMonthViewPager.this.d(healthCalendarB);
                HealthMonthViewPager.this.f = false;
            }
        });
    }

    @Override // com.huawei.ui.commonui.viewpager.HealthViewPager, com.huawei.uikit.hwviewpager.widget.HwViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.i.af() && super.onTouchEvent(motionEvent);
    }

    @Override // com.huawei.ui.commonui.viewpager.HealthViewPager, com.huawei.uikit.hwviewpager.widget.HwViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.i.af() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(HealthCalendar healthCalendar) {
        Calendar calendarTransformCalendar = healthCalendar.transformCalendar();
        int i = this.i.as() ? 22 : 36;
        this.e.setText(this.i.as() ? UnitUtil.a(new Date(calendarTransformCalendar.getTimeInMillis()), i) : DateUtils.formatDateTime(getContext(), calendarTransformCalendar.getTimeInMillis(), i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, float f) {
        float f2;
        int i2;
        if (i < getCurrentItem()) {
            f2 = this.l * (1.0f - f);
            i2 = this.h;
        } else {
            f2 = this.h * (1.0f - f);
            i2 = this.k;
        }
        int i3 = (int) (f2 + (i2 * f));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i3;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(HealthCalendar healthCalendar) {
        if (this.d != null) {
            if (getVisibility() != 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = qjj.c(healthCalendar, this.i);
                setLayoutParams(layoutParams);
            }
            this.d.g();
        }
        b(healthCalendar);
    }

    void a() {
        b(this.i.f46318a);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.h;
        setLayoutParams(layoutParams);
    }

    private void b(HealthCalendar healthCalendar) {
        this.h = qjj.c(healthCalendar, this.i);
        int month = healthCalendar.getMonth();
        int year = healthCalendar.getYear();
        if (month == 1) {
            this.l = qjj.a(year - 1, 12, this.i);
            this.k = qjj.a(year, 2, this.i);
            return;
        }
        this.l = qjj.a(year, month - 1, this.i);
        if (month == 12) {
            this.k = qjj.a(year + 1, 1, this.i);
        } else {
            this.k = qjj.a(year, month + 1, this.i);
        }
    }

    void c() {
        this.m = qjj.d(this.i);
        l();
    }

    void b() {
        for (int i = 0; i < getChildCount(); i++) {
            ((HealthCalendarBaseMonthView) getChildAt(i)).update();
        }
    }

    void f() {
        this.g = true;
        c();
        this.g = false;
        if (getVisibility() != 0) {
            return;
        }
        this.f = false;
        HealthCalendar healthCalendar = this.i.o;
        int iB = qjj.b(healthCalendar, this.i);
        setCurrentItem(iB, false);
        d(iB, healthCalendar);
        if (this.i.d != null) {
            this.i.d.onMonthDateSelected(healthCalendar, false);
        }
        if (this.i.f46319b != null) {
            this.i.f46319b.onCalendarSelect(healthCalendar, false);
        }
        h();
    }

    void b(HealthCalendar healthCalendar, boolean z, boolean z2) {
        this.f = true;
        HealthCalendar healthCalendar2 = new HealthCalendar(healthCalendar.getYear(), healthCalendar.getMonth(), healthCalendar.getDay());
        healthCalendar2.setPresentDay(healthCalendar2.equals(this.i.s()));
        this.i.f46318a = healthCalendar2;
        this.i.o = healthCalendar2;
        int iB = qjj.b(healthCalendar2, this.i);
        if (getCurrentItem() == iB) {
            this.f = false;
        }
        setCurrentItem(iB, z);
        d(iB, healthCalendar2);
        if (this.i.f46319b != null && z2) {
            this.i.f46319b.onCalendarSelect(healthCalendar2, false);
        }
        if (this.i.d != null) {
            this.i.d.onMonthDateSelected(healthCalendar2, false);
        }
        h();
    }

    public void d(int i, HealthCalendar healthCalendar) {
        HealthCalendarBaseMonthView healthCalendarBaseMonthView = (HealthCalendarBaseMonthView) findViewWithTag(Integer.valueOf(i));
        if (healthCalendarBaseMonthView != null) {
            healthCalendarBaseMonthView.setSelectedCalendar(this.i.f46318a);
            healthCalendarBaseMonthView.invalidate();
            HealthCalendarLayout healthCalendarLayout = this.d;
            if (healthCalendarLayout != null) {
                healthCalendarLayout.e(healthCalendarBaseMonthView.getSelectedIndex(this.i.f46318a));
            }
        }
        if (this.d != null) {
            this.d.b(qjj.e(healthCalendar, this.i.aa()));
        }
    }

    void a(boolean z) {
        this.f = true;
        int iC = qjj.c(this.i);
        if (getCurrentItem() == iC) {
            this.f = false;
        }
        setCurrentItem(iC, z);
        HealthCalendarBaseMonthView healthCalendarBaseMonthView = (HealthCalendarBaseMonthView) findViewWithTag(Integer.valueOf(iC));
        if (healthCalendarBaseMonthView != null) {
            healthCalendarBaseMonthView.setSelectedCalendar(this.i.s());
            healthCalendarBaseMonthView.invalidate();
            HealthCalendarLayout healthCalendarLayout = this.d;
            if (healthCalendarLayout != null) {
                healthCalendarLayout.e(healthCalendarBaseMonthView.getSelectedIndex(this.i.s()));
            }
        }
        if (this.i.f46319b == null || getVisibility() != 0) {
            return;
        }
        this.i.f46319b.onCalendarSelect(this.i.o, false);
    }

    List<HealthCalendar> getPresentMonthCalendars() {
        HealthCalendarBaseMonthView healthCalendarBaseMonthView = (HealthCalendarBaseMonthView) findViewWithTag(Integer.valueOf(getCurrentItem()));
        if (healthCalendarBaseMonthView == null) {
            return Collections.EMPTY_LIST;
        }
        return healthCalendarBaseMonthView.mItems;
    }

    void h() {
        for (int i = 0; i < getChildCount(); i++) {
            HealthCalendarBaseMonthView healthCalendarBaseMonthView = (HealthCalendarBaseMonthView) getChildAt(i);
            healthCalendarBaseMonthView.setSelectedCalendar(this.i.o);
            healthCalendarBaseMonthView.invalidate();
        }
        if (this.i.as()) {
            c(this.i.f46318a);
        }
    }

    void e() {
        for (int i = 0; i < getChildCount(); i++) {
            HealthCalendarBaseMonthView healthCalendarBaseMonthView = (HealthCalendarBaseMonthView) getChildAt(i);
            healthCalendarBaseMonthView.updateDisplayMode();
            healthCalendarBaseMonthView.requestLayout();
        }
        d(this.i.o);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.h;
        setLayoutParams(layoutParams);
        HealthCalendarLayout healthCalendarLayout = this.d;
        if (healthCalendarLayout != null) {
            healthCalendarLayout.g();
        }
    }

    void i() {
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i) instanceof HealthCalendarBaseMonthView) {
                HealthCalendarBaseMonthView healthCalendarBaseMonthView = (HealthCalendarBaseMonthView) getChildAt(i);
                healthCalendarBaseMonthView.updateWeekStart();
                healthCalendarBaseMonthView.requestLayout();
            }
        }
        d(this.i.o);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.h;
        setLayoutParams(layoutParams);
        if (this.d != null) {
            this.d.b(qjj.e(this.i.o, this.i.aa()));
        }
        h();
    }

    private void l() {
        if (getAdapter() == null) {
            return;
        }
        getAdapter().notifyDataSetChanged();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager
    public void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager
    public void setCurrentItem(int i, boolean z) {
        if (Math.abs(getCurrentItem() - i) > 1) {
            super.setCurrentItem(i, false);
        } else {
            super.setCurrentItem(i, z);
        }
    }

    void d() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof HealthCalendarBaseMonthView) {
                ((HealthCalendarBaseMonthView) childAt).updatePresentDate();
            }
        }
    }

    /* JADX INFO: loaded from: classes43.dex */
    final class d extends HwPagerAdapter {
        private d() {
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public int getCount() {
            return HealthMonthViewPager.this.m;
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public int getItemPosition(Object obj) {
            if (HealthMonthViewPager.this.g) {
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
            HealthCalendarBaseMonthView healthCalendarBaseMonthView;
            try {
                Constructor<?> constructor = HealthMonthViewPager.this.i.t().getConstructor(Context.class);
                healthCalendarBaseMonthView = constructor.newInstance(HealthMonthViewPager.this.getContext()) instanceof HealthCalendarBaseMonthView ? (HealthCalendarBaseMonthView) constructor.newInstance(HealthMonthViewPager.this.getContext()) : null;
            } catch (IllegalAccessException unused) {
                Log.e("HealthMonthViewPager", "IllegalAccessException in reflect call HealthCalendarBaseMonthView constructor");
            } catch (InstantiationException unused2) {
                Log.e("HealthMonthViewPager", "InstantiationException in reflect call HealthCalendarBaseMonthView constructor");
            } catch (NoSuchMethodException unused3) {
                Log.e("HealthMonthViewPager", "NoSuchMethodException in reflect call HealthCalendarBaseMonthView constructor");
            } catch (InvocationTargetException unused4) {
                Log.e("HealthMonthViewPager", "InvocationTargetException in reflect call HealthCalendarBaseMonthView constructor");
            }
            if (healthCalendarBaseMonthView == null) {
                HealthDefaultMonthView healthDefaultMonthView = new HealthDefaultMonthView(HealthMonthViewPager.this.getContext());
                healthDefaultMonthView.init(HealthMonthViewPager.this.i);
                return healthDefaultMonthView;
            }
            healthCalendarBaseMonthView.mHealthMonthViewPager = HealthMonthViewPager.this;
            healthCalendarBaseMonthView.mParentLayout = HealthMonthViewPager.this.d;
            healthCalendarBaseMonthView.init(HealthMonthViewPager.this.i);
            healthCalendarBaseMonthView.setTag(Integer.valueOf(i));
            healthCalendarBaseMonthView.initMonthWithDate(qjj.a(i, HealthMonthViewPager.this.i), qjj.e(i, HealthMonthViewPager.this.i));
            healthCalendarBaseMonthView.setSelectedCalendar(HealthMonthViewPager.this.i.o);
            viewGroup.addView(healthCalendarBaseMonthView);
            return healthCalendarBaseMonthView;
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (obj instanceof HealthCalendarBaseView) {
                HealthCalendarBaseView healthCalendarBaseView = (HealthCalendarBaseView) obj;
                healthCalendarBaseView.onDestroy();
                viewGroup.removeView(healthCalendarBaseView);
            }
        }
    }
}
