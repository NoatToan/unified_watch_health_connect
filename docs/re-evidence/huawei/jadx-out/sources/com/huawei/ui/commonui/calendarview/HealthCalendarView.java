package com.huawei.ui.commonui.calendarview;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qjj;
import defpackage.qjo;
import defpackage.xfs;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class HealthCalendarView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthMonthViewPager f23318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f23319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    HealthCalendarLayout f23320c;
    private HealthWeekBar d;
    private final qjo e;
    private HealthWeekViewPager g;

    public interface OnCalendarSelectListener {
        void onCalendarOutOfRange(HealthCalendar healthCalendar);

        void onCalendarSelect(HealthCalendar healthCalendar, boolean z);
    }

    public interface OnInnerDateSelectedListener {
        void onMonthDateSelected(HealthCalendar healthCalendar, boolean z);

        void onWeekDateSelected(HealthCalendar healthCalendar, boolean z);
    }

    public interface OnViewChangeListener {
        void onViewChange(boolean z);
    }

    public interface OnWeekChangeListener {
        void onWeekChange(List<HealthCalendar> list);
    }

    public HealthCalendarView(Context context) {
        this(context, null);
    }

    public HealthCalendarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.healthCalendarViewStyle);
    }

    public HealthCalendarView(Context context, AttributeSet attributeSet, int i) {
        super(d(context, i), attributeSet, i);
        this.e = new qjo(context, attributeSet, i, R.style.Widget_Emui_HealthCalendarView);
        d(super.getContext());
    }

    private static Context d(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HealthCalendarView);
    }

    private void d(Context context) {
        LayoutInflater.from(context).inflate(R.layout.health_calendar_view, (ViewGroup) this, true);
        HealthWeekViewPager healthWeekViewPager = (HealthWeekViewPager) findViewById(R.id.vp_week);
        this.g = healthWeekViewPager;
        healthWeekViewPager.setup(this.e);
        this.g.setIsAutoCurrentItemHeight(true);
        e();
        c();
        HealthMonthViewPager healthMonthViewPager = (HealthMonthViewPager) findViewById(R.id.vp_month);
        this.f23318a = healthMonthViewPager;
        healthMonthViewPager.f23340c = this.g;
        this.f23318a.e = (HealthTextView) findViewById(R.id.sub_header);
        a();
        if (c(this.e.s())) {
            qjo qjoVar = this.e;
            qjoVar.o = qjoVar.b();
        } else {
            qjo qjoVar2 = this.e;
            qjoVar2.o = qjoVar2.r();
        }
        qjo qjoVar3 = this.e;
        qjoVar3.f46318a = qjoVar3.o;
        this.f23318a.setup(this.e);
        this.f23318a.setCurrentItem(this.e.h);
        this.g.a(this.e.b(), false);
    }

    private void c() {
        try {
            Constructor<?> constructor = this.e.z().getConstructor(Context.class);
            if (constructor.newInstance(getContext()) instanceof HealthWeekBar) {
                this.d = (HealthWeekBar) constructor.newInstance(getContext());
            }
        } catch (IllegalAccessException unused) {
            Log.e("HealthCalendarView", "IllegalAccessException in reflect call HealthWeekBar constructor");
        } catch (InstantiationException unused2) {
            Log.e("HealthCalendarView", "InstantiationException in reflect call HealthWeekBar constructor");
        } catch (NoSuchMethodException unused3) {
            Log.e("HealthCalendarView", "NoSuchMethodException in reflect call HealthWeekBar constructor");
        } catch (InvocationTargetException unused4) {
            Log.e("HealthCalendarView", "InvocationTargetException in reflect call HealthWeekBar constructor");
        }
        if (this.d == null) {
            this.d = new HealthWeekBar(getContext());
        }
        ((LinearLayout) findViewById(R.id.frameContent)).addView(this.d, 0, new ViewGroup.LayoutParams(-1, -2));
        this.d.a(this.e);
        this.d.b(this.e.aa());
        HealthWeekBar healthWeekBar = this.d;
        healthWeekBar.measure(healthWeekBar.getMeasuredWidthAndState(), 0);
        this.e.f(this.d.getMeasuredHeight());
    }

    private void a() {
        this.e.d = new OnInnerDateSelectedListener() { // from class: com.huawei.ui.commonui.calendarview.HealthCalendarView.5
            @Override // com.huawei.ui.commonui.calendarview.HealthCalendarView.OnInnerDateSelectedListener
            public void onMonthDateSelected(HealthCalendar healthCalendar, boolean z) {
                if (healthCalendar.getYear() == HealthCalendarView.this.e.s().getYear() && healthCalendar.getMonth() == HealthCalendarView.this.e.s().getMonth() && HealthCalendarView.this.f23318a.getCurrentItem() != HealthCalendarView.this.e.h) {
                    return;
                }
                HealthCalendarView.this.e.f46318a = healthCalendar;
                if (z) {
                    HealthCalendarView.this.e.o = healthCalendar;
                }
                HealthCalendarView.this.g.a(HealthCalendarView.this.e.f46318a, false);
                HealthCalendarView.this.f23318a.h();
            }

            @Override // com.huawei.ui.commonui.calendarview.HealthCalendarView.OnInnerDateSelectedListener
            public void onWeekDateSelected(HealthCalendar healthCalendar, boolean z) {
                HealthCalendarView.this.e.f46318a = healthCalendar;
                if (z || HealthCalendarView.this.e.f46318a.equals(HealthCalendarView.this.e.o)) {
                    HealthCalendarView.this.e.o = healthCalendar;
                }
                HealthCalendarView.this.f23318a.setCurrentItem(qjj.b(healthCalendar, HealthCalendarView.this.e), false);
                HealthCalendarView.this.f23318a.h();
            }
        };
    }

    private void e() {
        View viewFindViewById = findViewById(R.id.titleBar);
        this.f23319b = viewFindViewById;
        viewFindViewById.measure(viewFindViewById.getMeasuredWidthAndState(), 0);
        this.e.i(this.f23319b.getMeasuredHeight());
        ImageView imageView = (ImageView) findViewById(R.id.left_btn);
        ImageView imageView2 = (ImageView) findViewById(R.id.right_btn);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.commonui.calendarview.HealthCalendarView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HealthCalendarView.this.e(true);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.commonui.calendarview.HealthCalendarView.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HealthCalendarView.this.b(true);
            }
        });
    }

    public void a(boolean z) {
        this.f23319b.setVisibility(z ? 8 : 0);
        if (z) {
            this.e.i(0);
            return;
        }
        View view = this.f23319b;
        view.measure(view.getMeasuredWidthAndState(), 0);
        this.e.i(this.f23319b.getMeasuredHeight());
    }

    public void d(boolean z) {
        HealthWeekBar healthWeekBar = this.d;
        if (healthWeekBar != null) {
            healthWeekBar.setVisibility(z ? 8 : 0);
            if (!z) {
                HealthWeekBar healthWeekBar2 = this.d;
                healthWeekBar2.measure(healthWeekBar2.getMeasuredWidthAndState(), 0);
                this.e.f(this.d.getMeasuredHeight());
            }
        }
        if (z) {
            this.e.f(0);
        }
    }

    public void setRange(HealthCalendar healthCalendar, HealthCalendar healthCalendar2) {
        if (healthCalendar.compareTo(healthCalendar2) > 0) {
            return;
        }
        this.e.b(healthCalendar, healthCalendar2);
        this.g.b();
        this.f23318a.c();
        if (!c(this.e.o)) {
            qjo qjoVar = this.e;
            qjoVar.o = qjoVar.r();
            qjo qjoVar2 = this.e;
            qjoVar2.f46318a = qjoVar2.o;
        }
        this.g.e();
        this.f23318a.f();
    }

    public void setRange(HealthCalendar healthCalendar, HealthCalendar healthCalendar2, boolean z) {
        setShowFullMonth(z);
        this.e.d(true);
        setRange(healthCalendar, healthCalendar2);
        this.f23318a.a();
    }

    void setShowFullMonth(boolean z) {
        this.e.m(z);
    }

    public HealthCalendar getCurCanlendar() {
        return this.e.s();
    }

    public void c(boolean z) {
        d();
        if (c(this.e.s())) {
            HealthCalendar healthCalendarB = this.e.b();
            this.e.o = healthCalendarB;
            this.e.f46318a = healthCalendarB;
            if (this.f23318a.getVisibility() == 0) {
                this.f23318a.a(z);
                this.g.a(this.e.f46318a, false);
            } else {
                this.g.e(z);
            }
        }
    }

    public void b(boolean z) {
        if (this.g.getVisibility() == 0) {
            HealthWeekViewPager healthWeekViewPager = this.g;
            healthWeekViewPager.setCurrentItem(healthWeekViewPager.getCurrentItem() + 1, z);
        } else {
            HealthMonthViewPager healthMonthViewPager = this.f23318a;
            healthMonthViewPager.setCurrentItem(healthMonthViewPager.getCurrentItem() + 1, z);
        }
    }

    public void e(boolean z) {
        if (this.g.getVisibility() == 0) {
            HealthWeekViewPager healthWeekViewPager = this.g;
            healthWeekViewPager.setCurrentItem(healthWeekViewPager.getCurrentItem() - 1, z);
        } else {
            HealthMonthViewPager healthMonthViewPager = this.f23318a;
            healthMonthViewPager.setCurrentItem(healthMonthViewPager.getCurrentItem() - 1, z);
        }
    }

    public void a(HealthCalendar healthCalendar) {
        c(healthCalendar, false, true);
    }

    public void c(HealthCalendar healthCalendar, boolean z, boolean z2) {
        if (healthCalendar.isAvailable() && c(healthCalendar)) {
            if (this.g.getVisibility() == 0) {
                this.g.e(healthCalendar, z, z2);
            } else {
                this.f23318a.b(healthCalendar, z, z2);
            }
        }
    }

    public final void setMonthViewScrollable(boolean z) {
        this.e.j(z);
    }

    public final void setWeekViewScrollable(boolean z) {
        this.e.l(z);
    }

    public final void setIsWeekDayReplaceDate(boolean z) {
        this.e.i(z);
    }

    public final void setMarkViewSize(int i) {
        this.e.h(i);
    }

    public final void setMarkTopMargin(int i) {
        this.e.b(i);
    }

    public void setOnWeekChangeListener(OnWeekChangeListener onWeekChangeListener) {
        this.e.n = onWeekChangeListener;
    }

    public void setOnCalendarSelectListener(OnCalendarSelectListener onCalendarSelectListener) {
        this.e.f46319b = onCalendarSelectListener;
        if (this.e.f46319b == null) {
            return;
        }
        c(this.e.o);
    }

    public void setOnViewChangeListener(OnViewChangeListener onViewChangeListener) {
        this.e.l = onViewChangeListener;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        if (this.e == null) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putSerializable("selected_calendar", this.e.o);
        bundle.putSerializable("index_calendar", this.e.f46318a);
        return bundle;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Serializable serializable = bundle.getSerializable("selected_calendar");
            if (serializable instanceof HealthCalendar) {
                this.e.o = (HealthCalendar) serializable;
            }
            if (this.e.f46319b != null) {
                this.e.f46319b.onCalendarSelect(this.e.o, false);
            }
            Serializable serializable2 = bundle.getSerializable("index_calendar");
            if (serializable2 instanceof HealthCalendar) {
                this.e.f46318a = (HealthCalendar) serializable2;
            }
            if (this.e.f46318a != null) {
                a(this.e.f46318a);
            }
            i();
            super.onRestoreInstanceState(bundle.getParcelable("super"));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof HealthCalendarLayout) {
            HealthCalendarLayout healthCalendarLayout = (HealthCalendarLayout) getParent();
            this.f23320c = healthCalendarLayout;
            this.f23318a.d = healthCalendarLayout;
            this.g.f23349c = this.f23320c;
            this.f23320c.a(this.e);
            this.f23320c.c();
        }
    }

    public final void e(Map<String, HealthCalendar> map) {
        if (this.e == null || map == null || map.size() == 0) {
            return;
        }
        this.e.c(map);
        this.f23318a.b();
        this.g.d();
    }

    public final void b() {
        this.e.e();
        this.f23318a.b();
        this.g.d();
    }

    public void setWeekStart(int i) {
        if ((i == 1 || i == 2 || i == 7) && i != this.e.aa()) {
            this.e.m(i);
            this.d.b(i);
            this.g.i();
            this.f23318a.i();
        }
    }

    public void setDayTextSize(int i) {
        this.e.d(i);
    }

    public void setMarkerViewClickable(boolean z) {
        this.e.h(z);
    }

    public void setOnlyCurrentMode() {
        setDisplayMode(1);
    }

    public void setFixMode() {
        setDisplayMode(2);
    }

    private void setDisplayMode(int i) {
        if ((i == 1 || i == 2) && this.e.q() != i) {
            this.e.g(i);
            this.g.c();
            this.f23318a.e();
            this.g.b();
        }
    }

    private void i() {
        this.d.b(this.e.aa());
        this.f23318a.b();
        this.g.d();
    }

    public HealthCalendar getSelectedCalendar() {
        return this.e.o;
    }

    protected final boolean c(HealthCalendar healthCalendar) {
        qjo qjoVar = this.e;
        return qjoVar != null && qjj.e(healthCalendar, qjoVar);
    }

    public void setModeOnlyWeekView() {
        this.g.setVisibility(0);
        this.f23318a.setVisibility(8);
    }

    public void setModeOnlyMonthView() {
        this.f23318a.setVisibility(0);
        this.g.setVisibility(8);
    }

    public void setWeekViewIsScroll(boolean z) {
        this.g.setIsScroll(z);
    }

    public void setMonthViewIsScroll(boolean z) {
        this.f23318a.setIsScroll(z);
    }

    public void setIsSetGrayUnmarkedDate(boolean z) {
        this.e.a(z);
    }

    public void setIsSetGrayFutureDate(boolean z) {
        this.e.c(z);
    }

    public void setIsSelectFutureDate(boolean z) {
        this.e.e(z);
    }

    public void setIsShowFutureDate(boolean z) {
        this.e.f(z);
        this.f23318a.a();
    }

    public void setRangeGray(HealthCalendar healthCalendar, HealthCalendar healthCalendar2) {
        this.e.e(healthCalendar, healthCalendar2);
    }

    public void setSelectGrayDate(boolean z) {
        this.e.g(z);
    }

    public final void d() {
        if (this.e == null || this.f23318a == null || this.g == null) {
            return;
        }
        Date date = new Date();
        if (this.e.s().equals(new HealthCalendar(qjj.b("yyyy", date), qjj.b("MM", date), qjj.b("dd", date)))) {
            return;
        }
        this.e.ap();
        this.f23318a.d();
        this.g.a();
    }

    public void setIsDrawSelected(boolean z) {
        this.e.b(z);
    }

    public void setExtraSpace(int i) {
        this.e.a(i);
    }

    public List<HealthCalendar> getCurrentWeekCalendars() {
        HealthWeekViewPager healthWeekViewPager = this.g;
        if (healthWeekViewPager == null) {
            return new ArrayList(0);
        }
        return healthWeekViewPager.getCurrentWeekCalendars();
    }

    public void setForbiddenSwipeNextWeek(boolean z) {
        HealthWeekViewPager healthWeekViewPager = this.g;
        if (healthWeekViewPager != null) {
            healthWeekViewPager.setIsScrollToLeft(!z);
        }
    }

    public void setForbiddenSwipePreWeek(boolean z) {
        HealthWeekViewPager healthWeekViewPager = this.g;
        if (healthWeekViewPager != null) {
            healthWeekViewPager.setIsScrollToRight(!z);
        }
    }
}
