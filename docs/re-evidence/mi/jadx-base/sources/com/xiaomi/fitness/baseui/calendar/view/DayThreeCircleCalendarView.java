package com.xiaomi.fitness.baseui.calendar.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.share.report.holder.EditCustomTabLayoutHolder;
import defpackage.c8h;
import defpackage.cdp;
import defpackage.m80;
import defpackage.mj8;
import defpackage.o93;
import defpackage.p93;
import defpackage.pad;
import defpackage.qdg;
import defpackage.y93;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public class DayThreeCircleCalendarView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LocalDate f11611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<RectF> f11612b;
    public List<LocalDate> c;
    public List<RectF> d;
    public List<LocalDate> e;
    public int f;
    public LocalDate g;
    public o93 h;
    public y93 i;
    public Map<Long, cdp> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c8h f11613k;
    public cdp l;
    public c m;
    public GestureDetector n;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            for (int i = 0; i < DayThreeCircleCalendarView.this.f11612b.size(); i++) {
                if (DayThreeCircleCalendarView.this.f11612b.get(i).contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    LocalDate localDate = DayThreeCircleCalendarView.this.c.get(i);
                    if (DayThreeCircleCalendarView.this.h(localDate)) {
                        return true;
                    }
                    DayThreeCircleCalendarView.this.i(localDate);
                    return true;
                }
            }
            return true;
        }
    }

    public class b extends qdg {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LocalDate f11615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f11616b;
        public final /* synthetic */ float c;
        public final /* synthetic */ long d;

        public b(LocalDate localDate, float f, float f2, long j) {
            this.f11615a = localDate;
            this.f11616b = f;
            this.c = f2;
            this.d = j;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            DayThreeCircleCalendarView.this.e(this.f11615a);
            DayThreeCircleCalendarView.this.g(this.f11615a);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(DayThreeCircleCalendarView.this, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, this.f11616b, this.c);
            objectAnimatorOfFloat.setDuration((this.d * 4) / 3);
            objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            objectAnimatorOfFloat.start();
        }
    }

    public class c extends mj8 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f11617a;

        public c(View view) {
            super(view);
            this.f11617a = new Rect();
        }

        @Override // defpackage.mj8
        public int getVirtualViewAt(float f, float f2) {
            for (int i = 0; i < DayThreeCircleCalendarView.this.d.size(); i++) {
                if (DayThreeCircleCalendarView.this.d.get(i).contains(f, f2)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // defpackage.mj8
        public void getVisibleVirtualViews(List<Integer> list) {
            for (int i = 0; i < DayThreeCircleCalendarView.this.d.size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // defpackage.mj8
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (i2 != 16 || i < 0 || i >= DayThreeCircleCalendarView.this.d.size() || i >= DayThreeCircleCalendarView.this.e.size()) {
                return false;
            }
            DayThreeCircleCalendarView dayThreeCircleCalendarView = DayThreeCircleCalendarView.this;
            dayThreeCircleCalendarView.i(dayThreeCircleCalendarView.e.get(i));
            return true;
        }

        @Override // defpackage.mj8
        public void onPopulateNodeForVirtualView(int i, m80 m80Var) {
            if (i < 0 || i >= DayThreeCircleCalendarView.this.d.size() || i >= DayThreeCircleCalendarView.this.e.size()) {
                this.f11617a.setEmpty();
                m80Var.d0(this.f11617a);
                m80Var.m0("");
                m80Var.j0(false);
                return;
            }
            RectF rectF = DayThreeCircleCalendarView.this.d.get(i);
            LocalDate localDate = DayThreeCircleCalendarView.this.e.get(i);
            this.f11617a.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            m80Var.d0(this.f11617a);
            String dateSimpleLocalFormat = TimeDateUtil.getDateSimpleLocalFormat(localDate);
            m80Var.j0(true);
            m80Var.m0(dateSimpleLocalFormat);
        }
    }

    public DayThreeCircleCalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = new GestureDetector(getContext(), new a());
        this.h = p93.a(context, attributeSet);
        LocalDate localDateNow = LocalDate.now();
        this.g = localDateNow;
        this.f11611a = localDateNow;
        this.f11612b = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        List<LocalDate> monthLocalDateCalendar = TimeDateUtil.getMonthLocalDateCalendar(localDateNow);
        this.c = monthLocalDateCalendar;
        this.f = monthLocalDateCalendar.size() / 7;
        this.i = new pad(this.h);
        c cVar = new c(this);
        this.m = cVar;
        androidx.core.view.c.r0(this, cVar);
    }

    public final void d(LocalDate localDate, float f, float f2, long j) {
        if (!this.h.Q) {
            e(localDate);
            g(localDate);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, f, f2);
        objectAnimatorOfFloat.setDuration((2 * j) / 3);
        objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        objectAnimatorOfFloat.start();
        objectAnimatorOfFloat.addListener(new b(localDate, f2, f, j));
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.m.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(LocalDate localDate) {
        List<LocalDate> monthLocalDateCalendar = TimeDateUtil.getMonthLocalDateCalendar(localDate);
        this.c = monthLocalDateCalendar;
        this.f = monthLocalDateCalendar.size() / 7;
    }

    public final RectF f(int i, int i2) {
        int measuredWidth = getMeasuredWidth();
        int iDip2px = DisplayUtil.dip2px(10.0f);
        int i3 = (int) (this.h.m * 2.0f);
        float f = i3 * 1.5f;
        int i4 = (measuredWidth - (i3 * 7)) / 8;
        int i5 = i2 + 1;
        int i6 = (i4 * i5) + (i2 * i3);
        float f2 = iDip2px + (i * f);
        float f3 = f + f2;
        if (AppUtil.isRTLDirection()) {
            int right = getRight() - i6;
            return new RectF(right - (i4 + i3), f2, right, f3);
        }
        return new RectF(i6, f2, i5 * (i4 + i3), f3);
    }

    public final void g(LocalDate localDate) {
        c8h c8hVar = this.f11613k;
        if (c8hVar != null) {
            c8hVar.g(localDate);
        }
        invalidate();
    }

    public y93 getCalendarPainter() {
        return this.i;
    }

    public final boolean h(LocalDate localDate) {
        return localDate.getMonthOfYear() == this.g.getMonthOfYear() && localDate.getDayOfMonth() == this.g.getDayOfMonth();
    }

    public void i(LocalDate localDate) {
        if (TimeDateUtil.isSameMonth(this.f11611a, localDate) || this.h.o) {
            if (TimeDateUtil.isLastMonth(this.g, localDate)) {
                this.g = localDate;
                d(localDate, 0.0f, -DisplayUtil.getScreenWidth(), 300L);
            } else {
                if (TimeDateUtil.isAfterToday(localDate)) {
                    return;
                }
                if (TimeDateUtil.isNextMonth(localDate, this.g)) {
                    this.g = localDate;
                    d(localDate, 0.0f, DisplayUtil.getScreenWidth(), 300L);
                } else {
                    this.g = localDate;
                    g(localDate);
                }
            }
        }
    }

    public void j(LocalDate localDate, Map<Long, cdp> map, cdp cdpVar) {
        this.f11611a = localDate;
        this.j = map;
        this.l = cdpVar;
        List<LocalDate> monthLocalDateCalendar = TimeDateUtil.getMonthLocalDateCalendar(localDate);
        this.c = monthLocalDateCalendar;
        this.f = monthLocalDateCalendar.size() / 7;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        y93 calendarPainter = getCalendarPainter();
        this.f11612b.clear();
        for (int i = 0; i < this.f; i++) {
            for (int i2 = 0; i2 < 7; i2++) {
                RectF rectFF = f(i, i2);
                this.f11612b.add(rectFF);
                LocalDate localDate = this.c.get((i * 7) + i2);
                if (TimeDateUtil.isSameMonth(this.f11611a, localDate) || this.h.o) {
                    this.d.add(rectFF);
                    this.e.add(localDate);
                    Map<Long, cdp> map = this.j;
                    if (map != null) {
                        cdp cdpVar = map.get(Long.valueOf(localDate.toDate().getTime() / 1000));
                        if (cdpVar == null) {
                            cdpVar = this.l;
                        }
                        calendarPainter.b(canvas, rectFF, cdpVar);
                    }
                    if (TimeDateUtil.isAfterToday(localDate)) {
                        calendarPainter.f(canvas, rectFF, localDate);
                    } else if (TimeDateUtil.isToday(localDate)) {
                        calendarPainter.d(canvas, rectFF, localDate, localDate.equals(this.g));
                    } else {
                        calendarPainter.e(canvas, rectFF, localDate, localDate.equals(this.g));
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.n.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void setOnDayCalendarItemSelectListener(c8h c8hVar) {
        this.f11613k = c8hVar;
    }

    public void setSelectDate(LocalDate localDate) {
        this.g = localDate;
        invalidate();
    }

    public void setSelectDateInvalidate(LocalDate localDate) {
        if (h(localDate)) {
            return;
        }
        i(localDate);
    }
}
