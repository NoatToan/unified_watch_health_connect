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
import defpackage.lad;
import defpackage.m80;
import defpackage.mj8;
import defpackage.o93;
import defpackage.p93;
import defpackage.q22;
import defpackage.qdg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public class WeekCalendarView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LocalDate f11634b;
    public List<RectF> c;
    public List<LocalDate> d;
    public LocalDate e;
    public int f;
    public int g;
    public o93 h;
    public q22 i;
    public List<RectF> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<LocalDate> f11635k;
    public HashMap<Long, Integer> l;
    public c m;
    public GestureDetector n;
    public d o;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            for (int i = 0; i < WeekCalendarView.this.c.size(); i++) {
                if (WeekCalendarView.this.c.get(i).contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    WeekCalendarView.this.k(WeekCalendarView.this.d.get(i));
                    return true;
                }
            }
            return true;
        }
    }

    public class b extends qdg {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LocalDate f11637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f11638b;
        public final /* synthetic */ float c;
        public final /* synthetic */ long d;

        public b(LocalDate localDate, float f, float f2, long j) {
            this.f11637a = localDate;
            this.f11638b = f;
            this.c = f2;
            this.d = j;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            WeekCalendarView.this.d(this.f11637a);
            WeekCalendarView.this.i(this.f11637a);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(WeekCalendarView.this, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, this.f11638b, this.c);
            objectAnimatorOfFloat.setDuration((this.d * 4) / 3);
            objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            objectAnimatorOfFloat.start();
        }
    }

    public class c extends mj8 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f11639a;

        public c(View view) {
            super(view);
            this.f11639a = new Rect();
        }

        @Override // defpackage.mj8
        public int getVirtualViewAt(float f, float f2) {
            for (int i = 0; i < WeekCalendarView.this.j.size(); i++) {
                if (WeekCalendarView.this.j.get(i).contains(f, f2)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // defpackage.mj8
        public void getVisibleVirtualViews(List<Integer> list) {
            for (int i = 0; i < WeekCalendarView.this.j.size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // defpackage.mj8
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (i2 != 16 || i < 0 || i >= WeekCalendarView.this.j.size() || i >= WeekCalendarView.this.f11635k.size()) {
                return false;
            }
            WeekCalendarView weekCalendarView = WeekCalendarView.this;
            weekCalendarView.k(weekCalendarView.f11635k.get(i));
            return true;
        }

        @Override // defpackage.mj8
        public void onPopulateNodeForVirtualView(int i, m80 m80Var) {
            if (i < 0 || i >= WeekCalendarView.this.j.size() || i >= WeekCalendarView.this.f11635k.size()) {
                this.f11639a.setEmpty();
                m80Var.d0(this.f11639a);
                m80Var.m0("");
                m80Var.j0(false);
                return;
            }
            RectF rectF = WeekCalendarView.this.j.get(i);
            LocalDate localDate = WeekCalendarView.this.f11635k.get(i);
            this.f11639a.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            m80Var.d0(this.f11639a);
            String dateSimpleLocalFormat = TimeDateUtil.getDateSimpleLocalFormat(localDate);
            m80Var.j0(true);
            m80Var.m0(dateSimpleLocalFormat);
        }
    }

    public interface d {
        void f(LocalDate localDate);
    }

    public WeekCalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = new GestureDetector(getContext(), new a());
        this.h = p93.a(context, attributeSet);
        LocalDate localDateNow = LocalDate.now();
        this.e = localDateNow;
        this.f11634b = localDateNow;
        this.d = TimeDateUtil.getMonthLocalDateCalendar(localDateNow);
        this.c = new ArrayList();
        this.j = new ArrayList();
        this.f11635k = new ArrayList();
        this.f11633a = this.d.size() / 7;
        this.i = new lad(this.h);
        c cVar = new c(this);
        this.m = cVar;
        androidx.core.view.c.r0(this, cVar);
    }

    private int getSelectDayWeek() {
        return TimeDateUtil.getDayWeek(this.e);
    }

    public final void c(LocalDate localDate, float f, float f2, long j) {
        if (!this.h.Q) {
            d(localDate);
            i(localDate);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, f, f2);
        objectAnimatorOfFloat.setDuration((2 * j) / 3);
        objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        objectAnimatorOfFloat.start();
        objectAnimatorOfFloat.addListener(new b(localDate, f2, f, j));
    }

    public final void d(LocalDate localDate) {
        List<LocalDate> monthLocalDateCalendar = TimeDateUtil.getMonthLocalDateCalendar(localDate);
        this.d = monthLocalDateCalendar;
        this.f11633a = monthLocalDateCalendar.size() / 7;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.m.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(Canvas canvas, q22 q22Var, int i) {
        LocalDate localDate = this.d.get(i * 7);
        int dayWeek = TimeDateUtil.getDayWeek(localDate);
        boolean z = localDate.getYear() == LocalDate.now().getYear();
        int iDip2px = DisplayUtil.dip2px(25.0f);
        RectF rectFG = g(i);
        if (dayWeek == this.f && dayWeek != this.g) {
            q22Var.g(canvas, rectFG, iDip2px, iDip2px, false);
        } else if (dayWeek == this.g && z) {
            q22Var.g(canvas, rectFG, iDip2px, iDip2px, true);
        }
    }

    public final RectF f(int i, int i2) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i3 = (int) (this.h.m * 2.0f);
        int i4 = (measuredWidth - (i3 * 7)) / 8;
        int i5 = i2 + 1;
        float f = (i4 * i5) + (i2 * i3);
        if (!AppUtil.isRTLDirection()) {
            float f2 = i5 * (i4 + i3);
            int i6 = this.f11633a;
            if (i6 == 5) {
                int i7 = measuredHeight / i6;
                int i8 = i * i7;
                return new RectF(f, i8, f2, i8 + i7);
            }
            int i9 = measuredHeight / 5;
            int i10 = (i9 * 4) / 5;
            int i11 = i * i10;
            int i12 = (i9 - i10) / 2;
            return new RectF(f, i11 + i12, f2, i11 + i10 + i12);
        }
        float right = getRight() - f;
        float f3 = right - (i4 + i3);
        int i13 = this.f11633a;
        if (i13 == 5) {
            int i14 = measuredHeight / i13;
            int i15 = i * i14;
            return new RectF(f3, i15, right, i15 + i14);
        }
        int i16 = measuredHeight / 5;
        int i17 = (i16 * 4) / 5;
        int i18 = i * i17;
        int i19 = (i16 - i17) / 2;
        return new RectF(f3, i18 + i19, right, i18 + i17 + i19);
    }

    public final RectF g(int i) {
        if (i == 0) {
            return h(i, this.d.subList(0, 7), 0);
        }
        if (i != this.f11633a - 1) {
            return h(i, new ArrayList(), 1);
        }
        int size = this.d.size();
        return h(i, this.d.subList(size - 7, size), 2);
    }

    public q22 getCalendarPainter() {
        return this.i;
    }

    public LocalDate getInitialDate() {
        return this.f11634b;
    }

    public List<LocalDate> getMonthDateList() {
        return this.d;
    }

    public LocalDate getSelectDate() {
        return this.e;
    }

    public final RectF h(int i, List<LocalDate> list, int i2) {
        int iDip2px;
        int i3;
        int iDip2px2;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.h.m * 2.0f;
        float f2 = measuredWidth;
        float f3 = (f2 - (7.0f * f)) / 8.0f;
        RectF rectF = new RectF();
        int i4 = measuredHeight / 5;
        int i5 = (i4 * 4) / 5;
        int i6 = (i4 - i5) / 2;
        if (this.f11633a == 5) {
            int i7 = i * i4;
            iDip2px = i7 + i6 + DisplayUtil.dip2px(3.0f);
            i3 = (i7 + i4) - i6;
            iDip2px2 = DisplayUtil.dip2px(3.0f);
        } else {
            int i8 = i * i5;
            iDip2px = DisplayUtil.dip2px(3.0f) + i8 + i6;
            i3 = i8 + i5 + i6;
            iDip2px2 = DisplayUtil.dip2px(3.0f);
        }
        int i9 = i3 - iDip2px2;
        int i10 = 0;
        if (i2 == 0) {
            int monthOfYear = list.get(6).getMonthOfYear();
            for (int i11 = 0; i11 < list.size(); i11++) {
                if (list.get(i11).getMonthOfYear() == monthOfYear) {
                    i10 = i11;
                    break;
                }
            }
            float f4 = ((i10 + 1) * f3) + (i10 * f);
            float right = f2 - f3;
            if (AppUtil.isRTLDirection()) {
                right = getRight() - f4;
            } else {
                f3 = f4;
            }
            rectF.set(f3, iDip2px, right, i9);
        } else if (i2 == 2) {
            int monthOfYear2 = list.get(0).getMonthOfYear();
            int size = list.size() - 1;
            for (int i12 = size; i12 >= 0; i12--) {
                int monthOfYear3 = list.get(i12).getMonthOfYear();
                StringBuilder sb = new StringBuilder();
                sb.append("month is:");
                sb.append(monthOfYear3);
                if (monthOfYear3 == monthOfYear2) {
                    size = i12;
                    break;
                }
            }
            float f5 = 6 - size;
            float right2 = f2 - (((7 - size) * f3) + (f5 * f));
            if (AppUtil.isRTLDirection()) {
                right2 = getRight() - f3;
                f3 = (f3 + f) * f5;
            }
            rectF.set(f3, iDip2px, right2, i9);
        } else {
            rectF.set(f3, iDip2px, f2 - f3, i9);
        }
        return rectF;
    }

    public final void i(LocalDate localDate) {
        d dVar = this.o;
        if (dVar != null) {
            dVar.f(localDate);
        }
        invalidate();
    }

    public final boolean j(LocalDate localDate) {
        return TimeDateUtil.getDayWeek(localDate) == getSelectDayWeek();
    }

    public void k(LocalDate localDate) {
        if (TimeDateUtil.isSameMonth(this.f11634b, localDate) || this.h.o) {
            if (TimeDateUtil.isLastMonth(this.e, localDate)) {
                this.e = localDate;
                c(localDate, 0.0f, -DisplayUtil.getScreenWidth(), 300L);
                return;
            }
            if (!TimeDateUtil.isAfterToday(localDate)) {
                if (TimeDateUtil.isNextMonth(localDate, this.e)) {
                    this.e = localDate;
                    c(localDate, 0.0f, DisplayUtil.getScreenWidth(), 300L);
                    return;
                } else {
                    this.e = localDate;
                    i(localDate);
                    return;
                }
            }
            if (TimeDateUtil.isSameWeekWithToday(localDate)) {
                if (TimeDateUtil.isNextMonth(localDate, this.e)) {
                    this.e = localDate;
                    c(localDate, 0.0f, DisplayUtil.getScreenWidth(), 300L);
                } else {
                    this.e = localDate;
                    i(localDate);
                }
            }
        }
    }

    public void l(LocalDate localDate, HashMap<Long, Integer> map) {
        this.f11634b = localDate;
        List<LocalDate> monthLocalDateCalendar = TimeDateUtil.getMonthLocalDateCalendar(localDate);
        this.d = monthLocalDateCalendar;
        this.l = map;
        this.f11633a = monthLocalDateCalendar.size() / 7;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        HashMap<Long, Integer> map;
        Integer num;
        q22 calendarPainter = getCalendarPainter();
        this.c.clear();
        this.f = getSelectDayWeek();
        this.g = TimeDateUtil.getTodayWeek();
        for (int i = 0; i < this.f11633a; i++) {
            e(canvas, calendarPainter, i);
            for (int i2 = 0; i2 < 7; i2++) {
                RectF rectFF = f(i, i2);
                this.c.add(rectFF);
                LocalDate localDate = this.d.get((i * 7) + i2);
                if (TimeDateUtil.isSameMonth(this.f11634b, localDate) || this.h.o) {
                    this.j.add(rectFF);
                    this.f11635k.add(localDate);
                    boolean zIsAfterToday = TimeDateUtil.isAfterToday(localDate);
                    if (zIsAfterToday) {
                        calendarPainter.f(canvas, rectFF, localDate);
                    } else if (TimeDateUtil.isToday(localDate)) {
                        calendarPainter.d(canvas, rectFF, localDate, true);
                    } else if (TimeDateUtil.isSameWeekWithToday(localDate) || j(localDate)) {
                        calendarPainter.e(canvas, rectFF, localDate, false);
                    } else {
                        calendarPainter.e(canvas, rectFF, localDate, false);
                    }
                    if (!zIsAfterToday && (map = this.l) != null && (num = map.get(Long.valueOf(localDate.toDate().getTime() / 1000))) != null && num.intValue() == 1) {
                        calendarPainter.a(canvas, rectFF);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.n.onTouchEvent(motionEvent);
    }

    public void setOnWeekCalendarItemSelectListener(d dVar) {
        this.o = dVar;
    }

    public void setSelectDate(LocalDate localDate) {
        this.e = localDate;
        invalidate();
    }

    public void setSelectDateInvalidate(LocalDate localDate) {
        if (j(localDate)) {
            return;
        }
        k(localDate);
    }
}
