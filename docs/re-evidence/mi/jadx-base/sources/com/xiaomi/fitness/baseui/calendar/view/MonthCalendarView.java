package com.xiaomi.fitness.baseui.calendar.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.gki;
import defpackage.m80;
import defpackage.mj8;
import defpackage.o93;
import defpackage.p93;
import defpackage.v7g;
import defpackage.x44;
import defpackage.y93;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public class MonthCalendarView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<v7g> f11622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<Rect> f11623b;
    public Paint c;
    public Paint d;
    public o93 e;
    public v7g f;
    public c g;
    public HashMap<Long, Integer> h;
    public b i;
    public GestureDetector j;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            for (int i = 0; i < MonthCalendarView.this.f11623b.size(); i++) {
                if (MonthCalendarView.this.f11623b.get(i).contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    if (!MonthCalendarView.this.m((v7g) MonthCalendarView.this.f11622a.get(i))) {
                        return true;
                    }
                    MonthCalendarView.this.invalidate();
                    return true;
                }
            }
            return true;
        }
    }

    public class b extends mj8 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f11625a;

        public b(View view) {
            super(view);
            this.f11625a = new Rect();
        }

        @Override // defpackage.mj8
        public int getVirtualViewAt(float f, float f2) {
            for (int i = 0; i < MonthCalendarView.this.f11623b.size(); i++) {
                if (MonthCalendarView.this.f11623b.get(i).contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // defpackage.mj8
        public void getVisibleVirtualViews(List<Integer> list) {
            for (int i = 0; i < MonthCalendarView.this.f11623b.size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // defpackage.mj8
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (i2 != 16 || i < 0 || i >= MonthCalendarView.this.f11623b.size() || i >= MonthCalendarView.this.f11622a.size()) {
                return false;
            }
            MonthCalendarView monthCalendarView = MonthCalendarView.this;
            monthCalendarView.m((v7g) monthCalendarView.f11622a.get(i));
            return false;
        }

        @Override // defpackage.mj8
        public void onPopulateNodeForVirtualView(int i, m80 m80Var) {
            if (i < 0 || i >= MonthCalendarView.this.f11623b.size() || i >= MonthCalendarView.this.f11622a.size()) {
                this.f11625a.setEmpty();
                m80Var.d0(this.f11625a);
                m80Var.m0("");
                m80Var.j0(false);
                return;
            }
            Rect rect = MonthCalendarView.this.f11623b.get(i);
            this.f11625a.set(rect.left, rect.top, rect.right, rect.bottom);
            m80Var.d0(this.f11625a);
            String dateMMSimpleFormat = TimeDateUtil.getDateMMSimpleFormat(((v7g) MonthCalendarView.this.f11622a.get(i)).f36589a);
            m80Var.j0(true);
            m80Var.m0(dateMMSimpleFormat);
        }
    }

    public interface c {
        void d(LocalDate localDate);
    }

    public MonthCalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = new GestureDetector(getContext(), new a());
        this.e = p93.a(context, attributeSet);
        Paint paint = getPaint();
        this.c = paint;
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        this.d = getPaint();
        this.f11623b = new ArrayList();
        b bVar = new b(this);
        this.i = bVar;
        androidx.core.view.c.r0(this, bVar);
    }

    private Paint getPaint() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        return paint;
    }

    public void c(LocalDate localDate, LocalDate localDate2, HashMap<Long, Integer> map) {
        this.f11622a = d(localDate);
        this.h = map;
        if (localDate.getYear() != localDate2.getYear()) {
            this.f = null;
        } else {
            v7g v7gVarG = g(localDate2);
            this.f = v7gVarG;
            if (v7gVarG != null) {
                v7gVarG.c(true);
            }
        }
        invalidate();
    }

    public final List<v7g> d(LocalDate localDate) {
        List<v7g> list = this.f11622a;
        if (list == null) {
            this.f11622a = new ArrayList();
        } else {
            list.clear();
        }
        int monthOfYear = LocalDate.now().getMonthOfYear();
        int monthOfYear2 = localDate.getMonthOfYear();
        for (int i = 1; i <= 12; i++) {
            v7g v7gVar = new v7g();
            LocalDate localDatePlusMonths = localDate.plusMonths(i - monthOfYear2);
            int monthOfYear3 = localDatePlusMonths.getMonthOfYear();
            v7gVar.b(localDatePlusMonths);
            if (k(localDatePlusMonths)) {
                v7gVar.f36590b = true;
            } else if (j(localDate) && monthOfYear3 == monthOfYear) {
                v7gVar.c = true;
            } else {
                v7gVar.c = false;
            }
            this.f11622a.add(v7gVar);
        }
        return this.f11622a;
    }

    @Override // android.view.View
    public boolean dispatchGenericFocusedEvent(MotionEvent motionEvent) {
        if (this.i.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return super.dispatchGenericFocusedEvent(motionEvent);
    }

    public final void e(Canvas canvas, Rect rect, boolean z) {
        this.d.setStyle(Paint.Style.STROKE);
        this.d.setStrokeWidth(this.e.w);
        this.d.setColor(this.e.i);
        canvas.drawCircle(rect.centerX(), rect.centerY(), this.e.m, this.d);
    }

    public final void f(Canvas canvas, Rect rect) {
        this.d.setStyle(Paint.Style.FILL);
        this.d.setColor(this.e.u);
        canvas.drawCircle(rect.centerX(), rect.centerY(), this.e.m, this.d);
    }

    public final v7g g(LocalDate localDate) {
        for (int i = 0; i < this.f11622a.size(); i++) {
            v7g v7gVar = this.f11622a.get(i);
            if (l(localDate, v7gVar)) {
                return v7gVar;
            }
            v7gVar.d = false;
        }
        return null;
    }

    public final int h(Rect rect) {
        Paint.FontMetrics fontMetrics = this.c.getFontMetrics();
        return (int) ((rect.centerY() - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f));
    }

    public final Rect i(int i, int i2) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (AppUtil.isRTLDirection()) {
            int i3 = measuredHeight / 3;
            int right = getRight() - ((i2 * measuredWidth) / 4);
            int i4 = i * i3;
            return new Rect(right - (measuredWidth / 4), i4, right, i3 + i4);
        }
        int i5 = measuredHeight / 3;
        int i6 = (i2 * measuredWidth) / 4;
        int i7 = i * i5;
        return new Rect(i6, i7, (measuredWidth / 4) + i6, i5 + i7);
    }

    public boolean j(LocalDate localDate) {
        return localDate.getYear() == LocalDate.now().getYear();
    }

    public boolean k(LocalDate localDate) {
        LocalDate localDateNow = LocalDate.now();
        int year = localDateNow.getYear();
        int monthOfYear = localDateNow.getMonthOfYear();
        int monthOfYear2 = localDate.getMonthOfYear();
        int year2 = localDate.getYear();
        if (year < year2) {
            return true;
        }
        return year2 >= year && year2 == year && monthOfYear2 > monthOfYear;
    }

    public final boolean l(LocalDate localDate, v7g v7gVar) {
        return v7gVar != null && TimeDateUtil.isSameMonthLocalDate(localDate, v7gVar.a());
    }

    public final boolean m(v7g v7gVar) {
        if (v7gVar.f36590b || v7gVar.d) {
            return false;
        }
        v7g v7gVar2 = this.f;
        if (v7gVar2 != null) {
            v7gVar2.d = false;
        }
        v7gVar.d = true;
        this.f = v7gVar;
        c cVar = this.g;
        if (cVar != null) {
            cVar.d(v7gVar.f36589a);
        }
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Integer num;
        super.onDraw(canvas);
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                Rect rectI = i(i, i2);
                this.f11623b.add(rectI);
                v7g v7gVar = this.f11622a.get((i * 4) + i2);
                this.c.setTextSize(this.e.R);
                if (v7gVar.f36590b) {
                    this.c.setColor(x44.a(gki.e));
                } else if (v7gVar.c) {
                    this.c.setColor(x44.a(gki.p));
                    f(canvas, rectI);
                } else if (v7gVar.d) {
                    this.c.setColor(x44.a(gki.p));
                    e(canvas, rectI, false);
                } else {
                    this.c.setColor(x44.a(gki.p));
                }
                long time = v7gVar.f36589a.toDate().getTime() / 1000;
                canvas.drawText(TimeDateUtil.getDateMMSimpleFormat(v7gVar.f36589a), rectI.centerX(), h(rectI), this.c);
                HashMap<Long, Integer> map = this.h;
                if (map != null && (num = map.get(Long.valueOf(time))) != null && num.intValue() == 1) {
                    canvas.drawCircle(rectI.centerX(), (int) (rectI.centerY() + ((this.c.descent() - this.c.ascent()) / 2.0f) + (y93.f39947b * 2)), y93.f39946a, this.c);
                }
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.j.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void setOnYearCalendarItemClickListener(c cVar) {
        this.g = cVar;
    }
}
