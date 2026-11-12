package com.xiaomi.fitness.health.threetarget.model;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.aggregation.GoalItem;
import com.xiaomi.fitness.health.threetarget.RainbowExExportKt;
import defpackage.ddp;
import defpackage.edp;
import defpackage.jji;
import defpackage.x44;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ThreeTargetView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f12311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f12312b;
    public List<GoalItem> c;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12313k;
    public int[] l;
    public int[] m;
    public int[] n;
    public int[] o;
    public int[] p;
    public int[] q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable[] f12314r;
    public Drawable[] s;
    public Drawable[] t;
    public int[] u;
    public float v;
    public float w;
    public float x;
    public float y;
    public boolean z;

    public ThreeTargetView(Context context) {
        super(context);
        this.c = new ArrayList();
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = -1;
        this.j = -1;
        this.f12313k = -1;
        this.l = new int[2];
        this.m = new int[2];
        this.n = new int[2];
        this.o = new int[2];
        this.p = new int[2];
        this.q = new int[2];
        this.f12314r = new Drawable[2];
        this.s = new Drawable[2];
        this.t = new Drawable[2];
        this.u = new int[]{x44.a(jji.S), x44.a(jji.S)};
        this.x = 1.0f;
        this.y = 1.0f;
        this.z = false;
        t();
    }

    private float getRadiusByType() {
        return this.d;
    }

    public final boolean c(float f, int i) {
        if (i == ddp.j) {
            return f < ddp.m;
        }
        if (i == ddp.f15416k) {
            return f < ddp.n;
        }
        return f < ddp.o;
    }

    public final float d(GoalItem goalItem) {
        if (goalItem.getGoalValue() == 0) {
            return 0.0f;
        }
        return (goalItem.getAchievedValue() * 1.0f) / goalItem.getGoalValue();
    }

    public final RectF e(int i) {
        float fS = s(i) * (this.v + this.w);
        int i2 = this.e;
        return new RectF(fS, (i2 >> 1) - (this.w * this.x), this.v + fS, i2 >> 1);
    }

    public final RectF f(int i) {
        float fS = s(i);
        float f = this.v;
        float f2 = this.w;
        return new RectF((f + f2) * fS, (f + f2) * fS, this.d - ((f + f2) * fS), this.e - (fS * (f + f2)));
    }

    public void g() {
        this.x = 0.0f;
        this.z = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(660L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kdp
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f23761a.u(valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    public final void h(Canvas canvas, float f, int i) {
        float f2 = 180.0f;
        float f3 = f * 180.0f;
        int i2 = ((int) f3) / 180;
        float f4 = f3 - (i2 * 180);
        if (i2 <= 0) {
            f2 = f4;
        } else if (this.z) {
            z(i);
            f2 = f4;
        }
        j(canvas, i, 180.0f, this.w, true);
        if (f2 == 0.0f) {
            return;
        }
        if (c(f, i)) {
            l(canvas, i);
        } else {
            i(canvas, i, f2, this.w);
        }
        if (i2 <= 0 || !this.z) {
            return;
        }
        r(canvas, f2, i, i2);
    }

    public final void i(Canvas canvas, int i, float f, float f2) {
        j(canvas, i, f, f2, false);
    }

    public final void j(Canvas canvas, int i, float f, float f2, boolean z) {
        SweepGradient sweepGradient;
        canvas.save();
        RectF rectFF = f(i);
        canvas.translate(rectFF.left, rectFF.top);
        edp edpVarF = edp.f(z, i, rectFF, this.v, f2, f);
        int[] iArrP = p(i);
        int[] iArrQ = q(i);
        float[] fArr = {0.0f, 1.0f};
        if (z) {
            int i2 = this.d;
            sweepGradient = new SweepGradient(i2 >> 1, i2 >> 1, iArrQ, fArr);
        } else {
            int i3 = this.d;
            sweepGradient = new SweepGradient(i3 >> 1, i3 >> 1, iArrP, fArr);
        }
        this.f12311a.setShader(sweepGradient);
        edpVarF.j(canvas, this.f12311a);
        canvas.restore();
    }

    public void k() {
        this.y = 0.0f;
        this.z = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(430L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jdp
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f22685a.v(valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    public final void l(Canvas canvas, int i) {
        canvas.save();
        RectF rectFE = e(i);
        this.f12312b.setColor(o(i));
        float f = this.w;
        canvas.drawRoundRect(rectFE, f / 2.0f, f / 2.0f, this.f12312b);
        canvas.restore();
    }

    public final void m(Canvas canvas) {
        float f = this.f;
        if (f < 1.0f) {
            h(canvas, f * this.y, ddp.j);
        } else {
            h(canvas, f * this.x, ddp.j);
        }
        float f2 = this.g;
        if (f2 < 1.0f) {
            h(canvas, f2 * this.y, ddp.f15416k);
        } else {
            h(canvas, f2 * this.x, ddp.f15416k);
        }
        float f3 = this.h;
        if (f3 < 1.0f) {
            h(canvas, f3 * this.y, ddp.l);
        } else {
            h(canvas, f3 * this.x, ddp.l);
        }
    }

    public final Drawable n(int i, int i2) {
        if (i == ddp.j) {
            return i2 == 1 ? this.f12314r[0] : this.f12314r[1];
        }
        if (i == ddp.f15416k) {
            return i2 == 1 ? this.s[0] : this.s[1];
        }
        return i2 == 1 ? this.t[0] : this.t[1];
    }

    public final int o(int i) {
        if (i == ddp.j) {
            return this.i;
        }
        return i == ddp.f15416k ? this.j : this.f12313k;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.d = getWidth();
        this.e = getHeight() * 2;
        float f = this.d / 7.2f;
        this.v = f;
        this.w = f / 6.5f;
        m(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        setMeasuredDimension(measuredWidth, measuredWidth / 2);
    }

    public final int[] p(int i) {
        if (i == ddp.j) {
            return this.l;
        }
        return i == ddp.f15416k ? this.m : this.n;
    }

    public final int[] q(int i) {
        if (i == ddp.j) {
            return this.o;
        }
        return i == ddp.f15416k ? this.p : this.q;
    }

    public final void r(Canvas canvas, float f, int i, int i2) {
        float f2 = ddp.f15414a;
        float f3 = this.v;
        RectF rectF = new RectF(f3 / 2.0f, f3 / 2.0f, this.d - (f3 / 2.0f), this.e - (f3 / 2.0f));
        float f4 = this.w;
        float f5 = this.v;
        RectF rectF2 = new RectF(f4 + f5 + (f5 / 2.0f), f4 + f5 + (f5 / 2.0f), this.d - ((f4 + f5) + (f5 / 2.0f)), this.e - ((f4 + f5) + (f5 / 2.0f)));
        float f6 = this.w;
        float f7 = this.v;
        RectF rectF3 = new RectF(((f6 + f7) * 2.0f) + (f7 / 2.0f), ((f6 + f7) * 2.0f) + (f7 / 2.0f), this.d - (((f6 + f7) * 2.0f) + (f7 / 2.0f)), this.e - (((f6 + f7) * 2.0f) + (f7 / 2.0f)));
        Path path = new Path();
        if (i == ddp.j) {
            path.arcTo(rectF, 180.0f, f);
        } else if (i == ddp.f15416k) {
            path.arcTo(rectF2, 180.0f, f);
        } else {
            path.arcTo(rectF3, 180.0f, f);
        }
        float[] fArr = new float[2];
        PathMeasure pathMeasure = new PathMeasure(path, false);
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f8 = fArr[0];
        float f9 = fArr[1];
        Drawable drawableN = n(i, i2);
        if (drawableN == null) {
            return;
        }
        canvas.save();
        int i3 = (int) f8;
        drawableN.setBounds(new Rect(i3 - drawableN.getIntrinsicWidth(), (int) (f9 - (drawableN.getIntrinsicHeight() / 2)), i3, (int) ((drawableN.getIntrinsicHeight() / 2) + f9)));
        canvas.rotate(f - 90.0f, f8, f9);
        drawableN.draw(canvas);
        canvas.restore();
    }

    public final int s(int i) {
        return Math.max(i - 1, 0);
    }

    public final void t() {
        this.f12312b = new Paint(1);
        this.f12311a = new Paint(1);
    }

    public final /* synthetic */ void u(ValueAnimator valueAnimator) {
        this.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public final /* synthetic */ void v(ValueAnimator valueAnimator) {
        this.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public final void w() {
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
    }

    public void x(DailyGoalReport dailyGoalReport, boolean z) {
        this.c.clear();
        this.c.addAll(dailyGoalReport.goalList());
        w();
        for (int i = 0; i < 3; i++) {
            if (this.c.size() >= 1 && i == 0) {
                GoalItem goalItem = this.c.get(0);
                this.f = d(goalItem);
                this.i = RainbowExExportKt.getItemColor(goalItem);
                this.l = RainbowExExportKt.getItemColors(goalItem);
                this.f12314r = RainbowExExportKt.getDrawables(goalItem);
                this.o = RainbowExExportKt.getItemBgColors(goalItem, z);
            }
            if (this.c.size() >= 2 && i == 1) {
                GoalItem goalItem2 = this.c.get(1);
                this.g = d(goalItem2);
                this.j = RainbowExExportKt.getItemColor(goalItem2);
                this.m = RainbowExExportKt.getItemColors(goalItem2);
                this.s = RainbowExExportKt.getDrawables(goalItem2);
                this.p = RainbowExExportKt.getItemBgColors(goalItem2, z);
            }
            if (this.c.size() >= 3 && i == 2) {
                GoalItem goalItem3 = this.c.get(2);
                this.h = d(goalItem3);
                this.f12313k = RainbowExExportKt.getItemColor(goalItem3);
                this.n = RainbowExExportKt.getItemColors(goalItem3);
                this.t = RainbowExExportKt.getDrawables(goalItem3);
                this.q = RainbowExExportKt.getItemBgColors(goalItem3, z);
            }
        }
        invalidate();
    }

    public void y(List<GoalItem> list, boolean z) {
        this.c.clear();
        this.c.addAll(list);
        w();
        for (int i = 0; i < 3; i++) {
            if (this.c.size() >= 1 && i == 0) {
                GoalItem goalItem = this.c.get(0);
                float achievedValue = (goalItem.getAchievedValue() * 1.0f) / goalItem.getGoalValue();
                this.f = achievedValue;
                this.f = Math.min(1.0f, achievedValue);
                this.i = RainbowExExportKt.getItemColor(goalItem);
                this.l = RainbowExExportKt.getItemColors(goalItem);
                this.f12314r = RainbowExExportKt.getDrawables(goalItem);
                this.o = RainbowExExportKt.getItemBgColors(goalItem, z);
            }
            if (this.c.size() >= 2 && i == 1) {
                GoalItem goalItem2 = this.c.get(1);
                float achievedValue2 = (goalItem2.getAchievedValue() * 1.0f) / goalItem2.getGoalValue();
                this.g = achievedValue2;
                this.g = Math.min(1.0f, achievedValue2);
                this.j = RainbowExExportKt.getItemColor(goalItem2);
                this.m = RainbowExExportKt.getItemColors(goalItem2);
                this.s = RainbowExExportKt.getDrawables(goalItem2);
                this.p = RainbowExExportKt.getItemBgColors(goalItem2, z);
            }
            if (this.c.size() >= 3 && i == 2) {
                GoalItem goalItem3 = this.c.get(2);
                float achievedValue3 = (goalItem3.getAchievedValue() * 1.0f) / goalItem3.getGoalValue();
                this.h = achievedValue3;
                this.h = Math.min(1.0f, achievedValue3);
                this.f12313k = RainbowExExportKt.getItemColor(goalItem3);
                this.n = RainbowExExportKt.getItemColors(goalItem3);
                this.t = RainbowExExportKt.getDrawables(goalItem3);
                this.q = RainbowExExportKt.getItemBgColors(goalItem3, z);
            }
        }
        invalidate();
    }

    public void z(int i) {
        if (this.c.size() >= 1 && i == ddp.j) {
            GoalItem goalItem = this.c.get(0);
            this.i = RainbowExExportKt.getItemColor(goalItem, 1);
            this.l = RainbowExExportKt.getItemColors(goalItem, 1);
            this.o = RainbowExExportKt.getItemColors(goalItem);
            return;
        }
        if (this.c.size() >= 2 && i == ddp.f15416k) {
            GoalItem goalItem2 = this.c.get(1);
            this.j = RainbowExExportKt.getItemColor(goalItem2, 1);
            this.m = RainbowExExportKt.getItemColors(goalItem2, 1);
            this.p = RainbowExExportKt.getItemColors(goalItem2);
            return;
        }
        if (this.c.size() < 3 || i != ddp.l) {
            return;
        }
        GoalItem goalItem3 = this.c.get(2);
        this.f12313k = RainbowExExportKt.getItemColor(goalItem3, 1);
        this.n = RainbowExExportKt.getItemColors(goalItem3, 1);
        this.q = RainbowExExportKt.getItemColors(goalItem3);
    }

    public ThreeTargetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new ArrayList();
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = -1;
        this.j = -1;
        this.f12313k = -1;
        this.l = new int[2];
        this.m = new int[2];
        this.n = new int[2];
        this.o = new int[2];
        this.p = new int[2];
        this.q = new int[2];
        this.f12314r = new Drawable[2];
        this.s = new Drawable[2];
        this.t = new Drawable[2];
        this.u = new int[]{x44.a(jji.S), x44.a(jji.S)};
        this.x = 1.0f;
        this.y = 1.0f;
        this.z = false;
        t();
    }

    public ThreeTargetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new ArrayList();
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = -1;
        this.j = -1;
        this.f12313k = -1;
        this.l = new int[2];
        this.m = new int[2];
        this.n = new int[2];
        this.o = new int[2];
        this.p = new int[2];
        this.q = new int[2];
        this.f12314r = new Drawable[2];
        this.s = new Drawable[2];
        this.t = new Drawable[2];
        this.u = new int[]{x44.a(jji.S), x44.a(jji.S)};
        this.x = 1.0f;
        this.y = 1.0f;
        this.z = false;
        t();
    }
}
