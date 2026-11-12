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
import defpackage.m80;
import defpackage.mad;
import defpackage.mj8;
import defpackage.o93;
import defpackage.p93;
import defpackage.qdg;
import defpackage.y93;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public class DayCalendarView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LocalDate f11604b;
    public List<RectF> c;
    public List<LocalDate> d;
    public List<RectF> e;
    public List<LocalDate> f;
    public LocalDate g;
    public o93 h;
    public y93 i;
    public HashMap<Long, Integer> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f11605k;
    public Boolean l;
    public GestureDetector m;
    public c8h n;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            for (int i = 0; i < DayCalendarView.this.c.size(); i++) {
                if (DayCalendarView.this.c.get(i).contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    LocalDate localDate = DayCalendarView.this.d.get(i);
                    if (DayCalendarView.this.j(localDate)) {
                        return true;
                    }
                    DayCalendarView.this.l(localDate);
                    return true;
                }
            }
            return true;
        }
    }

    public class b extends qdg {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LocalDate f11607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f11608b;
        public final /* synthetic */ float c;
        public final /* synthetic */ long d;

        public b(LocalDate localDate, float f, float f2, long j) {
            this.f11607a = localDate;
            this.f11608b = f;
            this.c = f2;
            this.d = j;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            DayCalendarView.this.g(this.f11607a);
            DayCalendarView.this.i(this.f11607a);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(DayCalendarView.this, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, this.f11608b, this.c);
            objectAnimatorOfFloat.setDuration((this.d * 4) / 3);
            objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            objectAnimatorOfFloat.start();
        }
    }

    public class c extends mj8 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f11609a;

        public c(View view) {
            super(view);
            this.f11609a = new Rect();
        }

        public final boolean a(LocalDate localDate) {
            if (DayCalendarView.this.h.o || TimeDateUtil.isSameMonth(DayCalendarView.this.f11604b, localDate)) {
                return DayCalendarView.this.l.booleanValue() || !TimeDateUtil.isAfterToday(localDate);
            }
            return false;
        }

        @Override // defpackage.mj8
        public int getVirtualViewAt(float f, float f2) {
            for (int i = 0; i < DayCalendarView.this.e.size(); i++) {
                if (DayCalendarView.this.e.get(i).contains(f, f2)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // defpackage.mj8
        public void getVisibleVirtualViews(List<Integer> list) {
            for (int i = 0; i < DayCalendarView.this.e.size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // defpackage.mj8
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (i2 != 16 || i < 0 || i >= DayCalendarView.this.e.size() || i >= DayCalendarView.this.f.size()) {
                return false;
            }
            DayCalendarView dayCalendarView = DayCalendarView.this;
            dayCalendarView.l(dayCalendarView.f.get(i));
            return true;
        }

        @Override // defpackage.mj8
        public void onPopulateNodeForVirtualView(int i, m80 m80Var) {
            if (i < 0 || i >= DayCalendarView.this.e.size() || i >= DayCalendarView.this.f.size()) {
                this.f11609a.setEmpty();
                m80Var.d0(this.f11609a);
                m80Var.m0("");
                m80Var.j0(false);
                return;
            }
            RectF rectF = DayCalendarView.this.e.get(i);
            LocalDate localDate = DayCalendarView.this.f.get(i);
            this.f11609a.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            m80Var.d0(this.f11609a);
            m80Var.m0(TimeDateUtil.getDateSimpleLocalFormat(localDate));
            if (a(localDate)) {
                m80Var.j0(true);
                m80Var.a(16);
            } else {
                m80Var.j0(false);
                m80Var.o0(false);
            }
        }
    }

    public DayCalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = new GestureDetector(getContext(), new a());
        this.h = p93.a(context, attributeSet);
        LocalDate localDateNow = LocalDate.now();
        this.g = localDateNow;
        this.f11604b = localDateNow;
        this.c = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        List<LocalDate> monthLocalDateCalendar = TimeDateUtil.getMonthLocalDateCalendar(localDateNow);
        this.d = monthLocalDateCalendar;
        this.f11603a = monthLocalDateCalendar.size() / 7;
        this.i = new mad(this.h);
        c cVar = new c(this);
        this.f11605k = cVar;
        androidx.core.view.c.r0(this, cVar);
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f11605k.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void f(LocalDate localDate, float f, float f2, long j) {
        if (!this.h.Q) {
            g(localDate);
            i(localDate);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, f, f2);
        objectAnimatorOfFloat.setDuration((2 * j) / 3);
        objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        objectAnimatorOfFloat.start();
        objectAnimatorOfFloat.addListener(new b(localDate, f2, f, j));
    }

    public final void g(LocalDate localDate) {
        List<LocalDate> monthLocalDateCalendar = TimeDateUtil.getMonthLocalDateCalendar(localDate);
        this.d = monthLocalDateCalendar;
        this.f11603a = monthLocalDateCalendar.size() / 7;
    }

    public y93 getCalendarPainter() {
        return this.i;
    }

    public final RectF h(int i, int i2) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i3 = (int) (this.h.m * 2.0f);
        int i4 = (measuredWidth - (i3 * 7)) / 8;
        int i5 = i2 + 1;
        float f = (i4 * i5) + (i2 * i3);
        if (!AppUtil.isRTLDirection()) {
            int i6 = i5 * (i4 + i3);
            int i7 = this.f11603a;
            if (i7 == 5) {
                int i8 = measuredHeight / i7;
                int i9 = i * i8;
                return new RectF(f, i9, i6, i9 + i8);
            }
            int i10 = measuredHeight / 5;
            int i11 = (i10 * 4) / 5;
            int i12 = i * i11;
            int i13 = (i10 - i11) / 2;
            return new RectF(f, i12 + i13, i6, i12 + i11 + i13);
        }
        float right = getRight() - f;
        float f2 = right - (i4 + i3);
        int i14 = this.f11603a;
        if (i14 == 5) {
            int i15 = measuredHeight / i14;
            int i16 = i * i15;
            return new RectF(f2, i16, right, i16 + i15);
        }
        int i17 = measuredHeight / 5;
        int i18 = (i17 * 4) / 5;
        int i19 = i * i18;
        int i20 = (i17 - i18) / 2;
        return new RectF(f2, i19 + i20, right, i19 + i18 + i20);
    }

    public final void i(LocalDate localDate) {
        c8h c8hVar = this.n;
        if (c8hVar != null) {
            c8hVar.g(localDate);
        }
        invalidate();
    }

    public final boolean j(LocalDate localDate) {
        return localDate.getMonthOfYear() == this.g.getMonthOfYear() && localDate.getDayOfMonth() == this.g.getDayOfMonth();
    }

    public void k(Boolean bool) {
        this.l = bool;
    }

    public void l(LocalDate localDate) {
        if (TimeDateUtil.isSameMonth(this.f11604b, localDate) || this.h.o) {
            if (TimeDateUtil.isLastMonth(this.g, localDate)) {
                this.g = localDate;
                f(localDate, 0.0f, -DisplayUtil.getScreenWidth(), 300L);
                return;
            }
            if (this.l.booleanValue()) {
                if (TimeDateUtil.isNextMonth(localDate, this.g)) {
                    this.g = localDate;
                    f(localDate, 0.0f, DisplayUtil.getScreenWidth(), 300L);
                    return;
                } else {
                    this.g = localDate;
                    i(localDate);
                    return;
                }
            }
            if (TimeDateUtil.isAfterToday(localDate)) {
                return;
            }
            if (TimeDateUtil.isNextMonth(localDate, this.g)) {
                this.g = localDate;
                f(localDate, 0.0f, DisplayUtil.getScreenWidth(), 300L);
            } else {
                this.g = localDate;
                i(localDate);
            }
        }
    }

    public void m(LocalDate localDate, HashMap<Long, Integer> map) {
        this.f11604b = localDate;
        this.j = map;
        List<LocalDate> monthLocalDateCalendar = TimeDateUtil.getMonthLocalDateCalendar(localDate);
        this.d = monthLocalDateCalendar;
        this.f11603a = monthLocalDateCalendar.size() / 7;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        HashMap<Long, Integer> map;
        Integer num;
        y93 calendarPainter = getCalendarPainter();
        this.c.clear();
        for (int i = 0; i < this.f11603a; i++) {
            for (int i2 = 0; i2 < 7; i2++) {
                RectF rectFH = h(i, i2);
                this.c.add(rectFH);
                LocalDate localDate = this.d.get((i * 7) + i2);
                if (TimeDateUtil.isSameMonth(this.f11604b, localDate) || this.h.o) {
                    this.e.add(rectFH);
                    this.f.add(localDate);
                    boolean z = TimeDateUtil.isAfterToday(localDate) && !this.l.booleanValue();
                    if (z) {
                        calendarPainter.f(canvas, rectFH, localDate);
                    } else if (TimeDateUtil.isToday(localDate)) {
                        calendarPainter.d(canvas, rectFH, localDate, localDate.equals(this.g));
                    } else {
                        calendarPainter.e(canvas, rectFH, localDate, localDate.equals(this.g));
                    }
                    if (!z && (map = this.j) != null && (num = map.get(Long.valueOf(localDate.toDate().getTime() / 1000))) != null && num.intValue() == 1) {
                        calendarPainter.a(canvas, rectFH);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.m.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void setOnDayCalendarItemSelectListener(c8h c8hVar) {
        this.n = c8hVar;
    }

    public void setSelectDate(LocalDate localDate) {
        this.g = localDate;
        invalidate();
    }

    public void setSelectDateInvalidate(LocalDate localDate) {
        if (j(localDate)) {
            return;
        }
        l(localDate);
    }
}
