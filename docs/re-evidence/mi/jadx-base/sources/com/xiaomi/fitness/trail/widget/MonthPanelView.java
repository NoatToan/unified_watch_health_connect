package com.xiaomi.fitness.trail.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.core.view.c;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.interfaces.IDraw;
import com.xiaomi.passport.ui.internal.MenuBuilder;
import defpackage.b8h;
import defpackage.f9h;
import defpackage.j1j;
import defpackage.m80;
import defpackage.mj8;
import defpackage.ruc;
import defpackage.tp5;
import defpackage.up5;
import defpackage.w7g;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class MonthPanelView extends View implements IDraw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13260b;
    public int c;
    public MonthPanelStyle d;
    public Context e;
    public up5 f;
    public Rect g;
    public w7g h;
    public a i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f13261k;
    public float l;
    public int m;

    public class a extends mj8 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f13262a;

        public a(View view) {
            super(view);
            this.f13262a = new Rect();
        }

        @Override // defpackage.mj8
        public int getVirtualViewAt(float f, float f2) {
            return MonthPanelView.this.f.e(f, f2);
        }

        @Override // defpackage.mj8
        public void getVisibleVirtualViews(List<Integer> list) {
            int i = 0;
            for (int i2 = 0; i2 < MonthPanelView.this.h.h(); i2++) {
                int iC = MonthPanelView.this.h.c(i2);
                int i3 = 0;
                while (i3 < iC) {
                    list.add(Integer.valueOf(i));
                    i3++;
                    i++;
                }
            }
        }

        @Override // defpackage.mj8
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            int iB = MonthPanelView.this.h.b();
            tp5 tp5VarD = MonthPanelView.this.h.d(i / iB, i % iB);
            if (tp5VarD == null || tp5VarD.d() != 2) {
                return false;
            }
            MonthPanelView.this.f.h(tp5VarD.f(), tp5VarD.g());
            MonthPanelView.this.postInvalidate();
            return true;
        }

        @Override // defpackage.mj8
        public void onPopulateNodeForVirtualView(int i, m80 m80Var) {
            int iB = MonthPanelView.this.h.b();
            tp5 tp5VarD = MonthPanelView.this.h.d(i / iB, i % iB);
            if (tp5VarD == null || tp5VarD.d() != 2) {
                this.f13262a.setEmpty();
                m80Var.d0(this.f13262a);
                m80Var.m0("");
                return;
            }
            int iF = (int) tp5VarD.f();
            int iG = (int) tp5VarD.g();
            int dateNumHeight = MonthPanelView.this.d.getDateNumHeight() / 2;
            int dateNumWidth = MonthPanelView.this.d.getDateNumWidth() / 2;
            this.f13262a.set(iF - dateNumWidth, iG - dateNumHeight, iF + dateNumWidth, iG + dateNumHeight);
            m80Var.d0(this.f13262a);
            String string = MonthPanelView.this.e.getString(j1j.K1, TimeUtils.formatDate(MonthPanelView.this.e.getString(j1j.e), Long.valueOf(tp5VarD.a().getTime())));
            MonthPanelView.c(MonthPanelView.this);
            if (!tp5VarD.i() && !tp5VarD.h()) {
                m80Var.m0(string);
                m80Var.j0(false);
            } else {
                m80Var.m0(string);
                m80Var.j0(true);
                m80Var.i0(TextView.class.getName());
                m80Var.a(16);
            }
        }
    }

    public MonthPanelView(Context context) {
        this(context, null);
    }

    public static /* bridge */ /* synthetic */ ruc c(MonthPanelView monthPanelView) {
        monthPanelView.getClass();
        return null;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.i.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public void f() {
        this.h.a();
        postInvalidate();
    }

    public final boolean g(MotionEvent motionEvent) {
        this.f.h(motionEvent.getX(), motionEvent.getY());
        postInvalidate();
        return true;
    }

    public Date getFirstDate() {
        return this.h.e();
    }

    public int getMonth() {
        return this.h.g();
    }

    public Date getSelectedDate() {
        return this.h.i();
    }

    public int getYear() {
        return this.h.j();
    }

    public final void h() {
        this.m = ViewConfiguration.get(this.e).getScaledTouchSlop();
        this.f = new up5(this.e);
        this.g = new Rect();
        w7g w7gVar = new w7g(this);
        this.h = w7gVar;
        this.f.i(w7gVar);
        a aVar = new a(this);
        this.i = aVar;
        c.r0(this, aVar);
        i();
    }

    public final void i() {
        HashMap map = new HashMap();
        map.put(0, -16777216);
        map.put(3, Integer.valueOf(MenuBuilder.CATEGORY_MASK));
        this.d = new MonthPanelStyle().addMonthDateNumPropertyColor(0, map);
    }

    @Override // com.xiaomi.fitness.interfaces.IDraw
    public void inDraw(Canvas canvas) {
        this.f.inDraw(canvas);
    }

    public final int j(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return (mode == 0 || mode == 1073741824) ? size : i2;
        }
        return Math.min(i2, size);
    }

    public void k(Map<Long, Integer> map, boolean z) {
        if (map != null) {
            this.h.p(map, z);
            postInvalidate();
        }
    }

    public void l() {
        this.g.set(getPaddingStart(), getPaddingTop(), getWidth() - getPaddingEnd(), getHeight() - getPaddingBottom());
        this.f.setMainArea(this.g);
    }

    public void m(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("month < 0");
        }
        if (i < 1900) {
            throw new IllegalArgumentException("year < 1900");
        }
        if (getYear() == i && getMonth() == i2) {
            return;
        }
        this.h.t(i, i2);
        this.f.i(this.h);
        requestLayout();
    }

    public boolean n(Date date) {
        boolean zS = this.h.s(date);
        postInvalidate();
        return zS;
    }

    public final boolean o(float f, float f2, float f3, float f4) {
        return !(f == f3 && f2 == f4) && Math.abs(f2 - f4) <= Math.abs(f - f3);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        preDraw(canvas);
        inDraw(canvas);
        postDraw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f13259a = j(i, this.c);
        int iH = this.h.h() * this.d.getDateNumHeight();
        this.f13260b = iH;
        setMeasuredDimension(this.f13259a, iH);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.j = false;
        } else if (actionMasked == 1) {
            if (!this.j) {
                g(motionEvent);
            }
            this.j = false;
        } else if (actionMasked == 2 && o(this.l, this.f13261k, x, y) && Math.abs(this.l - x) >= this.m) {
            this.j = true;
        }
        this.l = x;
        this.f13261k = y;
        return true;
    }

    @Override // com.xiaomi.fitness.interfaces.IDraw
    public void postDraw(Canvas canvas) {
        this.f.postDraw(canvas);
    }

    @Override // com.xiaomi.fitness.interfaces.IDraw
    public void preDraw(Canvas canvas) {
        l();
        this.f.setMonthPanelStyle(this.d);
        this.f.i(this.h);
        this.f.preDraw(canvas);
    }

    public void setDateNumberStateMap(Map<Long, Integer> map) {
        k(map, true);
    }

    public void setDecorateMap(Map<Long, List<Integer>> map) {
        this.h.r(map);
        postInvalidate();
    }

    public void setMonthDateContentDescriptionProvider(ruc rucVar) {
    }

    public void setMonthPanelStyle(MonthPanelStyle monthPanelStyle) {
        Objects.requireNonNull(monthPanelStyle);
        this.d = monthPanelStyle;
    }

    public void setOnDateSelectedListener(b8h b8hVar) {
        this.f.setOnDateSelectedListener(b8hVar);
    }

    public void setOnMonthPreparedListener(f9h f9hVar) {
        this.h.setOnMonthPreparedListener(f9hVar);
        if (f9hVar != null) {
            f9hVar.m(this, this.h.e(), this.h.f());
        }
    }

    public MonthPanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MonthPanelView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MonthPanelView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = 200;
        this.e = context;
        h();
    }
}
