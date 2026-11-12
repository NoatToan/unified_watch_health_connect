package com.xiaomi.fitness.baseui.calendar.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.o93;
import defpackage.y93;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseCalendarView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LocalDate f11593b;
    public List<RectF> c;
    public List<LocalDate> d;
    public LocalDate e;
    public boolean f;
    public o93 g;
    public GestureDetector h;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            for (int i = 0; i < BaseCalendarView.this.c.size(); i++) {
                if (BaseCalendarView.this.c.get(i).contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    LocalDate localDate = BaseCalendarView.this.d.get(i);
                    BaseCalendarView baseCalendarView = BaseCalendarView.this;
                    baseCalendarView.d(localDate, baseCalendarView.f11593b);
                    return true;
                }
            }
            return true;
        }
    }

    public BaseCalendarView(Context context, LocalDate localDate, o93 o93Var, int i) {
        super(context);
        this.h = new GestureDetector(getContext(), new a());
        this.e = localDate;
        this.f11593b = localDate;
        this.g = o93Var;
        this.d = TimeDateUtil.getMonthLocalDateCalendar(localDate);
        this.c = new ArrayList();
        this.f11592a = this.d.size() / 7;
    }

    public boolean a(LocalDate localDate) {
        return localDate != null && c(localDate, this.f11593b);
    }

    public final RectF b(int i, int i2) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i3 = (int) (this.g.m * 2.0f);
        int i4 = (measuredWidth - (i3 * 7)) / 8;
        int i5 = i2 + 1;
        float f = (i4 * i5) + (i2 * i3);
        int i6 = this.f11592a;
        if (i6 == 5) {
            int i7 = measuredHeight / i6;
            int i8 = i * i7;
            return new RectF(f, i8, i5 * (i4 + i3), i8 + i7);
        }
        int i9 = measuredHeight / 5;
        int i10 = (i9 * 4) / 5;
        int i11 = i * i10;
        int i12 = (i9 - i10) / 2;
        return new RectF(f, i11 + i12, i5 * (i4 + i3), i11 + i10 + i12);
    }

    public abstract boolean c(LocalDate localDate, LocalDate localDate2);

    public abstract void d(LocalDate localDate, LocalDate localDate2);

    public void e(LocalDate localDate, boolean z) {
        this.f = z;
        this.e = localDate;
        invalidate();
    }

    public LocalDate getInitialDate() {
        return this.f11593b;
    }

    public int getMonthCalendarOffset() {
        return (this.f11592a == 5 ? getMeasuredHeight() / 5 : ((getMeasuredHeight() / 5) * 4) / 5) * (this.d.indexOf(this.e) / 7);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        BaseCalendar baseCalendar = (BaseCalendar) getParent();
        LocalDate startDate = baseCalendar.getStartDate();
        LocalDate endDate = baseCalendar.getEndDate();
        y93 calendarPainter = baseCalendar.getCalendarPainter();
        this.c.clear();
        for (int i = 0; i < this.f11592a; i++) {
            for (int i2 = 0; i2 < 7; i2++) {
                RectF rectFB = b(i, i2);
                this.c.add(rectFB);
                LocalDate localDate = this.d.get((i * 7) + i2);
                if (localDate.isBefore(startDate) || localDate.isAfter(endDate)) {
                    calendarPainter.c(canvas, rectFB, localDate);
                } else if (TimeDateUtil.isSameMonth(this.f11593b, localDate) || this.g.o) {
                    if (TimeDateUtil.isAfterToday(localDate)) {
                        calendarPainter.f(canvas, rectFB, localDate);
                    } else if (TimeDateUtil.isToday(localDate) && localDate.equals(this.e)) {
                        calendarPainter.d(canvas, rectFB, localDate, true);
                    } else if (TimeDateUtil.isToday(localDate) && !localDate.equals(this.e)) {
                        calendarPainter.d(canvas, rectFB, localDate, false);
                    } else if (localDate.equals(this.e)) {
                        calendarPainter.e(canvas, rectFB, localDate, true);
                    } else {
                        calendarPainter.e(canvas, rectFB, localDate, false);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.h.onTouchEvent(motionEvent);
    }
}
